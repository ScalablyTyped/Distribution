package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RulesPosition extends js.Object

@JSGlobal("TypeScript.Services.Formatting.RulesPosition")
@js.native
object RulesPosition extends js.Object {
  @js.native
  sealed trait ContextRulesAny
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition
  
  @js.native
  sealed trait ContextRulesSpecific
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition
  
  @js.native
  sealed trait IgnoreRulesAny
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition
  
  @js.native
  sealed trait IgnoreRulesSpecific
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition
  
  @js.native
  sealed trait NoContextRulesAny
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition
  
  @js.native
  sealed trait NoContextRulesSpecific
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition
  
  /* 2 */ val ContextRulesAny: ContextRulesAny with scala.Double = js.native
  /* 1 */ val ContextRulesSpecific: ContextRulesSpecific with scala.Double = js.native
  /* 0 */ val IgnoreRulesAny: IgnoreRulesAny with scala.Double = js.native
  /* 0 */ val IgnoreRulesSpecific: IgnoreRulesSpecific with scala.Double = js.native
  /* 4 */ val NoContextRulesAny: NoContextRulesAny with scala.Double = js.native
  /* 3 */ val NoContextRulesSpecific: NoContextRulesSpecific with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition with scala.Double
  ] = js.native
}

