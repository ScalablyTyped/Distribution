package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSlots extends StObject {
  
  var timeSlots: Any
  
  var value: js.UndefOr[js.Date] = js.undefined
}
object TimeSlots {
  
  inline def apply(timeSlots: Any): TimeSlots = {
    val __obj = js.Dynamic.literal(timeSlots = timeSlots.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSlots]
  }
  
  extension [Self <: TimeSlots](x: Self) {
    
    inline def setTimeSlots(value: Any): Self = StObject.set(x, "timeSlots", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
