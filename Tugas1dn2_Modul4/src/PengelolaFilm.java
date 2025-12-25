import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class PengurutanFilm {
    public static void main(String[] args) {
        // List: menyimpan data berurutan
        List<String> mahasiswa = new ArrayList<>();
        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");
        mahasiswa.add("Dewi");

        System.out.println("Daftar Mahasiswa (List):");
        for (String mhs : mahasiswa) {
            System.out.println("- " + mhs);
        }

        // Set: menyimpan data unik
        Set<String> hadir = new HashSet<>(mahasiswa);
        hadir.add("Andi"); // duplikat, tidak akan ditambahkan

        System.out.println("\nMahasiswa Hadir (Set):");
        for (String mhs : hadir) {
            System.out.println("- " + mhs);
        }

        // Map: menyimpan pasangan kunci-nilai
        Map<String, Integer> nilai = new HashMap<>();
        nilai.put("Andi", 85);
        nilai.put("Budi", 90);
        nilai.put("Citra", 78);
        nilai.put("Dewi", 88);

        System.out.println("\nNilai Mahasiswa (Map):");
        for (Map.Entry<String, Integer> entry : nilai.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
