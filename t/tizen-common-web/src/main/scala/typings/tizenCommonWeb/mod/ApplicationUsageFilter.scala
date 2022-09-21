package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationUsageFilter extends StObject {
  
  /**
    * The attribute to store the date, which is used as an upper bound for selecting data.
    *
    * If only _endTime_ attribute is given, data will be accumulated from 90 days ago to _endTime_ date.
    */
  var endTime: js.UndefOr[js.Date | Null] = js.undefined
  
  /**
    * The attribute to store the date, which is used as a lower bound for selecting data.
    *
    * If only _startTime_ attribute is given, by default _endTime_ is equal to the current date.
    * If _startTime_ date predates the 90 days from the current time, data will be accumulated from last 90 days.
    */
  var startTime: js.UndefOr[js.Date | Null] = js.undefined
  
  /**
    * The attribute to store period of time, from which data is accumulated, in days.
    * The period of time begins _timeSpan_ days ago and ends with current date.
    *
    * If the attribute is given, the attributes _startTime_ and _endTime_ of this interface are not taken into an account.
    * If _timeSpan_ is greater than 90, 90 will be used instead.
    */
  var timeSpan: js.UndefOr[Double | Null] = js.undefined
}
object ApplicationUsageFilter {
  
  inline def apply(): ApplicationUsageFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationUsageFilter]
  }
  
  extension [Self <: ApplicationUsageFilter](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTimeSpan(value: Double): Self = StObject.set(x, "timeSpan", value.asInstanceOf[js.Any])
    
    inline def setTimeSpanNull: Self = StObject.set(x, "timeSpan", null)
    
    inline def setTimeSpanUndefined: Self = StObject.set(x, "timeSpan", js.undefined)
  }
}
