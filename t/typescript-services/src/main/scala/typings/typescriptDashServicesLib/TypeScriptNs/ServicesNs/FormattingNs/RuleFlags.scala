package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RuleFlags extends js.Object

@JSGlobal("TypeScript.Services.Formatting.RuleFlags")
@js.native
object RuleFlags extends js.Object {
  @js.native
  sealed trait CanDeleteNewLines
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags
  
  @js.native
  sealed trait None
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags
  
  /* 1 */ val CanDeleteNewLines: CanDeleteNewLines with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags with scala.Double
  ] = js.native
}

