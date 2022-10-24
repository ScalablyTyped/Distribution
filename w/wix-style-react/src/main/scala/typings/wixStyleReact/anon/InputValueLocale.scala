package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValueLocale extends StObject {
  
  var inputValue: Any
  
  var locale: Any
  
  var timeSlots: Any
}
object InputValueLocale {
  
  inline def apply(inputValue: Any, locale: Any, timeSlots: Any): InputValueLocale = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], timeSlots = timeSlots.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValueLocale]
  }
  
  extension [Self <: InputValueLocale](x: Self) {
    
    inline def setInputValue(value: Any): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setTimeSlots(value: Any): Self = StObject.set(x, "timeSlots", value.asInstanceOf[js.Any])
  }
}
