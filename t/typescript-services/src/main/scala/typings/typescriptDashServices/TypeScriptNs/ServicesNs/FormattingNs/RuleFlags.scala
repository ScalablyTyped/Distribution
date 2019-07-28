package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RuleFlags extends js.Object

@JSGlobal("TypeScript.Services.Formatting.RuleFlags")
@js.native
object RuleFlags extends js.Object {
  @js.native
  sealed trait CanDeleteNewLines extends RuleFlags
  
  @js.native
  sealed trait None extends RuleFlags
  
  /* 1 */ val CanDeleteNewLines: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags.CanDeleteNewLines with Double = js.native
  /* 0 */ val None: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleFlags with Double] = js.native
}

