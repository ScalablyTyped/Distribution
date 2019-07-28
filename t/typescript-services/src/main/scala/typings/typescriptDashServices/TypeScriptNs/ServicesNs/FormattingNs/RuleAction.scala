package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RuleAction extends js.Object

@JSGlobal("TypeScript.Services.Formatting.RuleAction")
@js.native
object RuleAction extends js.Object {
  @js.native
  sealed trait Delete extends RuleAction
  
  @js.native
  sealed trait Ignore extends RuleAction
  
  @js.native
  sealed trait NewLine extends RuleAction
  
  @js.native
  sealed trait Space extends RuleAction
  
  /* 3 */ val Delete: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.Delete with Double = js.native
  /* 0 */ val Ignore: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.Ignore with Double = js.native
  /* 2 */ val NewLine: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.NewLine with Double = js.native
  /* 1 */ val Space: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.Space with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleAction with Double] = js.native
}

