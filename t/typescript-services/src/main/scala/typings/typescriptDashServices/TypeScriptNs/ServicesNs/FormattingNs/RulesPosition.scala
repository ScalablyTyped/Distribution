package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RulesPosition extends js.Object

@JSGlobal("TypeScript.Services.Formatting.RulesPosition")
@js.native
object RulesPosition extends js.Object {
  @js.native
  sealed trait ContextRulesAny extends RulesPosition
  
  @js.native
  sealed trait ContextRulesSpecific extends RulesPosition
  
  @js.native
  sealed trait IgnoreRulesAny extends RulesPosition
  
  @js.native
  sealed trait IgnoreRulesSpecific extends RulesPosition
  
  @js.native
  sealed trait NoContextRulesAny extends RulesPosition
  
  @js.native
  sealed trait NoContextRulesSpecific extends RulesPosition
  
  /* 2 */ val ContextRulesAny: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.ContextRulesAny with Double = js.native
  /* 1 */ val ContextRulesSpecific: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.ContextRulesSpecific with Double = js.native
  /* 0 */ val IgnoreRulesAny: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.IgnoreRulesAny with Double = js.native
  /* 0 */ val IgnoreRulesSpecific: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.IgnoreRulesSpecific with Double = js.native
  /* 4 */ val NoContextRulesAny: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.NoContextRulesAny with Double = js.native
  /* 3 */ val NoContextRulesSpecific: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.NoContextRulesSpecific with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RulesPosition with Double] = js.native
}

