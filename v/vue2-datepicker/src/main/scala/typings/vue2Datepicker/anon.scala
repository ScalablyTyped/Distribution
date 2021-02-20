package typings.vue2Datepicker

import typings.std.Date
import typings.std.RegExp
import typings.vue2Datepicker.mod.Datepicker.Lang
import typings.vue2Datepicker.mod.Datepicker.Shortcuts
import typings.vue2Datepicker.mod.Datepicker.TimePickerOptions
import typings.vue2Datepicker.mod.Datepicker.ValueType
import typings.vue2Datepicker.vue2DatepickerStrings.date
import typings.vue2Datepicker.vue2DatepickerStrings.datetime
import typings.vue2Datepicker.vue2DatepickerStrings.month
import typings.vue2Datepicker.vue2DatepickerStrings.time
import typings.vue2Datepicker.vue2DatepickerStrings.week
import typings.vue2Datepicker.vue2DatepickerStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AppendToBody extends StObject {
    
    var appendToBody: js.UndefOr[Boolean] = js.native
    
    var clearable: js.UndefOr[Boolean] = js.native
    
    var confirm: js.UndefOr[Boolean] = js.native
    
    var confirmText: js.UndefOr[String] = js.native
    
    var defaultValue: js.UndefOr[Date] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.native
    
    var disabledTime: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.native
    
    var editable: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var hourOptions: js.UndefOr[js.Array[Double]] = js.native
    
    var hourStep: js.UndefOr[Double] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var inputAttr: js.UndefOr[js.Function0[js.Object]] = js.native
    
    var inputClass: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String | Lang] = js.native
    
    var minuteOptions: js.UndefOr[js.Array[Double]] = js.native
    
    var minuteStep: js.UndefOr[Double] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var partialUpdate: js.UndefOr[Boolean] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var popupClass: js.UndefOr[String] = js.native
    
    var popupStyle: js.UndefOr[js.Function0[js.Object]] = js.native
    
    var range: js.UndefOr[Boolean] = js.native
    
    var rangeSeparator: js.UndefOr[String] = js.native
    
    var secondOptions: js.UndefOr[js.Array[Double]] = js.native
    
    var secondStep: js.UndefOr[Double] = js.native
    
    var shortcuts: js.UndefOr[js.Array[Shortcuts]] = js.native
    
    var showHour: js.UndefOr[Boolean] = js.native
    
    var showMinute: js.UndefOr[Boolean] = js.native
    
    var showSecond: js.UndefOr[Boolean] = js.native
    
    var showTimeHeader: js.UndefOr[Boolean] = js.native
    
    var showWeekNumber: js.UndefOr[Boolean] = js.native
    
    var timePickerOptions: js.UndefOr[TimePickerOptions] = js.native
    
    var timeTitleFormat: js.UndefOr[String] = js.native
    
    var titleFormat: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[date | datetime | year | month | time | week] = js.native
    
    var use12h: js.UndefOr[Boolean] = js.native
    
    var valueType: js.UndefOr[ValueType] = js.native
  }
  object AppendToBody {
    
    @scala.inline
    def apply(): AppendToBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppendToBody]
    }
    
    @scala.inline
    implicit class AppendToBodyMutableBuilder[Self <: AppendToBody] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendToBody(value: Boolean): Self = StObject.set(x, "appendToBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToBodyUndefined: Self = StObject.set(x, "appendToBody", js.undefined)
      
      @scala.inline
      def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      @scala.inline
      def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
      
      @scala.inline
      def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDate(value: /* date */ Date => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setDisabledTime(value: /* date */ Date => Boolean): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHourOptions(value: js.Array[Double]): Self = StObject.set(x, "hourOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourOptionsUndefined: Self = StObject.set(x, "hourOptions", js.undefined)
      
      @scala.inline
      def setHourOptionsVarargs(value: Double*): Self = StObject.set(x, "hourOptions", js.Array(value :_*))
      
      @scala.inline
      def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInputAttr(value: () => js.Object): Self = StObject.set(x, "inputAttr", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInputAttrUndefined: Self = StObject.set(x, "inputAttr", js.undefined)
      
      @scala.inline
      def setInputClass(value: String): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputClassUndefined: Self = StObject.set(x, "inputClass", js.undefined)
      
      @scala.inline
      def setLang(value: String | Lang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMinuteOptions(value: js.Array[Double]): Self = StObject.set(x, "minuteOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteOptionsUndefined: Self = StObject.set(x, "minuteOptions", js.undefined)
      
      @scala.inline
      def setMinuteOptionsVarargs(value: Double*): Self = StObject.set(x, "minuteOptions", js.Array(value :_*))
      
      @scala.inline
      def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPartialUpdate(value: Boolean): Self = StObject.set(x, "partialUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialUpdateUndefined: Self = StObject.set(x, "partialUpdate", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopupClass(value: String): Self = StObject.set(x, "popupClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassUndefined: Self = StObject.set(x, "popupClass", js.undefined)
      
      @scala.inline
      def setPopupStyle(value: () => js.Object): Self = StObject.set(x, "popupStyle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeSeparator(value: String): Self = StObject.set(x, "rangeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeSeparatorUndefined: Self = StObject.set(x, "rangeSeparator", js.undefined)
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setSecondOptions(value: js.Array[Double]): Self = StObject.set(x, "secondOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondOptionsUndefined: Self = StObject.set(x, "secondOptions", js.undefined)
      
      @scala.inline
      def setSecondOptionsVarargs(value: Double*): Self = StObject.set(x, "secondOptions", js.Array(value :_*))
      
      @scala.inline
      def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      @scala.inline
      def setShortcuts(value: js.Array[Shortcuts]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      @scala.inline
      def setShortcutsVarargs(value: Shortcuts*): Self = StObject.set(x, "shortcuts", js.Array(value :_*))
      
      @scala.inline
      def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      @scala.inline
      def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      @scala.inline
      def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      @scala.inline
      def setShowTimeHeader(value: Boolean): Self = StObject.set(x, "showTimeHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTimeHeaderUndefined: Self = StObject.set(x, "showTimeHeader", js.undefined)
      
      @scala.inline
      def setShowWeekNumber(value: Boolean): Self = StObject.set(x, "showWeekNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowWeekNumberUndefined: Self = StObject.set(x, "showWeekNumber", js.undefined)
      
      @scala.inline
      def setTimePickerOptions(value: TimePickerOptions): Self = StObject.set(x, "timePickerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerOptionsUndefined: Self = StObject.set(x, "timePickerOptions", js.undefined)
      
      @scala.inline
      def setTimeTitleFormat(value: String): Self = StObject.set(x, "timeTitleFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeTitleFormatUndefined: Self = StObject.set(x, "timeTitleFormat", js.undefined)
      
      @scala.inline
      def setTitleFormat(value: String): Self = StObject.set(x, "titleFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFormatUndefined: Self = StObject.set(x, "titleFormat", js.undefined)
      
      @scala.inline
      def setType(value: date | datetime | year | month | time | week): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUse12h(value: Boolean): Self = StObject.set(x, "use12h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse12hUndefined: Self = StObject.set(x, "use12h", js.undefined)
      
      @scala.inline
      def setValueType(value: ValueType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    }
  }
  
  @js.native
  trait FirstDayOfWeek extends StObject {
    
    var firstDayOfWeek: Double = js.native
    
    var firstWeekContainsDate: Double = js.native
    
    def isPM(input: String): Boolean = js.native
    
    def meridiem(h: Double, _underscore: Double, isLowercase: Boolean): Boolean = js.native
    
    var meridiemParse: RegExp = js.native
    
    var months: js.Array[String] = js.native
    
    var monthsShort: js.Array[String] = js.native
    
    var weekdays: js.Array[String] = js.native
    
    var weekdaysMin: js.Array[String] = js.native
    
    var weekdaysShort: js.Array[String] = js.native
  }
  object FirstDayOfWeek {
    
    @scala.inline
    def apply(
      firstDayOfWeek: Double,
      firstWeekContainsDate: Double,
      isPM: String => Boolean,
      meridiem: (Double, Double, Boolean) => Boolean,
      meridiemParse: RegExp,
      months: js.Array[String],
      monthsShort: js.Array[String],
      weekdays: js.Array[String],
      weekdaysMin: js.Array[String],
      weekdaysShort: js.Array[String]
    ): FirstDayOfWeek = {
      val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekContainsDate = firstWeekContainsDate.asInstanceOf[js.Any], isPM = js.Any.fromFunction1(isPM), meridiem = js.Any.fromFunction3(meridiem), meridiemParse = meridiemParse.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysMin = weekdaysMin.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstDayOfWeek]
    }
    
    @scala.inline
    implicit class FirstDayOfWeekMutableBuilder[Self <: FirstDayOfWeek] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstWeekContainsDate(value: Double): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPM(value: String => Boolean): Self = StObject.set(x, "isPM", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMeridiem(value: (Double, Double, Boolean) => Boolean): Self = StObject.set(x, "meridiem", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMeridiemParse(value: RegExp): Self = StObject.set(x, "meridiemParse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value :_*))
      
      @scala.inline
      def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      @scala.inline
      def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysMin(value: js.Array[String]): Self = StObject.set(x, "weekdaysMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysMinVarargs(value: String*): Self = StObject.set(x, "weekdaysMin", js.Array(value :_*))
      
      @scala.inline
      def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
      
      @scala.inline
      def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
    }
  }
}
