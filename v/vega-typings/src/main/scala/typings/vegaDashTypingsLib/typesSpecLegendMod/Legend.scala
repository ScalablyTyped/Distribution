package typings
package vegaDashTypingsLib.typesSpecLegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend
  extends BaseLegend[
      vegaDashTypingsLib.typesSpecValuesMod.NumberValue, 
      scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecValuesMod.StringValue, 
      vegaDashTypingsLib.typesSpecValuesMod.ColorValue, 
      vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue, 
      vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AlignValue, 
      vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue, 
      vegaDashTypingsLib.typesSpecLayoutMod.LayoutAlign | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecAxisMod.LabelOverlap | vegaDashTypingsLib.typesSpecSignalMod.SignalRef, 
      vegaDashTypingsLib.typesSpecValuesMod.SymbolShapeValue, 
      vegaDashTypingsLib.typesSpecValuesMod.DashArrayValue, 
      vegaDashTypingsLib.typesSpecValuesMod.OrientValue, 
      vegaDashTypingsLib.typesSpecValuesMod.AnchorValue
    ] {
  /**
    * The direction of the legend, one of `"vertical"` (default) or `"horizontal"`.
    *
    * __Default value:__ `"vertical"`
    */
  var direction: js.UndefOr[vegaDashTypingsLib.typesSpecEncodeMod.Orientation] = js.undefined
  /**
    * Mark definitions for custom legend encoding.
    */
  var encode: js.UndefOr[LegendEncode] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The format specifier pattern for legend labels. For numerical values, must be a legal [d3-format](https://github.com/d3/d3-format#locale_format) specifier. For date-time values, must be a legal [d3-time-format](https://github.com/d3/d3-time-format#locale_format) specifier.
    */
  var format: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var opacity: js.UndefOr[java.lang.String] = js.undefined
  var shape: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var strokeDash: js.UndefOr[java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The desired number of tick values for quantitative legends.
    */
  var tickCount: js.UndefOr[vegaDashTypingsLib.typesSpecAxisMod.TickCount] = js.undefined
  /**
    * The minimum desired step between tick values for quantitative legends, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
    */
  var tickMinStep: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /**
    * The title for the legend.
    */
  var title: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  /**
    * The type of legend to include. One of `"symbol"` for discrete symbol legends, or `"gradient"` for a continuous color gradient. If gradient is used only the fill or stroke scale parameters are considered. If unspecified, the type will be inferred based on the scale parameters used and their backing scale types.
    */
  var `type`: js.UndefOr[LegendType] = js.undefined
  /**
    * Explicitly set the visible legend values.
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

object Legend {
  @scala.inline
  def apply(
    clipHeight: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    columnPadding: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    columns: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    cornerRadius: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    direction: vegaDashTypingsLib.typesSpecEncodeMod.Orientation = null,
    encode: LegendEncode = null,
    fill: java.lang.String = null,
    fillColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    format: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    gradientLength: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    gradientOpacity: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    gradientStrokeColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    gradientStrokeWidth: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    gradientThickness: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    gridAlign: vegaDashTypingsLib.typesSpecLayoutMod.LayoutAlign | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    labelAlign: vegaDashTypingsLib.typesSpecValuesMod.AlignValue = null,
    labelBaseline: vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue = null,
    labelColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    labelFont: vegaDashTypingsLib.typesSpecValuesMod.StringValue = null,
    labelFontSize: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    labelFontStyle: vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue = null,
    labelFontWeight: vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue = null,
    labelLimit: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    labelOffset: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    labelOpacity: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    labelOverlap: vegaDashTypingsLib.typesSpecAxisMod.LabelOverlap | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    labelPadding: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    labelSeparation: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    offset: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    opacity: java.lang.String = null,
    orient: LegendOrient = null,
    padding: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    rowPadding: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    shape: java.lang.String = null,
    size: java.lang.String = null,
    stroke: java.lang.String = null,
    strokeColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    strokeDash: java.lang.String = null,
    strokeWidth: java.lang.String = null,
    symbolDash: vegaDashTypingsLib.typesSpecValuesMod.DashArrayValue = null,
    symbolDashOffset: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    symbolFillColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    symbolOffset: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    symbolOpacity: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    symbolSize: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    symbolStrokeColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    symbolStrokeWidth: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    symbolType: vegaDashTypingsLib.typesSpecValuesMod.SymbolShapeValue = null,
    tickCount: vegaDashTypingsLib.typesSpecAxisMod.TickCount = null,
    tickMinStep: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    title: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    titleAlign: vegaDashTypingsLib.typesSpecValuesMod.AlignValue = null,
    titleAnchor: vegaDashTypingsLib.typesSpecValuesMod.AnchorValue = null,
    titleBaseline: vegaDashTypingsLib.typesSpecValuesMod.TextBaselineValue = null,
    titleColor: vegaDashTypingsLib.typesSpecValuesMod.ColorValue = null,
    titleFont: vegaDashTypingsLib.typesSpecValuesMod.StringValue = null,
    titleFontSize: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    titleFontStyle: vegaDashTypingsLib.typesSpecValuesMod.FontStyleValue = null,
    titleFontWeight: vegaDashTypingsLib.typesSpecValuesMod.FontWeightValue = null,
    titleLimit: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    titleOpacity: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    titleOrient: vegaDashTypingsLib.typesSpecValuesMod.OrientValue = null,
    titlePadding: vegaDashTypingsLib.typesSpecValuesMod.NumberValue = null,
    `type`: LegendType = null,
    values: js.Array[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    zindex: scala.Int | scala.Double = null
  ): Legend = {
    val __obj = js.Dynamic.literal()
    if (clipHeight != null) __obj.updateDynamic("clipHeight")(clipHeight.asInstanceOf[js.Any])
    if (columnPadding != null) __obj.updateDynamic("columnPadding")(columnPadding.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
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
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rowPadding != null) __obj.updateDynamic("rowPadding")(rowPadding.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (size != null) __obj.updateDynamic("size")(size)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth)
    if (symbolDash != null) __obj.updateDynamic("symbolDash")(symbolDash.asInstanceOf[js.Any])
    if (symbolDashOffset != null) __obj.updateDynamic("symbolDashOffset")(symbolDashOffset.asInstanceOf[js.Any])
    if (symbolFillColor != null) __obj.updateDynamic("symbolFillColor")(symbolFillColor.asInstanceOf[js.Any])
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset.asInstanceOf[js.Any])
    if (symbolOpacity != null) __obj.updateDynamic("symbolOpacity")(symbolOpacity.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (symbolStrokeColor != null) __obj.updateDynamic("symbolStrokeColor")(symbolStrokeColor.asInstanceOf[js.Any])
    if (symbolStrokeWidth != null) __obj.updateDynamic("symbolStrokeWidth")(symbolStrokeWidth.asInstanceOf[js.Any])
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (tickMinStep != null) __obj.updateDynamic("tickMinStep")(tickMinStep.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
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
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
}

