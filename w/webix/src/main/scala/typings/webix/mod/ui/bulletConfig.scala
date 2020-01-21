package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bulletConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var bands: js.UndefOr[js.Array[_]] = js.undefined
  var barWidth: js.UndefOr[Double] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String | WebixCallback] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var flowTime: js.UndefOr[Double] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelHeight: js.UndefOr[Double] = js.undefined
  var labelWidth: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var marker: js.UndefOr[Double | Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxRange: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minRange: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var placeholder: js.UndefOr[js.Any] = js.undefined
  var scale: js.UndefOr[js.Any] = js.undefined
  var smoothFlow: js.UndefOr[Boolean] = js.undefined
  var stroke: js.UndefOr[Double] = js.undefined
  var tickSize: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object bulletConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    bands: js.Array[_] = null,
    barWidth: Int | Double = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    color: String | WebixCallback = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    flowTime: Int | Double = null,
    gravity: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    keyPressTimeout: Int | Double = null,
    label: String = null,
    labelHeight: Int | Double = null,
    labelWidth: Int | Double = null,
    layout: String = null,
    marker: Double | Boolean = null,
    maxHeight: Int | Double = null,
    maxRange: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minRange: Int | Double = null,
    minWidth: Int | Double = null,
    placeholder: js.Any = null,
    scale: js.Any = null,
    smoothFlow: js.UndefOr[Boolean] = js.undefined,
    stroke: Int | Double = null,
    tickSize: Int | Double = null,
    value: Int | Double = null,
    view: String = null,
    width: Int | Double = null
  ): bulletConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (bands != null) __obj.updateDynamic("bands")(bands.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (flowTime != null) __obj.updateDynamic("flowTime")(flowTime.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keyPressTimeout != null) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelHeight != null) __obj.updateDynamic("labelHeight")(labelHeight.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxRange != null) __obj.updateDynamic("maxRange")(maxRange.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minRange != null) __obj.updateDynamic("minRange")(minRange.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothFlow)) __obj.updateDynamic("smoothFlow")(smoothFlow.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[bulletConfig]
  }
}

