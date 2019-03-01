package typings
package xDashEditableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEditableOptions extends js.Object {
  var ajaxOptions: js.UndefOr[js.Any] = js.undefined
  var anim: js.UndefOr[java.lang.String] = js.undefined
  var autotext: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var display: js.UndefOr[js.Any] = js.undefined
  var emptyclass: js.UndefOr[java.lang.String] = js.undefined
  var emptytext: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var highlight: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onblur: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var pk: js.UndefOr[js.Any] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var savenochange: js.UndefOr[scala.Boolean] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
  var send: js.UndefOr[java.lang.String] = js.undefined
  var showbuttons: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[js.Any] = js.undefined
  var toggle: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var unsavedclass: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var validate: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object XEditableOptions {
  @scala.inline
  def apply(
    ajaxOptions: js.Any = null,
    anim: java.lang.String = null,
    autotext: java.lang.String = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    display: js.Any = null,
    emptyclass: java.lang.String = null,
    emptytext: java.lang.String = null,
    error: js.Any = null,
    highlight: js.Any = null,
    mode: java.lang.String = null,
    name: java.lang.String = null,
    onblur: java.lang.String = null,
    params: js.Any = null,
    pk: js.Any = null,
    placement: java.lang.String = null,
    savenochange: js.UndefOr[scala.Boolean] = js.undefined,
    selector: java.lang.String = null,
    send: java.lang.String = null,
    showbuttons: js.Any = null,
    success: js.Any = null,
    toggle: java.lang.String = null,
    `type`: java.lang.String = null,
    unsavedclass: java.lang.String = null,
    url: js.Any = null,
    validate: js.Any = null,
    value: js.Any = null
  ): XEditableOptions = {
    val __obj = js.Dynamic.literal()
    if (ajaxOptions != null) __obj.updateDynamic("ajaxOptions")(ajaxOptions)
    if (anim != null) __obj.updateDynamic("anim")(anim)
    if (autotext != null) __obj.updateDynamic("autotext")(autotext)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (display != null) __obj.updateDynamic("display")(display)
    if (emptyclass != null) __obj.updateDynamic("emptyclass")(emptyclass)
    if (emptytext != null) __obj.updateDynamic("emptytext")(emptytext)
    if (error != null) __obj.updateDynamic("error")(error)
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onblur != null) __obj.updateDynamic("onblur")(onblur)
    if (params != null) __obj.updateDynamic("params")(params)
    if (pk != null) __obj.updateDynamic("pk")(pk)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(savenochange)) __obj.updateDynamic("savenochange")(savenochange)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (send != null) __obj.updateDynamic("send")(send)
    if (showbuttons != null) __obj.updateDynamic("showbuttons")(showbuttons)
    if (success != null) __obj.updateDynamic("success")(success)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (unsavedclass != null) __obj.updateDynamic("unsavedclass")(unsavedclass)
    if (url != null) __obj.updateDynamic("url")(url)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[XEditableOptions]
  }
}

