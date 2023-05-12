package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * The action to take if this rule is matched.
    */
  var action: RuleActionType
  
  /**
    * The condition under which this rule is triggered.
    */
  var condition: RuleConditionType
  
  /**
    * An id which uniquely identifies a rule. Mandatory and should be >= 1.
    */
  var id: Double
  
  /**
    * Rule priority. Defaults to 1. When specified, should be >= 1
    * Optional.
    */
  var priority: js.UndefOr[Double] = js.undefined
}
object Rule {
  
  inline def apply(action: RuleActionType, condition: RuleConditionType, id: Double): Rule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    inline def setAction(value: RuleActionType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: RuleConditionType): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
