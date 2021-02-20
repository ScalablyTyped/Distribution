package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RuleAction extends StObject
@JSGlobal("TypeScript.Services.Formatting.RuleAction")
@js.native
object RuleAction extends StObject {
  
  @js.native
  sealed trait Delete extends RuleAction
  
  @js.native
  sealed trait Ignore extends RuleAction
  
  @js.native
  sealed trait NewLine extends RuleAction
  
  @js.native
  sealed trait Space extends RuleAction
}
