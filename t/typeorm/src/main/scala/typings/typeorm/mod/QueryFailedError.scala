package typings.typeorm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "QueryFailedError")
@js.native
class QueryFailedError protected ()
  extends typings.typeorm.errorQueryFailedErrorMod.QueryFailedError {
  def this(query: String, parameters: js.UndefOr[scala.Nothing], driverError: js.Any) = this()
  def this(query: String, parameters: js.Array[_], driverError: js.Any) = this()
}
