package typings.typeorm

import typings.typeorm.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectChangedColumnsComputerMod {
  
  @JSImport("typeorm/browser/persistence/SubjectChangedColumnsComputer", "SubjectChangedColumnsComputer")
  @js.native
  class SubjectChangedColumnsComputer () extends StObject {
    
    /**
      * Finds what columns are changed in the subject entities.
      */
    def compute(subjects: js.Array[Subject]): Unit = js.native
    
    /**
      * Differentiate columns from the updated entity and entity stored in the database.
      */
    /* protected */ def computeDiffColumns(subject: Subject): Unit = js.native
    
    /**
      * Difference columns of the owning one-to-one and many-to-one columns.
      */
    /* protected */ def computeDiffRelationalColumns(allSubjects: js.Array[Subject], subject: Subject): Unit = js.native
  }
}
