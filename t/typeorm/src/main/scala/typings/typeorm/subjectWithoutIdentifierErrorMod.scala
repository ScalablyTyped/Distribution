package typings.typeorm

import typings.std.Error
import typings.typeorm.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/SubjectWithoutIdentifierError", JSImport.Namespace)
@js.native
object subjectWithoutIdentifierErrorMod extends js.Object {
  
  @js.native
  class SubjectWithoutIdentifierError protected () extends Error {
    def this(subject: Subject) = this()
  }
}
