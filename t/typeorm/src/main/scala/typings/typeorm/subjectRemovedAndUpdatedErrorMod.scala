package typings.typeorm

import typings.std.Error
import typings.typeorm.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/SubjectRemovedAndUpdatedError", JSImport.Namespace)
@js.native
object subjectRemovedAndUpdatedErrorMod extends js.Object {
  
  @js.native
  class SubjectRemovedAndUpdatedError protected () extends Error {
    def this(subject: Subject) = this()
  }
}
