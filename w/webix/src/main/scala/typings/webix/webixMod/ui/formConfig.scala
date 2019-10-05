package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait formConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var autoheight: js.UndefOr[Boolean] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var cols: js.UndefOr[js.Array[_]] = js.undefined
  var complexData: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[String | js.Array[_]] = js.undefined
  var dataFeed: js.UndefOr[String | WebixCallback] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var elements: js.UndefOr[js.Array[_]] = js.undefined
  var elementsConfig: js.UndefOr[js.Any] = js.undefined
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
  var on: js.UndefOr[EventHash] = js.undefined
  var padding: js.UndefOr[js.Any] = js.undefined
  var paddingX: js.UndefOr[Double] = js.undefined
  var paddingY: js.UndefOr[Double] = js.undefined
  var responsive: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[_]] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var scroll: js.UndefOr[Boolean | String] = js.undefined
  var scrollSpeed: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var visibleBatch: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object formConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    autoheight: js.UndefOr[Boolean] = js.undefined,
    borderless: js.UndefOr[Boolean] = js.undefined,
    cols: js.Array[_] = null,
    complexData: js.UndefOr[Boolean] = js.undefined,
    container: String | HTMLElement = null,
    css: js.Any = null,
    data: String | js.Array[_] = null,
    dataFeed: String | WebixCallback = null,
    datatype: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elements: js.Array[_] = null,
    elementsConfig: js.Any = null,
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
    on: EventHash = null,
    padding: js.Any = null,
    paddingX: Int | Double = null,
    paddingY: Int | Double = null,
    responsive: String = null,
    rows: js.Array[_] = null,
    rules: js.Any = null,
    scroll: Boolean | String = null,
    scrollSpeed: String = null,
    `type`: String = null,
    url: js.Any = null,
    view: String = null,
    visibleBatch: String = null,
    width: Int | Double = null
  ): formConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(autoheight)) __obj.updateDynamic("autoheight")(autoheight)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (cols != null) __obj.updateDynamic("cols")(cols)
    if (!js.isUndefined(complexData)) __obj.updateDynamic("complexData")(complexData)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFeed != null) __obj.updateDynamic("dataFeed")(dataFeed.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (elementsConfig != null) __obj.updateDynamic("elementsConfig")(elementsConfig)
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
    if (on != null) __obj.updateDynamic("on")(on)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (view != null) __obj.updateDynamic("view")(view)
    if (visibleBatch != null) __obj.updateDynamic("visibleBatch")(visibleBatch)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[formConfig]
  }
}

