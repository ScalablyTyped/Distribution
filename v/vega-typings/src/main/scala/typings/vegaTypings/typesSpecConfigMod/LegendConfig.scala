package typings.vegaTypings.typesSpecConfigMod

import typings.std.Exclude
import typings.vegaTypings.typesSpecAxisMod.LabelOverlap
import typings.vegaTypings.typesSpecAxisMod.TickCount
import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecEncodeMod.ColorValueRef
import typings.vegaTypings.typesSpecEncodeMod.NumericValueRef
import typings.vegaTypings.typesSpecEncodeMod.Orientation
import typings.vegaTypings.typesSpecEncodeMod.ScaledValueRef
import typings.vegaTypings.typesSpecLayoutMod.LayoutAlign
import typings.vegaTypings.typesSpecLegendMod.LegendOrient
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecValuesMod.AlignValue
import typings.vegaTypings.typesSpecValuesMod.AnchorValue
import typings.vegaTypings.typesSpecValuesMod.ColorValue
import typings.vegaTypings.typesSpecValuesMod.DashArrayValue
import typings.vegaTypings.typesSpecValuesMod.FontStyleValue
import typings.vegaTypings.typesSpecValuesMod.FontWeightValue
import typings.vegaTypings.typesSpecValuesMod.NumberValue
import typings.vegaTypings.typesSpecValuesMod.OrientValue
import typings.vegaTypings.typesSpecValuesMod.StringValue
import typings.vegaTypings.typesSpecValuesMod.SymbolShapeValue
import typings.vegaTypings.typesSpecValuesMod.TextBaselineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/legend.BaseLegend> */
trait LegendConfig extends StObject {
  
