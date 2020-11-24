package typings.typeorm

import typings.typeorm.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/persistence/SubjectChangedColumnsComputer", JSImport.Namespace)
@js.native
object subjectChangedColumnsComputerMod extends js.Object {
  
  @js.native
  class SubjectChangedColumnsComputer () extends js.Object {
    
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
