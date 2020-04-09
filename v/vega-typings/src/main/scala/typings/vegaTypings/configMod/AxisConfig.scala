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
import typings.vegaTypings.valuesMod.TextBaselineValue
import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/axis.BaseAxis> */
trait AxisConfig extends js.Object {
  var bandPosition: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var domain: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
  var domainColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  var domainDash: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
  var domainDashOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var domainOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var domainWidth: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  var grid: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
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
  var translate: (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
}

object AxisConfig {
  @scala.inline
  def apply(
    bandPosition: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    domain: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]] = null,
    domainColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    domainDash: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]] = null,
    domainDashOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    domainOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    domainWidth: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    grid: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]] = null,
    gridColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    gridDash: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]] = null,
    gridDashOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    gridOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    gridWidth: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    labelAlign: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]] = null,
    labelAngle: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    labelBaseline: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]] = null,
    labelBound: (Exclude[
      js.UndefOr[Double | Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]]) = null,
    labelColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    labelFlush: (Exclude[
      js.UndefOr[Double | Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]]) = null,
    labelFlushOffset: (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]]) = null,
    labelFont: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]] = null,
    labelFontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    labelFontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]] = null,
    labelFontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]] = null,
    labelLimit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    labelLineHeight: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
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
    labels: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]] = null,
    maxExtent: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    minExtent: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    tickBand: (Exclude[
      js.UndefOr[center | extent | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[center | extent | SignalRef]]) = null,
    tickColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    tickDash: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]] = null,
    tickDashOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    tickExtra: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]] = null,
    tickOffset: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    tickOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    tickRound: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]] = null,
    tickSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    tickWidth: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    ticks: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]] = null,
    titleAlign: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]] = null,
    titleAnchor: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]] = null,
    titleAngle: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    titleBaseline: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]] = null,
    titleColor: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]] = null,
    titleFont: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]] = null,
    titleFontSize: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    titleFontStyle: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]] = null,
    titleFontWeight: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]] = null,
    titleLimit: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    titleLineHeight: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    titleOpacity: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    titlePadding: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    titleX: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    titleY: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]] = null,
    translate: (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]] = null
  ): AxisConfig = {
    val __obj = js.Dynamic.literal()
    if (bandPosition != null) __obj.updateDynamic("bandPosition")(bandPosition.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainColor != null) __obj.updateDynamic("domainColor")(domainColor.asInstanceOf[js.Any])
    if (domainDash != null) __obj.updateDynamic("domainDash")(domainDash.asInstanceOf[js.Any])
    if (domainDashOffset != null) __obj.updateDynamic("domainDashOffset")(domainDashOffset.asInstanceOf[js.Any])
    if (domainOpacity != null) __obj.updateDynamic("domainOpacity")(domainOpacity.asInstanceOf[js.Any])
    if (domainWidth != null) __obj.updateDynamic("domainWidth")(domainWidth.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
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
    if (labelLineHeight != null) __obj.updateDynamic("labelLineHeight")(labelLineHeight.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (labelOpacity != null) __obj.updateDynamic("labelOpacity")(labelOpacity.asInstanceOf[js.Any])
    if (labelOverlap != null) __obj.updateDynamic("labelOverlap")(labelOverlap.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (labelSeparation != null) __obj.updateDynamic("labelSeparation")(labelSeparation.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (maxExtent != null) __obj.updateDynamic("maxExtent")(maxExtent.asInstanceOf[js.Any])
    if (minExtent != null) __obj.updateDynamic("minExtent")(minExtent.asInstanceOf[js.Any])
    if (tickBand != null) __obj.updateDynamic("tickBand")(tickBand.asInstanceOf[js.Any])
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
    if (titleLineHeight != null) __obj.updateDynamic("titleLineHeight")(titleLineHeight.asInstanceOf[js.Any])
    if (titleOpacity != null) __obj.updateDynamic("titleOpacity")(titleOpacity.asInstanceOf[js.Any])
    if (titlePadding != null) __obj.updateDynamic("titlePadding")(titlePadding.asInstanceOf[js.Any])
    if (titleX != null) __obj.updateDynamic("titleX")(titleX.asInstanceOf[js.Any])
    if (titleY != null) __obj.updateDynamic("titleY")(titleY.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisConfig]
  }
}

