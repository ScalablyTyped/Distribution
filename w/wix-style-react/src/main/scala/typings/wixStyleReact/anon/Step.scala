package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  var locale: Any
  
  var step: Any
  
  var timeStyle: Any
  
  var value: js.UndefOr[js.Date] = js.undefined
}
object Step {
  
  inline def apply(locale: Any, step: Any, timeStyle: Any): Step = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], timeStyle = timeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  extension [Self <: Step](x: Self) {
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setTimeStyle(value: Any): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
