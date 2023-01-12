package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Am extends StObject {
  
  var am: js.UndefOr[String] = js.undefined
  
  var day: js.UndefOr[String] = js.undefined
  
  var hour: js.UndefOr[String] = js.undefined
  
  var minute: js.UndefOr[String] = js.undefined
  
  var month: js.UndefOr[String] = js.undefined
  
  var pm: js.UndefOr[String] = js.undefined
  
  var year: js.UndefOr[String] = js.undefined
}
object Am {
  
  inline def apply(): Am = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Am]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Am] (val x: Self) extends AnyVal {
    
    inline def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
    
    inline def setAmUndefined: Self = StObject.set(x, "am", js.undefined)
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    
    inline def setPmUndefined: Self = StObject.set(x, "pm", js.undefined)
    
    inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
