package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RuleAction extends js.Object

@JSGlobal("TypeScript.Services.Formatting.RuleAction")
@js.native
object RuleAction extends js.Object {
  @js.native
  sealed trait Delete
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction
  
  @js.native
  sealed trait Ignore
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction
  
  @js.native
  sealed trait NewLine
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction
  
  @js.native
  sealed trait Space
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction
  
  /* 3 */ val Delete: Delete with scala.Double = js.native
  /* 0 */ val Ignore: Ignore with scala.Double = js.native
  /* 2 */ val NewLine: NewLine with scala.Double = js.native
  /* 1 */ val Space: Space with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction with scala.Double
  ] = js.native
}

