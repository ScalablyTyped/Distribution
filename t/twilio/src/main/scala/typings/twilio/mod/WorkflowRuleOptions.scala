package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowRuleOptions extends StObject {
  
  var expression: String
  
  var filter_friendly_name: js.UndefOr[String] = js.undefined
  
  var friendlyName: js.UndefOr[String] = js.undefined
  
  // Don't ask me why, but all of these are supported options.
  var friendly_name: js.UndefOr[String] = js.undefined
  
  var targets: js.Array[WorkflowRuleTargetOptions]
}
object WorkflowRuleOptions {
  
  inline def apply(expression: String, targets: js.Array[WorkflowRuleTargetOptions]): WorkflowRuleOptions = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowRuleOptions]
  }
  
  extension [Self <: WorkflowRuleOptions](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setFilter_friendly_name(value: String): Self = StObject.set(x, "filter_friendly_name", value.asInstanceOf[js.Any])
    
    inline def setFilter_friendly_nameUndefined: Self = StObject.set(x, "filter_friendly_name", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
    
    inline def setFriendly_nameUndefined: Self = StObject.set(x, "friendly_name", js.undefined)
    
    inline def setTargets(value: js.Array[WorkflowRuleTargetOptions]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: WorkflowRuleTargetOptions*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
