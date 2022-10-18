package typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleActionModel extends StObject {
  
  var actionType: String
  
  var targetField: String
  
  var value: String
}
object RuleActionModel {
  
  inline def apply(actionType: String, targetField: String, value: String): RuleActionModel = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], targetField = targetField.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleActionModel]
  }
  
  extension [Self <: RuleActionModel](x: Self) {
    
    inline def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setTargetField(value: String): Self = StObject.set(x, "targetField", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
