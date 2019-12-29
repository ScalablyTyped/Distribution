package typings.typescriptDashServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RulesPosition with Double] = js.native
  /* 2 */ @js.native
  object ContextRulesAny extends TopLevel[ContextRulesAny with Double]
  
  /* 1 */ @js.native
  object ContextRulesSpecific extends TopLevel[ContextRulesSpecific with Double]
  
  /* 0 */ @js.native
  object IgnoreRulesAny extends TopLevel[IgnoreRulesAny with Double]
  
  /* 0 */ @js.native
  object IgnoreRulesSpecific extends TopLevel[IgnoreRulesSpecific with Double]
  
  /* 4 */ @js.native
  object NoContextRulesAny extends TopLevel[NoContextRulesAny with Double]
  
  /* 3 */ @js.native
  object NoContextRulesSpecific extends TopLevel[NoContextRulesSpecific with Double]
  
}

