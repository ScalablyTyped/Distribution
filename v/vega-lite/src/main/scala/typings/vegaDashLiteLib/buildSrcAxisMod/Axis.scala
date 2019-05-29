package typings
package vegaDashLiteLib.buildSrcAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis
  extends vegaDashLiteLib.buildSrcGuideMod.Guide
     with vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxisBase {
  /**
    * Mark definitions for custom axis encoding.
    *
    * @hide
    */
  var encoding: js.UndefOr[AxisEncoding] = js.undefined
  /**
    * The rotation angle of the axis labels.
    *
    * __Default value:__ `-90` for nominal and ordinal fields; `0` otherwise.
    *
    * @minimum -360
    * @maximum 360
    */
  var labelAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * The offset, in pixels, by which to displace the axis from the edge of the enclosing group or data rectangle.
    *
    * __Default value:__ derived from the [axis config](https://vega.github.io/vega-lite/docs/config.html#facet-scale-config)'s `offset` (`0` by default)
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The orientation of the axis. One of `"top"`, `"bottom"`, `"left"` or `"right"`. The orientation can be used to further specialize the axis type (e.g., a y axis oriented for the right edge of the chart).
    *
    * __Default value:__ `"bottom"` for x-axes and `"left"` for y-axes.
    */
  var orient: js.UndefOr[vegaDashLiteLib.buildSrcVegaDotSchemaMod.AxisOrient] = js.undefined
  /**
    * The anchor position of the axis in pixels. For x-axis with top or bottom orientation, this sets the axis group x coordinate. For y-axis with left or right orientation, this sets the axis group y coordinate.
    *
    * __Default value__: `0`
    */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
    * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of 2, 5, 10) and lie within the underlying scale's range.
    * @minimum 0
    *
    * __Default value__: Determine using a formula `ceil(width/40)` for x and `ceil(height/40)` for y.
    */
  var tickCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Explicitly set the visible axis tick values.
    */
  var values: js.UndefOr[
    js.Array[
      scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | scala.Double | java.lang.String
    ]
  ] = js.undefined
  /**
    * A non-positive integer indicating z-index of the axis.
    * If zindex is 0, axes should be drawn behind all chart elements.
    * To put them in front, use `"zindex = 1"`.
    *
    * __Default value:__ `1` (in front of the marks) for actual axis and `0` (behind the marks) for grids.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[scala.Double] = js.undefined
}

object Axis {
  @scala.inline
  def apply(
    domain: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: AxisEncoding = null,
    format: java.lang.String = null,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    labelAngle: scala.Int | scala.Double = null,
    labelBound: scala.Boolean | scala.Double = null,
    labelFlush: scala.Boolean | scala.Double = null,
    labelOverlap: scala.Boolean | vegaDashLiteLib.vegaDashLiteLibStrings.parity | vegaDashLiteLib.vegaDashLiteLibStrings.greedy = null,
    labelPadding: scala.Int | scala.Double = null,
    labels: js.UndefOr[scala.Boolean] = js.undefined,
    maxExtent: scala.Int | scala.Double = null,
    minExtent: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    orient: vegaDashLiteLib.buildSrcVegaDotSchemaMod.AxisOrient = null,
    position: scala.Int | scala.Double = null,
    tickCount: scala.Int | scala.Double = null,
    tickSize: scala.Int | scala.Double = null,
    ticks: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    titleMaxLength: scala.Int | scala.Double = null,
    titlePadding: scala.Int | scala.Double = null,
    values: js.Array[
      scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | scala.Double | java.lang.String
    ] = null,
    zindex: scala.Int | scala.Double = null
  ): Axis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (labelAngle != null) __obj.updateDynamic("labelAngle")(labelAngle.asInstanceOf[js.Any])
    if (labelBound != null) __obj.updateDynamic("labelBound")(labelBound.asInstanceOf[js.Any])
    if (labelFlush != null) __obj.updateDynamic("labelFlush")(labelFlush.asInstanceOf[js.Any])
    if (labelOverlap != null) __obj.updateDynamic("labelOverlap")(labelOverlap.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels)
    if (maxExtent != null) __obj.updateDynamic("maxExtent")(maxExtent.asInstanceOf[js.Any])
    if (minExtent != null) __obj.updateDynamic("minExtent")(minExtent.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (!js.isUndefined(ticks)) __obj.updateDynamic("ticks")(ticks)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleMaxLength != null) __obj.updateDynamic("titleMaxLength")(titleMaxLength.asInstanceOf[js.Any])
    if (titlePadding != null) __obj.updateDynamic("titlePadding")(titlePadding.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

