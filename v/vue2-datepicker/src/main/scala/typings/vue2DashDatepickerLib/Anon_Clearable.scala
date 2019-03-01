package typings
package vue2DashDatepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clearable extends js.Object {
  var clearable: js.UndefOr[scala.Boolean] = js.undefined
  var confirm: js.UndefOr[scala.Boolean] = js.undefined
  var confirmText: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledDays: js.UndefOr[
    js.Array[scala.Double] | js.Array[java.lang.String] | (js.Function1[/* date */ stdLib.Date, js.Array[stdLib.Date]])
  ] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[scala.Double] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var inputClass: js.UndefOr[java.lang.String] = js.undefined
  var inputName: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String | vue2DashDatepickerLib.vue2DashDatepickerMod.DatepickerNs.Lang] = js.undefined
  var minuteStep: js.UndefOr[scala.Double] = js.undefined
  var notAfter: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var notBefore: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
  var rangeSeparator: js.UndefOr[java.lang.String] = js.undefined
  var shortcuts: js.UndefOr[
    scala.Boolean | js.Array[vue2DashDatepickerLib.vue2DashDatepickerMod.DatepickerNs.Shortcuts]
  ] = js.undefined
  var timePickerOptions: js.UndefOr[
    js.Array[vue2DashDatepickerLib.vue2DashDatepickerMod.DatepickerNs.TimePickerOptions] | (js.Function0[
      js.Array[vue2DashDatepickerLib.vue2DashDatepickerMod.DatepickerNs.TimePickerOptions]
    ])
  ] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_Clearable {
  @scala.inline
  def apply(
    clearable: js.UndefOr[scala.Boolean] = js.undefined,
    confirm: js.UndefOr[scala.Boolean] = js.undefined,
    confirmText: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledDays: js.Array[scala.Double] | js.Array[java.lang.String] | (js.Function1[/* date */ stdLib.Date, js.Array[stdLib.Date]]) = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    firstDayOfWeek: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    inputClass: java.lang.String = null,
    inputName: java.lang.String = null,
    lang: java.lang.String | vue2DashDatepickerLib.vue2DashDatepickerMod.DatepickerNs.Lang = null,
    minuteStep: scala.Int | scala.Double = null,
    notAfter: java.lang.String | stdLib.Date = null,
    notBefore: java.lang.String | stdLib.Date = null,
    placeholder: java.lang.String = null,
    range: js.UndefOr[scala.Boolean] = js.undefined,
    rangeSeparator: java.lang.String = null,
    shortcuts: scala.Boolean | js.Array[vue2DashDatepickerLib.vue2DashDatepickerMod.DatepickerNs.Shortcuts] = null,
    timePickerOptions: js.Array[vue2DashDatepickerLib.vue2DashDatepickerMod.DatepickerNs.TimePickerOptions] | (js.Function0[
      js.Array[vue2DashDatepickerLib.vue2DashDatepickerMod.DatepickerNs.TimePickerOptions]
    ]) = null,
    `type`: java.lang.String = null,
    width: scala.Double | java.lang.String = null
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

