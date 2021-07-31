package typings.vegaLite.anon

import typings.std.Exclude
import typings.vegaLite.axisMod.ConditionalAxisColor
import typings.vegaLite.axisMod.ConditionalAxisLabelAlign
import typings.vegaLite.axisMod.ConditionalAxisLabelBaseline
import typings.vegaLite.axisMod.ConditionalAxisLabelFontStyle
import typings.vegaLite.axisMod.ConditionalAxisLabelFontWeight
import typings.vegaLite.axisMod.ConditionalAxisNumber
import typings.vegaLite.axisMod.ConditionalAxisNumberArray
import typings.vegaLite.axisMod.ConditionalAxisString
import typings.vegaLite.channeldefMod.FieldDefBase
import typings.vegaLite.vegaLiteStrings.center
import typings.vegaLite.vegaLiteStrings.extent
import typings.vegaTypings.axisMod.AxisEncode
import typings.vegaTypings.axisMod.AxisOrient
import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.axisMod.TickCount
import typings.vegaTypings.axisMod.TimeFormatSpecifier
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.encodeMod.Text
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<vega-lite.vega-lite/build/src/compile/axis/component.AxisComponentProps> */
trait PartialAxisComponentProps extends StObject {
  
  var aria: js.UndefOr[Boolean] = js.undefined
  
  var bandPosition: js.UndefOr[NumberValue] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var disable: js.UndefOr[Boolean] = js.undefined
  
  var domain: js.UndefOr[Boolean] = js.undefined
  
  var domainCap: js.UndefOr[StrokeCapValue] = js.undefined
  
  var domainColor: js.UndefOr[ColorValue] = js.undefined
  
  var domainDash: js.UndefOr[DashArrayValue] = js.undefined
  
  var domainDashOffset: js.UndefOr[NumberValue] = js.undefined
  
  var domainOpacity: js.UndefOr[NumberValue] = js.undefined
  
  var domainWidth: js.UndefOr[NumberValue] = js.undefined
  
  var encode: js.UndefOr[AxisEncode] = js.undefined
  
  var format: js.UndefOr[String | TimeFormatSpecifier | SignalRef] = js.undefined
  
  var formatType: js.UndefOr[typings.vegaTypings.axisMod.FormatType | SignalRef] = js.undefined
  
  var grid: js.UndefOr[Boolean] = js.undefined
  
  var gridCap: js.UndefOr[StrokeCapValue] = js.undefined
  
