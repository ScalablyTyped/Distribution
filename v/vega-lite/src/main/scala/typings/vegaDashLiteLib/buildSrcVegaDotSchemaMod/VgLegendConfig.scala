package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgLegendConfig extends VgLegendBase {
  /**
    * Corner radius for the full legend.
    */
  var cornerRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * Background fill color for the full legend.
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the gradient, in pixels.
    * @minimum 0
    */
  var gradientHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Text baseline for color ramp gradient labels.
    */
  var gradientLabelBaseline: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum allowed length in pixels of color ramp gradient labels.
    */
  var gradientLabelLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Vertical offset in pixels for color ramp gradient labels.
    */
  var gradientLabelOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color of the gradient stroke, can be in hex color code or regular color name.
    */
  var gradientStrokeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the gradient stroke, in pixels.
    * @minimum 0
    */
  var gradientStrokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the gradient, in pixels.
    * @minimum 0
    */
  var gradientWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The alignment of the legend label, can be left, middle or right.
    */
  var labelAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The position of the baseline of legend label, can be top, middle or bottom.
    */
  var labelBaseline: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color of the legend label, can be in hex color code or regular color name.
    */
  var labelColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font of the legend label.
    */
  var labelFont: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font size of legend label.
    *
    * __Default value:__ `10`.
    *
    * @minimum 0
    */
  var labelFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum allowed pixel width of axis tick labels.
    */
  var labelLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The offset of the legend label.
    * @minimum 0
    */
  var labelOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Border stroke color for the full legend.
    */
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Border stroke dash pattern for the full legend.
    */
  var strokeDash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Border stroke width for the full legend.
    */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color of the legend symbol,
    */
  var symbolColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The size of the legend symbol, in pixels.
    * @minimum 0
    */
  var symbolSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the symbol's stroke.
    * @minimum 0
    */
  var symbolStrokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default shape type (such as "circle") for legend symbols.
    */
  var symbolType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Horizontal text alignment for legend titles.
    */
  var titleAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Vertical text baseline for legend titles.
    */
  var titleBaseline: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color of the legend title, can be in hex color code or regular color name.
    */
  var titleColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font of the legend title.
    */
  var titleFont: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font size of the legend title.
    */
  var titleFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The font weight of the legend title.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var titleFontWeight: js.UndefOr[FontWeight] = js.undefined
  /**
    * Maximum allowed pixel width of axis titles.
    */
  var titleLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The padding, in pixels, between title and legend.
    */
  var titlePadding: js.UndefOr[scala.Double] = js.undefined
}

object VgLegendConfig {
  @scala.inline
  def apply(
    cornerRadius: scala.Int | scala.Double = null,
    entryPadding: scala.Int | scala.Double = null,
    fillColor: java.lang.String = null,
    gradientHeight: scala.Int | scala.Double = null,
    gradientLabelBaseline: java.lang.String = null,
    gradientLabelLimit: scala.Int | scala.Double = null,
    gradientLabelOffset: scala.Int | scala.Double = null,
    gradientStrokeColor: java.lang.String = null,
    gradientStrokeWidth: scala.Int | scala.Double = null,
    gradientWidth: scala.Int | scala.Double = null,
    labelAlign: java.lang.String = null,
    labelBaseline: java.lang.String = null,
    labelColor: java.lang.String = null,
    labelFont: java.lang.String = null,
    labelFontSize: scala.Int | scala.Double = null,
    labelLimit: scala.Int | scala.Double = null,
    labelOffset: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    orient: LegendOrient = null,
    padding: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeDash: js.Array[scala.Double] = null,
    strokeWidth: scala.Int | scala.Double = null,
    symbolColor: java.lang.String = null,
    symbolSize: scala.Int | scala.Double = null,
    symbolStrokeWidth: scala.Int | scala.Double = null,
    symbolType: java.lang.String = null,
    titleAlign: java.lang.String = null,
    titleBaseline: java.lang.String = null,
    titleColor: java.lang.String = null,
    titleFont: java.lang.String = null,
    titleFontSize: scala.Int | scala.Double = null,
    titleFontWeight: FontWeight = null,
    titleLimit: scala.Int | scala.Double = null,
    titlePadding: scala.Int | scala.Double = null
  ): VgLegendConfig = {
    val __obj = js.Dynamic.literal()
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (entryPadding != null) __obj.updateDynamic("entryPadding")(entryPadding.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (gradientHeight != null) __obj.updateDynamic("gradientHeight")(gradientHeight.asInstanceOf[js.Any])
    if (gradientLabelBaseline != null) __obj.updateDynamic("gradientLabelBaseline")(gradientLabelBaseline)
    if (gradientLabelLimit != null) __obj.updateDynamic("gradientLabelLimit")(gradientLabelLimit.asInstanceOf[js.Any])
    if (gradientLabelOffset != null) __obj.updateDynamic("gradientLabelOffset")(gradientLabelOffset.asInstanceOf[js.Any])
    if (gradientStrokeColor != null) __obj.updateDynamic("gradientStrokeColor")(gradientStrokeColor)
    if (gradientStrokeWidth != null) __obj.updateDynamic("gradientStrokeWidth")(gradientStrokeWidth.asInstanceOf[js.Any])
    if (gradientWidth != null) __obj.updateDynamic("gradientWidth")(gradientWidth.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign)
    if (labelBaseline != null) __obj.updateDynamic("labelBaseline")(labelBaseline)
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelFont != null) __obj.updateDynamic("labelFont")(labelFont)
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (labelLimit != null) __obj.updateDynamic("labelLimit")(labelLimit.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (symbolColor != null) __obj.updateDynamic("symbolColor")(symbolColor)
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (symbolStrokeWidth != null) __obj.updateDynamic("symbolStrokeWidth")(symbolStrokeWidth.asInstanceOf[js.Any])
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType)
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign)
    if (titleBaseline != null) __obj.updateDynamic("titleBaseline")(titleBaseline)
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    if (titleFont != null) __obj.updateDynamic("titleFont")(titleFont)
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    if (titleLimit != null) __obj.updateDynamic("titleLimit")(titleLimit.asInstanceOf[js.Any])
    if (titlePadding != null) __obj.updateDynamic("titlePadding")(titlePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgLegendConfig]
  }
}

