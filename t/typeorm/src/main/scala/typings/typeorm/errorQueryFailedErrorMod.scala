package typings.typeorm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/QueryFailedError", JSImport.Namespace)
@js.native
object errorQueryFailedErrorMod extends js.Object {
  
  @js.native
  class QueryFailedError protected () extends Error {
    def this(query: String, parameters: js.UndefOr[scala.Nothing], driverError: js.Any) = this()
    def this(query: String, parameters: js.Array[_], driverError: js.Any) = this()
  }
}
