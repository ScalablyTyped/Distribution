package typings.typeorm

import typings.std.Error
import typings.typeorm.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectRemovedAndUpdatedErrorMod {
  
  @JSImport("typeorm/browser/error/SubjectRemovedAndUpdatedError", "SubjectRemovedAndUpdatedError")
  @js.native
  class SubjectRemovedAndUpdatedError protected ()
    extends StObject
       with Error {
    def this(subject: Subject) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
