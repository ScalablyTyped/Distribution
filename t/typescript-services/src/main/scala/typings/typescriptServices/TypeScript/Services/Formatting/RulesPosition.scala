package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RulesPosition extends StObject
@JSGlobal("TypeScript.Services.Formatting.RulesPosition")
@js.native
object RulesPosition extends StObject {
  
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
