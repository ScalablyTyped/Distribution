package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputHasFocus extends StObject {
  
  var inputHasFocus: Boolean
  
  var inputValue: String
}
object InputHasFocus {
  
  inline def apply(inputHasFocus: Boolean, inputValue: String): InputHasFocus = {
    val __obj = js.Dynamic.literal(inputHasFocus = inputHasFocus.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputHasFocus]
  }
  
  extension [Self <: InputHasFocus](x: Self) {
    
    inline def setInputHasFocus(value: Boolean): Self = StObject.set(x, "inputHasFocus", value.asInstanceOf[js.Any])
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
  }
}
