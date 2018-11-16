package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("TypeScript.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait Max31BitInteger
    extends typescriptDashServicesLib.TypeScriptNs.Constants
  
  @js.native
  sealed trait Min31BitInteger
    extends typescriptDashServicesLib.TypeScriptNs.Constants
  
  /* 1073741823 */ val Max31BitInteger: Max31BitInteger with scala.Double = js.native
  /* -1073741824 */ val Min31BitInteger: Min31BitInteger with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.Constants with scala.Double] = js.native
}

