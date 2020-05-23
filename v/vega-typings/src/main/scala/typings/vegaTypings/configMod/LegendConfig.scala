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
  var aria: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
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
  var description: (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
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
  var zindex: (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
}

