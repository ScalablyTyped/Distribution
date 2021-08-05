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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppendToBody extends StObject {
    
    var appendToBody: js.UndefOr[Boolean] = js.undefined
    
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    var confirm: js.UndefOr[Boolean] = js.undefined
    
    var confirmText: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[Date] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.undefined
    
    var disabledTime: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.undefined
    
    var editable: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var hourOptions: js.UndefOr[js.Array[Double]] = js.undefined
    
    var hourStep: js.UndefOr[Double] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var inputAttr: js.UndefOr[js.Function0[js.Object]] = js.undefined
    
    var inputClass: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String | Lang] = js.undefined
    
    var minuteOptions: js.UndefOr[js.Array[Double]] = js.undefined
    
    var minuteStep: js.UndefOr[Double] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var partialUpdate: js.UndefOr[Boolean] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popupClass: js.UndefOr[String] = js.undefined
    
    var popupStyle: js.UndefOr[js.Function0[js.Object]] = js.undefined
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var rangeSeparator: js.UndefOr[String] = js.undefined
    
    var secondOptions: js.UndefOr[js.Array[Double]] = js.undefined
    
    var secondStep: js.UndefOr[Double] = js.undefined
    
    var shortcuts: js.UndefOr[js.Array[Shortcuts]] = js.undefined
    
    var showHour: js.UndefOr[Boolean] = js.undefined
    
    var showMinute: js.UndefOr[Boolean] = js.undefined
    
    var showSecond: js.UndefOr[Boolean] = js.undefined
    
    var showTimeHeader: js.UndefOr[Boolean] = js.undefined
    
    var showWeekNumber: js.UndefOr[Boolean] = js.undefined
    
    var timePickerOptions: js.UndefOr[TimePickerOptions] = js.undefined
    
    var timeTitleFormat: js.UndefOr[String] = js.undefined
    
    var titleFormat: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[date | datetime | year | month | time | week] = js.undefined
    
    var use12h: js.UndefOr[Boolean] = js.undefined
    
    var valueType: js.UndefOr[ValueType] = js.undefined
  }
  object AppendToBody {
    
    inline def apply(): AppendToBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppendToBody]
    }
    
    extension [Self <: AppendToBody](x: Self) {
      
      inline def setAppendToBody(value: Boolean): Self = StObject.set(x, "appendToBody", value.asInstanceOf[js.Any])
      
      inline def setAppendToBodyUndefined: Self = StObject.set(x, "appendToBody", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
      
      inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledDate(value: /* date */ Date => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setDisabledTime(value: /* date */ Date => Boolean): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHourOptions(value: js.Array[Double]): Self = StObject.set(x, "hourOptions", value.asInstanceOf[js.Any])
      
      inline def setHourOptionsUndefined: Self = StObject.set(x, "hourOptions", js.undefined)
      
      inline def setHourOptionsVarargs(value: Double*): Self = StObject.set(x, "hourOptions", js.Array(value :_*))
      
      inline def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      inline def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInputAttr(value: () => js.Object): Self = StObject.set(x, "inputAttr", js.Any.fromFunction0(value))
      
      inline def setInputAttrUndefined: Self = StObject.set(x, "inputAttr", js.undefined)
      
      inline def setInputClass(value: String): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
      
      inline def setInputClassUndefined: Self = StObject.set(x, "inputClass", js.undefined)
      
      inline def setLang(value: String | Lang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMinuteOptions(value: js.Array[Double]): Self = StObject.set(x, "minuteOptions", value.asInstanceOf[js.Any])
      
      inline def setMinuteOptionsUndefined: Self = StObject.set(x, "minuteOptions", js.undefined)
      
      inline def setMinuteOptionsVarargs(value: Double*): Self = StObject.set(x, "minuteOptions", js.Array(value :_*))
      
      inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPartialUpdate(value: Boolean): Self = StObject.set(x, "partialUpdate", value.asInstanceOf[js.Any])
      
      inline def setPartialUpdateUndefined: Self = StObject.set(x, "partialUpdate", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopupClass(value: String): Self = StObject.set(x, "popupClass", value.asInstanceOf[js.Any])
      
      inline def setPopupClassUndefined: Self = StObject.set(x, "popupClass", js.undefined)
      
      inline def setPopupStyle(value: () => js.Object): Self = StObject.set(x, "popupStyle", js.Any.fromFunction0(value))
      
      inline def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeSeparator(value: String): Self = StObject.set(x, "rangeSeparator", value.asInstanceOf[js.Any])
      
      inline def setRangeSeparatorUndefined: Self = StObject.set(x, "rangeSeparator", js.undefined)
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setSecondOptions(value: js.Array[Double]): Self = StObject.set(x, "secondOptions", value.asInstanceOf[js.Any])
      
      inline def setSecondOptionsUndefined: Self = StObject.set(x, "secondOptions", js.undefined)
      
      inline def setSecondOptionsVarargs(value: Double*): Self = StObject.set(x, "secondOptions", js.Array(value :_*))
      
      inline def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      inline def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      inline def setShortcuts(value: js.Array[Shortcuts]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
      
      inline def setShortcutsVarargs(value: Shortcuts*): Self = StObject.set(x, "shortcuts", js.Array(value :_*))
      
      inline def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      inline def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      inline def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      inline def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      inline def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      inline def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      inline def setShowTimeHeader(value: Boolean): Self = StObject.set(x, "showTimeHeader", value.asInstanceOf[js.Any])
      
      inline def setShowTimeHeaderUndefined: Self = StObject.set(x, "showTimeHeader", js.undefined)
      
      inline def setShowWeekNumber(value: Boolean): Self = StObject.set(x, "showWeekNumber", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumberUndefined: Self = StObject.set(x, "showWeekNumber", js.undefined)
      
      inline def setTimePickerOptions(value: TimePickerOptions): Self = StObject.set(x, "timePickerOptions", value.asInstanceOf[js.Any])
      
      inline def setTimePickerOptionsUndefined: Self = StObject.set(x, "timePickerOptions", js.undefined)
      
      inline def setTimeTitleFormat(value: String): Self = StObject.set(x, "timeTitleFormat", value.asInstanceOf[js.Any])
      
      inline def setTimeTitleFormatUndefined: Self = StObject.set(x, "timeTitleFormat", js.undefined)
      
      inline def setTitleFormat(value: String): Self = StObject.set(x, "titleFormat", value.asInstanceOf[js.Any])
      
      inline def setTitleFormatUndefined: Self = StObject.set(x, "titleFormat", js.undefined)
      
      inline def setType(value: date | datetime | year | month | time | week): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUse12h(value: Boolean): Self = StObject.set(x, "use12h", value.asInstanceOf[js.Any])
      
      inline def setUse12hUndefined: Self = StObject.set(x, "use12h", js.undefined)
      
      inline def setValueType(value: ValueType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    }
  }
  
  trait FirstDayOfWeek extends StObject {
    
    var firstDayOfWeek: Double
    
    var firstWeekContainsDate: Double
    
    def isPM(input: String): Boolean
    
    def meridiem(h: Double, _underscore: Double, isLowercase: Boolean): Boolean
    
    var meridiemParse: RegExp
    
    var months: js.Array[String]
    
    var monthsShort: js.Array[String]
    
    var weekdays: js.Array[String]
    
    var weekdaysMin: js.Array[String]
    
    var weekdaysShort: js.Array[String]
  }
  object FirstDayOfWeek {
    
    inline def apply(
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
    
    extension [Self <: FirstDayOfWeek](x: Self) {
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstWeekContainsDate(value: Double): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
      
      inline def setIsPM(value: String => Boolean): Self = StObject.set(x, "isPM", js.Any.fromFunction1(value))
      
      inline def setMeridiem(value: (Double, Double, Boolean) => Boolean): Self = StObject.set(x, "meridiem", js.Any.fromFunction3(value))
      
      inline def setMeridiemParse(value: RegExp): Self = StObject.set(x, "meridiemParse", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
      
      inline def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value :_*))
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      inline def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysMin(value: js.Array[String]): Self = StObject.set(x, "weekdaysMin", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysMinVarargs(value: String*): Self = StObject.set(x, "weekdaysMin", js.Array(value :_*))
      
      inline def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
      
      inline def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value :_*))
    }
  }
}
