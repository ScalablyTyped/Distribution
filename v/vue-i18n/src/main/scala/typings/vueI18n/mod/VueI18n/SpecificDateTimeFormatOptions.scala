package typings.vueI18n.mod.VueI18n

import typings.vueI18n.vueI18nStrings.long
import typings.vueI18n.vueI18nStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpecificDateTimeFormatOptions
  extends typings.std.Intl.DateTimeFormatOptions {
  
  @JSName("day")
  var day_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
  
  @JSName("era")
  var era_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.native
  
  @JSName("formatMatcher")
  var formatMatcher_SpecificDateTimeFormatOptions: js.UndefOr[FormatMatcher] = js.native
  
  @JSName("hour")
  var hour_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
  
  @JSName("localeMatcher")
  var localeMatcher_SpecificDateTimeFormatOptions: js.UndefOr[LocaleMatcher] = js.native
  
  @JSName("minute")
  var minute_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
  
  @JSName("month")
  var month_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital | DateTimeHumanReadable] = js.native
  
  @JSName("second")
  var second_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
  
  @JSName("timeZoneName")
  var timeZoneName_SpecificDateTimeFormatOptions: js.UndefOr[long | short] = js.native
  
  @JSName("weekday")
  var weekday_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.native
  
  @JSName("year")
  var year_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
}
object SpecificDateTimeFormatOptions {
  
  @scala.inline
  def apply(): SpecificDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecificDateTimeFormatOptions]
  }
  
  @scala.inline
  implicit class SpecificDateTimeFormatOptionsOps[Self <: SpecificDateTimeFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setDay(value: DateTimeDigital): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setEra(value: DateTimeHumanReadable): Self = this.set("era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEra: Self = this.set("era", js.undefined)
    
    @scala.inline
    def setFormatMatcher(value: FormatMatcher): Self = this.set("formatMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatMatcher: Self = this.set("formatMatcher", js.undefined)
    
    @scala.inline
    def setHour(value: DateTimeDigital): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: LocaleMatcher): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
    
    @scala.inline
    def setMinute(value: DateTimeDigital): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    
    @scala.inline
    def setMonth(value: DateTimeDigital | DateTimeHumanReadable): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setSecond(value: DateTimeDigital): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    
    @scala.inline
    def setTimeZoneName(value: long | short): Self = this.set("timeZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneName: Self = this.set("timeZoneName", js.undefined)
    
    @scala.inline
    def setWeekday(value: DateTimeHumanReadable): Self = this.set("weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekday: Self = this.set("weekday", js.undefined)
    
    @scala.inline
    def setYear(value: DateTimeDigital): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
