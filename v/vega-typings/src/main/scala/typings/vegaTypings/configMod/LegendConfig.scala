package typings.vegaTypings.configMod

import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.axisMod.TickCount
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.layoutMod.LayoutAlign
import typings.vegaTypings.legendMod.BaseLegend
import typings.vegaTypings.legendMod.LegendOrient
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.valuesMod.AlignValue
import typings.vegaTypings.valuesMod.AnchorValue
import typings.vegaTypings.valuesMod.ColorValue
import typings.vegaTypings.valuesMod.DashArrayValue
import typings.vegaTypings.valuesMod.FontStyleValue
import typings.vegaTypings.valuesMod.FontWeightValue
import typings.vegaTypings.valuesMod.NumberValue
import typings.vegaTypings.valuesMod.OrientValue
import typings.vegaTypings.valuesMod.StringValue
import typings.vegaTypings.valuesMod.SymbolShapeValue
import typings.vegaTypings.valuesMod.TextBaselineValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendConfig extends BaseLegend {
  /**
    * The default direction (`"horizontal"` or `"vertical"`) for gradient legends.
    *
    * __Default value:__ `"vertical"`.
    */
  var gradientDirection: js.UndefOr[Orientation] = js.undefined
  /**
    * The maximum allowed length in pixels of color ramp gradient labels.
    */
  var gradientLabelLimit: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * Vertical offset in pixels for color ramp gradient labels.
    *
    * __Default value:__ `2`.
    */
  var gradientLabelOffset: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * Legend orient group layout parameters.
    */
  var layout: js.UndefOr[LegendLayout] = js.undefined
  /**
    * Border stroke dash pattern for the full legend.
    */
  var strokeDash: js.UndefOr[js.Array[Double] | SignalRef] = js.undefined
  /**
    * Border stroke width for the full legend.
    */
  var strokeWidth: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * Default fill color for legend symbols. Only applied if there is no `"fill"` scale color encoding for the legend.
    *
    * __Default value:__ `"transparent"`.
    */
  var symbolBaseFillColor: js.UndefOr[Null | Color | SignalRef] = js.undefined
  /**
    * Default stroke color for legend symbols. Only applied if there is no `"fill"` scale color encoding for the legend.
    *
    * __Default value:__ `"gray"`.
    */
  var symbolBaseStrokeColor: js.UndefOr[Null | Color | SignalRef] = js.undefined
  /**
    * The default direction (`"horizontal"` or `"vertical"`) for symbol legends.
    *
    * __Default value:__ `"vertical"`.
    */
  var symbolDirection: js.UndefOr[Orientation] = js.undefined
}

