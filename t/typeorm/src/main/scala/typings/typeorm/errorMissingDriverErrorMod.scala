package typings.typeorm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/MissingDriverError", JSImport.Namespace)
@js.native
object errorMissingDriverErrorMod extends js.Object {
  
  @js.native
  class MissingDriverError protected () extends Error {
    def this(driverType: String) = this()
  }
}
