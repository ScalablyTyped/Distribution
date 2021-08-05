package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValidationItem extends StObject {
  
  var isValid: Boolean
  
  var reason: String
  
  var `type`: String
  
  var value: String
}
object InputValidationItem {
  
  inline def apply(isValid: Boolean, reason: String, `type`: String, value: String): InputValidationItem = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValidationItem]
  }
  
  extension [Self <: InputValidationItem](x: Self) {
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
