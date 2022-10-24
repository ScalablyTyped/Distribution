package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValue extends StObject {
  
  var inputValue: Any
  
  var isDropdownOpen: Boolean
}
object InputValue {
  
  inline def apply(inputValue: Any, isDropdownOpen: Boolean): InputValue = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isDropdownOpen = isDropdownOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValue]
  }
  
  extension [Self <: InputValue](x: Self) {
    
    inline def setInputValue(value: Any): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setIsDropdownOpen(value: Boolean): Self = StObject.set(x, "isDropdownOpen", value.asInstanceOf[js.Any])
  }
}