  var gridColor: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
  ] = js.undefined
  
  var gridDash: js.UndefOr[
    (Exclude[
      js.UndefOr[DashArrayValue], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | SignalRef | ConditionalAxisNumberArray[SignalRef]
  ] = js.undefined
  
  var gridDashOffset: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
  ] = js.undefined
  
  var gridOpacity: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
  ] = js.undefined
  
  var gridScale: js.UndefOr[String] = js.undefined
  
  var gridWidth: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
  ] = js.undefined
  
  var labelAlign: js.UndefOr[
    (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisLabelAlign[SignalRef]
  ] = js.undefined
  
  var labelAngle: js.UndefOr[NumberValue] = js.undefined
  
  var labelBaseline: js.UndefOr[
    (Exclude[
      js.UndefOr[TextBaselineValue], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | SignalRef | ConditionalAxisLabelBaseline[SignalRef]
  ] = js.undefined
  
  var labelBound: js.UndefOr[Double | Boolean | SignalRef] = js.undefined
  
  var labelColor: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
  ] = js.undefined
  
  var labelExpr: js.UndefOr[String] = js.undefined
  
  var labelFlush: js.UndefOr[Double | Boolean | SignalRef] = js.undefined
  
  var labelFlushOffset: js.UndefOr[Double | SignalRef] = js.undefined
  
  var labelFont: js.UndefOr[
    (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisString[SignalRef]
  ] = js.undefined
  
  var labelFontSize: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
  ] = js.undefined
  
  var labelFontStyle: js.UndefOr[
    (Exclude[
      js.UndefOr[FontStyleValue], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | SignalRef | ConditionalAxisLabelFontStyle[SignalRef]
  ] = js.undefined
  
  var labelFontWeight: js.UndefOr[
    (Exclude[
      js.UndefOr[FontWeightValue], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | SignalRef | ConditionalAxisLabelFontWeight[SignalRef]
  ] = js.undefined
  
  var labelLimit: js.UndefOr[NumberValue] = js.undefined
  
  var labelLineHeight: js.UndefOr[NumberValue] = js.undefined
  
  var labelOffset: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
  ] = js.undefined
  
  var labelOpacity: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
  ] = js.undefined
  
  var labelOverlap: js.UndefOr[LabelOverlap | SignalRef] = js.undefined
  
  var labelPadding: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
  ] = js.undefined
  
  var labelSeparation: js.UndefOr[Double | SignalRef] = js.undefined
  
  var labels: js.UndefOr[Boolean] = js.undefined
  
  var maxExtent: js.UndefOr[NumberValue] = js.undefined
  
  var minExtent: js.UndefOr[NumberValue] = js.undefined
  
  var offset: js.UndefOr[NumberValue] = js.undefined
  
  var orient: js.UndefOr[AxisOrient | SignalRef] = js.undefined
  
  var position: js.UndefOr[NumberValue] = js.undefined
  
  var scale: js.UndefOr[String] = js.undefined
  
  var tickBand: js.UndefOr[center | extent | SignalRef] = js.undefined
  
  var tickCap: js.UndefOr[StrokeCapValue] = js.undefined
  
  var tickColor: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
  ] = js.undefined
  
  var tickCount: js.UndefOr[TickCount] = js.undefined
  
  var tickDash: js.UndefOr[
    (Exclude[
      js.UndefOr[DashArrayValue], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | SignalRef | ConditionalAxisNumberArray[SignalRef]
  ] = js.undefined
  
  var tickDashOffset: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
  ] = js.undefined
  
  var tickExtra: js.UndefOr[BooleanValue] = js.undefined
  
  var tickMinStep: js.UndefOr[Double | SignalRef] = js.undefined
  
  var tickOffset: js.UndefOr[NumberValue] = js.undefined
  
  var tickOpacity: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
  ] = js.undefined
  
  var tickRound: js.UndefOr[BooleanValue] = js.undefined
  
  var tickSize: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
  ] = js.undefined
  
  var tickWidth: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
  ] = js.undefined
  
  var ticks: js.UndefOr[BooleanValue] = js.undefined
  
  var title: js.UndefOr[Text | (js.Array[FieldDefBase[String, typings.vegaLite.binMod.Bin]]) | SignalRef] = js.undefined
  
  var titleAlign: js.UndefOr[AlignValue] = js.undefined
  
  var titleAnchor: js.UndefOr[AnchorValue] = js.undefined
  
  var titleAngle: js.UndefOr[NumberValue] = js.undefined
  
  var titleBaseline: js.UndefOr[TextBaselineValue] = js.undefined
  
  var titleColor: js.UndefOr[ColorValue] = js.undefined
  
  var titleFont: js.UndefOr[StringValue] = js.undefined
  
  var titleFontSize: js.UndefOr[NumberValue] = js.undefined
  
  var titleFontStyle: js.UndefOr[FontStyleValue] = js.undefined
  
  var titleFontWeight: js.UndefOr[FontWeightValue] = js.undefined
  
  var titleLimit: js.UndefOr[NumberValue] = js.undefined
  
  var titleLineHeight: js.UndefOr[NumberValue] = js.undefined
  
  var titleOpacity: js.UndefOr[NumberValue] = js.undefined
  
  var titlePadding: js.UndefOr[NumberValue] = js.undefined
  
  var titleX: js.UndefOr[NumberValue] = js.undefined
  
  var titleY: js.UndefOr[NumberValue] = js.undefined
  
  var translate: js.UndefOr[NumberValue] = js.undefined
  
  var values: js.UndefOr[js.Array[js.Any] | SignalRef] = js.undefined
  
  var zindex: js.UndefOr[Double] = js.undefined
}
object PartialAxisComponentProps {
  
