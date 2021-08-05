package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleOperation extends StObject {
  
  var Action: RuleAction
  
  var Context: RuleOperationContext
}
object RuleOperation {
  
  inline def apply(Action: RuleAction, Context: RuleOperationContext): RuleOperation = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOperation]
  }
  
  extension [Self <: RuleOperation](x: Self) {
    
    inline def setAction(value: RuleAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setContext(value: RuleOperationContext): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
  }
}
