package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uploaderConfig extends js.Object {
  var accept: js.UndefOr[String] = js.undefined
  var align: js.UndefOr[String] = js.undefined
  var animate: js.UndefOr[js.Any] = js.undefined
  var apiOnly: js.UndefOr[Boolean] = js.undefined
  var autosend: js.UndefOr[Boolean] = js.undefined
  var autowidth: js.UndefOr[Boolean] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var click: js.UndefOr[WebixCallback] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var directory: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var formData: js.UndefOr[js.Any] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var hotkey: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var inputHeight: js.UndefOr[Double] = js.undefined
  var inputName: js.UndefOr[String] = js.undefined
  var inputWidth: js.UndefOr[Double] = js.undefined
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var popup: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var upload: js.UndefOr[String] = js.undefined
  var urlData: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object uploaderConfig {
  @scala.inline
  def apply(
    accept: String = null,
    align: String = null,
    animate: js.Any = null,
    apiOnly: js.UndefOr[Boolean] = js.undefined,
    autosend: js.UndefOr[Boolean] = js.undefined,
    autowidth: js.UndefOr[Boolean] = js.undefined,
    borderless: js.UndefOr[Boolean] = js.undefined,
    click: /* repeated */ js.Any => js.Any = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    datatype: String = null,
    directory: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    formData: js.Any = null,
    gravity: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hotkey: String = null,
    id: String | Double = null,
    inputHeight: Int | Double = null,
    inputName: String = null,
    inputWidth: Int | Double = null,
    keyPressTimeout: Int | Double = null,
    label: String = null,
    link: String = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    on: EventHash = null,
    popup: String = null,
    tooltip: js.Any = null,
    `type`: String = null,
    upload: String = null,
    urlData: js.Any = null,
    value: String | Double = null,
    view: String = null,
    width: Int | Double = null
  ): uploaderConfig = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (align != null) __obj.updateDynamic("align")(align)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(apiOnly)) __obj.updateDynamic("apiOnly")(apiOnly)
    if (!js.isUndefined(autosend)) __obj.updateDynamic("autosend")(autosend)
    if (!js.isUndefined(autowidth)) __obj.updateDynamic("autowidth")(autowidth)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (formData != null) __obj.updateDynamic("formData")(formData)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hotkey != null) __obj.updateDynamic("hotkey")(hotkey)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputHeight != null) __obj.updateDynamic("inputHeight")(inputHeight.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (inputWidth != null) __obj.updateDynamic("inputWidth")(inputWidth.asInstanceOf[js.Any])
    if (keyPressTimeout != null) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (link != null) __obj.updateDynamic("link")(link)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (on != null) __obj.updateDynamic("on")(on)
    if (popup != null) __obj.updateDynamic("popup")(popup)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (upload != null) __obj.updateDynamic("upload")(upload)
    if (urlData != null) __obj.updateDynamic("urlData")(urlData)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[uploaderConfig]
  }
}

