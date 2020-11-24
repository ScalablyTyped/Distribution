package typings.typeorm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/EntityColumnNotFound", JSImport.Namespace)
@js.native
object errorEntityColumnNotFoundMod extends js.Object {
  
  @js.native
  class EntityColumnNotFound protected () extends Error {
    def this(propertyPath: String) = this()
  }
}
