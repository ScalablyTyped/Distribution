package typings.webix.webixMod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait accordionitemConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var header: js.UndefOr[Boolean | String | WebixCallback] = js.undefined
  var headerAlt: js.UndefOr[String | WebixCallback] = js.undefined
  var headerAltHeight: js.UndefOr[Double] = js.undefined
  var headerHeight: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var mouseEventDelay: js.UndefOr[Double] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var onClick: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onContext: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onDblClick: js.UndefOr[WebixCallback] = js.undefined
  var onMouseMove: js.UndefOr[WebixCallback] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object accordionitemConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    body: js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    container: String | HTMLElement = null,
    css: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gravity: Int | Double = null,
    header: Boolean | String | WebixCallback = null,
    headerAlt: String | WebixCallback = null,
    headerAltHeight: Int | Double = null,
    headerHeight: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    keyPressTimeout: Int | Double = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    mouseEventDelay: Int | Double = null,
    on: EventHash = null,
    onClick: StringDictionary[js.Any] = null,
    onContext: StringDictionary[js.Any] = null,
    onDblClick: /* repeated */ js.Any => js.Any = null,
    onMouseMove: /* repeated */ js.Any => js.Any = null,
    view: String = null,
    width: Int | Double = null
  ): accordionitemConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerAlt != null) __obj.updateDynamic("headerAlt")(headerAlt.asInstanceOf[js.Any])
    if (headerAltHeight != null) __obj.updateDynamic("headerAltHeight")(headerAltHeight.asInstanceOf[js.Any])
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keyPressTimeout != null) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mouseEventDelay != null) __obj.updateDynamic("mouseEventDelay")(mouseEventDelay.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onContext != null) __obj.updateDynamic("onContext")(onContext)
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[accordionitemConfig]
  }
}

