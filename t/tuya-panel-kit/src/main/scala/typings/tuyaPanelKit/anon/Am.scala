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
  
  @scala.inline
  def apply(): Am = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Am]
  }
  
  @scala.inline
  implicit class AmMutableBuilder[Self <: Am] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAm(value: String): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmUndefined: Self = StObject.set(x, "am", js.undefined)
    
    @scala.inline
    def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    @scala.inline
    def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    @scala.inline
    def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setPm(value: String): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPmUndefined: Self = StObject.set(x, "pm", js.undefined)
    
    @scala.inline
    def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
