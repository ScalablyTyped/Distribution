package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("TypeScript.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait Max31BitInteger extends Constants
  
  @js.native
  sealed trait Min31BitInteger extends Constants
  
  /* 1073741823 */ val Max31BitInteger: typings.typescriptDashServices.TypeScriptNs.Constants.Max31BitInteger with Double = js.native
  /* -1073741824 */ val Min31BitInteger: typings.typescriptDashServices.TypeScriptNs.Constants.Min31BitInteger with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Constants with Double] = js.native
}

