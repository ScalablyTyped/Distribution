package typings
package vegaDashTypingsLib.typesSpecConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendConfig[N, NS, S, C, FW, FS, A, TB, LA, LO, SY, DA, O, AN, LOR]
  extends vegaDashTypingsLib.typesSpecLegendMod.BaseLegend[N, NS, S, C, FW, FS, A, TB, LA, LO, SY, DA, O, AN, LOR] {
  /**
    * The default direction (`"horizontal"` or `"vertical"`) for gradient legends.
    *
    * __Default value:__ `"vertical"`.
    */
  var gradientDirection: js.UndefOr[vegaDashTypingsLib.typesSpecEncodeMod.Orientation] = js.undefined
  /**
    * The maximum allowed length in pixels of color ramp gradient labels.
    */
  var gradientLabelLimit: js.UndefOr[N] = js.undefined
  /**
    * Vertical offset in pixels for color ramp gradient labels.
    *
    * __Default value:__ `2`.
    */
  var gradientLabelOffset: js.UndefOr[N] = js.undefined
  /**
    * Legend orient group layout parameters.
    */
  var layout: js.UndefOr[LegendLayout] = js.undefined
  /**
    * Border stroke dash pattern for the full legend.
    */
  var strokeDash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Border stroke width for the full legend.
    */
  var strokeWidth: js.UndefOr[N] = js.undefined
  /**
    * Default fill color for legend symbols. Only applied if there is no `"fill"` scale color encoding for the legend.
    *
    * __Default value:__ `"transparent"`.
    */
  var symbolBaseFillColor: js.UndefOr[C] = js.undefined
  /**
    * Default stroke color for legend symbols. Only applied if there is no `"fill"` scale color encoding for the legend.
    *
    * __Default value:__ `"gray"`.
    */
  var symbolBaseStrokeColor: js.UndefOr[C] = js.undefined
  /**
    * The default direction (`"horizontal"` or `"vertical"`) for symbol legends.
    *
    * __Default value:__ `"vertical"`.
    */
  var symbolDirection: js.UndefOr[vegaDashTypingsLib.typesSpecEncodeMod.Orientation] = js.undefined
}

