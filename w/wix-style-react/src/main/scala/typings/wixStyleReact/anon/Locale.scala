package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var inputValue: Any
  
  var locale: Any
  
  var suggestedOption: Any
}
object Locale {
  
  inline def apply(inputValue: Any, locale: Any, suggestedOption: Any): Locale = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], suggestedOption = suggestedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  extension [Self <: Locale](x: Self) {
    
    inline def setInputValue(value: Any): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setSuggestedOption(value: Any): Self = StObject.set(x, "suggestedOption", value.asInstanceOf[js.Any])
  }
}
