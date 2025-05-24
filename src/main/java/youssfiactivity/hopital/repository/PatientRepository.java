package youssfiactivity.hopital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import youssfiactivity.hopital.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
