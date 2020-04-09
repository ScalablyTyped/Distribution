package typings.vegaTypings.configMod

import typings.std.Exclude
import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.axisMod.TickCount
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.layoutMod.LayoutAlign
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

/* Inlined parent vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/legend.BaseLegend> */
trait LegendConfig extends js.Object {
  var clipHeight: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var columnPadding: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var columns: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var cornerRadius: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var fillColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
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
  var gradientLength: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var gradientOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var gradientStrokeColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var gradientStrokeWidth: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var gradientThickness: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var gridAlign: (Exclude[
    js.UndefOr[LayoutAlign | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[LayoutAlign | SignalRef]])
  var labelAlign: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
  var labelBaseline: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
  var labelColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var labelFont: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
  var labelFontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var labelFontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
  var labelFontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
  var labelLimit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var labelOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var labelOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var labelOverlap: (Exclude[
    js.UndefOr[LabelOverlap | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]])
  var labelPadding: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var labelSeparation: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  /**
    * Legend orient group layout parameters.
    */
  var layout: js.UndefOr[LegendLayout] = js.undefined
  var legendX: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var legendY: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var offset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var orient: (Exclude[
    js.UndefOr[LegendOrient | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[LegendOrient | SignalRef]])
  var padding: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var rowPadding: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var strokeColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
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
  var symbolDash: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
  var symbolDashOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  /**
    * The default direction (`"horizontal"` or `"vertical"`) for symbol legends.
    *
    * __Default value:__ `"vertical"`.
    */
  var symbolDirection: js.UndefOr[Orientation] = js.undefined
  var symbolFillColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var symbolLimit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var symbolOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var symbolOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var symbolSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var symbolStrokeColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var symbolStrokeWidth: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var symbolType: (Exclude[
    js.UndefOr[SymbolShapeValue | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[SymbolShapeValue | SignalRef]])
  var tickCount: (Exclude[js.UndefOr[TickCount], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TickCount]]
  var titleAlign: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
  var titleAnchor: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
  var titleBaseline: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
  var titleColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var titleFont: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
  var titleFontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var titleFontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
  var titleFontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
  var titleLimit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var titleLineHeight: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var titleOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var titleOrient: (Exclude[js.UndefOr[OrientValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[OrientValue]]
  var titlePadding: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
}

object LegendConfig {
  @scala.inline
  def apply(
    clipHeight: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    columnPadding: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    columns: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    cornerRadius: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    fillColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    gradientDirection: Orientation = null,
    gradientLabelLimit: Double | SignalRef = null,
    gradientLabelOffset: Double | SignalRef = null,
    gradientLength: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    gradientOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    gradientStrokeColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    gradientStrokeWidth: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    gradientThickness: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    gridAlign: (Exclude[
      js.UndefOr[LayoutAlign | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[LayoutAlign | SignalRef]]) = null,
    labelAlign: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]] = null,
    labelBaseline: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]] = null,
    labelColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    labelFont: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]] = null,
    labelFontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    labelFontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]] = null,
    labelFontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]] = null,
    labelLimit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    labelOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    labelOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    labelOverlap: (Exclude[
      js.UndefOr[LabelOverlap | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]]) = null,
    labelPadding: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    labelSeparation: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    layout: LegendLayout = null,
    legendX: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    legendY: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    offset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    orient: (Exclude[
      js.UndefOr[LegendOrient | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[LegendOrient | SignalRef]]) = null,
    padding: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    rowPadding: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    strokeColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    strokeDash: js.Array[Double] | SignalRef = null,
    strokeWidth: Double | SignalRef = null,
    symbolBaseFillColor: Color | SignalRef = null,
    symbolBaseStrokeColor: Color | SignalRef = null,
    symbolDash: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]] = null,
    symbolDashOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    symbolDirection: Orientation = null,
    symbolFillColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    symbolLimit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    symbolOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    symbolOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    symbolSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    symbolStrokeColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    symbolStrokeWidth: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    symbolType: (Exclude[
      js.UndefOr[SymbolShapeValue | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[SymbolShapeValue | SignalRef]]) = null,
    tickCount: (Exclude[js.UndefOr[TickCount], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TickCount]] = null,
    titleAlign: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]] = null,
    titleAnchor: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]] = null,
    titleBaseline: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]] = null,
    titleColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    titleFont: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]] = null,
    titleFontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    titleFontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]] = null,
    titleFontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]] = null,
    titleLimit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    titleLineHeight: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    titleOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    titleOrient: (Exclude[js.UndefOr[OrientValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[OrientValue]] = null,
    titlePadding: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null
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

