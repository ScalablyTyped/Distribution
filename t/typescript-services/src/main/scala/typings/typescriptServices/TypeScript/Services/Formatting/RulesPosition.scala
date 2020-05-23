package typings.typescriptServices.TypeScript.Services.Formatting

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
  
}

