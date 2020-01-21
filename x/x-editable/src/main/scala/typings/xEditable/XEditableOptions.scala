package typings.xEditable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEditableOptions extends js.Object {
  var ajaxOptions: js.UndefOr[js.Any] = js.undefined
  var anim: js.UndefOr[String] = js.undefined
  var autotext: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var display: js.UndefOr[js.Any] = js.undefined
  var emptyclass: js.UndefOr[String] = js.undefined
  var emptytext: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var highlight: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onblur: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var pk: js.UndefOr[js.Any] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var savenochange: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var send: js.UndefOr[String] = js.undefined
  var showbuttons: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[js.Any] = js.undefined
  var toggle: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var unsavedclass: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var validate: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object XEditableOptions {
  @scala.inline
  def apply(
    ajaxOptions: js.Any = null,
    anim: String = null,
    autotext: String = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    display: js.Any = null,
    emptyclass: String = null,
    emptytext: String = null,
    error: js.Any = null,
    highlight: js.Any = null,
    mode: String = null,
    name: String = null,
    onblur: String = null,
    params: js.Any = null,
    pk: js.Any = null,
    placement: String = null,
    savenochange: js.UndefOr[Boolean] = js.undefined,
    selector: String = null,
    send: String = null,
    showbuttons: js.Any = null,
    success: js.Any = null,
    toggle: String = null,
    `type`: String = null,
    unsavedclass: String = null,
    url: js.Any = null,
    validate: js.Any = null,
    value: js.Any = null
  ): XEditableOptions = {
    val __obj = js.Dynamic.literal()
    if (ajaxOptions != null) __obj.updateDynamic("ajaxOptions")(ajaxOptions.asInstanceOf[js.Any])
    if (anim != null) __obj.updateDynamic("anim")(anim.asInstanceOf[js.Any])
    if (autotext != null) __obj.updateDynamic("autotext")(autotext.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (emptyclass != null) __obj.updateDynamic("emptyclass")(emptyclass.asInstanceOf[js.Any])
    if (emptytext != null) __obj.updateDynamic("emptytext")(emptytext.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onblur != null) __obj.updateDynamic("onblur")(onblur.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (pk != null) __obj.updateDynamic("pk")(pk.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(savenochange)) __obj.updateDynamic("savenochange")(savenochange.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (send != null) __obj.updateDynamic("send")(send.asInstanceOf[js.Any])
    if (showbuttons != null) __obj.updateDynamic("showbuttons")(showbuttons.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unsavedclass != null) __obj.updateDynamic("unsavedclass")(unsavedclass.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[XEditableOptions]
  }
}

