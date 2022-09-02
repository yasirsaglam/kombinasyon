import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nfak = 1;
        int rfak = 1;
        int bfak = 1;
        int sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Toplam eleman sayısı giriniz (n) : ");
        int n = input.nextInt();
        System.out.print("Seçilecek eleman sayısı giriniz (r) : ");
        int r = input.nextInt();
        int b = n - r;
        for (int i = 1; i <= n; i++) {
            nfak = nfak * i;
        }
        for (int i = 1; i <= r; i++) {
            rfak = rfak * i;
        }
        for (int i = 1; i <= b; i++) {
            bfak = bfak * i;
        }
        sonuc = nfak / (rfak * bfak);
        System.out.print("Kombinasyon Sonucunuz : " + sonuc);
    }
}
