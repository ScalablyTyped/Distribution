package typings.tizenCommonWeb.applicationMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationUsageFilter extends StObject {
  
  /**
    * The attribute to store the date, which is used as an upper bound for selecting data.
    *
    * If only `endTime` attribute is given, data will be accumulated from 90 days ago to `endTime` date.
    */
  var endTime: js.UndefOr[Date] = js.native
  
  /**
    * The attribute to store the date, which is used as a lower bound for selecting data.
    *
    * If only `startTime` attribute is given, by default `endTime` is equal to the current date.
    * If `startTime` date predates the 90 days from the current time, data will be accumulated from last 90 days.
    */
  var startTime: js.UndefOr[Date] = js.native
  
  /**
    * The attribute to store period of time, from which data is accumulated, in days.
    * The  period of time begins `timeSpan` days ago and ends with current date.
    *
    * If the attribute is given, the attributes `startTime` and `endTime` of this interface are not taken into an account.
    * If `timeSpan` is greater than ***90***, ***90*** will be used instead.
    */
  var timeSpan: js.UndefOr[Double] = js.native
}
object ApplicationUsageFilter {
  
  @scala.inline
  def apply(): ApplicationUsageFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationUsageFilter]
  }
  
  @scala.inline
  implicit class ApplicationUsageFilterMutableBuilder[Self <: ApplicationUsageFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTimeSpan(value: Double): Self = StObject.set(x, "timeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSpanUndefined: Self = StObject.set(x, "timeSpan", js.undefined)
  }
}
