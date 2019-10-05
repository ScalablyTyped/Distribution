package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait labelConfig extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var animate: js.UndefOr[js.Any] = js.undefined
  var autowidth: js.UndefOr[Boolean] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var click: js.UndefOr[WebixCallback] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var hotkey: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var inputHeight: js.UndefOr[Double] = js.undefined
  var inputWidth: js.UndefOr[Double] = js.undefined
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelPosition: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var popup: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object labelConfig {
  @scala.inline
  def apply(
    align: String = null,
    animate: js.Any = null,
    autowidth: js.UndefOr[Boolean] = js.undefined,
    borderless: js.UndefOr[Boolean] = js.undefined,
    click: /* repeated */ js.Any => js.Any = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gravity: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hotkey: String = null,
    id: String | Double = null,
    inputHeight: Int | Double = null,
    inputWidth: Int | Double = null,
    keyPressTimeout: Int | Double = null,
    label: String = null,
    labelPosition: String = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    name: String = null,
    on: EventHash = null,
    popup: String = null,
    tooltip: js.Any = null,
    value: String | Double = null,
    view: String = null,
    width: Int | Double = null
  ): labelConfig = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(autowidth)) __obj.updateDynamic("autowidth")(autowidth)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hotkey != null) __obj.updateDynamic("hotkey")(hotkey)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputHeight != null) __obj.updateDynamic("inputHeight")(inputHeight.asInstanceOf[js.Any])
    if (inputWidth != null) __obj.updateDynamic("inputWidth")(inputWidth.asInstanceOf[js.Any])
    if (keyPressTimeout != null) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (on != null) __obj.updateDynamic("on")(on)
    if (popup != null) __obj.updateDynamic("popup")(popup)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[labelConfig]
  }
}