  @scala.inline
  def apply(): PartialAxisComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAxisComponentProps]
  }
  
  @scala.inline
  implicit class PartialAxisComponentPropsMutableBuilder[Self <: PartialAxisComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    @scala.inline
    def setBandPosition(value: NumberValue): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    @scala.inline
    def setDomain(value: Boolean): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainCap(value: StrokeCapValue): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
    
    @scala.inline
    def setDomainColor(value: ColorValue): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainColorNull: Self = StObject.set(x, "domainColor", null)
    
    @scala.inline
    def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
    
    @scala.inline
    def setDomainDash(value: DashArrayValue): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainDashOffset(value: NumberValue): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
    
    @scala.inline
    def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
    
    @scala.inline
    def setDomainDashVarargs(value: Double*): Self = StObject.set(x, "domainDash", js.Array(value :_*))
    
    @scala.inline
    def setDomainOpacity(value: NumberValue): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setDomainWidth(value: NumberValue): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
    
    @scala.inline
    def setEncode(value: AxisEncode): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    @scala.inline
    def setFormat(value: String | TimeFormatSpecifier | SignalRef): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatType(value: typings.vegaTypings.axisMod.FormatType | SignalRef): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridCap(value: StrokeCapValue): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
    
    @scala.inline
    def setGridColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
    ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColorNull: Self = StObject.set(x, "gridColor", null)
    
    @scala.inline
    def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
    
    @scala.inline
    def setGridDash(
      value: (Exclude[
          js.UndefOr[DashArrayValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | SignalRef | ConditionalAxisNumberArray[SignalRef]
    ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridDashOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
    ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
    
    @scala.inline
    def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
    
    @scala.inline
    def setGridDashVarargs(value: Double*): Self = StObject.set(x, "gridDash", js.Array(value :_*))
    
    @scala.inline
    def setGridOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
    ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
    
    @scala.inline
    def setGridScale(value: String): Self = StObject.set(x, "gridScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridScaleUndefined: Self = StObject.set(x, "gridScale", js.undefined)
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setGridWidth(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
    ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
    
    @scala.inline
    def setLabelAlign(
      value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisLabelAlign[SignalRef]
    ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    @scala.inline
    def setLabelAngle(value: NumberValue): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
    
    @scala.inline
    def setLabelBaseline(
      value: (Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | SignalRef | ConditionalAxisLabelBaseline[SignalRef]
    ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
    
    @scala.inline
    def setLabelBound(value: Double | Boolean | SignalRef): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
    
    @scala.inline
    def setLabelColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
    ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
    
    @scala.inline
    def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    @scala.inline
    def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
    
    @scala.inline
    def setLabelFlush(value: Double | Boolean | SignalRef): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFlushOffset(value: Double | SignalRef): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
    
    @scala.inline
    def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
    
    @scala.inline
    def setLabelFont(
      value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisString[SignalRef]
    ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontSize(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
    ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
    
    @scala.inline
    def setLabelFontStyle(
      value: (Exclude[
          js.UndefOr[FontStyleValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | SignalRef | ConditionalAxisLabelFontStyle[SignalRef]
    ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
    
    @scala.inline
    def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
    
    @scala.inline
    def setLabelFontWeight(
      value: (Exclude[
          js.UndefOr[FontWeightValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | SignalRef | ConditionalAxisLabelFontWeight[SignalRef]
    ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
    
    @scala.inline
    def setLabelLimit(value: NumberValue): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
    
    @scala.inline
    def setLabelLineHeight(value: NumberValue): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
    
    @scala.inline
    def setLabelOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
    ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
    
    @scala.inline
    def setLabelOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
    ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
    
    @scala.inline
    def setLabelOverlap(value: LabelOverlap | SignalRef): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
    
    @scala.inline
    def setLabelPadding(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
    ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
    
    @scala.inline
    def setLabelSeparation(value: Double | SignalRef): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
    
    @scala.inline
    def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMaxExtent(value: NumberValue): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
    
    @scala.inline
    def setMinExtent(value: NumberValue): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
    
    @scala.inline
    def setOffset(value: NumberValue): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrient(value: AxisOrient | SignalRef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    @scala.inline
    def setPosition(value: NumberValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTickBand(value: center | extent | SignalRef): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
    
    @scala.inline
    def setTickCap(value: StrokeCapValue): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
    
    @scala.inline
    def setTickColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
    ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickColorNull: Self = StObject.set(x, "tickColor", null)
    
    @scala.inline
    def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
    
    @scala.inline
    def setTickCount(value: TickCount): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
    
    @scala.inline
    def setTickDash(
      value: (Exclude[
          js.UndefOr[DashArrayValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | SignalRef | ConditionalAxisNumberArray[SignalRef]
    ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickDashOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
    ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
    
    @scala.inline
    def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
    
    @scala.inline
    def setTickDashVarargs(value: Double*): Self = StObject.set(x, "tickDash", js.Array(value :_*))
    
    @scala.inline
    def setTickExtra(value: BooleanValue): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
    
    @scala.inline
    def setTickMinStep(value: Double | SignalRef): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
    
    @scala.inline
    def setTickOffset(value: NumberValue): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
    
    @scala.inline
    def setTickOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
    ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
    
    @scala.inline
    def setTickRound(value: BooleanValue): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
    
    @scala.inline
    def setTickSize(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
    ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
    
    @scala.inline
    def setTickWidth(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
    ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
    
    @scala.inline
    def setTicks(value: BooleanValue): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTitle(value: Text | (js.Array[FieldDefBase[String, typings.vegaLite.binMod.Bin]]) | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAlign(value: AlignValue): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
    
    @scala.inline
    def setTitleAnchor(value: AnchorValue): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
    
    @scala.inline
    def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
    
    @scala.inline
    def setTitleAngle(value: NumberValue): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
    
    @scala.inline
    def setTitleBaseline(value: TextBaselineValue): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
    
    @scala.inline
    def setTitleColor(value: ColorValue): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
    
    @scala.inline
    def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
    
    @scala.inline
    def setTitleFont(value: StringValue): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontSize(value: NumberValue): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
    
    @scala.inline
    def setTitleFontStyle(value: FontStyleValue): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
    
    @scala.inline
    def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
    
    @scala.inline
    def setTitleFontWeight(value: FontWeightValue): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
    
    @scala.inline
    def setTitleLimit(value: NumberValue): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
    
    @scala.inline
    def setTitleLineHeight(value: NumberValue): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
    
    @scala.inline
    def setTitleOpacity(value: NumberValue): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
    
    @scala.inline
    def setTitlePadding(value: NumberValue): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: ((FieldDefBase[String, typings.vegaLite.binMod.Bin]) | String)*): Self = StObject.set(x, "title", js.Array(value :_*))
    
    @scala.inline
    def setTitleX(value: NumberValue): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
    
    @scala.inline
    def setTitleY(value: NumberValue): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
    
    @scala.inline
    def setTranslate(value: NumberValue): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[js.Any] | SignalRef): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    @scala.inline
    def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
  }
}
