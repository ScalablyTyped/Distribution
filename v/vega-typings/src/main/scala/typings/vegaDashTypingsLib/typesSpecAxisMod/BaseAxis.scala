package typings
package vegaDashTypingsLib.typesSpecAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAxis[N, NS, B, BNS, S, C, FW, FS, A, TB, LA, LO, DA, AN] extends js.Object {
  /**
    * An interpolation fraction indicating where, for `band` scales, axis ticks should be positioned. A value of `0` places ticks at the left edge of their bands. A value of `0.5` places ticks in the middle of their bands.
    *
    *  __Default value:__ `0.5`
    */
  var bandPosition: js.UndefOr[N] = js.undefined
  // ---------- Domain ----------
  /**
    * A boolean flag indicating if the domain (the axis baseline) should be included as part of the axis.
    *
    * __Default value:__ `true`
    */
  var domain: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Color of axis domain line.
    *
    * __Default value:__ `"gray"`.
    */
  var domainColor: js.UndefOr[C] = js.undefined
  /**
    * An array of alternating [stroke, space] lengths for dashed domain lines.
    */
  var domainDash: js.UndefOr[DA] = js.undefined
  /**
    * The pixel offset at which to start drawing with the domain dash array.
    */
  var domainDashOffset: js.UndefOr[N] = js.undefined
  /**
    * Opacity of the axis domain line.
    */
  var domainOpacity: js.UndefOr[N] = js.undefined
  /**
    * Stroke width of axis domain line
    *
    * __Default value:__ `1`
    */
  var domainWidth: js.UndefOr[N] = js.undefined
  // ---------- Grid ----------
  /**
    * A boolean flag indicating if grid lines should be included as part of the axis.
    */
  var grid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Color of gridlines.
    *
    * __Default value:__ `"lightGray"`.
    */
  var gridColor: js.UndefOr[C] = js.undefined
  /**
    * An array of alternating [stroke, space] lengths for dashed grid lines.
    */
  var gridDash: js.UndefOr[DA] = js.undefined
  /**
    * The pixel offset at which to start drawing with the grid dash array.
    */
  var gridDashOffset: js.UndefOr[N] = js.undefined
  /**
    * The stroke opacity of grid (value between [0,1])
    *
    * __Default value:__ `1`
    * @minimum 0
    * @maximum 1
    */
  var gridOpacity: js.UndefOr[N] = js.undefined
  /**
    * The grid width, in pixels.
    *
    * __Default value:__ `1`
    * @minimum 0
    */
  var gridWidth: js.UndefOr[N] = js.undefined
  /**
    * Horizontal text alignment of axis tick labels, overriding the default setting for the current axis orientation.
    */
  var labelAlign: js.UndefOr[A] = js.undefined
  /**
    * The rotation angle of the axis labels.
    *
    * __Default value:__ `-90` for nominal and ordinal fields; `0` otherwise.
    *
    * @minimum -360
    * @maximum 360
    */
  var labelAngle: js.UndefOr[N] = js.undefined
  /**
    * Vertical text baseline of axis tick labels, overriding the default setting for the current axis orientation. Can be `"top"`, `"middle"`, `"bottom"`, or `"alphabetic"`.
    */
  var labelBaseline: js.UndefOr[TB] = js.undefined
  /**
    * Indicates if labels should be hidden if they exceed the axis range. If `false` (the default) no bounds overlap analysis is performed. If `true`, labels will be hidden if they exceed the axis range by more than 1 pixel. If this property is a number, it specifies the pixel tolerance: the maximum amount by which a label bounding box may exceed the axis range.
    *
    * __Default value:__ `false`.
    */
  var labelBound: js.UndefOr[BNS] = js.undefined
  /**
    * The color of the tick label, can be in hex color code or regular color name.
    */
  var labelColor: js.UndefOr[C] = js.undefined
  /**
    * Indicates if the first and last axis labels should be aligned flush with the scale range. Flush alignment for a horizontal axis will left-align the first label and right-align the last label. For vertical axes, bottom and top text baselines are applied instead. If this property is a number, it also indicates the number of pixels by which to offset the first and last labels; for example, a value of 2 will flush-align the first and last labels and also push them 2 pixels outward from the center of the axis. The additional adjustment can sometimes help the labels better visually group with corresponding axis ticks.
    */
  var labelFlush: js.UndefOr[BNS] = js.undefined
  /**
    * Indicates the number of pixels by which to offset flush-adjusted labels. For example, a value of `2` will push flush-adjusted labels 2 pixels outward from the center of the axis. Offsets can help the labels better visually group with corresponding axis ticks.
    *
    * __Default value:__ `0`.
    */
  var labelFlushOffset: js.UndefOr[NS] = js.undefined
  /**
    * The font of the tick label.
    */
  var labelFont: js.UndefOr[S] = js.undefined
  /**
    * The font size of the label, in pixels.
    *
    * @minimum 0
    */
  var labelFontSize: js.UndefOr[N] = js.undefined
  /**
    * Font style of the title.
    */
  var labelFontStyle: js.UndefOr[FS] = js.undefined
  /**
    * Font weight of axis tick labels.
    */
  var labelFontWeight: js.UndefOr[FW] = js.undefined
  /**
    * Maximum allowed pixel width of axis tick labels.
    *
    * __Default value:__ `180`
    */
  var labelLimit: js.UndefOr[N] = js.undefined
  /**
    * The opacity of the labels.
    */
  var labelOpacity: js.UndefOr[N] = js.undefined
  /**
    * The strategy to use for resolving overlap of axis labels. If `false` (the default), no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used (this works well for standard linear axes). If set to `"greedy"`, a linear scan of the labels is performed, removing any labels that overlaps with the last visible label (this often works better for log-scaled axes).
    */
  var labelOverlap: js.UndefOr[LO] = js.undefined
  /**
    * The padding, in pixels, between axis and text labels.
    *
    * __Default value:__ `2`
    */
  var labelPadding: js.UndefOr[N] = js.undefined
  /**
    * The minimum separation that must be between label bounding boxes for them to be considered non-overlapping (default `0`). This property is ignored if *labelOverlap* resolution is not enabled.
    */
  var labelSeparation: js.UndefOr[NS] = js.undefined
  // ---------- Labels ----------
  /**
    * A boolean flag indicating if labels should be included as part of the axis.
    *
    * __Default value:__ `true`.
    */
  var labels: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum extent in pixels that axis ticks and labels should use. This determines a maximum offset value for axis titles.
    *
    * __Default value:__ `undefined`.
    */
  var maxExtent: js.UndefOr[N] = js.undefined
  /**
    * The minimum extent in pixels that axis ticks and labels should use. This determines a minimum offset value for axis titles.
    *
    * __Default value:__ `30` for y-axis; `undefined` for x-axis.
    */
  var minExtent: js.UndefOr[N] = js.undefined
  /**
    * The color of the axis's tick.
    *
    * __Default value:__ `"gray"`
    */
  var tickColor: js.UndefOr[C] = js.undefined
  /**
    * An array of alternating [stroke, space] lengths for dashed tick mark lines.
    */
  var tickDash: js.UndefOr[DA] = js.undefined
  /**
    * The pixel offset at which to start drawing with the tick mark dash array.
    */
  var tickDashOffset: js.UndefOr[N] = js.undefined
  /**
    * Boolean flag indicating if an extra axis tick should be added for the initial position of the axis. This flag is useful for styling axes for `band` scales such that ticks are placed on band boundaries rather in the middle of a band. Use in conjunction with `"bandPosition": 1` and an axis `"padding"` value of `0`.
    */
  var tickExtra: js.UndefOr[B] = js.undefined
  /**
    * Position offset in pixels to apply to ticks, labels, and gridlines.
    */
  var tickOffset: js.UndefOr[N] = js.undefined
  /**
    * Opacity of the ticks.
    */
  var tickOpacity: js.UndefOr[N] = js.undefined
  /**
    * Boolean flag indicating if pixel position values should be rounded to the nearest integer.
    *
    * __Default value:__ `true`
    */
  var tickRound: js.UndefOr[B] = js.undefined
  /**
    * The size in pixels of axis ticks.
    *
    * __Default value:__ `5`
    * @minimum 0
    */
  var tickSize: js.UndefOr[N] = js.undefined
  /**
    * The width, in pixels, of ticks.
    *
    * __Default value:__ `1`
    * @minimum 0
    */
  var tickWidth: js.UndefOr[N] = js.undefined
  // ---------- Ticks ----------
  /**
    * Boolean value that determines whether the axis should include ticks.
    *
    * __Default value:__ `true`
    */
  var ticks: js.UndefOr[B] = js.undefined
  /**
    * Horizontal text alignment of axis titles.
    */
  var titleAlign: js.UndefOr[A] = js.undefined
  /**
    * Text anchor position for placing axis titles.
    */
  var titleAnchor: js.UndefOr[AN] = js.undefined
  /**
    * Angle in degrees of axis titles.
    */
  var titleAngle: js.UndefOr[N] = js.undefined
  /**
    * Vertical text baseline for axis titles.
    */
  var titleBaseline: js.UndefOr[TB] = js.undefined
  /**
    * Color of the title, can be in hex color code or regular color name.
    */
  var titleColor: js.UndefOr[C] = js.undefined
  /**
    * Font of the title. (e.g., `"Helvetica Neue"`).
    */
  var titleFont: js.UndefOr[S] = js.undefined
  /**
    * Font size of the title.
    *
    * @minimum 0
    */
  var titleFontSize: js.UndefOr[N] = js.undefined
  /**
    * Font style of the title.
    */
  var titleFontStyle: js.UndefOr[FS] = js.undefined
  /**
    * Font weight of the title.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var titleFontWeight: js.UndefOr[FW] = js.undefined
  /**
    * Maximum allowed pixel width of axis titles.
    *
    * @minimum 0
    */
  var titleLimit: js.UndefOr[N] = js.undefined
  /**
    * Opacity of the axis title.
    */
  var titleOpacity: js.UndefOr[N] = js.undefined
  // ---------- Title ----------
  /**
    * The padding, in pixels, between title and axis.
    */
  var titlePadding: js.UndefOr[N] = js.undefined
  /**
    * X-coordinate of the axis title relative to the axis group.
    */
  var titleX: js.UndefOr[N] = js.undefined
  /**
    * Y-coordinate of the axis title relative to the axis group.
    */
  var titleY: js.UndefOr[N] = js.undefined
}

