package typings.vegaDashLite.buildSrcLegendMod

import typings.vegaDashLite.buildSrcGuideMod.VlOnlyGuideConfig
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.FontWeight
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.LegendOrient
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgLegendConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendConfig
  extends VgLegendConfig
     with VlOnlyGuideConfig

object LegendConfig {
  @scala.inline
  def apply(
    cornerRadius: Int | Double = null,
    entryPadding: Int | Double = null,
    fillColor: String = null,
    gradientHeight: Int | Double = null,
    gradientLabelBaseline: String = null,
    gradientLabelLimit: Int | Double = null,
    gradientLabelOffset: Int | Double = null,
    gradientStrokeColor: String = null,
    gradientStrokeWidth: Int | Double = null,
    gradientWidth: Int | Double = null,
    labelAlign: String = null,
    labelBaseline: String = null,
    labelColor: String = null,
    labelFont: String = null,
    labelFontSize: Int | Double = null,
    labelLimit: Int | Double = null,
    labelOffset: Int | Double = null,
    offset: Int | Double = null,
    orient: LegendOrient = null,
    padding: Int | Double = null,
    shortTimeLabels: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    strokeDash: js.Array[Double] = null,
    strokeWidth: Int | Double = null,
    symbolColor: String = null,
    symbolSize: Int | Double = null,
    symbolStrokeWidth: Int | Double = null,
    symbolType: String = null,
    titleAlign: String = null,
    titleBaseline: String = null,
    titleColor: String = null,
    titleFont: String = null,
    titleFontSize: Int | Double = null,
    titleFontWeight: FontWeight = null,
    titleLimit: Int | Double = null,
    titlePadding: Int | Double = null
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

