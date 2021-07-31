package typings.vegaLite

import typings.std.Exclude
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcGuideMod.GuideEncodingEntry
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.utilMod.Flag
import typings.vegaLite.vegaLiteStrings.fill
import typings.vegaLite.vegaLiteStrings.gradient
import typings.vegaLite.vegaLiteStrings.number
import typings.vegaLite.vegaLiteStrings.opacity
import typings.vegaLite.vegaLiteStrings.shape
import typings.vegaLite.vegaLiteStrings.size
import typings.vegaLite.vegaLiteStrings.stroke
import typings.vegaLite.vegaLiteStrings.strokeDash
import typings.vegaLite.vegaLiteStrings.strokeWidth
import typings.vegaLite.vegaLiteStrings.symbol
import typings.vegaLite.vegaLiteStrings.time
import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.axisMod.TickCount
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.configMod.KeepSignal
import typings.vegaTypings.configMod.LegendLayout
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.encodeMod.Text
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendMod {
  
  @JSImport("vega-lite/build/src/legend", "COMMON_LEGEND_PROPERTY_INDEX")
  @js.native
  val COMMON_LEGEND_PROPERTY_INDEX: Flag[
    /* keyof vega-typings.vega-typings/types/spec/legend.Legend | vega-lite.vega-lite/build/src/legend.Legend<any> */ String
  ] = js.native
  
  @JSImport("vega-lite/build/src/legend", "LEGEND_PROPERTIES")
  @js.native
  val LEGEND_PROPERTIES: js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 65 */ js.Any
  ] = js.native
  
  @JSImport("vega-lite/build/src/legend", "LEGEND_SCALE_CHANNELS")
  @js.native
  val LEGEND_SCALE_CHANNELS: js.Tuple7[size, shape, fill, stroke, strokeDash, strokeWidth, opacity] = js.native
  
  @JSImport("vega-lite/build/src/legend", "defaultLegendConfig")
  @js.native
  val defaultLegendConfig: LegendConfig[SignalRef] = js.native
  
  /* Inlined vega-lite.vega-lite/build/src/vega.schema.MapExcludeValueRefAndReplaceSignalWith<vega.vega.BaseLegend, ES> */
  trait BaseLegendNoValueRefs[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var clipHeight: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var columnPadding: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var columns: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var cornerRadius: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var description: js.UndefOr[
        (Exclude[js.UndefOr[String], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var fillColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var gradientLength: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var gradientOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var gradientStrokeColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var gradientStrokeWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var gradientThickness: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var gridAlign: js.UndefOr[
        (Exclude[
          js.UndefOr[LayoutAlign | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelBaseline: js.UndefOr[
        (Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelFontStyle: js.UndefOr[
        (Exclude[
          js.UndefOr[FontStyleValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelFontWeight: js.UndefOr[
        (Exclude[
          js.UndefOr[FontWeightValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelOverlap: js.UndefOr[
        (Exclude[
          js.UndefOr[LabelOverlap | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelPadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelSeparation: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var legendX: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var legendY: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var offset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var orient: js.UndefOr[
        (Exclude[
          js.UndefOr[LegendOrient | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var padding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var rowPadding: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var strokeColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolDash: js.UndefOr[
        (Exclude[
          js.UndefOr[DashArrayValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolFillColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolStrokeColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolStrokeWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolType: js.UndefOr[
        (Exclude[
          js.UndefOr[SymbolShapeValue | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var tickCount: js.UndefOr[
        (Exclude[js.UndefOr[TickCount], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleAnchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleBaseline: js.UndefOr[
        (Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleFontStyle: js.UndefOr[
        (Exclude[
          js.UndefOr[FontStyleValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleFontWeight: js.UndefOr[
        (Exclude[
          js.UndefOr[FontWeightValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleOrient: js.UndefOr[
        (Exclude[js.UndefOr[OrientValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var zindex: js.UndefOr[
        (Exclude[js.UndefOr[Double], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
  }
  object BaseLegendNoValueRefs {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): BaseLegendNoValueRefs[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseLegendNoValueRefs[ES]]
    }
    
    @scala.inline
    implicit class BaseLegendNoValueRefsMutableBuilder[Self <: BaseLegendNoValueRefs[?], ES /* <: ExprRef | SignalRef */] (val x: Self & BaseLegendNoValueRefs[ES]) extends AnyVal {
      
      @scala.inline
      def setAria(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setClipHeight(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "clipHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipHeightUndefined: Self = StObject.set(x, "clipHeight", js.undefined)
      
      @scala.inline
      def setColumnPadding(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "columnPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnPaddingUndefined: Self = StObject.set(x, "columnPadding", js.undefined)
      
      @scala.inline
      def setColumns(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setCornerRadius(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setDescription(
        value: (Exclude[js.UndefOr[String], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFillColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorNull: Self = StObject.set(x, "fillColor", null)
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setGradientLength(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gradientLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientLengthUndefined: Self = StObject.set(x, "gradientLength", js.undefined)
      
      @scala.inline
      def setGradientOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gradientOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientOpacityUndefined: Self = StObject.set(x, "gradientOpacity", js.undefined)
      
      @scala.inline
      def setGradientStrokeColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gradientStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientStrokeColorNull: Self = StObject.set(x, "gradientStrokeColor", null)
      
      @scala.inline
      def setGradientStrokeColorUndefined: Self = StObject.set(x, "gradientStrokeColor", js.undefined)
      
      @scala.inline
      def setGradientStrokeWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gradientStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientStrokeWidthUndefined: Self = StObject.set(x, "gradientStrokeWidth", js.undefined)
      
      @scala.inline
      def setGradientThickness(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gradientThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientThicknessUndefined: Self = StObject.set(x, "gradientThickness", js.undefined)
      
      @scala.inline
      def setGridAlign(
        value: (Exclude[
              js.UndefOr[LayoutAlign | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gridAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAlignUndefined: Self = StObject.set(x, "gridAlign", js.undefined)
      
      @scala.inline
      def setLabelAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelBaseline(
        value: (Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(
        value: (Exclude[
              js.UndefOr[FontStyleValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
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
            ]) | ES
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      @scala.inline
      def setLabelOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      @scala.inline
      def setLabelOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      @scala.inline
      def setLabelOverlap(
        value: (Exclude[
              js.UndefOr[LabelOverlap | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      @scala.inline
      def setLabelPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setLabelSeparation(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      @scala.inline
      def setLegendX(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "legendX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendXUndefined: Self = StObject.set(x, "legendX", js.undefined)
      
      @scala.inline
      def setLegendY(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "legendY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendYUndefined: Self = StObject.set(x, "legendY", js.undefined)
      
      @scala.inline
      def setOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(
        value: (Exclude[
              js.UndefOr[LegendOrient | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRowPadding(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "rowPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowPaddingUndefined: Self = StObject.set(x, "rowPadding", js.undefined)
      
      @scala.inline
      def setStrokeColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorNull: Self = StObject.set(x, "strokeColor", null)
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setSymbolDash(
        value: (Exclude[
              js.UndefOr[DashArrayValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolDashOffsetUndefined: Self = StObject.set(x, "symbolDashOffset", js.undefined)
      
      @scala.inline
      def setSymbolDashUndefined: Self = StObject.set(x, "symbolDash", js.undefined)
      
      @scala.inline
      def setSymbolDashVarargs(value: Double*): Self = StObject.set(x, "symbolDash", js.Array(value :_*))
      
      @scala.inline
      def setSymbolFillColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolFillColorNull: Self = StObject.set(x, "symbolFillColor", null)
      
      @scala.inline
      def setSymbolFillColorUndefined: Self = StObject.set(x, "symbolFillColor", js.undefined)
      
      @scala.inline
      def setSymbolLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolLimitUndefined: Self = StObject.set(x, "symbolLimit", js.undefined)
      
      @scala.inline
      def setSymbolOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolOffsetUndefined: Self = StObject.set(x, "symbolOffset", js.undefined)
      
      @scala.inline
      def setSymbolOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolOpacityUndefined: Self = StObject.set(x, "symbolOpacity", js.undefined)
      
      @scala.inline
      def setSymbolSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
      
      @scala.inline
      def setSymbolStrokeColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolStrokeColorNull: Self = StObject.set(x, "symbolStrokeColor", null)
      
      @scala.inline
      def setSymbolStrokeColorUndefined: Self = StObject.set(x, "symbolStrokeColor", js.undefined)
      
      @scala.inline
      def setSymbolStrokeWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolStrokeWidthUndefined: Self = StObject.set(x, "symbolStrokeWidth", js.undefined)
      
      @scala.inline
      def setSymbolType(
        value: (Exclude[
              js.UndefOr[SymbolShapeValue | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
      
      @scala.inline
      def setTickCount(
        value: (Exclude[js.UndefOr[TickCount], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      @scala.inline
      def setTitleAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleBaseline(
        value: (Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      @scala.inline
      def setTitleColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      @scala.inline
      def setTitleFontStyle(
        value: (Exclude[
              js.UndefOr[FontStyleValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      @scala.inline
      def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      @scala.inline
      def setTitleFontWeight(
        value: (Exclude[
              js.UndefOr[FontWeightValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      @scala.inline
      def setTitleLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      @scala.inline
      def setTitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      @scala.inline
      def setTitleOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      @scala.inline
      def setTitleOrient(
        value: (Exclude[js.UndefOr[OrientValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOrientUndefined: Self = StObject.set(x, "titleOrient", js.undefined)
      
      @scala.inline
      def setTitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      @scala.inline
      def setZindex(
        value: (Exclude[js.UndefOr[Double], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<vega-lite.vega-lite/build/src/legend.BaseLegendNoValueRefs<ES>, 'orient'> */
  /* Inlined parent vega-lite.vega-lite/build/src/legend.LegendMixins<ES> */
  /* Inlined parent vega-lite.vega-lite/build/src/guide.Guide */
  trait Legend[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var clipHeight: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var columnPadding: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var columns: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var cornerRadius: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var description: js.UndefOr[
        (Exclude[js.UndefOr[String], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    /**
      * The direction of the legend, one of `"vertical"` or `"horizontal"`.
      *
      * __Default value:__
      * - For top-/bottom-`orient`ed legends, `"horizontal"`
      * - For left-/right-`orient`ed legends, `"vertical"`
      * - For top/bottom-left/right-`orient`ed legends, `"horizontal"` for gradient legends and `"vertical"` for symbol legends.
      */
    var direction: js.UndefOr[Orientation] = js.undefined
    
    /**
      * Mark definitions for custom legend encoding.
      *
      * @hidden
      */
    var encoding: js.UndefOr[LegendEncoding] = js.undefined
    
    var fillColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    /**
      * When used with the default `"number"` and `"time"` format type, the text formatting pattern for labels of guides (axes, legends, headers) and text marks.
      *
      * - If the format type is `"number"` (e.g., for quantitative fields), this is D3's [number format pattern](https://github.com/d3/d3-format#locale_format).
      * - If the format type is `"time"` (e.g., for temporal fields), this is D3's [time format pattern](https://github.com/d3/d3-time-format#locale_format).
      *
      * See the [format documentation](https://vega.github.io/vega-lite/docs/format.html) for more examples.
      *
      * When used with a [custom `formatType`](https://vega.github.io/vega-lite/docs/config.html#custom-format-type), this value will be passed as `format` alongside `datum.value` to the registered function.
      *
      * __Default value:__  Derived from [numberFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for number format and from [timeFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for time format.
      */
    var format: js.UndefOr[String | Dict[js.Any]] = js.undefined
    
    /**
      * The format type for labels. One of `"number"`, `"time"`, or a [registered custom format type](https://vega.github.io/vega-lite/docs/config.html#custom-format-type).
      *
      * __Default value:__
      * - `"time"` for temporal fields and ordinal and nominal fields with `timeUnit`.
      * - `"number"` for quantitative fields as well as ordinal and nominal fields without `timeUnit`.
      */
    var formatType: js.UndefOr[number | time | String] = js.undefined
    
    var gradientLength: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var gradientOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var gradientStrokeColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var gradientStrokeWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var gradientThickness: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var gridAlign: js.UndefOr[
        (Exclude[
          js.UndefOr[LayoutAlign | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelBaseline: js.UndefOr[
        (Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    /**
      * [Vega expression](https://vega.github.io/vega/docs/expressions/) for customizing labels.
      *
      * __Note:__ The label text and value can be assessed via the `label` and `value` properties of the legend's backing `datum` object.
      */
    var labelExpr: js.UndefOr[String] = js.undefined
    
    var labelFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelFontStyle: js.UndefOr[
        (Exclude[
          js.UndefOr[FontStyleValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelFontWeight: js.UndefOr[
        (Exclude[
          js.UndefOr[FontWeightValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    /**
      * The strategy to use for resolving overlap of labels in gradient legends. If `false`, no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used. If set to `"greedy"`, a linear scan of the labels is performed, removing any label that overlaps with the last visible label (this often works better for log-scaled axes).
      *
      * __Default value:__ `"greedy"` for `log scales otherwise `true`.
      */
    var labelOverlap: (js.UndefOr[
        (Exclude[
          js.UndefOr[LabelOverlap | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ]) & (js.UndefOr[LabelOverlap | ES])
    
    var labelPadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var labelSeparation: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var legendX: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var legendY: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var offset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    /**
      * The orientation of the legend, which determines how the legend is positioned within the scene. One of `"left"`, `"right"`, `"top"`, `"bottom"`, `"top-left"`, `"top-right"`, `"bottom-left"`, `"bottom-right"`, `"none"`.
      *
      * __Default value:__ `"right"`
      */
    var orient: js.UndefOr[LegendOrient] = js.undefined
    
    var padding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var rowPadding: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var strokeColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolDash: js.UndefOr[
        (Exclude[
          js.UndefOr[DashArrayValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolFillColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolStrokeColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolStrokeWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolType: js.UndefOr[
        (Exclude[
          js.UndefOr[SymbolShapeValue | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var tickCount: js.UndefOr[
        (Exclude[js.UndefOr[TickCount], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    /**
      * The minimum desired step between legend ticks, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
      *
      * __Default value__: `undefined`
      */
    var tickMinStep: js.UndefOr[Double | ES] = js.undefined
    
    /**
      * A title for the field. If `null`, the title will be removed.
      *
      * __Default value:__  derived from the field's name and transformation function (`aggregate`, `bin` and `timeUnit`). If the field has an aggregate function, the function is displayed as part of the title (e.g., `"Sum of Profit"`). If the field is binned or has a time unit applied, the applied function is shown in parentheses (e.g., `"Profit (binned)"`, `"Transaction Date (year-month)"`). Otherwise, the title is simply the field name.
      *
      * __Notes__:
      *
      * 1) You can customize the default field title format by providing the [`fieldTitle`](https://vega.github.io/vega-lite/docs/config.html#top-level-config) property in the [config](https://vega.github.io/vega-lite/docs/config.html) or [`fieldTitle` function via the `compile` function's options](https://vega.github.io/vega-lite/docs/compile.html#field-title).
      *
      * 2) If both field definition's `title` and axis, header, or legend `title` are defined, axis/header/legend title will be used.
      */
    var title: js.UndefOr[Text | Null | SignalRef] = js.undefined
    
    var titleAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleAnchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleBaseline: js.UndefOr[
        (Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleFontStyle: js.UndefOr[
        (Exclude[
          js.UndefOr[FontStyleValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleFontWeight: js.UndefOr[
        (Exclude[
          js.UndefOr[FontWeightValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titleOrient: js.UndefOr[
        (Exclude[js.UndefOr[OrientValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var titlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    /**
      * The type of the legend. Use `"symbol"` to create a discrete legend and `"gradient"` for a continuous color gradient.
      *
      * __Default value:__ `"gradient"` for non-binned quantitative fields and temporal fields; `"symbol"` otherwise.
      */
    var `type`: js.UndefOr[symbol | gradient] = js.undefined
    
    /**
      * Explicitly set the visible legend values.
      */
    var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | ES] = js.undefined
    
    /**
      * A non-negative integer indicating the z-index of the legend.
      * If zindex is 0, legend should be drawn behind all chart elements.
      * To put them in front, use zindex = 1.
      *
      * @TJS-type integer
      * @minimum 0
      */
    var zindex: js.UndefOr[Double] = js.undefined
  }
  object Legend {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](
      labelOverlap: (js.UndefOr[
          (Exclude[
            js.UndefOr[LabelOverlap | SignalRef], 
            ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
          ]) | ES
        ]) & (js.UndefOr[LabelOverlap | ES])
    ): Legend[ES] = {
      val __obj = js.Dynamic.literal(labelOverlap = labelOverlap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Legend[ES]]
    }
    
    @scala.inline
    implicit class LegendMutableBuilder[Self <: Legend[?], ES /* <: ExprRef | SignalRef */] (val x: Self & Legend[ES]) extends AnyVal {
      
      @scala.inline
      def setAria(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setClipHeight(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "clipHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipHeightUndefined: Self = StObject.set(x, "clipHeight", js.undefined)
      
      @scala.inline
      def setColumnPadding(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "columnPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnPaddingUndefined: Self = StObject.set(x, "columnPadding", js.undefined)
      
      @scala.inline
      def setColumns(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setCornerRadius(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setDescription(
        value: (Exclude[js.UndefOr[String], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDirection(value: Orientation): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEncoding(value: LegendEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFillColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorNull: Self = StObject.set(x, "fillColor", null)
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFormat(value: String | Dict[js.Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatType(value: number | time | String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGradientLength(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gradientLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientLengthUndefined: Self = StObject.set(x, "gradientLength", js.undefined)
      
      @scala.inline
      def setGradientOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gradientOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientOpacityUndefined: Self = StObject.set(x, "gradientOpacity", js.undefined)
      
      @scala.inline
      def setGradientStrokeColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gradientStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientStrokeColorNull: Self = StObject.set(x, "gradientStrokeColor", null)
      
      @scala.inline
      def setGradientStrokeColorUndefined: Self = StObject.set(x, "gradientStrokeColor", js.undefined)
      
      @scala.inline
      def setGradientStrokeWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gradientStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientStrokeWidthUndefined: Self = StObject.set(x, "gradientStrokeWidth", js.undefined)
      
      @scala.inline
      def setGradientThickness(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gradientThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientThicknessUndefined: Self = StObject.set(x, "gradientThickness", js.undefined)
      
      @scala.inline
      def setGridAlign(
        value: (Exclude[
              js.UndefOr[LayoutAlign | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gridAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAlignUndefined: Self = StObject.set(x, "gridAlign", js.undefined)
      
      @scala.inline
      def setLabelAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelBaseline(
        value: (Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
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
      def setLabelFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(
        value: (Exclude[
              js.UndefOr[FontStyleValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
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
            ]) | ES
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      @scala.inline
      def setLabelOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      @scala.inline
      def setLabelOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      @scala.inline
      def setLabelOverlap(
        value: (js.UndefOr[
              (Exclude[
                js.UndefOr[LabelOverlap | SignalRef], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | ES
            ]) & (js.UndefOr[LabelOverlap | ES])
      ): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setLabelSeparation(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      @scala.inline
      def setLegendX(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "legendX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendXUndefined: Self = StObject.set(x, "legendX", js.undefined)
      
      @scala.inline
      def setLegendY(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "legendY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendYUndefined: Self = StObject.set(x, "legendY", js.undefined)
      
      @scala.inline
      def setOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(value: LegendOrient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRowPadding(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "rowPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowPaddingUndefined: Self = StObject.set(x, "rowPadding", js.undefined)
      
      @scala.inline
      def setStrokeColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorNull: Self = StObject.set(x, "strokeColor", null)
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setSymbolDash(
        value: (Exclude[
              js.UndefOr[DashArrayValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolDashOffsetUndefined: Self = StObject.set(x, "symbolDashOffset", js.undefined)
      
      @scala.inline
      def setSymbolDashUndefined: Self = StObject.set(x, "symbolDash", js.undefined)
      
      @scala.inline
      def setSymbolDashVarargs(value: Double*): Self = StObject.set(x, "symbolDash", js.Array(value :_*))
      
      @scala.inline
      def setSymbolFillColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolFillColorNull: Self = StObject.set(x, "symbolFillColor", null)
      
      @scala.inline
      def setSymbolFillColorUndefined: Self = StObject.set(x, "symbolFillColor", js.undefined)
      
      @scala.inline
      def setSymbolLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolLimitUndefined: Self = StObject.set(x, "symbolLimit", js.undefined)
      
      @scala.inline
      def setSymbolOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolOffsetUndefined: Self = StObject.set(x, "symbolOffset", js.undefined)
      
      @scala.inline
      def setSymbolOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolOpacityUndefined: Self = StObject.set(x, "symbolOpacity", js.undefined)
      
      @scala.inline
      def setSymbolSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
      
      @scala.inline
      def setSymbolStrokeColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolStrokeColorNull: Self = StObject.set(x, "symbolStrokeColor", null)
      
      @scala.inline
      def setSymbolStrokeColorUndefined: Self = StObject.set(x, "symbolStrokeColor", js.undefined)
      
      @scala.inline
      def setSymbolStrokeWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolStrokeWidthUndefined: Self = StObject.set(x, "symbolStrokeWidth", js.undefined)
      
      @scala.inline
      def setSymbolType(
        value: (Exclude[
              js.UndefOr[SymbolShapeValue | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
      
      @scala.inline
      def setTickCount(
        value: (Exclude[js.UndefOr[TickCount], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      @scala.inline
      def setTickMinStep(value: Double | ES): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      @scala.inline
      def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleBaseline(
        value: (Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      @scala.inline
      def setTitleColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      @scala.inline
      def setTitleFontStyle(
        value: (Exclude[
              js.UndefOr[FontStyleValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      @scala.inline
      def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      @scala.inline
      def setTitleFontWeight(
        value: (Exclude[
              js.UndefOr[FontWeightValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      @scala.inline
      def setTitleLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      @scala.inline
      def setTitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      @scala.inline
      def setTitleOrient(
        value: (Exclude[js.UndefOr[OrientValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titleOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOrientUndefined: Self = StObject.set(x, "titleOrient", js.undefined)
      
      @scala.inline
      def setTitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
      
      @scala.inline
      def setType(value: symbol | gradient): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | ES): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  /* Inlined vega-lite.vega-lite/build/src/legend.LegendMixins<ES> & vega-lite.vega-lite/build/src/guide.VlOnlyGuideConfig & vega-lite.vega-lite/build/src/vega.schema.MapExcludeValueRefAndReplaceSignalWith<vega.vega.LegendConfig, ES> & {  gradientVerticalMaxLength :number | undefined,   gradientVerticalMinLength :number | undefined,   gradientHorizontalMaxLength :number | undefined,   gradientHorizontalMinLength :number | undefined,   gradientLength :number | undefined,   unselectedOpacity :number | undefined,   disable :boolean | undefined} */
  trait LegendConfig[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var aria: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[Boolean], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var clipHeight: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var columnPadding: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var columns: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var cornerRadius: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var description: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[String], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    /**
      * The direction of the legend, one of `"vertical"` or `"horizontal"`.
      *
      * __Default value:__
      * - For top-/bottom-`orient`ed legends, `"horizontal"`
      * - For left-/right-`orient`ed legends, `"vertical"`
      * - For top/bottom-left/right-`orient`ed legends, `"horizontal"` for gradient legends and `"vertical"` for symbol legends.
      */
    var direction: js.UndefOr[Orientation] = js.undefined
    
    /**
      * Disable legend by default
      */
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var fillColor: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var gradientDirection: js.UndefOr[
        (Exclude[js.UndefOr[Orientation], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    /**
      * Max legend length for a horizontal gradient when `config.legend.gradientLength` is undefined.
      *
      * __Default value:__ `200`
      */
    var gradientHorizontalMaxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Min legend length for a horizontal gradient when `config.legend.gradientLength` is undefined.
      *
      * __Default value:__ `100`
      */
    var gradientHorizontalMinLength: js.UndefOr[Double] = js.undefined
    
    var gradientLabelLimit: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var gradientLabelOffset: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    /**
      * The length in pixels of the primary axis of a color gradient. This value corresponds to the height of a vertical gradient or the width of a horizontal gradient.
      *
      * __Default value:__ `undefined`. If `undefined`, the default gradient will be determined based on the following rules:
      * - For vertical gradients, `clamp(plot_height, gradientVerticalMinLength, gradientVerticalMaxLength)`
      * - For top-`orient`ed or bottom-`orient`ed horizontal gradients, `clamp(plot_width, gradientHorizontalMinLength, gradientHorizontalMaxLength)`
      * - For other horizontal gradients, `gradientHorizontalMinLength`
      *
      * where `clamp(value, min, max)` restricts _value_ to be between the specified _min_ and _max_.
      * @minimum 0
      */
    var gradientLength: (js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ]) & js.UndefOr[Double]
    
    var gradientOpacity: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var gradientStrokeColor: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var gradientStrokeWidth: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var gradientThickness: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    /**
      * Max legend length for a vertical gradient when `config.legend.gradientLength` is undefined.
      *
      * __Default value:__ `200`
      */
    var gradientVerticalMaxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Min legend length for a vertical gradient when `config.legend.gradientLength` is undefined.
      *
      * __Default value:__ `100`
      */
    var gradientVerticalMinLength: js.UndefOr[Double] = js.undefined
    
    var gridAlign: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[LayoutAlign | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[LayoutAlign | SignalRef]])
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelAlign: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelBaseline: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelColor: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelFont: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelFontSize: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelFontStyle: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[FontStyleValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | KeepSignal[js.UndefOr[FontStyleValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelFontWeight: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[FontWeightValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | KeepSignal[js.UndefOr[FontWeightValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelLimit: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelOffset: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelOpacity: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    /**
      * The strategy to use for resolving overlap of labels in gradient legends. If `false`, no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used. If set to `"greedy"`, a linear scan of the labels is performed, removing any label that overlaps with the last visible label (this often works better for log-scaled axes).
      *
      * __Default value:__ `"greedy"` for `log scales otherwise `true`.
      */
    var labelOverlap: (js.UndefOr[LabelOverlap | ES]) & (js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[LabelOverlap | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]])
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ])
    
    var labelPadding: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var labelSeparation: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var layout: js.UndefOr[
        (Exclude[js.UndefOr[LegendLayout], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var legendX: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var legendY: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var offset: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    /**
      * The orientation of the legend, which determines how the legend is positioned within the scene. One of `"left"`, `"right"`, `"top"`, `"bottom"`, `"top-left"`, `"top-right"`, `"bottom-left"`, `"bottom-right"`, `"none"`.
      *
      * __Default value:__ `"right"`
      */
    var orient: js.UndefOr[LegendOrient] & (js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[LegendOrient | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[LegendOrient | SignalRef]])
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ])
    
    var padding: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var rowPadding: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var strokeColor: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var strokeDash: js.UndefOr[
        (Exclude[
          js.UndefOr[js.Array[Double] | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var strokeWidth: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolBaseFillColor: js.UndefOr[
        (Exclude[
          js.UndefOr[Null | Color | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolBaseStrokeColor: js.UndefOr[
        (Exclude[
          js.UndefOr[Null | Color | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolDash: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[DashArrayValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | KeepSignal[js.UndefOr[DashArrayValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolDashOffset: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolDirection: js.UndefOr[
        (Exclude[js.UndefOr[Orientation], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var symbolFillColor: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolLimit: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolOffset: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolOpacity: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolSize: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolStrokeColor: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolStrokeWidth: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var symbolType: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[SymbolShapeValue | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[SymbolShapeValue | SignalRef]])
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var tickCount: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[TickCount], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TickCount]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    /**
      * Set to null to disable title for the axis, legend, or header.
      */
    var title: js.UndefOr[Null] = js.undefined
    
    var titleAlign: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleAnchor: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleBaseline: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleColor: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleFont: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleFontSize: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleFontStyle: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[FontStyleValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | KeepSignal[js.UndefOr[FontStyleValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleFontWeight: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[
              js.UndefOr[FontWeightValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | KeepSignal[js.UndefOr[FontWeightValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleLimit: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleLineHeight: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleOpacity: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titleOrient: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[OrientValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[OrientValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var titlePadding: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    /**
      * The opacity of unselected legend entries.
      *
      * __Default value:__ 0.35.
      */
    var unselectedOpacity: js.UndefOr[Double] = js.undefined
    
    var zindex: js.UndefOr[
        (Exclude[
          js.UndefOr[
            (Exclude[js.UndefOr[Double], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
          ], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
  }
  object LegendConfig {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](
      gradientLength: (js.UndefOr[
          (Exclude[
            js.UndefOr[
              (Exclude[
                js.UndefOr[Double | SignalRef], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
            ], 
            ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
          ]) | ES
        ]) & js.UndefOr[Double],
      labelOverlap: (js.UndefOr[LabelOverlap | ES]) & (js.UndefOr[
          (Exclude[
            js.UndefOr[
              (Exclude[
                js.UndefOr[LabelOverlap | SignalRef], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]])
            ], 
            ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
          ]) | ES
        ]),
      orient: js.UndefOr[LegendOrient] & (js.UndefOr[
          (Exclude[
            js.UndefOr[
              (Exclude[
                js.UndefOr[LegendOrient | SignalRef], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | (KeepSignal[js.UndefOr[LegendOrient | SignalRef]])
            ], 
            ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
          ]) | ES
        ])
    ): LegendConfig[ES] = {
      val __obj = js.Dynamic.literal(gradientLength = gradientLength.asInstanceOf[js.Any], labelOverlap = labelOverlap.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendConfig[ES]]
    }
    
    @scala.inline
    implicit class LegendConfigMutableBuilder[Self <: LegendConfig[?], ES /* <: ExprRef | SignalRef */] (val x: Self & LegendConfig[ES]) extends AnyVal {
      
      @scala.inline
      def setAria(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[Boolean], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setClipHeight(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[Double | SignalRef], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "clipHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipHeightUndefined: Self = StObject.set(x, "clipHeight", js.undefined)
      
      @scala.inline
      def setColumnPadding(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[Double | SignalRef], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "columnPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnPaddingUndefined: Self = StObject.set(x, "columnPadding", js.undefined)
      
      @scala.inline
      def setColumns(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[Double | SignalRef], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setCornerRadius(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setDescription(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[String], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDirection(value: Orientation): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setFillColor(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorNull: Self = StObject.set(x, "fillColor", null)
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setGradientDirection(
        value: (Exclude[js.UndefOr[Orientation], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "gradientDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientDirectionUndefined: Self = StObject.set(x, "gradientDirection", js.undefined)
      
      @scala.inline
      def setGradientHorizontalMaxLength(value: Double): Self = StObject.set(x, "gradientHorizontalMaxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientHorizontalMaxLengthUndefined: Self = StObject.set(x, "gradientHorizontalMaxLength", js.undefined)
      
      @scala.inline
      def setGradientHorizontalMinLength(value: Double): Self = StObject.set(x, "gradientHorizontalMinLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientHorizontalMinLengthUndefined: Self = StObject.set(x, "gradientHorizontalMinLength", js.undefined)
      
      @scala.inline
      def setGradientLabelLimit(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gradientLabelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientLabelLimitUndefined: Self = StObject.set(x, "gradientLabelLimit", js.undefined)
      
      @scala.inline
      def setGradientLabelOffset(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gradientLabelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientLabelOffsetUndefined: Self = StObject.set(x, "gradientLabelOffset", js.undefined)
      
      @scala.inline
      def setGradientLength(
        value: (js.UndefOr[
              (Exclude[
                js.UndefOr[
                  (Exclude[
                    js.UndefOr[Double | SignalRef], 
                    ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                  ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
                ], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | ES
            ]) & js.UndefOr[Double]
      ): Self = StObject.set(x, "gradientLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientOpacity(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gradientOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientOpacityUndefined: Self = StObject.set(x, "gradientOpacity", js.undefined)
      
      @scala.inline
      def setGradientStrokeColor(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gradientStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientStrokeColorNull: Self = StObject.set(x, "gradientStrokeColor", null)
      
      @scala.inline
      def setGradientStrokeColorUndefined: Self = StObject.set(x, "gradientStrokeColor", js.undefined)
      
      @scala.inline
      def setGradientStrokeWidth(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gradientStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientStrokeWidthUndefined: Self = StObject.set(x, "gradientStrokeWidth", js.undefined)
      
      @scala.inline
      def setGradientThickness(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[Double | SignalRef], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gradientThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientThicknessUndefined: Self = StObject.set(x, "gradientThickness", js.undefined)
      
      @scala.inline
      def setGradientVerticalMaxLength(value: Double): Self = StObject.set(x, "gradientVerticalMaxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientVerticalMaxLengthUndefined: Self = StObject.set(x, "gradientVerticalMaxLength", js.undefined)
      
      @scala.inline
      def setGradientVerticalMinLength(value: Double): Self = StObject.set(x, "gradientVerticalMinLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientVerticalMinLengthUndefined: Self = StObject.set(x, "gradientVerticalMinLength", js.undefined)
      
      @scala.inline
      def setGridAlign(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[LayoutAlign | SignalRef], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | (KeepSignal[js.UndefOr[LayoutAlign | SignalRef]])
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "gridAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAlignUndefined: Self = StObject.set(x, "gridAlign", js.undefined)
      
      @scala.inline
      def setLabelAlign(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelBaseline(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[TextBaselineValue], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelColor(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelFont(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[FontStyleValue], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | KeepSignal[js.UndefOr[FontStyleValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      @scala.inline
      def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      @scala.inline
      def setLabelFontWeight(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[FontWeightValue], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | KeepSignal[js.UndefOr[FontWeightValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLimit(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      @scala.inline
      def setLabelOffset(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      @scala.inline
      def setLabelOpacity(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      @scala.inline
      def setLabelOverlap(
        value: (js.UndefOr[LabelOverlap | ES]) & (js.UndefOr[
              (Exclude[
                js.UndefOr[
                  (Exclude[
                    js.UndefOr[LabelOverlap | SignalRef], 
                    ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                  ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]])
                ], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | ES
            ])
      ): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPadding(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setLabelSeparation(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[Double | SignalRef], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      @scala.inline
      def setLayout(
        value: (Exclude[js.UndefOr[LegendLayout], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLegendX(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "legendX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendXUndefined: Self = StObject.set(x, "legendX", js.undefined)
      
      @scala.inline
      def setLegendY(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "legendY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendYUndefined: Self = StObject.set(x, "legendY", js.undefined)
      
      @scala.inline
      def setOffset(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(
        value: js.UndefOr[LegendOrient] & (js.UndefOr[
              (Exclude[
                js.UndefOr[
                  (Exclude[
                    js.UndefOr[LegendOrient | SignalRef], 
                    ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                  ]) | (KeepSignal[js.UndefOr[LegendOrient | SignalRef]])
                ], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | ES
            ])
      ): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRowPadding(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[Double | SignalRef], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "rowPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowPaddingUndefined: Self = StObject.set(x, "rowPadding", js.undefined)
      
      @scala.inline
      def setStrokeColor(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorNull: Self = StObject.set(x, "strokeColor", null)
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeDash(
        value: (Exclude[
              js.UndefOr[js.Array[Double] | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      @scala.inline
      def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value :_*))
      
      @scala.inline
      def setStrokeWidth(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setSymbolBaseFillColor(
        value: (Exclude[
              js.UndefOr[Null | Color | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolBaseFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolBaseFillColorNull: Self = StObject.set(x, "symbolBaseFillColor", null)
      
      @scala.inline
      def setSymbolBaseFillColorUndefined: Self = StObject.set(x, "symbolBaseFillColor", js.undefined)
      
      @scala.inline
      def setSymbolBaseStrokeColor(
        value: (Exclude[
              js.UndefOr[Null | Color | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolBaseStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolBaseStrokeColorNull: Self = StObject.set(x, "symbolBaseStrokeColor", null)
      
      @scala.inline
      def setSymbolBaseStrokeColorUndefined: Self = StObject.set(x, "symbolBaseStrokeColor", js.undefined)
      
      @scala.inline
      def setSymbolDash(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[DashArrayValue], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | KeepSignal[js.UndefOr[DashArrayValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolDashOffset(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolDashOffsetUndefined: Self = StObject.set(x, "symbolDashOffset", js.undefined)
      
      @scala.inline
      def setSymbolDashUndefined: Self = StObject.set(x, "symbolDash", js.undefined)
      
      @scala.inline
      def setSymbolDashVarargs(value: Double*): Self = StObject.set(x, "symbolDash", js.Array(value :_*))
      
      @scala.inline
      def setSymbolDirection(
        value: (Exclude[js.UndefOr[Orientation], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "symbolDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolDirectionUndefined: Self = StObject.set(x, "symbolDirection", js.undefined)
      
      @scala.inline
      def setSymbolFillColor(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolFillColorNull: Self = StObject.set(x, "symbolFillColor", null)
      
      @scala.inline
      def setSymbolFillColorUndefined: Self = StObject.set(x, "symbolFillColor", js.undefined)
      
      @scala.inline
      def setSymbolLimit(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolLimitUndefined: Self = StObject.set(x, "symbolLimit", js.undefined)
      
      @scala.inline
      def setSymbolOffset(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolOffsetUndefined: Self = StObject.set(x, "symbolOffset", js.undefined)
      
      @scala.inline
      def setSymbolOpacity(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolOpacityUndefined: Self = StObject.set(x, "symbolOpacity", js.undefined)
      
      @scala.inline
      def setSymbolSize(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
      
      @scala.inline
      def setSymbolStrokeColor(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolStrokeColorNull: Self = StObject.set(x, "symbolStrokeColor", null)
      
      @scala.inline
      def setSymbolStrokeColorUndefined: Self = StObject.set(x, "symbolStrokeColor", js.undefined)
      
      @scala.inline
      def setSymbolStrokeWidth(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolStrokeWidthUndefined: Self = StObject.set(x, "symbolStrokeWidth", js.undefined)
      
      @scala.inline
      def setSymbolType(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[SymbolShapeValue | SignalRef], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | (KeepSignal[js.UndefOr[SymbolShapeValue | SignalRef]])
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
      
      @scala.inline
      def setTickCount(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[TickCount], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TickCount]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      @scala.inline
      def setTitleAlign(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleAnchor(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleBaseline(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[TextBaselineValue], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      @scala.inline
      def setTitleColor(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleFont(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      @scala.inline
      def setTitleFontStyle(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[FontStyleValue], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | KeepSignal[js.UndefOr[FontStyleValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      @scala.inline
      def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      @scala.inline
      def setTitleFontWeight(
        value: (Exclude[
              js.UndefOr[
                (Exclude[
                  js.UndefOr[FontWeightValue], 
                  ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
                ]) | KeepSignal[js.UndefOr[FontWeightValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      @scala.inline
      def setTitleLimit(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      @scala.inline
      def setTitleLineHeight(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      @scala.inline
      def setTitleOpacity(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      @scala.inline
      def setTitleOrient(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[OrientValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[OrientValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titleOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOrientUndefined: Self = StObject.set(x, "titleOrient", js.undefined)
      
      @scala.inline
      def setTitlePadding(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      @scala.inline
      def setUnselectedOpacity(value: Double): Self = StObject.set(x, "unselectedOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedOpacityUndefined: Self = StObject.set(x, "unselectedOpacity", js.undefined)
      
      @scala.inline
      def setZindex(
        value: (Exclude[
              js.UndefOr[
                (Exclude[js.UndefOr[Double], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
              ], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  trait LegendEncoding extends StObject {
    
    /**
      * Custom encoding for legend gradient filled rect marks.
      */
    var gradient: js.UndefOr[GuideEncodingEntry] = js.undefined
    
    /**
      * Custom encoding for legend label text marks.
      */
    var labels: js.UndefOr[GuideEncodingEntry] = js.undefined
    
    /**
      * Custom encoding for the legend container.
      * This can be useful for creating legend with custom x, y position.
      */
    var legend: js.UndefOr[GuideEncodingEntry] = js.undefined
    
    /**
      * Custom encoding for legend symbol marks.
      */
    var symbols: js.UndefOr[GuideEncodingEntry] = js.undefined
    
    /**
      * Custom encoding for the legend title text mark.
      */
    var title: js.UndefOr[GuideEncodingEntry] = js.undefined
  }
  object LegendEncoding {
    
    @scala.inline
    def apply(): LegendEncoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendEncoding]
    }
    
    @scala.inline
    implicit class LegendEncodingMutableBuilder[Self <: LegendEncoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGradient(value: GuideEncodingEntry): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      @scala.inline
      def setLabels(value: GuideEncodingEntry): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLegend(value: GuideEncodingEntry): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setSymbols(value: GuideEncodingEntry): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      
      @scala.inline
      def setTitle(value: GuideEncodingEntry): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type LegendInternal = Legend[SignalRef]
  
  trait LegendMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * The direction of the legend, one of `"vertical"` or `"horizontal"`.
      *
      * __Default value:__
      * - For top-/bottom-`orient`ed legends, `"horizontal"`
      * - For left-/right-`orient`ed legends, `"vertical"`
      * - For top/bottom-left/right-`orient`ed legends, `"horizontal"` for gradient legends and `"vertical"` for symbol legends.
      */
    var direction: js.UndefOr[Orientation] = js.undefined
    
    /**
      * The strategy to use for resolving overlap of labels in gradient legends. If `false`, no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used. If set to `"greedy"`, a linear scan of the labels is performed, removing any label that overlaps with the last visible label (this often works better for log-scaled axes).
      *
      * __Default value:__ `"greedy"` for `log scales otherwise `true`.
      */
    var labelOverlap: js.UndefOr[LabelOverlap | ES] = js.undefined
    
    /**
      * The orientation of the legend, which determines how the legend is positioned within the scene. One of `"left"`, `"right"`, `"top"`, `"bottom"`, `"top-left"`, `"top-right"`, `"bottom-left"`, `"bottom-right"`, `"none"`.
      *
      * __Default value:__ `"right"`
      */
    var orient: js.UndefOr[LegendOrient] = js.undefined
  }
  object LegendMixins {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): LegendMixins[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendMixins[ES]]
    }
    
    @scala.inline
    implicit class LegendMixinsMutableBuilder[Self <: LegendMixins[?], ES /* <: ExprRef | SignalRef */] (val x: Self & LegendMixins[ES]) extends AnyVal {
      
      @scala.inline
      def setDirection(value: Orientation): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setLabelOverlap(value: LabelOverlap | ES): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      @scala.inline
      def setOrient(value: LegendOrient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    }
  }
}
