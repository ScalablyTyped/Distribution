package typings.vegaDashTypings.typesSpecLegendMod

import typings.vegaDashTypings.typesSpecAxisMod.FormatType
import typings.vegaDashTypings.typesSpecAxisMod.LabelOverlap
import typings.vegaDashTypings.typesSpecAxisMod.TickCount
import typings.vegaDashTypings.typesSpecEncodeMod.Orientation
import typings.vegaDashTypings.typesSpecLayoutMod.LayoutAlign
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecValuesMod.AlignValue
import typings.vegaDashTypings.typesSpecValuesMod.AnchorValue
import typings.vegaDashTypings.typesSpecValuesMod.ColorValue
import typings.vegaDashTypings.typesSpecValuesMod.DashArrayValue
import typings.vegaDashTypings.typesSpecValuesMod.FontStyleValue
import typings.vegaDashTypings.typesSpecValuesMod.FontWeightValue
import typings.vegaDashTypings.typesSpecValuesMod.NumberValue
import typings.vegaDashTypings.typesSpecValuesMod.OrientValue
import typings.vegaDashTypings.typesSpecValuesMod.StringValue
import typings.vegaDashTypings.typesSpecValuesMod.SymbolShapeValue
import typings.vegaDashTypings.typesSpecValuesMod.TextBaselineValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend extends BaseLegend[
      NumberValue, 
      Double | SignalRef, 
      StringValue, 
      ColorValue, 
      FontWeightValue, 
      FontStyleValue, 
      AlignValue, 
      TextBaselineValue, 
      LayoutAlign | SignalRef, 
      LabelOverlap | SignalRef, 
      SymbolShapeValue, 
      DashArrayValue, 
      OrientValue, 
      AnchorValue, 
      LegendOrient | SignalRef
    ] {
  /**
    * The direction of the legend, one of `"vertical"` (default) or `"horizontal"`.
    *
    * __Default value:__ `"vertical"`
    */
  var direction: js.UndefOr[Orientation] = js.undefined
  /**
    * Mark definitions for custom legend encoding.
    */
  var encode: js.UndefOr[LegendEncode] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  /**
    * The format specifier pattern for legend labels. For numerical values, must be a legal [d3-format](https://github.com/d3/d3-format#locale_format) specifier. For date-time values, must be a legal [d3-time-format](https://github.com/d3/d3-time-format#locale_format) specifier.
    */
  var format: js.UndefOr[String | SignalRef] = js.undefined
  /**
    * The format type for legend labels (number or time).
    */
  var formatType: js.UndefOr[FormatType | SignalRef] = js.undefined
  var opacity: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var strokeDash: js.UndefOr[String] = js.undefined
  var strokeWidth: js.UndefOr[String] = js.undefined
  /**
    * The desired number of tick values for quantitative legends.
    */
  var tickCount: js.UndefOr[TickCount] = js.undefined
  /**
    * The minimum desired step between tick values for quantitative legends, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
    */
  var tickMinStep: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The title for the legend.
    */
  var title: js.UndefOr[String | SignalRef] = js.undefined
  /**
    * The type of legend to include. One of `"symbol"` for discrete symbol legends, or `"gradient"` for a continuous color gradient. If gradient is used only the fill or stroke scale parameters are considered. If unspecified, the type will be inferred based on the scale parameters used and their backing scale types.
    */
  var `type`: js.UndefOr[LegendType] = js.undefined
  /**
    * Explicitly set the visible legend values.
    */
  var values: js.UndefOr[js.Array[_] | SignalRef] = js.undefined
  /**
    * The integer z-index indicating the layering of the legend group relative to other axis, mark, and legend groups.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[Double] = js.undefined
}

object Legend {
  @scala.inline
  def apply(
    clipHeight: Double | SignalRef = null,
    columnPadding: Double | SignalRef = null,
    columns: Double | SignalRef = null,
    cornerRadius: NumberValue = null,
    direction: Orientation = null,
    encode: LegendEncode = null,
    fill: String = null,
    fillColor: ColorValue = null,
    format: String | SignalRef = null,
    formatType: FormatType | SignalRef = null,
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
    legendX: NumberValue = null,
    legendY: NumberValue = null,
    offset: NumberValue = null,
    opacity: String = null,
    orient: LegendOrient | SignalRef = null,
    padding: NumberValue = null,
    rowPadding: Double | SignalRef = null,
    shape: String = null,
    size: String = null,
    stroke: String = null,
    strokeColor: ColorValue = null,
    strokeDash: String = null,
    strokeWidth: String = null,
    symbolDash: DashArrayValue = null,
    symbolDashOffset: NumberValue = null,
    symbolFillColor: ColorValue = null,
    symbolOffset: NumberValue = null,
    symbolOpacity: NumberValue = null,
    symbolSize: NumberValue = null,
    symbolStrokeColor: ColorValue = null,
    symbolStrokeWidth: NumberValue = null,
    symbolType: SymbolShapeValue = null,
    tickCount: TickCount = null,
    tickMinStep: Double | SignalRef = null,
    title: String | SignalRef = null,
    titleAlign: AlignValue = null,
    titleAnchor: AnchorValue = null,
    titleBaseline: TextBaselineValue = null,
    titleColor: ColorValue = null,
    titleFont: StringValue = null,
    titleFontSize: NumberValue = null,
    titleFontStyle: FontStyleValue = null,
    titleFontWeight: FontWeightValue = null,
    titleLimit: NumberValue = null,
    titleOpacity: NumberValue = null,
    titleOrient: OrientValue = null,
    titlePadding: NumberValue = null,
    `type`: LegendType = null,
    values: js.Array[_] | SignalRef = null,
    zindex: Int | Double = null
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
    if (formatType != null) __obj.updateDynamic("formatType")(formatType.asInstanceOf[js.Any])
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
    if (legendX != null) __obj.updateDynamic("legendX")(legendX.asInstanceOf[js.Any])
    if (legendY != null) __obj.updateDynamic("legendY")(legendY.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
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

