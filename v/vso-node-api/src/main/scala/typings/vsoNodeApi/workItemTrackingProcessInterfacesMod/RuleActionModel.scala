package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleActionModel extends StObject {
  
  var actionType: String
  
  var targetField: String
  
  var value: String
}
object RuleActionModel {
  
  @scala.inline
  def apply(actionType: String, targetField: String, value: String): RuleActionModel = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], targetField = targetField.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleActionModel]
  }
  
  @scala.inline
  implicit class RuleActionModelMutableBuilder[Self <: RuleActionModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetField(value: String): Self = StObject.set(x, "targetField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
