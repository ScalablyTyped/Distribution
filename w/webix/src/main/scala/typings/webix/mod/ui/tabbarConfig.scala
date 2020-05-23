package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tabbarConfig extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var animate: js.UndefOr[js.Any] = js.undefined
  var attributes: js.UndefOr[js.Any] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var bottomLabel: js.UndefOr[String] = js.undefined
  var bottomOffset: js.UndefOr[Double] = js.undefined
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
  var moreTemplate: js.UndefOr[WebixCallback] = js.undefined
  var multiview: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var optionWidth: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popup: js.UndefOr[String] = js.undefined
  var popupTemplate: js.UndefOr[WebixCallback] = js.undefined
  var popupWidth: js.UndefOr[Double] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var relatedAction: js.UndefOr[String] = js.undefined
  var relatedView: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var suggest: js.UndefOr[js.Any] = js.undefined
  var tabMargin: js.UndefOr[Double] = js.undefined
  var tabMinWidth: js.UndefOr[Double] = js.undefined
  var tabMoreWidth: js.UndefOr[Double] = js.undefined
  var tabOffset: js.UndefOr[Double] = js.undefined
  var tabbarPopup: js.UndefOr[typings.webix.webix.ui.baseview] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var topOffset: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[WebixCallback] = js.undefined
  var validateEvent: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var yCount: js.UndefOr[Double] = js.undefined
}

object tabbarConfig {
  @scala.inline
  def apply(
    align: String = null,
    animate: js.Any = null,
    attributes: js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    bottomLabel: String = null,
    bottomOffset: js.UndefOr[Double] = js.undefined,
    bottomPadding: js.UndefOr[Double] = js.undefined,
    click: /* repeated */ js.Any => js.Any = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format: js.Any = null,
    gravity: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hotkey: String = null,
    id: String | Double = null,
    inputAlign: String = null,
    inputHeight: js.UndefOr[Double] = js.undefined,
    inputWidth: js.UndefOr[Double] = js.undefined,
    invalid: js.UndefOr[Boolean] = js.undefined,
    invalidMessage: String = null,
    keyPressTimeout: js.UndefOr[Double] = js.undefined,
    label: String = null,
    labelAlign: String = null,
    labelPosition: String = null,
    labelWidth: js.UndefOr[Double] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    moreTemplate: /* repeated */ js.Any => js.Any = null,
    multiview: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    on: EventHash = null,
    optionWidth: js.UndefOr[Double] = js.undefined,
    options: js.Array[_] = null,
    placeholder: String = null,
    popup: String = null,
    popupTemplate: /* repeated */ js.Any => js.Any = null,
    popupWidth: js.UndefOr[Double] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    relatedAction: String = null,
    relatedView: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    suggest: js.Any = null,
    tabMargin: js.UndefOr[Double] = js.undefined,
    tabMinWidth: js.UndefOr[Double] = js.undefined,
    tabMoreWidth: js.UndefOr[Double] = js.undefined,
    tabOffset: js.UndefOr[Double] = js.undefined,
    tabbarPopup: typings.webix.webix.ui.baseview = null,
    tooltip: js.Any = null,
    topOffset: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    validate: /* repeated */ js.Any => js.Any = null,
    validateEvent: String = null,
    value: String | Double = null,
    view: String = null,
    width: js.UndefOr[Double] = js.undefined,
    yCount: js.UndefOr[Double] = js.undefined
  ): tabbarConfig = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.get.asInstanceOf[js.Any])
    if (bottomLabel != null) __obj.updateDynamic("bottomLabel")(bottomLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomOffset)) __obj.updateDynamic("bottomOffset")(bottomOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomPadding)) __obj.updateDynamic("bottomPadding")(bottomPadding.get.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(gravity)) __obj.updateDynamic("gravity")(gravity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (hotkey != null) __obj.updateDynamic("hotkey")(hotkey.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputAlign != null) __obj.updateDynamic("inputAlign")(inputAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(inputHeight)) __obj.updateDynamic("inputHeight")(inputHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inputWidth)) __obj.updateDynamic("inputWidth")(inputWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid.get.asInstanceOf[js.Any])
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(keyPressTimeout)) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWidth)) __obj.updateDynamic("labelWidth")(labelWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (moreTemplate != null) __obj.updateDynamic("moreTemplate")(js.Any.fromFunction1(moreTemplate))
    if (!js.isUndefined(multiview)) __obj.updateDynamic("multiview")(multiview.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (!js.isUndefined(optionWidth)) __obj.updateDynamic("optionWidth")(optionWidth.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(js.Any.fromFunction1(popupTemplate))
    if (!js.isUndefined(popupWidth)) __obj.updateDynamic("popupWidth")(popupWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (relatedAction != null) __obj.updateDynamic("relatedAction")(relatedAction.asInstanceOf[js.Any])
    if (relatedView != null) __obj.updateDynamic("relatedView")(relatedView.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (suggest != null) __obj.updateDynamic("suggest")(suggest.asInstanceOf[js.Any])
    if (!js.isUndefined(tabMargin)) __obj.updateDynamic("tabMargin")(tabMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabMinWidth)) __obj.updateDynamic("tabMinWidth")(tabMinWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabMoreWidth)) __obj.updateDynamic("tabMoreWidth")(tabMoreWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabOffset)) __obj.updateDynamic("tabOffset")(tabOffset.get.asInstanceOf[js.Any])
    if (tabbarPopup != null) __obj.updateDynamic("tabbarPopup")(tabbarPopup.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffset)) __obj.updateDynamic("topOffset")(topOffset.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (validateEvent != null) __obj.updateDynamic("validateEvent")(validateEvent.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yCount)) __obj.updateDynamic("yCount")(yCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[tabbarConfig]
  }
}

