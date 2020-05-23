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

trait AppendToBody extends js.Object {
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
  @scala.inline
  def apply(
    appendToBody: js.UndefOr[Boolean] = js.undefined,
    clearable: js.UndefOr[Boolean] = js.undefined,
    confirm: js.UndefOr[Boolean] = js.undefined,
    confirmText: String = null,
    defaultValue: Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDate: /* date */ Date => Boolean = null,
    disabledTime: /* date */ Date => Boolean = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    hourOptions: js.Array[Double] = null,
    hourStep: js.UndefOr[Double] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inputAttr: () => js.Object = null,
    inputClass: String = null,
    lang: String | Lang = null,
    minuteOptions: js.Array[Double] = null,
    minuteStep: js.UndefOr[Double] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    partialUpdate: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    popupClass: String = null,
    popupStyle: () => js.Object = null,
    range: js.UndefOr[Boolean] = js.undefined,
    rangeSeparator: String = null,
    secondOptions: js.Array[Double] = null,
    secondStep: js.UndefOr[Double] = js.undefined,
    shortcuts: js.Array[Shortcuts] = null,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    showTimeHeader: js.UndefOr[Boolean] = js.undefined,
    showWeekNumber: js.UndefOr[Boolean] = js.undefined,
    timePickerOptions: TimePickerOptions = null,
    timeTitleFormat: String = null,
    titleFormat: String = null,
    `type`: date | datetime | year | month | time | week = null,
    use12h: js.UndefOr[Boolean] = js.undefined,
    valueType: ValueType = null
  ): AppendToBody = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendToBody)) __obj.updateDynamic("appendToBody")(appendToBody.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm.get.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction1(disabledTime))
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hourOptions != null) __obj.updateDynamic("hourOptions")(hourOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(hourStep)) __obj.updateDynamic("hourStep")(hourStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(js.Any.fromFunction0(inputAttr))
    if (inputClass != null) __obj.updateDynamic("inputClass")(inputClass.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (minuteOptions != null) __obj.updateDynamic("minuteOptions")(minuteOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteStep)) __obj.updateDynamic("minuteStep")(minuteStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partialUpdate)) __obj.updateDynamic("partialUpdate")(partialUpdate.get.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupClass != null) __obj.updateDynamic("popupClass")(popupClass.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(js.Any.fromFunction0(popupStyle))
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (rangeSeparator != null) __obj.updateDynamic("rangeSeparator")(rangeSeparator.asInstanceOf[js.Any])
    if (secondOptions != null) __obj.updateDynamic("secondOptions")(secondOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(secondStep)) __obj.updateDynamic("secondStep")(secondStep.get.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimeHeader)) __obj.updateDynamic("showTimeHeader")(showTimeHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumber)) __obj.updateDynamic("showWeekNumber")(showWeekNumber.get.asInstanceOf[js.Any])
    if (timePickerOptions != null) __obj.updateDynamic("timePickerOptions")(timePickerOptions.asInstanceOf[js.Any])
    if (timeTitleFormat != null) __obj.updateDynamic("timeTitleFormat")(timeTitleFormat.asInstanceOf[js.Any])
    if (titleFormat != null) __obj.updateDynamic("titleFormat")(titleFormat.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(use12h)) __obj.updateDynamic("use12h")(use12h.get.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendToBody]
  }
}

