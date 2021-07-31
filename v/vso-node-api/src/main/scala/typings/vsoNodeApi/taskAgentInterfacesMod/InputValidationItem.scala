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
  
  @scala.inline
  def apply(isValid: Boolean, reason: String, `type`: String, value: String): InputValidationItem = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValidationItem]
  }
  
  @scala.inline
  implicit class InputValidationItemMutableBuilder[Self <: InputValidationItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