object LegendConfig {
  @scala.inline
  def apply(
    clipHeight: Double | SignalRef = null,
    columnPadding: Double | SignalRef = null,
    columns: Double | SignalRef = null,
    cornerRadius: NumberValue = null,
    fillColor: ColorValue = null,
    gradientDirection: Orientation = null,
    gradientLabelLimit: Double | SignalRef = null,
    gradientLabelOffset: Double | SignalRef = null,
    gradientLength: Double | SignalRef = null,
    gradientOpacity: NumberValue = null,
    gradientStrokeColor: ColorValue = null,
    gradientStrokeWidth: NumberValue = null,
    gradientThickness: Double | SignalRef = null,
    gridAlign: LayoutAlign | SignalRef = null,
    labelAlign: AlignValue = null,
    labelBaseline: TextBaselineValue = null,
    labelColor: ColorValue = null,
    labelFont: StringValue = null,
    labelFontSize: NumberValue = null,
    labelFontStyle: FontStyleValue = null,
    labelFontWeight: FontWeightValue = null,
    labelLimit: NumberValue = null,
    labelOffset: NumberValue = null,
    labelOpacity: NumberValue = null,
    labelOverlap: LabelOverlap | SignalRef = null,
    labelPadding: NumberValue = null,
    labelSeparation: Double | SignalRef = null,
    layout: LegendLayout = null,
    legendX: NumberValue = null,
    legendY: NumberValue = null,
    offset: NumberValue = null,
    orient: LegendOrient | SignalRef = null,
    padding: NumberValue = null,
    rowPadding: Double | SignalRef = null,
    strokeColor: ColorValue = null,
    strokeDash: js.Array[Double] | SignalRef = null,
    strokeWidth: Double | SignalRef = null,
    symbolBaseFillColor: Color | SignalRef = null,
    symbolBaseStrokeColor: Color | SignalRef = null,
    symbolDash: DashArrayValue = null,
    symbolDashOffset: NumberValue = null,
    symbolDirection: Orientation = null,
    symbolFillColor: ColorValue = null,
    symbolLimit: NumberValue = null,
    symbolOffset: NumberValue = null,
    symbolOpacity: NumberValue = null,
    symbolSize: NumberValue = null,
    symbolStrokeColor: ColorValue = null,
    symbolStrokeWidth: NumberValue = null,
    symbolType: SymbolShapeValue | SignalRef = null,
    tickCount: TickCount = null,
    titleAlign: AlignValue = null,
    titleAnchor: AnchorValue = null,
    titleBaseline: TextBaselineValue = null,
    titleColor: ColorValue = null,
    titleFont: StringValue = null,
    titleFontSize: NumberValue = null,
    titleFontStyle: FontStyleValue = null,
    titleFontWeight: FontWeightValue = null,
    titleLimit: NumberValue = null,
    titleLineHeight: NumberValue = null,
    titleOpacity: NumberValue = null,
    titleOrient: OrientValue = null,
    titlePadding: NumberValue = null
  ): LegendConfig = {
    val __obj = js.Dynamic.literal()
    if (clipHeight != null) __obj.updateDynamic("clipHeight")(clipHeight.asInstanceOf[js.Any])
    if (columnPadding != null) __obj.updateDynamic("columnPadding")(columnPadding.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (gradientDirection != null) __obj.updateDynamic("gradientDirection")(gradientDirection.asInstanceOf[js.Any])
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
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legendX != null) __obj.updateDynamic("legendX")(legendX.asInstanceOf[js.Any])
    if (legendY != null) __obj.updateDynamic("legendY")(legendY.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rowPadding != null) __obj.updateDynamic("rowPadding")(rowPadding.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (symbolBaseFillColor != null) __obj.updateDynamic("symbolBaseFillColor")(symbolBaseFillColor.asInstanceOf[js.Any])
    if (symbolBaseStrokeColor != null) __obj.updateDynamic("symbolBaseStrokeColor")(symbolBaseStrokeColor.asInstanceOf[js.Any])
    if (symbolDash != null) __obj.updateDynamic("symbolDash")(symbolDash.asInstanceOf[js.Any])
    if (symbolDashOffset != null) __obj.updateDynamic("symbolDashOffset")(symbolDashOffset.asInstanceOf[js.Any])
    if (symbolDirection != null) __obj.updateDynamic("symbolDirection")(symbolDirection.asInstanceOf[js.Any])
    if (symbolFillColor != null) __obj.updateDynamic("symbolFillColor")(symbolFillColor.asInstanceOf[js.Any])
    if (symbolLimit != null) __obj.updateDynamic("symbolLimit")(symbolLimit.asInstanceOf[js.Any])
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset.asInstanceOf[js.Any])
    if (symbolOpacity != null) __obj.updateDynamic("symbolOpacity")(symbolOpacity.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (symbolStrokeColor != null) __obj.updateDynamic("symbolStrokeColor")(symbolStrokeColor.asInstanceOf[js.Any])
    if (symbolStrokeWidth != null) __obj.updateDynamic("symbolStrokeWidth")(symbolStrokeWidth.asInstanceOf[js.Any])
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign.asInstanceOf[js.Any])
    if (titleAnchor != null) __obj.updateDynamic("titleAnchor")(titleAnchor.asInstanceOf[js.Any])
    if (titleBaseline != null) __obj.updateDynamic("titleBaseline")(titleBaseline.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    if (titleFont != null) __obj.updateDynamic("titleFont")(titleFont.asInstanceOf[js.Any])
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontStyle != null) __obj.updateDynamic("titleFontStyle")(titleFontStyle.asInstanceOf[js.Any])
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    if (titleLimit != null) __obj.updateDynamic("titleLimit")(titleLimit.asInstanceOf[js.Any])
    if (titleLineHeight != null) __obj.updateDynamic("titleLineHeight")(titleLineHeight.asInstanceOf[js.Any])
    if (titleOpacity != null) __obj.updateDynamic("titleOpacity")(titleOpacity.asInstanceOf[js.Any])
    if (titleOrient != null) __obj.updateDynamic("titleOrient")(titleOrient.asInstanceOf[js.Any])
    if (titlePadding != null) __obj.updateDynamic("titlePadding")(titlePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendConfig]
  }
}

