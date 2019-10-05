package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait accordionConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var cols: js.UndefOr[js.Array[_]] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var isolate: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var multi: js.UndefOr[Boolean | String] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var padding: js.UndefOr[js.Any] = js.undefined
  var paddingX: js.UndefOr[Double] = js.undefined
  var paddingY: js.UndefOr[Double] = js.undefined
  var panelClass: js.UndefOr[String] = js.undefined
  var responsive: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[_]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var visibleBatch: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object accordionConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    cols: js.Array[_] = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gravity: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    isolate: js.UndefOr[Boolean] = js.undefined,
    margin: Int | Double = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    multi: Boolean | String = null,
    on: EventHash = null,
    padding: js.Any = null,
    paddingX: Int | Double = null,
    paddingY: Int | Double = null,
    panelClass: String = null,
    responsive: String = null,
    rows: js.Array[_] = null,
    `type`: String = null,
    view: String = null,
    visibleBatch: String = null,
    width: Int | Double = null
  ): accordionConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (cols != null) __obj.updateDynamic("cols")(cols)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isolate)) __obj.updateDynamic("isolate")(isolate)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (multi != null) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (panelClass != null) __obj.updateDynamic("panelClass")(panelClass)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (view != null) __obj.updateDynamic("view")(view)
    if (visibleBatch != null) __obj.updateDynamic("visibleBatch")(visibleBatch)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[accordionConfig]
  }
}

