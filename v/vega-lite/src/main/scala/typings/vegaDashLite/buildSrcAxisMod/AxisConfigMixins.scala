package typings.vegaDashLite.buildSrcAxisMod

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgAxisConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisConfigMixins extends js.Object {
  /**
    * Axis configuration, which determines default properties for all `x` and `y` [axes](https://vega.github.io/vega-lite/docs/axis.html). For a full list of axis configuration options, please see the [corresponding section of the axis documentation](https://vega.github.io/vega-lite/docs/axis.html#config).
    */
  var axis: js.UndefOr[AxisConfig] = js.undefined
  /**
    * Specific axis config for axes with "band" scales.
    */
  var axisBand: js.UndefOr[VgAxisConfig] = js.undefined
  /**
    * Specific axis config for x-axis along the bottom edge of the chart.
    */
  var axisBottom: js.UndefOr[VgAxisConfig] = js.undefined
  /**
    * Specific axis config for y-axis along the left edge of the chart.
    */
  var axisLeft: js.UndefOr[VgAxisConfig] = js.undefined
  /**
    * Specific axis config for y-axis along the right edge of the chart.
    */
  var axisRight: js.UndefOr[VgAxisConfig] = js.undefined
  /**
    * Specific axis config for x-axis along the top edge of the chart.
    */
  var axisTop: js.UndefOr[VgAxisConfig] = js.undefined
  /**
    * X-axis specific config.
    */
  var axisX: js.UndefOr[VgAxisConfig] = js.undefined
  /**
    * Y-axis specific config.
    */
  var axisY: js.UndefOr[VgAxisConfig] = js.undefined
}

object AxisConfigMixins {
  @scala.inline
  def apply(
    axis: AxisConfig = null,
    axisBand: VgAxisConfig = null,
    axisBottom: VgAxisConfig = null,
    axisLeft: VgAxisConfig = null,
    axisRight: VgAxisConfig = null,
    axisTop: VgAxisConfig = null,
    axisX: VgAxisConfig = null,
    axisY: VgAxisConfig = null
  ): AxisConfigMixins = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (axisBand != null) __obj.updateDynamic("axisBand")(axisBand)
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (axisX != null) __obj.updateDynamic("axisX")(axisX)
    if (axisY != null) __obj.updateDynamic("axisY")(axisY)
    __obj.asInstanceOf[AxisConfigMixins]
  }
}

