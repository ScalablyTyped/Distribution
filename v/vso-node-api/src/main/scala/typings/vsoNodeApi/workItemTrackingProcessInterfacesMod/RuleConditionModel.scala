package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleConditionModel extends StObject {
  
  var conditionType: String
  
  var field: String
  
  var value: String
}
object RuleConditionModel {
  
  @scala.inline
  def apply(conditionType: String, field: String, value: String): RuleConditionModel = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleConditionModel]
  }
  
  @scala.inline
  implicit class RuleConditionModelMutableBuilder[Self <: RuleConditionModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionType(value: String): Self = StObject.set(x, "conditionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
