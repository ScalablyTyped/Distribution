package typings.vue2DashDatepicker

import typings.std.Date
import typings.vue2DashDatepicker.vue2DashDatepickerMod.DatepickerNs.Lang
import typings.vue2DashDatepicker.vue2DashDatepickerMod.DatepickerNs.Shortcuts
import typings.vue2DashDatepicker.vue2DashDatepickerMod.DatepickerNs.TimePickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clearable extends js.Object {
  var clearable: js.UndefOr[Boolean] = js.undefined
  var confirm: js.UndefOr[Boolean] = js.undefined
  var confirmText: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledDays: js.UndefOr[(js.Array[Double | String]) | (js.Function1[/* date */ Date, js.Array[Date]])] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var inputClass: js.UndefOr[String] = js.undefined
  var inputName: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String | Lang] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var notAfter: js.UndefOr[String | Date] = js.undefined
  var notBefore: js.UndefOr[String | Date] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var rangeSeparator: js.UndefOr[String] = js.undefined
  var shortcuts: js.UndefOr[Boolean | js.Array[Shortcuts]] = js.undefined
  var timePickerOptions: js.UndefOr[js.Array[TimePickerOptions] | js.Function0[js.Array[TimePickerOptions]]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object Anon_Clearable {
  @scala.inline
  def apply(
    clearable: js.UndefOr[Boolean] = js.undefined,
    confirm: js.UndefOr[Boolean] = js.undefined,
    confirmText: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDays: (js.Array[Double | String]) | (js.Function1[/* date */ Date, js.Array[Date]]) = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: Int | Double = null,
    format: String = null,
    inputClass: String = null,
    inputName: String = null,
    lang: String | Lang = null,
    minuteStep: Int | Double = null,
    notAfter: String | Date = null,
    notBefore: String | Date = null,
    placeholder: String = null,
    range: js.UndefOr[Boolean] = js.undefined,
    rangeSeparator: String = null,
    shortcuts: Boolean | js.Array[Shortcuts] = null,
    timePickerOptions: js.Array[TimePickerOptions] | js.Function0[js.Array[TimePickerOptions]] = null,
    `type`: String = null,
    width: Double | String = null
  ): Anon_Clearable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable)
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm)
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (inputClass != null) __obj.updateDynamic("inputClass")(inputClass)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (rangeSeparator != null) __obj.updateDynamic("rangeSeparator")(rangeSeparator)
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (timePickerOptions != null) __obj.updateDynamic("timePickerOptions")(timePickerOptions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Clearable]
  }
}

