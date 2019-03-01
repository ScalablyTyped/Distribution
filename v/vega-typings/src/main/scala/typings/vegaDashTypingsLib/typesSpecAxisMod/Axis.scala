package typings
package vegaDashTypingsLib.typesSpecAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis
  extends BaseAxis[
      vegaDashTypingsLib.typesSpecValuesMod.NumberValue, 
      scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecValuesMod.BooleanValue, 
      scala.Double | scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecValuesMod.StringValue, 
      vegaDashTypingsLib.typesSpecValuesMod.ColorValue, 
      vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue, 
      vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AlignValue, 
      vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue, 
      vegaDashTypingsLib.typesSpecLayoutMod.LayoutAlign | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      LabelOverlap | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecValuesMod.DashArrayValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AnchorValue
    ] {
  /**
    * Mark definitions for custom axis encoding.
    */
  var encode: js.UndefOr[AxisEncode] = js.undefined
  /**
    * The format specifier pattern for axis labels. For numerical values, must be a legal [d3-format](https://github.com/d3/d3-format#locale_format) specifier. For date-time values, must be a legal [d3-time-format](https://github.com/d3/d3-time-format#locale_format) specifier.
    */
  var format: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /**
    * The name of the scale to use for including grid lines. By default grid lines are driven by the same scale as the ticks and labels.
    */
  var gridScale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The orthogonal offset in pixels by which to displace the axis from its position along the edge of the chart.
    */
  var offset: js.UndefOr[vegaDashTypingsLib.typesSpecValuesMod.NumberValue] = js.undefined
  /**
    * The orientation of the axis. One of `"top"`, `"bottom"`, `"left"` or `"right"`. The orientation can be used to further specialize the axis type (e.g., a y axis oriented for the right edge of the chart).
    *
    * __Default value:__ `"bottom"` for x-axes and `"left"` for y-axes.
    */
  var orient: AxisOrient
  /**
    * The anchor position of the axis in pixels. For x-axes with top or bottom orientation, this sets the axis group x coordinate. For y-axes with left or right orientation, this sets the axis group y coordinate.
    *
    * __Default value__: `0`
    */
  var position: js.UndefOr[vegaDashTypingsLib.typesSpecValuesMod.NumberValue] = js.undefined
  /**
    * The name of the scale backing the axis component.
    */
  var scale: java.lang.String
  /**
    * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of `2`, `5`, `10`) and lie within the underlying scale's range.
    *
    * For scales of type `"time"` or `"utc"`, the tick count can instead be a time interval specifier. Legal string values are `"millisecond"`, `"second"`, `"minute"`, `"hour"`, `"day"`, `"week"`, `"month"`, and "year". Alternatively, an object-valued interval specifier of the form `{"interval": "month", "step": 3}` includes a desired number of interval steps. Here, ticks are generated for each quarter (Jan, Apr, Jul, Oct) boundary.
    *
    * @minimum 0
    */
  var tickCount: js.UndefOr[TickCount] = js.undefined
  /**
    * The minimum desired step between axis ticks, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
    */
  var tickMinStep: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /**
    * A title for the axis (none by default).
    */
  var title: js.UndefOr[vegaDashTypingsLib.typesSpecValuesMod.StringValue] = js.undefined
  /**
    * Explicitly set the visible axis tick and label values.
    */
  var values: js.UndefOr[js.Array[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /**
    * The integer z-index indicating the layering of the legend group relative to other axis, mark, and legend groups.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[scala.Double] = js.undefined
}

object Axis {
  @scala.inline
  def apply(
    orient: AxisOrient,
    scale: java.lang.String,
    bandPosition: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    domain: js.UndefOr[scala.Boolean] = js.undefined,
    domainColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    domainDash: vegaDashTypingsLib.typesSpecValuesMod.DashArrayValue = null,
    domainDashOffset: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    domainOpacity: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    domainWidth: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    encode: AxisEncode = null,
    format: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    gridColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    gridDash: vegaDashTypingsLib.typesSpecValuesMod.DashArrayValue = null,
    gridDashOffset: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    gridOpacity: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    gridScale: java.lang.String = null,
    gridWidth: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    labelAlign: vegaDashTypingsLib.typesSpecValuesMod.AlignValue = null,
    labelAngle: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    labelBaseline: vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue = null,
    labelBound: scala.Double | scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    labelColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    labelFlush: scala.Double | scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    labelFlushOffset: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    labelFont: vegaDashTypingsLib.typesSpecValuesMod.StringValue = null,
    labelFontSize: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    labelFontStyle: vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue = null,
    labelFontWeight: vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue = null,
    labelLimit: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    labelOpacity: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    labelOverlap: LabelOverlap | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    labelPadding: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    labelSeparation: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    labels: js.UndefOr[scala.Boolean] = js.undefined,
    maxExtent: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    minExtent: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    offset: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    position: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    tickColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    tickCount: TickCount = null,
    tickDash: vegaDashTypingsLib.typesSpecValuesMod.DashArrayValue = null,
    tickDashOffset: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    tickExtra: vegaDashTypingsLib.typesSpecValuesMod.BooleanValue = null,
    tickMinStep: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    tickOffset: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    tickOpacity: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    tickRound: vegaDashTypingsLib.typesSpecValuesMod.BooleanValue = null,
    tickSize: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    tickWidth: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    ticks: vegaDashTypingsLib.typesSpecValuesMod.BooleanValue = null,
    title: vegaDashTypingsLib.typesSpecValuesMod.StringValue = null,
    titleAlign: vegaDashTypingsLib.typesSpecValuesMod.AlignValue = null,
    titleAnchor: vegaDashTypingsLib.typesSpecValuesMod.AnchorValue = null,
    titleAngle: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    titleBaseline: vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue = null,
    titleColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    titleFont: vegaDashTypingsLib.typesSpecValuesMod.StringValue = null,
    titleFontSize: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    titleFontStyle: vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue = null,
    titleFontWeight: vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue = null,
    titleLimit: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    titleOpacity: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    titlePadding: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    titleX: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    titleY: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    values: js.Array[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    zindex: scala.Int | scala.Double = null
  ): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("orient")(orient)
    __obj.updateDynamic("scale")(scale)
    if (bandPosition != null) __obj.updateDynamic("bandPosition")(bandPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain)
    if (domainColor != null) __obj.updateDynamic("domainColor")(domainColor.asInstanceOf[js.Any])
    if (domainDash != null) __obj.updateDynamic("domainDash")(domainDash.asInstanceOf[js.Any])
    if (domainDashOffset != null) __obj.updateDynamic("domainDashOffset")(domainDashOffset.asInstanceOf[js.Any])
    if (domainOpacity != null) __obj.updateDynamic("domainOpacity")(domainOpacity.asInstanceOf[js.Any])
    if (domainWidth != null) __obj.updateDynamic("domainWidth")(domainWidth.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (gridColor != null) __obj.updateDynamic("gridColor")(gridColor.asInstanceOf[js.Any])
    if (gridDash != null) __obj.updateDynamic("gridDash")(gridDash.asInstanceOf[js.Any])
    if (gridDashOffset != null) __obj.updateDynamic("gridDashOffset")(gridDashOffset.asInstanceOf[js.Any])
    if (gridOpacity != null) __obj.updateDynamic("gridOpacity")(gridOpacity.asInstanceOf[js.Any])
    if (gridScale != null) __obj.updateDynamic("gridScale")(gridScale)
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
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels)
    if (maxExtent != null) __obj.updateDynamic("maxExtent")(maxExtent.asInstanceOf[js.Any])
    if (minExtent != null) __obj.updateDynamic("minExtent")(minExtent.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (tickDash != null) __obj.updateDynamic("tickDash")(tickDash.asInstanceOf[js.Any])
    if (tickDashOffset != null) __obj.updateDynamic("tickDashOffset")(tickDashOffset.asInstanceOf[js.Any])
    if (tickExtra != null) __obj.updateDynamic("tickExtra")(tickExtra.asInstanceOf[js.Any])
    if (tickMinStep != null) __obj.updateDynamic("tickMinStep")(tickMinStep.asInstanceOf[js.Any])
    if (tickOffset != null) __obj.updateDynamic("tickOffset")(tickOffset.asInstanceOf[js.Any])
    if (tickOpacity != null) __obj.updateDynamic("tickOpacity")(tickOpacity.asInstanceOf[js.Any])
    if (tickRound != null) __obj.updateDynamic("tickRound")(tickRound.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickWidth != null) __obj.updateDynamic("tickWidth")(tickWidth.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
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
    if (titleOpacity != null) __obj.updateDynamic("titleOpacity")(titleOpacity.asInstanceOf[js.Any])
    if (titlePadding != null) __obj.updateDynamic("titlePadding")(titlePadding.asInstanceOf[js.Any])
    if (titleX != null) __obj.updateDynamic("titleX")(titleX.asInstanceOf[js.Any])
    if (titleY != null) __obj.updateDynamic("titleY")(titleY.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

