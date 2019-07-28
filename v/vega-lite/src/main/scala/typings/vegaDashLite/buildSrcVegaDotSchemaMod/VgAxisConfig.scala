package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.greedy
import typings.vegaDashLite.vegaDashLiteStrings.parity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgAxisConfig extends VgAxisBase {
  /**
    * An interpolation fraction indicating where, for `band` scales, axis ticks should be positioned. A value of `0` places ticks at the left edge of their bands. A value of `0.5` places ticks in the middle of their bands.
    */
  var bandPosition: js.UndefOr[Double] = js.undefined
  /**
    * Color of axis domain line.
    *
    * __Default value:__  (none, using Vega default).
    */
  var domainColor: js.UndefOr[String] = js.undefined
  /**
    * Stroke width of axis domain line
    *
    * __Default value:__  (none, using Vega default).
    */
  var domainWidth: js.UndefOr[Double] = js.undefined
  /**
    * Color of gridlines.
    */
  var gridColor: js.UndefOr[String] = js.undefined
  /**
    * The offset (in pixels) into which to begin drawing with the grid dash array.
    */
  var gridDash: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The stroke opacity of grid (value between [0,1])
    *
    * __Default value:__ (`1` by default)
    * @minimum 0
    * @maximum 1
    */
  var gridOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The grid width, in pixels.
    * @minimum 0
    */
  var gridWidth: js.UndefOr[Double] = js.undefined
  /**
    * The rotation angle of the axis labels.
    *
    * __Default value:__ `-90` for nominal and ordinal fields; `0` otherwise.
    *
    * @minimum -360
    * @maximum 360
    */
  var labelAngle: js.UndefOr[Double] = js.undefined
  /**
    * The color of the tick label, can be in hex color code or regular color name.
    */
  var labelColor: js.UndefOr[String] = js.undefined
  /**
    * The font of the tick label.
    */
  var labelFont: js.UndefOr[String] = js.undefined
  /**
    * The font size of the label, in pixels.
    *
    * @minimum 0
    */
  var labelFontSize: js.UndefOr[Double] = js.undefined
  /**
    * Maximum allowed pixel width of axis tick labels.
    */
  var labelLimit: js.UndefOr[Double] = js.undefined
  /**
    * The color of the axis's tick.
    */
  var tickColor: js.UndefOr[String] = js.undefined
  /**
    * Boolean flag indicating if pixel position values should be rounded to the nearest integer.
    */
  var tickRound: js.UndefOr[Boolean] = js.undefined
  /**
    * The width, in pixels, of ticks.
    *
    * @minimum 0
    */
  var tickWidth: js.UndefOr[Double] = js.undefined
  /**
    * Horizontal text alignment of axis titles.
    */
  var titleAlign: js.UndefOr[String] = js.undefined
  /**
    * Angle in degrees of axis titles.
    */
  var titleAngle: js.UndefOr[Double] = js.undefined
  /**
    * Vertical text baseline for axis titles.
    */
  var titleBaseline: js.UndefOr[String] = js.undefined
  /**
    * Color of the title, can be in hex color code or regular color name.
    */
  var titleColor: js.UndefOr[String] = js.undefined
  /**
    * Font of the title. (e.g., `"Helvetica Neue"`).
    */
  var titleFont: js.UndefOr[String] = js.undefined
  /**
    * Font size of the title.
    *
    * @minimum 0
    */
  var titleFontSize: js.UndefOr[Double] = js.undefined
  /**
    * Font weight of the title.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var titleFontWeight: js.UndefOr[FontWeight] = js.undefined
  /**
    * Maximum allowed pixel width of axis titles.
    */
  var titleLimit: js.UndefOr[Double] = js.undefined
  /**
    * X-coordinate of the axis title relative to the axis group.
    */
  var titleX: js.UndefOr[Double] = js.undefined
  /**
    * Y-coordinate of the axis title relative to the axis group.
    */
  var titleY: js.UndefOr[Double] = js.undefined
}

