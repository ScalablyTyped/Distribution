package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
