package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait textareaConfig extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var animate: js.UndefOr[js.Any] = js.undefined
  var attributes: js.UndefOr[js.Any] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var bottomLabel: js.UndefOr[String] = js.undefined
  var bottomPadding: js.UndefOr[Double] = js.undefined
  var click: js.UndefOr[WebixCallback] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[js.Any] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var hotkey: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var inputAlign: js.UndefOr[String] = js.undefined
  var inputHeight: js.UndefOr[Double] = js.undefined
  var inputWidth: js.UndefOr[Double] = js.undefined
  var invalid: js.UndefOr[Boolean] = js.undefined
  var invalidMessage: js.UndefOr[String] = js.undefined
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelAlign: js.UndefOr[String] = js.undefined
  var labelPosition: js.UndefOr[String] = js.undefined
  var labelWidth: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var pattern: js.UndefOr[js.Any] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popup: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var relatedAction: js.UndefOr[String] = js.undefined
  var relatedView: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var suggest: js.UndefOr[js.Any] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var validate: js.UndefOr[WebixCallback] = js.undefined
  var validateEvent: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object textareaConfig {
  @scala.inline
  def apply(
    align: String = null,
    animate: js.Any = null,
    attributes: js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    bottomLabel: String = null,
    bottomPadding: Int | Double = null,
    click: /* repeated */ js.Any => js.Any = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format: js.Any = null,
    gravity: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hotkey: String = null,
    id: String | Double = null,
    inputAlign: String = null,
    inputHeight: Int | Double = null,
    inputWidth: Int | Double = null,
    invalid: js.UndefOr[Boolean] = js.undefined,
    invalidMessage: String = null,
    keyPressTimeout: Int | Double = null,
    label: String = null,
    labelAlign: String = null,
    labelPosition: String = null,
    labelWidth: Int | Double = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    name: String = null,
    on: EventHash = null,
    pattern: js.Any = null,
    placeholder: String = null,
    popup: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    relatedAction: String = null,
    relatedView: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    suggest: js.Any = null,
    tooltip: js.Any = null,
    validate: /* repeated */ js.Any => js.Any = null,
    validateEvent: String = null,
    value: String | Double = null,
    view: String = null,
    width: Int | Double = null
  ): textareaConfig = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (bottomLabel != null) __obj.updateDynamic("bottomLabel")(bottomLabel)
    if (bottomPadding != null) __obj.updateDynamic("bottomPadding")(bottomPadding.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (format != null) __obj.updateDynamic("format")(format)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hotkey != null) __obj.updateDynamic("hotkey")(hotkey)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputAlign != null) __obj.updateDynamic("inputAlign")(inputAlign)
    if (inputHeight != null) __obj.updateDynamic("inputHeight")(inputHeight.asInstanceOf[js.Any])
    if (inputWidth != null) __obj.updateDynamic("inputWidth")(inputWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid)
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage)
    if (keyPressTimeout != null) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition)
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (on != null) __obj.updateDynamic("on")(on)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popup != null) __obj.updateDynamic("popup")(popup)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (relatedAction != null) __obj.updateDynamic("relatedAction")(relatedAction)
    if (relatedView != null) __obj.updateDynamic("relatedView")(relatedView)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (suggest != null) __obj.updateDynamic("suggest")(suggest)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (validateEvent != null) __obj.updateDynamic("validateEvent")(validateEvent)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[textareaConfig]
  }
}