object BaseAxis {
  @scala.inline
  def apply[N, NS, B, BNS, S, C, FW, FS, A, TB, LA, LO, DA, AN](
    bandPosition: N = null,
    domain: js.UndefOr[scala.Boolean] = js.undefined,
    domainColor: C = null,
    domainDash: DA = null,
    domainDashOffset: N = null,
    domainOpacity: N = null,
    domainWidth: N = null,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    gridColor: C = null,
    gridDash: DA = null,
    gridDashOffset: N = null,
    gridOpacity: N = null,
    gridWidth: N = null,
    labelAlign: A = null,
    labelAngle: N = null,
    labelBaseline: TB = null,
    labelBound: BNS = null,
    labelColor: C = null,
    labelFlush: BNS = null,
    labelFlushOffset: NS = null,
    labelFont: S = null,
    labelFontSize: N = null,
    labelFontStyle: FS = null,
    labelFontWeight: FW = null,
    labelLimit: N = null,
    labelOpacity: N = null,
    labelOverlap: LO = null,
    labelPadding: N = null,
    labelSeparation: NS = null,
    labels: js.UndefOr[scala.Boolean] = js.undefined,
    maxExtent: N = null,
    minExtent: N = null,
    tickColor: C = null,
    tickDash: DA = null,
    tickDashOffset: N = null,
    tickExtra: B = null,
    tickOffset: N = null,
    tickOpacity: N = null,
    tickRound: B = null,
    tickSize: N = null,
    tickWidth: N = null,
    ticks: B = null,
    titleAlign: A = null,
    titleAnchor: AN = null,
    titleAngle: N = null,
    titleBaseline: TB = null,
    titleColor: C = null,
    titleFont: S = null,
    titleFontSize: N = null,
    titleFontStyle: FS = null,
    titleFontWeight: FW = null,
    titleLimit: N = null,
    titleOpacity: N = null,
    titlePadding: N = null,
    titleX: N = null,
    titleY: N = null
  ): BaseAxis[N, NS, B, BNS, S, C, FW, FS, A, TB, LA, LO, DA, AN] = {
    val __obj = js.Dynamic.literal()
    if (bandPosition != null) __obj.updateDynamic("bandPosition")(bandPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain)
    if (domainColor != null) __obj.updateDynamic("domainColor")(domainColor.asInstanceOf[js.Any])
    if (domainDash != null) __obj.updateDynamic("domainDash")(domainDash.asInstanceOf[js.Any])
    if (domainDashOffset != null) __obj.updateDynamic("domainDashOffset")(domainDashOffset.asInstanceOf[js.Any])
    if (domainOpacity != null) __obj.updateDynamic("domainOpacity")(domainOpacity.asInstanceOf[js.Any])
    if (domainWidth != null) __obj.updateDynamic("domainWidth")(domainWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (gridColor != null) __obj.updateDynamic("gridColor")(gridColor.asInstanceOf[js.Any])
    if (gridDash != null) __obj.updateDynamic("gridDash")(gridDash.asInstanceOf[js.Any])
    if (gridDashOffset != null) __obj.updateDynamic("gridDashOffset")(gridDashOffset.asInstanceOf[js.Any])
    if (gridOpacity != null) __obj.updateDynamic("gridOpacity")(gridOpacity.asInstanceOf[js.Any])
    if (gridWidth != null) __obj.updateDynamic("gridWidth")(gridWidth.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelAngle != null) __obj.updateDynamic("labelAngle")(labelAngle.asInstanceOf[js.Any])
    if (labelBaseline != null) __obj.updateDynamic("labelBaseline")(labelBaseline.asInstanceOf[js.Any])
    if (labelBound != null) __obj.updateDynamic("labelBound")(labelBound.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelFlush != null) __obj.updateDynamic("labelFlush")(labelFlush.asInstanceOf[js.Any])
    if (labelFlushOffset != null) __obj.updateDynamic("labelFlushOffset")(labelFlushOffset.asInstanceOf[js.Any])
    if (labelFont != null) __obj.updateDynamic("labelFont")(labelFont.asInstanceOf[js.Any])
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (labelFontStyle != null) __obj.updateDynamic("labelFontStyle")(labelFontStyle.asInstanceOf[js.Any])
    if (labelFontWeight != null) __obj.updateDynamic("labelFontWeight")(labelFontWeight.asInstanceOf[js.Any])
    if (labelLimit != null) __obj.updateDynamic("labelLimit")(labelLimit.asInstanceOf[js.Any])
    if (labelOpacity != null) __obj.updateDynamic("labelOpacity")(labelOpacity.asInstanceOf[js.Any])
    if (labelOverlap != null) __obj.updateDynamic("labelOverlap")(labelOverlap.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (labelSeparation != null) __obj.updateDynamic("labelSeparation")(labelSeparation.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels)
    if (maxExtent != null) __obj.updateDynamic("maxExtent")(maxExtent.asInstanceOf[js.Any])
    if (minExtent != null) __obj.updateDynamic("minExtent")(minExtent.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (tickDash != null) __obj.updateDynamic("tickDash")(tickDash.asInstanceOf[js.Any])
    if (tickDashOffset != null) __obj.updateDynamic("tickDashOffset")(tickDashOffset.asInstanceOf[js.Any])
    if (tickExtra != null) __obj.updateDynamic("tickExtra")(tickExtra.asInstanceOf[js.Any])
    if (tickOffset != null) __obj.updateDynamic("tickOffset")(tickOffset.asInstanceOf[js.Any])
    if (tickOpacity != null) __obj.updateDynamic("tickOpacity")(tickOpacity.asInstanceOf[js.Any])
    if (tickRound != null) __obj.updateDynamic("tickRound")(tickRound.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickWidth != null) __obj.updateDynamic("tickWidth")(tickWidth.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign.asInstanceOf[js.Any])
    if (titleAnchor != null) __obj.updateDynamic("titleAnchor")(titleAnchor.asInstanceOf[js.Any])
    if (titleAngle != null) __obj.updateDynamic("titleAngle")(titleAngle.asInstanceOf[js.Any])
    if (titleBaseline != null) __obj.updateDynamic("titleBaseline")(titleBaseline.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    if (titleFont != null) __obj.updateDynamic("titleFont")(titleFont.asInstanceOf[js.Any])
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontStyle != null) __obj.updateDynamic("titleFontStyle")(titleFontStyle.asInstanceOf[js.Any])
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    if (titleLimit != null) __obj.updateDynamic("titleLimit")(titleLimit.asInstanceOf[js.Any])
    if (titleOpacity != null) __obj.updateDynamic("titleOpacity")(titleOpacity.asInstanceOf[js.Any])
    if (titlePadding != null) __obj.updateDynamic("titlePadding")(titlePadding.asInstanceOf[js.Any])
    if (titleX != null) __obj.updateDynamic("titleX")(titleX.asInstanceOf[js.Any])
    if (titleY != null) __obj.updateDynamic("titleY")(titleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAxis[N, NS, B, BNS, S, C, FW, FS, A, TB, LA, LO, DA, AN]]
  }
}