object VgAxisConfig {
  @scala.inline
  def apply(
    bandPosition: Int | Double = null,
    domain: js.UndefOr[Boolean] = js.undefined,
    domainColor: String = null,
    domainWidth: Int | Double = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    gridColor: String = null,
    gridDash: js.Array[Double] = null,
    gridOpacity: Int | Double = null,
    gridWidth: Int | Double = null,
    labelAngle: Int | Double = null,
    labelBound: Boolean | Double = null,
    labelColor: String = null,
    labelFlush: Boolean | Double = null,
    labelFont: String = null,
    labelFontSize: Int | Double = null,
    labelLimit: Int | Double = null,
    labelOverlap: Boolean | parity | greedy = null,
    labelPadding: Int | Double = null,
    labels: js.UndefOr[Boolean] = js.undefined,
    maxExtent: Int | Double = null,
    minExtent: Int | Double = null,
    tickColor: String = null,
    tickRound: js.UndefOr[Boolean] = js.undefined,
    tickSize: Int | Double = null,
    tickWidth: Int | Double = null,
    ticks: js.UndefOr[Boolean] = js.undefined,
    titleAlign: String = null,
    titleAngle: Int | Double = null,
    titleBaseline: String = null,
    titleColor: String = null,
    titleFont: String = null,
    titleFontSize: Int | Double = null,
    titleFontWeight: FontWeight = null,
    titleLimit: Int | Double = null,
    titleMaxLength: Int | Double = null,
    titlePadding: Int | Double = null,
    titleX: Int | Double = null,
    titleY: Int | Double = null
  ): VgAxisConfig = {
    val __obj = js.Dynamic.literal()
    if (bandPosition != null) __obj.updateDynamic("bandPosition")(bandPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain)
    if (domainColor != null) __obj.updateDynamic("domainColor")(domainColor)
    if (domainWidth != null) __obj.updateDynamic("domainWidth")(domainWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (gridColor != null) __obj.updateDynamic("gridColor")(gridColor)
    if (gridDash != null) __obj.updateDynamic("gridDash")(gridDash)
    if (gridOpacity != null) __obj.updateDynamic("gridOpacity")(gridOpacity.asInstanceOf[js.Any])
    if (gridWidth != null) __obj.updateDynamic("gridWidth")(gridWidth.asInstanceOf[js.Any])
    if (labelAngle != null) __obj.updateDynamic("labelAngle")(labelAngle.asInstanceOf[js.Any])
    if (labelBound != null) __obj.updateDynamic("labelBound")(labelBound.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelFlush != null) __obj.updateDynamic("labelFlush")(labelFlush.asInstanceOf[js.Any])
    if (labelFont != null) __obj.updateDynamic("labelFont")(labelFont)
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (labelLimit != null) __obj.updateDynamic("labelLimit")(labelLimit.asInstanceOf[js.Any])
    if (labelOverlap != null) __obj.updateDynamic("labelOverlap")(labelOverlap.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels)
    if (maxExtent != null) __obj.updateDynamic("maxExtent")(maxExtent.asInstanceOf[js.Any])
    if (minExtent != null) __obj.updateDynamic("minExtent")(minExtent.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor)
    if (!js.isUndefined(tickRound)) __obj.updateDynamic("tickRound")(tickRound)
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickWidth != null) __obj.updateDynamic("tickWidth")(tickWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(ticks)) __obj.updateDynamic("ticks")(ticks)
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign)
    if (titleAngle != null) __obj.updateDynamic("titleAngle")(titleAngle.asInstanceOf[js.Any])
    if (titleBaseline != null) __obj.updateDynamic("titleBaseline")(titleBaseline)
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    if (titleFont != null) __obj.updateDynamic("titleFont")(titleFont)
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    if (titleLimit != null) __obj.updateDynamic("titleLimit")(titleLimit.asInstanceOf[js.Any])
    if (titleMaxLength != null) __obj.updateDynamic("titleMaxLength")(titleMaxLength.asInstanceOf[js.Any])
    if (titlePadding != null) __obj.updateDynamic("titlePadding")(titlePadding.asInstanceOf[js.Any])
    if (titleX != null) __obj.updateDynamic("titleX")(titleX.asInstanceOf[js.Any])
    if (titleY != null) __obj.updateDynamic("titleY")(titleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgAxisConfig]
  }
}

