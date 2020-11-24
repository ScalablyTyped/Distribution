package typings.wojtekmajReactDatetimerangePicker.mod

import typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.hour
import typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.minute
import typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.second
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeRangePickerProps[T] extends DateTimeRangePickerCalendarProps {
  
  var amPmAriaLabel: js.UndefOr[String] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var calendarAriaLabel: js.UndefOr[String] = js.native
  
  var calendarClassName: js.UndefOr[String | js.Array[String]] = js.native
  
  var calendarIcon: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
  ] = js.native
  
  var clearAriaLabel: js.UndefOr[String] = js.native
  
  var clearIcon: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
  ] = js.native
  
  var clockClassName: js.UndefOr[String | js.Array[String]] = js.native
  
  var closeWidgets: js.UndefOr[Boolean] = js.native
  
  var dayAriaLabel: js.UndefOr[String] = js.native
  
  var dayPlaceholder: js.UndefOr[String] = js.native
  
  var disableCalendar: js.UndefOr[Boolean] = js.native
  
  var disableClock: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var hourAriaLabel: js.UndefOr[String] = js.native
  
  var hourPlaceholder: js.UndefOr[String] = js.native
  
  var isCalendarOpen: js.UndefOr[Boolean] = js.native
  
  var isClockOpen: js.UndefOr[Boolean] = js.native
  
  var maxDetail: js.UndefOr[hour | minute | second] = js.native
  
  var minuteAriaLabel: js.UndefOr[String] = js.native
  
  var minutePlaceholder: js.UndefOr[String] = js.native
  
  var monthAriaLabel: js.UndefOr[String] = js.native
  
  var monthPlaceholder: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nativeInputAriaLabel: js.UndefOr[String] = js.native
  
  var onCalendarClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onCalendarOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* val */ T, Unit]] = js.native
  
  var onClockClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onClockOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
  
  var rangeDivider: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
  ] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var secondAriaLabel: js.UndefOr[String] = js.native
  
  var secondPlaceholder: js.UndefOr[String] = js.native
  
  var showLeadingZeros: js.UndefOr[Boolean] = js.native
  
  var value: T = js.native
  
  var yearAriaLabel: js.UndefOr[String] = js.native
  
  var yearPlaceholder: js.UndefOr[String] = js.native
}
object DateTimeRangePickerProps {
  
