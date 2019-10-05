package typings.typescriptDashServices.TypeScript.Services.Formatting

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
  
  /* 3 */ val Delete: typings.typescriptDashServices.TypeScript.Services.Formatting.RuleAction.Delete with Double = js.native
  /* 0 */ val Ignore: typings.typescriptDashServices.TypeScript.Services.Formatting.RuleAction.Ignore with Double = js.native
  /* 2 */ val NewLine: typings.typescriptDashServices.TypeScript.Services.Formatting.RuleAction.NewLine with Double = js.native
  /* 1 */ val Space: typings.typescriptDashServices.TypeScript.Services.Formatting.RuleAction.Space with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleAction with Double] = js.native
}

