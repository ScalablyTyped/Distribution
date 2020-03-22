package typings.vegaTypings.configMod

import typings.vegaTypings.axisMod.LabelOverlap
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
  var bandPosition: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var domain: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]]
  var domainColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]
  var domainDash: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]]
  var domainDashOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var domainOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var domainWidth: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var grid: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]]
  var gridColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]
  var gridDash: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]]
  var gridDashOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var gridOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var gridWidth: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var labelAlign: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]]
  var labelAngle: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var labelBaseline: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]]
  var labelBound: ExcludeValueRefKeepSignal[js.UndefOr[Double | Boolean | SignalRef]]
  var labelColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]
  var labelFlush: ExcludeValueRefKeepSignal[js.UndefOr[Double | Boolean | SignalRef]]
  var labelFlushOffset: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]
  var labelFont: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]]
  var labelFontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var labelFontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]]
  var labelFontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]]
  var labelLimit: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var labelOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var labelOverlap: ExcludeValueRefKeepSignal[js.UndefOr[LabelOverlap | SignalRef]]
  var labelPadding: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var labelSeparation: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]
  var labels: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]]
  var maxExtent: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var minExtent: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var tickBand: ExcludeValueRefKeepSignal[js.UndefOr[center | extent | SignalRef]]
  var tickColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]
  var tickDash: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]]
  var tickDashOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var tickExtra: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]]
  var tickOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var tickOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var tickRound: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]]
  var tickSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var tickWidth: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var ticks: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]]
  var titleAlign: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]]
  var titleAnchor: ExcludeValueRefKeepSignal[js.UndefOr[AnchorValue]]
  var titleAngle: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var titleBaseline: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]]
  var titleColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]]
  var titleFont: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]]
  var titleFontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var titleFontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]]
  var titleFontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]]
  var titleLimit: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var titleLineHeight: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var titleOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var titlePadding: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var titleX: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var titleY: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]]
  var translate: ExcludeValueRefKeepSignal[js.UndefOr[Double]]
}

object AxisConfig {
  @scala.inline
  def apply(
    bandPosition: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    domain: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]] = null,
    domainColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = null,
    domainDash: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]] = null,
    domainDashOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    domainOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    domainWidth: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    grid: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]] = null,
    gridColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = null,
    gridDash: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]] = null,
    gridDashOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    gridOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    gridWidth: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    labelAlign: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]] = null,
    labelAngle: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    labelBaseline: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]] = null,
    labelBound: ExcludeValueRefKeepSignal[js.UndefOr[Double | Boolean | SignalRef]] = null,
    labelColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = null,
    labelFlush: ExcludeValueRefKeepSignal[js.UndefOr[Double | Boolean | SignalRef]] = null,
    labelFlushOffset: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = null,
    labelFont: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]] = null,
    labelFontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    labelFontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]] = null,
    labelFontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]] = null,
    labelLimit: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    labelOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    labelOverlap: ExcludeValueRefKeepSignal[js.UndefOr[LabelOverlap | SignalRef]] = null,
    labelPadding: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    labelSeparation: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = null,
    labels: ExcludeValueRefKeepSignal[js.UndefOr[Boolean]] = null,
    maxExtent: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    minExtent: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    tickBand: ExcludeValueRefKeepSignal[js.UndefOr[center | extent | SignalRef]] = null,
    tickColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = null,
    tickDash: ExcludeValueRefKeepSignal[js.UndefOr[DashArrayValue]] = null,
    tickDashOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    tickExtra: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]] = null,
    tickOffset: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    tickOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    tickRound: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]] = null,
    tickSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    tickWidth: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    ticks: ExcludeValueRefKeepSignal[js.UndefOr[BooleanValue]] = null,
    titleAlign: ExcludeValueRefKeepSignal[js.UndefOr[AlignValue]] = null,
    titleAnchor: ExcludeValueRefKeepSignal[js.UndefOr[AnchorValue]] = null,
    titleAngle: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    titleBaseline: ExcludeValueRefKeepSignal[js.UndefOr[TextBaselineValue]] = null,
    titleColor: ExcludeValueRefKeepSignal[js.UndefOr[ColorValue]] = null,
    titleFont: ExcludeValueRefKeepSignal[js.UndefOr[StringValue]] = null,
    titleFontSize: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    titleFontStyle: ExcludeValueRefKeepSignal[js.UndefOr[FontStyleValue]] = null,
    titleFontWeight: ExcludeValueRefKeepSignal[js.UndefOr[FontWeightValue]] = null,
    titleLimit: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    titleLineHeight: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    titleOpacity: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    titlePadding: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    titleX: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    titleY: ExcludeValueRefKeepSignal[js.UndefOr[NumberValue]] = null,
    translate: ExcludeValueRefKeepSignal[js.UndefOr[Double]] = null
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

