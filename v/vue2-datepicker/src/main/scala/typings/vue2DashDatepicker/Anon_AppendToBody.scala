package typings.vue2DashDatepicker

import typings.std.Date
import typings.vue2DashDatepicker.vue2DashDatepickerMod.Datepicker.Lang
import typings.vue2DashDatepicker.vue2DashDatepickerMod.Datepicker.Shortcuts
import typings.vue2DashDatepicker.vue2DashDatepickerMod.Datepicker.TimePickerOptions
import typings.vue2DashDatepicker.vue2DashDatepickerMod.Datepicker.TimeSelectOptions
import typings.vue2DashDatepicker.vue2DashDatepickerMod.Datepicker.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppendToBody extends js.Object {
  var appendToBody: js.UndefOr[Boolean] = js.undefined
  var clearable: js.UndefOr[Boolean] = js.undefined
  var confirm: js.UndefOr[Boolean] = js.undefined
  var confirmText: js.UndefOr[String] = js.undefined
  var dateFormat: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledDays: js.UndefOr[(js.Array[Double | String]) | (js.Function1[/* date */ Date, js.Array[Date]])] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var inputAttr: js.UndefOr[String] = js.undefined
  var inputClass: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String | Lang] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var notAfter: js.UndefOr[String | Date] = js.undefined
  var notBefore: js.UndefOr[String | Date] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popupStyle: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var rangeSeparator: js.UndefOr[String] = js.undefined
  var shortcuts: js.UndefOr[Boolean | js.Array[Shortcuts]] = js.undefined
  var timePickerOptions: js.UndefOr[js.Array[TimePickerOptions] | js.Function0[js.Array[TimePickerOptions]]] = js.undefined
  var timeSelectOptions: js.UndefOr[TimeSelectOptions] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var valueType: js.UndefOr[ValueType] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object Anon_AppendToBody {
  @scala.inline
  def apply(
    appendToBody: js.UndefOr[Boolean] = js.undefined,
    clearable: js.UndefOr[Boolean] = js.undefined,
    confirm: js.UndefOr[Boolean] = js.undefined,
    confirmText: String = null,
    dateFormat: String = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDays: (js.Array[Double | String]) | (js.Function1[/* date */ Date, js.Array[Date]]) = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: Int | Double = null,
    format: String = null,
    inputAttr: String = null,
    inputClass: String = null,
    lang: String | Lang = null,
    minuteStep: Int | Double = null,
    notAfter: String | Date = null,
    notBefore: String | Date = null,
    placeholder: String = null,
    popupStyle: String = null,
    range: js.UndefOr[Boolean] = js.undefined,
    rangeSeparator: String = null,
    shortcuts: Boolean | js.Array[Shortcuts] = null,
    timePickerOptions: js.Array[TimePickerOptions] | js.Function0[js.Array[TimePickerOptions]] = null,
    timeSelectOptions: TimeSelectOptions = null,
    `type`: String = null,
    valueType: ValueType = null,
    width: Double | String = null
  ): Anon_AppendToBody = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appendToBody)) __obj.updateDynamic("appendToBody")(appendToBody.asInstanceOf[js.Any])
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (inputClass != null) __obj.updateDynamic("inputClass")(inputClass.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rangeSeparator != null) __obj.updateDynamic("rangeSeparator")(rangeSeparator.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (timePickerOptions != null) __obj.updateDynamic("timePickerOptions")(timePickerOptions.asInstanceOf[js.Any])
    if (timeSelectOptions != null) __obj.updateDynamic("timeSelectOptions")(timeSelectOptions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AppendToBody]
  }
}

