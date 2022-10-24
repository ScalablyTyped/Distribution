package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSlot extends StObject {
  
  var locale: Any
  
  var timeSlot: Any
  
  var timeStyle: Any
  
  var value: Any
}
object TimeSlot {
  
  inline def apply(locale: Any, timeSlot: Any, timeStyle: Any, value: Any): TimeSlot = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], timeSlot = timeSlot.asInstanceOf[js.Any], timeStyle = timeStyle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSlot]
  }
  
  extension [Self <: TimeSlot](x: Self) {
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setTimeSlot(value: Any): Self = StObject.set(x, "timeSlot", value.asInstanceOf[js.Any])
    
    inline def setTimeStyle(value: Any): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
