package typings.vue2Datepicker.anon

import typings.std.Date
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppendToBody extends js.Object {
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
  implicit class AppendToBodyOps[Self <: AppendToBody] (val x: Self) extends AnyVal {
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
    def setAppendToBody(value: Boolean): Self = this.set("appendToBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendToBody: Self = this.set("appendToBody", js.undefined)
    @scala.inline
    def setClearable(value: Boolean): Self = this.set("clearable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearable: Self = this.set("clearable", js.undefined)
    @scala.inline
    def setConfirm(value: Boolean): Self = this.set("confirm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
    @scala.inline
    def setConfirmText(value: String): Self = this.set("confirmText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmText: Self = this.set("confirmText", js.undefined)
    @scala.inline
    def setDefaultValue(value: Date): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledDate(value: /* date */ Date => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    @scala.inline
    def setDisabledTime(value: /* date */ Date => Boolean): Self = this.set("disabledTime", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledTime: Self = this.set("disabledTime", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHourOptionsVarargs(value: Double*): Self = this.set("hourOptions", js.Array(value :_*))
    @scala.inline
    def setHourOptions(value: js.Array[Double]): Self = this.set("hourOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourOptions: Self = this.set("hourOptions", js.undefined)
    @scala.inline
    def setHourStep(value: Double): Self = this.set("hourStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourStep: Self = this.set("hourStep", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInputAttr(value: () => js.Object): Self = this.set("inputAttr", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInputAttr: Self = this.set("inputAttr", js.undefined)
    @scala.inline
    def setInputClass(value: String): Self = this.set("inputClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputClass: Self = this.set("inputClass", js.undefined)
    @scala.inline
    def setLang(value: String | Lang): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setMinuteOptionsVarargs(value: Double*): Self = this.set("minuteOptions", js.Array(value :_*))
    @scala.inline
    def setMinuteOptions(value: js.Array[Double]): Self = this.set("minuteOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteOptions: Self = this.set("minuteOptions", js.undefined)
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPartialUpdate(value: Boolean): Self = this.set("partialUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialUpdate: Self = this.set("partialUpdate", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopupClass(value: String): Self = this.set("popupClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupClass: Self = this.set("popupClass", js.undefined)
    @scala.inline
    def setPopupStyle(value: () => js.Object): Self = this.set("popupStyle", js.Any.fromFunction0(value))
    @scala.inline
    def deletePopupStyle: Self = this.set("popupStyle", js.undefined)
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRangeSeparator(value: String): Self = this.set("rangeSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeSeparator: Self = this.set("rangeSeparator", js.undefined)
    @scala.inline
    def setSecondOptionsVarargs(value: Double*): Self = this.set("secondOptions", js.Array(value :_*))
    @scala.inline
    def setSecondOptions(value: js.Array[Double]): Self = this.set("secondOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondOptions: Self = this.set("secondOptions", js.undefined)
    @scala.inline
    def setSecondStep(value: Double): Self = this.set("secondStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondStep: Self = this.set("secondStep", js.undefined)
    @scala.inline
    def setShortcutsVarargs(value: Shortcuts*): Self = this.set("shortcuts", js.Array(value :_*))
    @scala.inline
    def setShortcuts(value: js.Array[Shortcuts]): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortcuts: Self = this.set("shortcuts", js.undefined)
    @scala.inline
    def setShowHour(value: Boolean): Self = this.set("showHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHour: Self = this.set("showHour", js.undefined)
    @scala.inline
    def setShowMinute(value: Boolean): Self = this.set("showMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMinute: Self = this.set("showMinute", js.undefined)
    @scala.inline
    def setShowSecond(value: Boolean): Self = this.set("showSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSecond: Self = this.set("showSecond", js.undefined)
    @scala.inline
    def setShowTimeHeader(value: Boolean): Self = this.set("showTimeHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTimeHeader: Self = this.set("showTimeHeader", js.undefined)
    @scala.inline
    def setShowWeekNumber(value: Boolean): Self = this.set("showWeekNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWeekNumber: Self = this.set("showWeekNumber", js.undefined)
    @scala.inline
    def setTimePickerOptions(value: TimePickerOptions): Self = this.set("timePickerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePickerOptions: Self = this.set("timePickerOptions", js.undefined)
    @scala.inline
    def setTimeTitleFormat(value: String): Self = this.set("timeTitleFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeTitleFormat: Self = this.set("timeTitleFormat", js.undefined)
    @scala.inline
    def setTitleFormat(value: String): Self = this.set("titleFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleFormat: Self = this.set("titleFormat", js.undefined)
    @scala.inline
    def setType(value: date | datetime | year | month | time | week): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUse12h(value: Boolean): Self = this.set("use12h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse12h: Self = this.set("use12h", js.undefined)
    @scala.inline
    def setValueType(value: ValueType): Self = this.set("valueType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
  }
  
}