  @scala.inline
  def apply[T](value: T): DateTimeRangePickerProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeRangePickerProps[T]]
  }
  
  @scala.inline
  implicit class DateTimeRangePickerPropsOps[Self <: DateTimeRangePickerProps[_], T] (val x: Self with DateTimeRangePickerProps[T]) extends AnyVal {
    
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
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmPmAriaLabel(value: String): Self = this.set("amPmAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmPmAriaLabel: Self = this.set("amPmAriaLabel", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setCalendarAriaLabel(value: String): Self = this.set("calendarAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarAriaLabel: Self = this.set("calendarAriaLabel", js.undefined)
    
    @scala.inline
    def setCalendarClassNameVarargs(value: String*): Self = this.set("calendarClassName", js.Array(value :_*))
    
    @scala.inline
    def setCalendarClassName(value: String | js.Array[String]): Self = this.set("calendarClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarClassName: Self = this.set("calendarClassName", js.undefined)
    
    @scala.inline
    def setCalendarIcon(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = this.set("calendarIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarIcon: Self = this.set("calendarIcon", js.undefined)
    
    @scala.inline
    def setClearAriaLabel(value: String): Self = this.set("clearAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearAriaLabel: Self = this.set("clearAriaLabel", js.undefined)
    
    @scala.inline
    def setClearIcon(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    
    @scala.inline
    def setClockClassNameVarargs(value: String*): Self = this.set("clockClassName", js.Array(value :_*))
    
    @scala.inline
    def setClockClassName(value: String | js.Array[String]): Self = this.set("clockClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockClassName: Self = this.set("clockClassName", js.undefined)
    
    @scala.inline
    def setCloseWidgets(value: Boolean): Self = this.set("closeWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseWidgets: Self = this.set("closeWidgets", js.undefined)
    
    @scala.inline
    def setDayAriaLabel(value: String): Self = this.set("dayAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayAriaLabel: Self = this.set("dayAriaLabel", js.undefined)
    
    @scala.inline
    def setDayPlaceholder(value: String): Self = this.set("dayPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayPlaceholder: Self = this.set("dayPlaceholder", js.undefined)
    
    @scala.inline
    def setDisableCalendar(value: Boolean): Self = this.set("disableCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCalendar: Self = this.set("disableCalendar", js.undefined)
    
    @scala.inline
    def setDisableClock(value: Boolean): Self = this.set("disableClock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableClock: Self = this.set("disableClock", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHourAriaLabel(value: String): Self = this.set("hourAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourAriaLabel: Self = this.set("hourAriaLabel", js.undefined)
    
    @scala.inline
    def setHourPlaceholder(value: String): Self = this.set("hourPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourPlaceholder: Self = this.set("hourPlaceholder", js.undefined)
    
    @scala.inline
    def setIsCalendarOpen(value: Boolean): Self = this.set("isCalendarOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCalendarOpen: Self = this.set("isCalendarOpen", js.undefined)
    
    @scala.inline
    def setIsClockOpen(value: Boolean): Self = this.set("isClockOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClockOpen: Self = this.set("isClockOpen", js.undefined)
    
    @scala.inline
    def setMaxDetail(value: hour | minute | second): Self = this.set("maxDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDetail: Self = this.set("maxDetail", js.undefined)
    
    @scala.inline
    def setMinuteAriaLabel(value: String): Self = this.set("minuteAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteAriaLabel: Self = this.set("minuteAriaLabel", js.undefined)
    
    @scala.inline
    def setMinutePlaceholder(value: String): Self = this.set("minutePlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutePlaceholder: Self = this.set("minutePlaceholder", js.undefined)
    
    @scala.inline
    def setMonthAriaLabel(value: String): Self = this.set("monthAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthAriaLabel: Self = this.set("monthAriaLabel", js.undefined)
    
    @scala.inline
    def setMonthPlaceholder(value: String): Self = this.set("monthPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthPlaceholder: Self = this.set("monthPlaceholder", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNativeInputAriaLabel(value: String): Self = this.set("nativeInputAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeInputAriaLabel: Self = this.set("nativeInputAriaLabel", js.undefined)
    
    @scala.inline
    def setOnCalendarClose(value: () => Unit): Self = this.set("onCalendarClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCalendarClose: Self = this.set("onCalendarClose", js.undefined)
    
    @scala.inline
    def setOnCalendarOpen(value: () => Unit): Self = this.set("onCalendarOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCalendarOpen: Self = this.set("onCalendarOpen", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* val */ T => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClockClose(value: () => Unit): Self = this.set("onClockClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClockClose: Self = this.set("onClockClose", js.undefined)
    
    @scala.inline
    def setOnClockOpen(value: () => Unit): Self = this.set("onClockOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClockOpen: Self = this.set("onClockOpen", js.undefined)
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setRangeDivider(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = this.set("rangeDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeDivider: Self = this.set("rangeDivider", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSecondAriaLabel(value: String): Self = this.set("secondAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondAriaLabel: Self = this.set("secondAriaLabel", js.undefined)
    
    @scala.inline
    def setSecondPlaceholder(value: String): Self = this.set("secondPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondPlaceholder: Self = this.set("secondPlaceholder", js.undefined)
    
    @scala.inline
    def setShowLeadingZeros(value: Boolean): Self = this.set("showLeadingZeros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLeadingZeros: Self = this.set("showLeadingZeros", js.undefined)
    
    @scala.inline
    def setYearAriaLabel(value: String): Self = this.set("yearAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearAriaLabel: Self = this.set("yearAriaLabel", js.undefined)
    
    @scala.inline
    def setYearPlaceholder(value: String): Self = this.set("yearPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearPlaceholder: Self = this.set("yearPlaceholder", js.undefined)
  }
}
