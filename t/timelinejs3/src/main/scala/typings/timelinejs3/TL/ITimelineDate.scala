package typings.timelinejs3.TL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimelineDate extends js.Object {
  
  var day: js.UndefOr[Double] = js.native
  
  /*
    * A string for presenting the date. Useful if Timeline's date formatting doesn't fit your needs.
    */
  var display_date: js.UndefOr[String] = js.native
  
  /*
    * 0-23
    */
  var hour: js.UndefOr[Double] = js.native
  
  var millisecond: js.UndefOr[Double] = js.native
  
  /*
    * 0-59
    */
  var minute: js.UndefOr[Double] = js.native
  
  /*
    * 1-12
    */
  var month: js.UndefOr[Double] = js.native
  
  /*
    * 0-59
    */
  var second: js.UndefOr[Double] = js.native
  
  /*
    * BCE years should be negative numbers.
    */
  var year: Double = js.native
}
object ITimelineDate {
  
  @scala.inline
  def apply(year: Double): ITimelineDate = {
    val __obj = js.Dynamic.literal(year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineDate]
  }
  
  @scala.inline
  implicit class ITimelineDateOps[Self <: ITimelineDate] (val x: Self) extends AnyVal {
    
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
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setDisplay_date(value: String): Self = this.set("display_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_date: Self = this.set("display_date", js.undefined)
    
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    
    @scala.inline
    def setMillisecond(value: Double): Self = this.set("millisecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMillisecond: Self = this.set("millisecond", js.undefined)
    
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
  }
}
