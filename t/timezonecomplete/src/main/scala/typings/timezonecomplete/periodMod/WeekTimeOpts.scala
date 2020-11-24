package typings.timezonecomplete.periodMod

import typings.timezonecomplete.basicsMod.WeekDay
import typings.timezonecomplete.datetimeMod.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeekTimeOpts extends js.Object {
  
  /**
    * Desired time (hours 0-23)
    */
  var hour: Double = js.native
  
  /**
    * Desired time (milliseconds 0-999)
    */
  var millisecond: js.UndefOr[Double] = js.native
  
  /**
    * Desired time (minutes 0-59)
    */
  var minute: js.UndefOr[Double] = js.native
  
  /**
    * Timestamp to use as a basis
    */
  var reference: DateTime = js.native
  
  /**
    * Desired time (seconds 0-59)
    */
  var second: js.UndefOr[Double] = js.native
  
  /**
    * Desired day of week
    */
  var weekday: WeekDay = js.native
}
object WeekTimeOpts {
  
  @scala.inline
  def apply(hour: Double, reference: DateTime, weekday: WeekDay): WeekTimeOpts = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekTimeOpts]
  }
  
  @scala.inline
  implicit class WeekTimeOptsOps[Self <: WeekTimeOpts] (val x: Self) extends AnyVal {
    
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
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: DateTime): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekday(value: WeekDay): Self = this.set("weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisecond(value: Double): Self = this.set("millisecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMillisecond: Self = this.set("millisecond", js.undefined)
    
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
  }
}
