package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleOperation extends StObject {
  
  var Action: RuleAction = js.native
  
  var Context: RuleOperationContext = js.native
}
object RuleOperation {
  
  @scala.inline
  def apply(Action: RuleAction, Context: RuleOperationContext): RuleOperation = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOperation]
  }
  
  @scala.inline
  implicit class RuleOperationMutableBuilder[Self <: RuleOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: RuleAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: RuleOperationContext): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
  }
}
