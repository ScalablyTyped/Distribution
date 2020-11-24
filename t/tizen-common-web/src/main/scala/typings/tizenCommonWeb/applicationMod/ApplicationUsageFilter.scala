package typings.tizenCommonWeb.applicationMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationUsageFilter extends js.Object {
  
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
  implicit class ApplicationUsageFilterOps[Self <: ApplicationUsageFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTime(value: Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTimeSpan(value: Double): Self = this.set("timeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSpan: Self = this.set("timeSpan", js.undefined)
  }
}
