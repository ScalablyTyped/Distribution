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
    barWidth: js.UndefOr[Double] = js.undefined,
    borderless: js.UndefOr[Boolean] = js.undefined,
    color: String | WebixCallback = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    flowTime: js.UndefOr[Double] = js.undefined,
    gravity: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    keyPressTimeout: js.UndefOr[Double] = js.undefined,
    label: String = null,
    labelHeight: js.UndefOr[Double] = js.undefined,
    labelWidth: js.UndefOr[Double] = js.undefined,
    layout: String = null,
    marker: Double | Boolean = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxRange: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minRange: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    placeholder: js.Any = null,
    scale: js.Any = null,
    smoothFlow: js.UndefOr[Boolean] = js.undefined,
    stroke: js.UndefOr[Double] = js.undefined,
    tickSize: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined,
    view: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): bulletConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (bands != null) __obj.updateDynamic("bands")(bands.asInstanceOf[js.Any])
    if (!js.isUndefined(barWidth)) __obj.updateDynamic("barWidth")(barWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flowTime)) __obj.updateDynamic("flowTime")(flowTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gravity)) __obj.updateDynamic("gravity")(gravity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(keyPressTimeout)) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelHeight)) __obj.updateDynamic("labelHeight")(labelHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWidth)) __obj.updateDynamic("labelWidth")(labelWidth.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRange)) __obj.updateDynamic("maxRange")(maxRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRange)) __obj.updateDynamic("minRange")(minRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothFlow)) __obj.updateDynamic("smoothFlow")(smoothFlow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickSize)) __obj.updateDynamic("tickSize")(tickSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[bulletConfig]
  }
}

