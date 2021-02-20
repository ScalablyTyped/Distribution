package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldRuleModel extends StObject {
  
  var actions: js.Array[RuleActionModel] = js.native
  
  var conditions: js.Array[RuleConditionModel] = js.native
  
  var friendlyName: String = js.native
  
  var id: String = js.native
  
  var isDisabled: Boolean = js.native
  
  var isSystem: Boolean = js.native
}
object FieldRuleModel {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FieldRuleModelMutableBuilder[Self <: FieldRuleModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[RuleActionModel]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: RuleActionModel*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[RuleConditionModel]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: RuleConditionModel*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSystem(value: Boolean): Self = StObject.set(x, "isSystem", value.asInstanceOf[js.Any])
  }
}
