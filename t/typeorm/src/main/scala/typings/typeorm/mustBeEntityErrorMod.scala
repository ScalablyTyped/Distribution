package typings.typeorm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/MustBeEntityError", JSImport.Namespace)
@js.native
object mustBeEntityErrorMod extends js.Object {
  
  @js.native
  class MustBeEntityError protected () extends Error {
    def this(operation: String, wrongValue: js.Any) = this()
  }
}
