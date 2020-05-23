package typings.vegaTypings.configMod

import typings.std.Exclude
import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.valuesMod.AlignValue
import typings.vegaTypings.valuesMod.AnchorValue
import typings.vegaTypings.valuesMod.BooleanValue
import typings.vegaTypings.valuesMod.ColorValue
import typings.vegaTypings.valuesMod.DashArrayValue
import typings.vegaTypings.valuesMod.FontStyleValue
import typings.vegaTypings.valuesMod.FontWeightValue
import typings.vegaTypings.valuesMod.NumberValue
import typings.vegaTypings.valuesMod.StringValue
import typings.vegaTypings.valuesMod.StrokeCapValue
import typings.vegaTypings.valuesMod.TextBaselineValue
import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/axis.BaseAxis> */
trait AxisConfig extends js.Object {
  var aria: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
  var bandPosition: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var description: (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
  var domain: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
  var domainCap: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
  var domainColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var domainDash: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
  var domainDashOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var domainOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var domainWidth: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var grid: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
  var gridCap: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
  var gridColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var gridDash: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
  var gridDashOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var gridOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var gridWidth: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var labelAlign: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
  var labelAngle: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var labelBaseline: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
  var labelBound: (Exclude[
    js.UndefOr[Double | Boolean | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
  var labelColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var labelFlush: (Exclude[
    js.UndefOr[Double | Boolean | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
  var labelFlushOffset: (Exclude[
    js.UndefOr[Double | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  var labelFont: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
  var labelFontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var labelFontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
  var labelFontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
  var labelLimit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var labelLineHeight: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
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
  var labels: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
  var maxExtent: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var minExtent: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var tickBand: (Exclude[
    js.UndefOr[center | extent | SignalRef], 
    ScaledValueRef[_] | NumericValueRef | ColorValueRef
  ]) | (KeepSignal[js.UndefOr[center | extent | SignalRef]])
  var tickCap: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
  var tickColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var tickDash: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
  var tickDashOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var tickExtra: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
  var tickOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var tickOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var tickRound: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
  var tickSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var tickWidth: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var ticks: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
  var titleAlign: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
  var titleAnchor: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
  var titleAngle: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var titleBaseline: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
  var titleColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var titleFont: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
  var titleFontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var titleFontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
  var titleFontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
  var titleLimit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var titleLineHeight: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var titleOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var titlePadding: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var titleX: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var titleY: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var translate: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var zindex: (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
}

