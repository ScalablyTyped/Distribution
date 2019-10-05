package typings.webix.webixMod.ui

import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait geochartConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var chart: js.UndefOr[js.Any] = js.undefined
  var columns: js.UndefOr[js.Array[_]] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[String | js.Array[_]] = js.undefined
  var datathrottle: js.UndefOr[Double] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var ready: js.UndefOr[WebixCallback] = js.undefined
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  var save: js.UndefOr[js.Any] = js.undefined
  var scheme: js.UndefOr[js.Any] = js.undefined
  var tooltip: js.UndefOr[String | WebixCallback] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object geochartConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    chart: js.Any = null,
    columns: js.Array[_] = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    data: String | js.Array[_] = null,
    datathrottle: Int | Double = null,
    datatype: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gravity: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    key: String = null,
    keyPressTimeout: Int | Double = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    on: EventHash = null,
    ready: /* repeated */ js.Any => js.Any = null,
    removeMissed: js.UndefOr[Boolean] = js.undefined,
    save: js.Any = null,
    scheme: js.Any = null,
    tooltip: String | WebixCallback = null,
    url: js.Any = null,
    view: String = null,
    width: Int | Double = null
  ): geochartConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datathrottle != null) __obj.updateDynamic("datathrottle")(datathrottle.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (keyPressTimeout != null) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(removeMissed)) __obj.updateDynamic("removeMissed")(removeMissed)
    if (save != null) __obj.updateDynamic("save")(save)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[geochartConfig]
  }
}

