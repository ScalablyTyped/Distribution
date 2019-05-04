package typings
package vegaDashLiteLib.buildSrcLegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendConfig
  extends vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgLegendConfig
     with vegaDashLiteLib.buildSrcGuideMod.VlOnlyGuideConfig

object LegendConfig {
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
    orient: vegaDashLiteLib.buildSrcVegaDotSchemaMod.LegendOrient = null,
    padding: scala.Int | scala.Double = null,
    shortTimeLabels: js.UndefOr[scala.Boolean] = js.undefined,
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
    titleFontWeight: vegaDashLiteLib.buildSrcVegaDotSchemaMod.FontWeight = null,
    titleLimit: scala.Int | scala.Double = null,
    titlePadding: scala.Int | scala.Double = null
  ): LegendConfig = {
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
    if (!js.isUndefined(shortTimeLabels)) __obj.updateDynamic("shortTimeLabels")(shortTimeLabels)
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
    __obj.asInstanceOf[LegendConfig]
  }
}

