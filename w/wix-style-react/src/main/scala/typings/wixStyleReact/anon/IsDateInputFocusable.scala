package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDateInputFocusable extends StObject {
  
  var inputValue: Any
  
  var isDateInputFocusable: Boolean
  
  var isOpen: Any
  
  var value: Any
}
object IsDateInputFocusable {
  
  inline def apply(inputValue: Any, isDateInputFocusable: Boolean, isOpen: Any, value: Any): IsDateInputFocusable = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isDateInputFocusable = isDateInputFocusable.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDateInputFocusable]
  }
  
  extension [Self <: IsDateInputFocusable](x: Self) {
    
    inline def setInputValue(value: Any): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setIsDateInputFocusable(value: Boolean): Self = StObject.set(x, "isDateInputFocusable", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Any): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
