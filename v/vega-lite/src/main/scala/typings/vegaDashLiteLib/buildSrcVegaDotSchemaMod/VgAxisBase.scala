package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgAxisBase extends js.Object {
  /**
    * A boolean flag indicating if the domain (the axis baseline) should be included as part of the axis.
    *
    * __Default value:__ `true`
    */
  var domain: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean flag indicating if grid lines should be included as part of the axis
    *
    * __Default value:__ `true` for [continuous scales](https://vega.github.io/vega-lite/docs/scale.html#continuous) that are not binned; otherwise, `false`.
    */
  var grid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if labels should be hidden if they exceed the axis range. If `false `(the default) no bounds overlap analysis is performed. If `true`, labels will be hidden if they exceed the axis range by more than 1 pixel. If this property is a number, it specifies the pixel tolerance: the maximum amount by which a label bounding box may exceed the axis range.
    *
    * __Default value:__ `false`.
    */
  var labelBound: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Indicates if the first and last axis labels should be aligned flush with the scale range. Flush alignment for a horizontal axis will left-align the first label and right-align the last label. For vertical axes, bottom and top text baselines are applied instead. If this property is a number, it also indicates the number of pixels by which to offset the first and last labels; for example, a value of 2 will flush-align the first and last labels and also push them 2 pixels outward from the center of the axis. The additional adjustment can sometimes help the labels better visually group with corresponding axis ticks.
    *
    * __Default value:__ `true` for axis of a continuous x-scale. Otherwise, `false`.
    */
  var labelFlush: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * The strategy to use for resolving overlap of axis labels. If `false` (the default), no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used (this works well for standard linear axes). If set to `"greedy"`, a linear scan of the labels is performed, removing any labels that overlaps with the last visible label (this often works better for log-scaled axes).
    *
    * __Default value:__ `true` for non-nominal fields with non-log scales; `"greedy"` for log scales; otherwise `false`.
    */
  var labelOverlap: js.UndefOr[
    scala.Boolean | vegaDashLiteLib.vegaDashLiteLibStrings.parity | vegaDashLiteLib.vegaDashLiteLibStrings.greedy
  ] = js.undefined
  /**
    * The padding, in pixels, between axis and text labels.
    */
  var labelPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * A boolean flag indicating if labels should be included as part of the axis.
    *
    * __Default value:__  `true`.
    */
  var labels: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum extent in pixels that axis ticks and labels should use. This determines a maximum offset value for axis titles.
    *
    * __Default value:__ `undefined`.
    */
  var maxExtent: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum extent in pixels that axis ticks and labels should use. This determines a minimum offset value for axis titles.
    *
    * __Default value:__ `30` for y-axis; `undefined` for x-axis.
    */
  var minExtent: js.UndefOr[scala.Double] = js.undefined
  /**
    * The size in pixels of axis ticks.
    *
    * @minimum 0
    */
  var tickSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Boolean value that determines whether the axis should include ticks.
    */
  var ticks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Max length for axis title if the title is automatically generated from the field's description.
    *
    * @minimum 0
    * __Default value:__ `undefined`.
    */
  var titleMaxLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The padding, in pixels, between title and axis.
    */
  var titlePadding: js.UndefOr[scala.Double] = js.undefined
}

object VgAxisBase {
  @scala.inline
  def apply(
    domain: js.UndefOr[scala.Boolean] = js.undefined,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    labelBound: scala.Boolean | scala.Double = null,
    labelFlush: scala.Boolean | scala.Double = null,
    labelOverlap: scala.Boolean | vegaDashLiteLib.vegaDashLiteLibStrings.parity | vegaDashLiteLib.vegaDashLiteLibStrings.greedy = null,
    labelPadding: scala.Int | scala.Double = null,
    labels: js.UndefOr[scala.Boolean] = js.undefined,
    maxExtent: scala.Int | scala.Double = null,
    minExtent: scala.Int | scala.Double = null,
    tickSize: scala.Int | scala.Double = null,
    ticks: js.UndefOr[scala.Boolean] = js.undefined,
    titleMaxLength: scala.Int | scala.Double = null,
    titlePadding: scala.Int | scala.Double = null
  ): VgAxisBase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (labelBound != null) __obj.updateDynamic("labelBound")(labelBound.asInstanceOf[js.Any])
    if (labelFlush != null) __obj.updateDynamic("labelFlush")(labelFlush.asInstanceOf[js.Any])
    if (labelOverlap != null) __obj.updateDynamic("labelOverlap")(labelOverlap.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels)
    if (maxExtent != null) __obj.updateDynamic("maxExtent")(maxExtent.asInstanceOf[js.Any])
    if (minExtent != null) __obj.updateDynamic("minExtent")(minExtent.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (!js.isUndefined(ticks)) __obj.updateDynamic("ticks")(ticks)
    if (titleMaxLength != null) __obj.updateDynamic("titleMaxLength")(titleMaxLength.asInstanceOf[js.Any])
    if (titlePadding != null) __obj.updateDynamic("titlePadding")(titlePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgAxisBase]
  }
}