  var aria: js.UndefOr[
    (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
  ] = js.undefined
  
  var clipHeight: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var columnPadding: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var columns: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var cornerRadius: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var description: js.UndefOr[
    (Exclude[js.UndefOr[String], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
  ] = js.undefined
  
  var fillColor: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  ] = js.undefined
  
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
  
  var gradientLength: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var gradientOpacity: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var gradientStrokeColor: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  ] = js.undefined
  
  var gradientStrokeWidth: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var gradientThickness: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var gridAlign: js.UndefOr[
    (Exclude[
      js.UndefOr[LayoutAlign | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[LayoutAlign | SignalRef]])
  ] = js.undefined
  
  var labelAlign: js.UndefOr[
    (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
  ] = js.undefined
  
  var labelBaseline: js.UndefOr[
    (Exclude[
      js.UndefOr[TextBaselineValue], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
  ] = js.undefined
  
  var labelColor: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  ] = js.undefined
  
  var labelFont: js.UndefOr[
    (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
  ] = js.undefined
  
  var labelFontSize: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var labelFontStyle: js.UndefOr[
    (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
  ] = js.undefined
  
  var labelFontWeight: js.UndefOr[
    (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
  ] = js.undefined
  
  var labelLimit: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var labelOffset: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var labelOpacity: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var labelOverlap: js.UndefOr[
    (Exclude[
      js.UndefOr[LabelOverlap | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]])
  ] = js.undefined
  
  var labelPadding: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var labelSeparation: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  /**
    * Legend orient group layout parameters.
    */
  var layout: js.UndefOr[LegendLayout] = js.undefined
  
  var legendX: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var legendY: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var offset: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var orient: js.UndefOr[
    (Exclude[
      js.UndefOr[LegendOrient | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[LegendOrient | SignalRef]])
  ] = js.undefined
  
  var padding: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var rowPadding: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
  ] = js.undefined
  
  var strokeColor: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  ] = js.undefined
  
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
  
  var symbolDash: js.UndefOr[
    (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
  ] = js.undefined
  
  var symbolDashOffset: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  /**
    * The default direction (`"horizontal"` or `"vertical"`) for symbol legends.
    *
    * __Default value:__ `"vertical"`.
    */
  var symbolDirection: js.UndefOr[Orientation] = js.undefined
  
  var symbolFillColor: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  ] = js.undefined
  
  var symbolLimit: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var symbolOffset: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var symbolOpacity: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var symbolSize: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var symbolStrokeColor: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  ] = js.undefined
  
  var symbolStrokeWidth: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var symbolType: js.UndefOr[
    (Exclude[
      js.UndefOr[SymbolShapeValue | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[SymbolShapeValue | SignalRef]])
  ] = js.undefined
  
  var tickCount: js.UndefOr[
    (Exclude[js.UndefOr[TickCount], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TickCount]]
  ] = js.undefined
  
  var titleAlign: js.UndefOr[
    (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
  ] = js.undefined
  
  var titleAnchor: js.UndefOr[
    (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
  ] = js.undefined
  
  var titleBaseline: js.UndefOr[
    (Exclude[
      js.UndefOr[TextBaselineValue], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
  ] = js.undefined
  
  var titleColor: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  ] = js.undefined
  
  var titleFont: js.UndefOr[
    (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
  ] = js.undefined
  
  var titleFontSize: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var titleFontStyle: js.UndefOr[
    (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
  ] = js.undefined
  
  var titleFontWeight: js.UndefOr[
    (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
  ] = js.undefined
  
  var titleLimit: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var titleLineHeight: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var titleOpacity: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var titleOrient: js.UndefOr[
    (Exclude[js.UndefOr[OrientValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[OrientValue]]
  ] = js.undefined
  
  var titlePadding: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var zindex: js.UndefOr[
    (Exclude[js.UndefOr[Double], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
  ] = js.undefined
}
object LegendConfig {
  
  inline def apply(): LegendConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendConfig]
  }
  
  extension [Self <: LegendConfig](x: Self) {
    
    inline def setAria(
      value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
    ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    inline def setClipHeight(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "clipHeight", value.asInstanceOf[js.Any])
    
    inline def setClipHeightUndefined: Self = StObject.set(x, "clipHeight", js.undefined)
    
    inline def setColumnPadding(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "columnPadding", value.asInstanceOf[js.Any])
    
    inline def setColumnPaddingUndefined: Self = StObject.set(x, "columnPadding", js.undefined)
    
    inline def setColumns(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setCornerRadius(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setDescription(
      value: (Exclude[js.UndefOr[String], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
    ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFillColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setGradientDirection(value: Orientation): Self = StObject.set(x, "gradientDirection", value.asInstanceOf[js.Any])
    
    inline def setGradientDirectionUndefined: Self = StObject.set(x, "gradientDirection", js.undefined)
    
    inline def setGradientLabelLimit(value: Double | SignalRef): Self = StObject.set(x, "gradientLabelLimit", value.asInstanceOf[js.Any])
    
    inline def setGradientLabelLimitUndefined: Self = StObject.set(x, "gradientLabelLimit", js.undefined)
    
    inline def setGradientLabelOffset(value: Double | SignalRef): Self = StObject.set(x, "gradientLabelOffset", value.asInstanceOf[js.Any])
    
    inline def setGradientLabelOffsetUndefined: Self = StObject.set(x, "gradientLabelOffset", js.undefined)
    
    inline def setGradientLength(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "gradientLength", value.asInstanceOf[js.Any])
    
    inline def setGradientLengthUndefined: Self = StObject.set(x, "gradientLength", js.undefined)
    
    inline def setGradientOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "gradientOpacity", value.asInstanceOf[js.Any])
    
    inline def setGradientOpacityUndefined: Self = StObject.set(x, "gradientOpacity", js.undefined)
    
    inline def setGradientStrokeColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = StObject.set(x, "gradientStrokeColor", value.asInstanceOf[js.Any])
    
    inline def setGradientStrokeColorUndefined: Self = StObject.set(x, "gradientStrokeColor", js.undefined)
    
    inline def setGradientStrokeWidth(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "gradientStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def setGradientStrokeWidthUndefined: Self = StObject.set(x, "gradientStrokeWidth", js.undefined)
    
    inline def setGradientThickness(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "gradientThickness", value.asInstanceOf[js.Any])
    
    inline def setGradientThicknessUndefined: Self = StObject.set(x, "gradientThickness", js.undefined)
    
    inline def setGridAlign(
      value: (Exclude[
          js.UndefOr[LayoutAlign | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[LayoutAlign | SignalRef]])
    ): Self = StObject.set(x, "gridAlign", value.asInstanceOf[js.Any])
    
    inline def setGridAlignUndefined: Self = StObject.set(x, "gridAlign", js.undefined)
    
    inline def setLabelAlign(
      value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
    ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    inline def setLabelBaseline(
      value: (Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
    ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
    
    inline def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
    
    inline def setLabelColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    inline def setLabelFont(
      value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
    ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
    
    inline def setLabelFontSize(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
    
    inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
    
    inline def setLabelFontStyle(
      value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
    ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
    
    inline def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
    
    inline def setLabelFontWeight(
      value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
    ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
    
    inline def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
    
    inline def setLabelLimit(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
    
    inline def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
    
    inline def setLabelOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
    
    inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
    
    inline def setLabelOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
    
    inline def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
    
    inline def setLabelOverlap(
      value: (Exclude[
          js.UndefOr[LabelOverlap | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]])
    ): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
    
    inline def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
    
    inline def setLabelPadding(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
    
    inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
    
    inline def setLabelSeparation(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
    
    inline def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
    
    inline def setLayout(value: LegendLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLegendX(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "legendX", value.asInstanceOf[js.Any])
    
    inline def setLegendXUndefined: Self = StObject.set(x, "legendX", js.undefined)
    
    inline def setLegendY(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "legendY", value.asInstanceOf[js.Any])
    
    inline def setLegendYUndefined: Self = StObject.set(x, "legendY", js.undefined)
    
    inline def setOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrient(
      value: (Exclude[
          js.UndefOr[LegendOrient | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[LegendOrient | SignalRef]])
    ): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    inline def setPadding(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRowPadding(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = StObject.set(x, "rowPadding", value.asInstanceOf[js.Any])
    
    inline def setRowPaddingUndefined: Self = StObject.set(x, "rowPadding", js.undefined)
    
    inline def setStrokeColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeDash(value: js.Array[Double] | SignalRef): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
    
    inline def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value*))
    
    inline def setStrokeWidth(value: Double | SignalRef): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setSymbolBaseFillColor(value: Color | SignalRef): Self = StObject.set(x, "symbolBaseFillColor", value.asInstanceOf[js.Any])
    
    inline def setSymbolBaseFillColorNull: Self = StObject.set(x, "symbolBaseFillColor", null)
    
    inline def setSymbolBaseFillColorUndefined: Self = StObject.set(x, "symbolBaseFillColor", js.undefined)
    
    inline def setSymbolBaseStrokeColor(value: Color | SignalRef): Self = StObject.set(x, "symbolBaseStrokeColor", value.asInstanceOf[js.Any])
    
    inline def setSymbolBaseStrokeColorNull: Self = StObject.set(x, "symbolBaseStrokeColor", null)
    
    inline def setSymbolBaseStrokeColorUndefined: Self = StObject.set(x, "symbolBaseStrokeColor", js.undefined)
    
    inline def setSymbolDash(
      value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
    ): Self = StObject.set(x, "symbolDash", value.asInstanceOf[js.Any])
    
    inline def setSymbolDashOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "symbolDashOffset", value.asInstanceOf[js.Any])
    
    inline def setSymbolDashOffsetUndefined: Self = StObject.set(x, "symbolDashOffset", js.undefined)
    
    inline def setSymbolDashUndefined: Self = StObject.set(x, "symbolDash", js.undefined)
    
    inline def setSymbolDirection(value: Orientation): Self = StObject.set(x, "symbolDirection", value.asInstanceOf[js.Any])
    
    inline def setSymbolDirectionUndefined: Self = StObject.set(x, "symbolDirection", js.undefined)
    
    inline def setSymbolFillColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = StObject.set(x, "symbolFillColor", value.asInstanceOf[js.Any])
    
    inline def setSymbolFillColorUndefined: Self = StObject.set(x, "symbolFillColor", js.undefined)
    
    inline def setSymbolLimit(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "symbolLimit", value.asInstanceOf[js.Any])
    
    inline def setSymbolLimitUndefined: Self = StObject.set(x, "symbolLimit", js.undefined)
    
    inline def setSymbolOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "symbolOffset", value.asInstanceOf[js.Any])
    
    inline def setSymbolOffsetUndefined: Self = StObject.set(x, "symbolOffset", js.undefined)
    
    inline def setSymbolOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "symbolOpacity", value.asInstanceOf[js.Any])
    
    inline def setSymbolOpacityUndefined: Self = StObject.set(x, "symbolOpacity", js.undefined)
    
    inline def setSymbolSize(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    inline def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
    
    inline def setSymbolStrokeColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = StObject.set(x, "symbolStrokeColor", value.asInstanceOf[js.Any])
    
    inline def setSymbolStrokeColorUndefined: Self = StObject.set(x, "symbolStrokeColor", js.undefined)
    
    inline def setSymbolStrokeWidth(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "symbolStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def setSymbolStrokeWidthUndefined: Self = StObject.set(x, "symbolStrokeWidth", js.undefined)
    
    inline def setSymbolType(
      value: (Exclude[
          js.UndefOr[SymbolShapeValue | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[SymbolShapeValue | SignalRef]])
    ): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
    
    inline def setTickCount(
      value: (Exclude[js.UndefOr[TickCount], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TickCount]]
    ): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
    
    inline def setTitleAlign(
      value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
    ): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
    
    inline def setTitleAnchor(
      value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
    ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
    
    inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
    
    inline def setTitleBaseline(
      value: (Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
    ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
    
    inline def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
    
    inline def setTitleColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
    
    inline def setTitleFont(
      value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
    ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
    
    inline def setTitleFontSize(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
    
    inline def setTitleFontStyle(
      value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
    ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
    
    inline def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
    
    inline def setTitleFontWeight(
      value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
    ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
    
    inline def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
    
    inline def setTitleLimit(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
    
    inline def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
    
    inline def setTitleLineHeight(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
    
    inline def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
    
    inline def setTitleOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
    
    inline def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
    
    inline def setTitleOrient(
      value: (Exclude[js.UndefOr[OrientValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[OrientValue]]
    ): Self = StObject.set(x, "titleOrient", value.asInstanceOf[js.Any])
    
    inline def setTitleOrientUndefined: Self = StObject.set(x, "titleOrient", js.undefined)
    
    inline def setTitlePadding(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
    
    inline def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
    
    inline def setZindex(
      value: (Exclude[js.UndefOr[Double], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
    ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
    
    inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
  }
}
