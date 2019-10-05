package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sidemenuConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var autofit: js.UndefOr[Boolean] = js.undefined
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var body: js.UndefOr[String | baseview] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var head: js.UndefOr[js.Any] = js.undefined
  var headHeight: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var master: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var move: js.UndefOr[Boolean] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var padding: js.UndefOr[js.Any] = js.undefined
  var point: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[String | WebixCallback] = js.undefined
  var relative: js.UndefOr[String] = js.undefined
  var resize: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[WebixCallback] = js.undefined
  var toFront: js.UndefOr[Boolean] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object sidemenuConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    autofit: js.UndefOr[Boolean] = js.undefined,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    body: String | baseview = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    container: String | HTMLElement = null,
    css: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gravity: Int | Double = null,
    head: js.Any = null,
    headHeight: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    keyPressTimeout: Int | Double = null,
    left: Int | Double = null,
    master: String = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    move: js.UndefOr[Boolean] = js.undefined,
    on: EventHash = null,
    padding: js.Any = null,
    point: js.UndefOr[Boolean] = js.undefined,
    position: String | WebixCallback = null,
    relative: String = null,
    resize: js.UndefOr[Boolean] = js.undefined,
    state: /* repeated */ js.Any => js.Any = null,
    toFront: js.UndefOr[Boolean] = js.undefined,
    top: Int | Double = null,
    view: String = null,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): sidemenuConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(autofit)) __obj.updateDynamic("autofit")(autofit)
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head)
    if (headHeight != null) __obj.updateDynamic("headHeight")(headHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keyPressTimeout != null) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (master != null) __obj.updateDynamic("master")(master)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (!js.isUndefined(move)) __obj.updateDynamic("move")(move)
    if (on != null) __obj.updateDynamic("on")(on)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(point)) __obj.updateDynamic("point")(point)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (relative != null) __obj.updateDynamic("relative")(relative)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (state != null) __obj.updateDynamic("state")(js.Any.fromFunction1(state))
    if (!js.isUndefined(toFront)) __obj.updateDynamic("toFront")(toFront)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[sidemenuConfig]
  }
}

