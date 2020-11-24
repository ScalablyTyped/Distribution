package typings.twix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwixFormatOptions extends js.Object {
  
  var allDay: js.UndefOr[js.Any] = js.native
  
  var dayFormat: js.UndefOr[String] = js.native
  
   // boolean | string
  var explicitAllDay: js.UndefOr[Boolean] = js.native
  
  var groupMeridiems: js.UndefOr[Boolean] = js.native
  
  var hideDate: js.UndefOr[Boolean] = js.native
  
  var hideTime: js.UndefOr[Boolean] = js.native
  
  var hideYear: js.UndefOr[Boolean] = js.native
  
  var hourFormat: js.UndefOr[String] = js.native
  
  var implicitMinutes: js.UndefOr[Boolean] = js.native
  
  var implicitYear: js.UndefOr[Boolean] = js.native
  
  var lastNightEndsAt: js.UndefOr[Double] = js.native
  
  var meridiemFormat: js.UndefOr[String] = js.native
  
  var minuteFormat: js.UndefOr[String] = js.native
  
  var monthFormat: js.UndefOr[String] = js.native
  
  var showDate: js.UndefOr[Boolean] = js.native
  
  var showDayOfWeek: js.UndefOr[Boolean] = js.native
  
  var spaceBeforeMeridiem: js.UndefOr[Boolean] = js.native
  
  var twentyFourHour: js.UndefOr[Boolean] = js.native
  
  var weekdayFormat: js.UndefOr[String] = js.native
  
  var yearFormat: js.UndefOr[String] = js.native
}
object TwixFormatOptions {
  
  @scala.inline
  def apply(): TwixFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwixFormatOptions]
  }
  
  @scala.inline
  implicit class TwixFormatOptionsOps[Self <: TwixFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setAllDay(value: js.Any): Self = this.set("allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDay: Self = this.set("allDay", js.undefined)
    
    @scala.inline
    def setDayFormat(value: String): Self = this.set("dayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayFormat: Self = this.set("dayFormat", js.undefined)
    
    @scala.inline
    def setExplicitAllDay(value: Boolean): Self = this.set("explicitAllDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitAllDay: Self = this.set("explicitAllDay", js.undefined)
    
    @scala.inline
    def setGroupMeridiems(value: Boolean): Self = this.set("groupMeridiems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupMeridiems: Self = this.set("groupMeridiems", js.undefined)
    
    @scala.inline
    def setHideDate(value: Boolean): Self = this.set("hideDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDate: Self = this.set("hideDate", js.undefined)
    
    @scala.inline
    def setHideTime(value: Boolean): Self = this.set("hideTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTime: Self = this.set("hideTime", js.undefined)
    
    @scala.inline
    def setHideYear(value: Boolean): Self = this.set("hideYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideYear: Self = this.set("hideYear", js.undefined)
    
    @scala.inline
    def setHourFormat(value: String): Self = this.set("hourFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourFormat: Self = this.set("hourFormat", js.undefined)
    
    @scala.inline
    def setImplicitMinutes(value: Boolean): Self = this.set("implicitMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicitMinutes: Self = this.set("implicitMinutes", js.undefined)
    
    @scala.inline
    def setImplicitYear(value: Boolean): Self = this.set("implicitYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicitYear: Self = this.set("implicitYear", js.undefined)
    
    @scala.inline
    def setLastNightEndsAt(value: Double): Self = this.set("lastNightEndsAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastNightEndsAt: Self = this.set("lastNightEndsAt", js.undefined)
    
    @scala.inline
    def setMeridiemFormat(value: String): Self = this.set("meridiemFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeridiemFormat: Self = this.set("meridiemFormat", js.undefined)
    
    @scala.inline
    def setMinuteFormat(value: String): Self = this.set("minuteFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteFormat: Self = this.set("minuteFormat", js.undefined)
    
    @scala.inline
    def setMonthFormat(value: String): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthFormat: Self = this.set("monthFormat", js.undefined)
    
    @scala.inline
    def setShowDate(value: Boolean): Self = this.set("showDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDate: Self = this.set("showDate", js.undefined)
    
    @scala.inline
    def setShowDayOfWeek(value: Boolean): Self = this.set("showDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDayOfWeek: Self = this.set("showDayOfWeek", js.undefined)
    
    @scala.inline
    def setSpaceBeforeMeridiem(value: Boolean): Self = this.set("spaceBeforeMeridiem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceBeforeMeridiem: Self = this.set("spaceBeforeMeridiem", js.undefined)
    
    @scala.inline
    def setTwentyFourHour(value: Boolean): Self = this.set("twentyFourHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwentyFourHour: Self = this.set("twentyFourHour", js.undefined)
    
    @scala.inline
    def setWeekdayFormat(value: String): Self = this.set("weekdayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdayFormat: Self = this.set("weekdayFormat", js.undefined)
    
    @scala.inline
    def setYearFormat(value: String): Self = this.set("yearFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearFormat: Self = this.set("yearFormat", js.undefined)
  }
}