object LegendConfig {
  @scala.inline
  def apply[N, NS, S, C, FW, FS, A, TB, LA, LO, SY, DA, O, AN, LOR](
    clipHeight: NS = null,
    columnPadding: NS = null,
    columns: NS = null,
    cornerRadius: N = null,
    fillColor: C = null,
    gradientDirection: vegaDashTypingsLib.typesSpecEncodeMod.Orientation = null,
    gradientLabelLimit: N = null,
    gradientLabelOffset: N = null,
    gradientLength: NS = null,
    gradientOpacity: N = null,
    gradientStrokeColor: C = null,
    gradientStrokeWidth: N = null,
    gradientThickness: NS = null,
    gridAlign: LA = null,
    labelAlign: A = null,
    labelBaseline: TB = null,
    labelColor: C = null,
    labelFont: S = null,
    labelFontSize: N = null,
    labelFontStyle: FS = null,
    labelFontWeight: FW = null,
    labelLimit: N = null,
    labelOffset: N = null,
    labelOpacity: N = null,
    labelOverlap: LO = null,
    labelPadding: N = null,
    labelSeparation: NS = null,
    layout: LegendLayout = null,
    legendX: N = null,
    legendY: N = null,
    offset: N = null,
    orient: LOR = null,
    padding: N = null,
    rowPadding: NS = null,
    strokeColor: C = null,
    strokeDash: js.Array[scala.Double] = null,
    strokeWidth: N = null,
    symbolBaseFillColor: C = null,
    symbolBaseStrokeColor: C = null,
    symbolDash: DA = null,
    symbolDashOffset: N = null,
    symbolDirection: vegaDashTypingsLib.typesSpecEncodeMod.Orientation = null,
    symbolFillColor: C = null,
    symbolOffset: N = null,
    symbolOpacity: N = null,
    symbolSize: N = null,
    symbolStrokeColor: C = null,
    symbolStrokeWidth: N = null,
    symbolType: SY = null,
    titleAlign: A = null,
    titleAnchor: AN = null,
    titleBaseline: TB = null,
    titleColor: C = null,
    titleFont: S = null,
    titleFontSize: N = null,
    titleFontStyle: FS = null,
    titleFontWeight: FW = null,
    titleLimit: N = null,
    titleOpacity: N = null,
    titleOrient: O = null,
    titlePadding: N = null
  ): LegendConfig[N, NS, S, C, FW, FS, A, TB, LA, LO, SY, DA, O, AN, LOR] = {
    val __obj = js.Dynamic.literal()
    if (clipHeight != null) __obj.updateDynamic("clipHeight")(clipHeight.asInstanceOf[js.Any])
    if (columnPadding != null) __obj.updateDynamic("columnPadding")(columnPadding.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (gradientDirection != null) __obj.updateDynamic("gradientDirection")(gradientDirection)
    if (gradientLabelLimit != null) __obj.updateDynamic("gradientLabelLimit")(gradientLabelLimit.asInstanceOf[js.Any])
    if (gradientLabelOffset != null) __obj.updateDynamic("gradientLabelOffset")(gradientLabelOffset.asInstanceOf[js.Any])
    if (gradientLength != null) __obj.updateDynamic("gradientLength")(gradientLength.asInstanceOf[js.Any])
    if (gradientOpacity != null) __obj.updateDynamic("gradientOpacity")(gradientOpacity.asInstanceOf[js.Any])
    if (gradientStrokeColor != null) __obj.updateDynamic("gradientStrokeColor")(gradientStrokeColor.asInstanceOf[js.Any])
    if (gradientStrokeWidth != null) __obj.updateDynamic("gradientStrokeWidth")(gradientStrokeWidth.asInstanceOf[js.Any])
    if (gradientThickness != null) __obj.updateDynamic("gradientThickness")(gradientThickness.asInstanceOf[js.Any])
    if (gridAlign != null) __obj.updateDynamic("gridAlign")(gridAlign.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelBaseline != null) __obj.updateDynamic("labelBaseline")(labelBaseline.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelFont != null) __obj.updateDynamic("labelFont")(labelFont.asInstanceOf[js.Any])
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (labelFontStyle != null) __obj.updateDynamic("labelFontStyle")(labelFontStyle.asInstanceOf[js.Any])
    if (labelFontWeight != null) __obj.updateDynamic("labelFontWeight")(labelFontWeight.asInstanceOf[js.Any])
    if (labelLimit != null) __obj.updateDynamic("labelLimit")(labelLimit.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (labelOpacity != null) __obj.updateDynamic("labelOpacity")(labelOpacity.asInstanceOf[js.Any])
    if (labelOverlap != null) __obj.updateDynamic("labelOverlap")(labelOverlap.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (labelSeparation != null) __obj.updateDynamic("labelSeparation")(labelSeparation.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (legendX != null) __obj.updateDynamic("legendX")(legendX.asInstanceOf[js.Any])
    if (legendY != null) __obj.updateDynamic("legendY")(legendY.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rowPadding != null) __obj.updateDynamic("rowPadding")(rowPadding.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (symbolBaseFillColor != null) __obj.updateDynamic("symbolBaseFillColor")(symbolBaseFillColor.asInstanceOf[js.Any])
    if (symbolBaseStrokeColor != null) __obj.updateDynamic("symbolBaseStrokeColor")(symbolBaseStrokeColor.asInstanceOf[js.Any])
    if (symbolDash != null) __obj.updateDynamic("symbolDash")(symbolDash.asInstanceOf[js.Any])
    if (symbolDashOffset != null) __obj.updateDynamic("symbolDashOffset")(symbolDashOffset.asInstanceOf[js.Any])
    if (symbolDirection != null) __obj.updateDynamic("symbolDirection")(symbolDirection)
    if (symbolFillColor != null) __obj.updateDynamic("symbolFillColor")(symbolFillColor.asInstanceOf[js.Any])
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset.asInstanceOf[js.Any])
    if (symbolOpacity != null) __obj.updateDynamic("symbolOpacity")(symbolOpacity.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (symbolStrokeColor != null) __obj.updateDynamic("symbolStrokeColor")(symbolStrokeColor.asInstanceOf[js.Any])
    if (symbolStrokeWidth != null) __obj.updateDynamic("symbolStrokeWidth")(symbolStrokeWidth.asInstanceOf[js.Any])
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign.asInstanceOf[js.Any])
    if (titleAnchor != null) __obj.updateDynamic("titleAnchor")(titleAnchor.asInstanceOf[js.Any])
    if (titleBaseline != null) __obj.updateDynamic("titleBaseline")(titleBaseline.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    if (titleFont != null) __obj.updateDynamic("titleFont")(titleFont.asInstanceOf[js.Any])
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontStyle != null) __obj.updateDynamic("titleFontStyle")(titleFontStyle.asInstanceOf[js.Any])
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    if (titleLimit != null) __obj.updateDynamic("titleLimit")(titleLimit.asInstanceOf[js.Any])
    if (titleOpacity != null) __obj.updateDynamic("titleOpacity")(titleOpacity.asInstanceOf[js.Any])
    if (titleOrient != null) __obj.updateDynamic("titleOrient")(titleOrient.asInstanceOf[js.Any])
    if (titlePadding != null) __obj.updateDynamic("titlePadding")(titlePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendConfig[N, NS, S, C, FW, FS, A, TB, LA, LO, SY, DA, O, AN, LOR]]
  }
}

