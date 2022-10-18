package typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldRuleModel extends StObject {
  
  var actions: js.Array[RuleActionModel]
  
  var conditions: js.Array[RuleConditionModel]
  
  var friendlyName: String
  
  var id: String
  
  var isDisabled: Boolean
  
  var isSystem: Boolean
}
object FieldRuleModel {
  
  inline def apply(
    actions: js.Array[RuleActionModel],
    conditions: js.Array[RuleConditionModel],
    friendlyName: String,
    id: String,
    isDisabled: Boolean,
    isSystem: Boolean
  ): FieldRuleModel = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isSystem = isSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldRuleModel]
  }
  
  extension [Self <: FieldRuleModel](x: Self) {
    
    inline def setActions(value: js.Array[RuleActionModel]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: RuleActionModel*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setConditions(value: js.Array[RuleConditionModel]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: RuleConditionModel*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsSystem(value: Boolean): Self = StObject.set(x, "isSystem", value.asInstanceOf[js.Any])
  }
}
