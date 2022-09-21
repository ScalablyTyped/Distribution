package typings.vegaTypings

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.vegaTypings.anon.Bind
import typings.vegaTypings.autosizeMod.AutoSize
import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.axisMod.TickCount
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.dataMod.URI
import typings.vegaTypings.encodeMod.Align
import typings.vegaTypings.encodeMod.Blend
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.FontStyle
import typings.vegaTypings.encodeMod.FontWeight
import typings.vegaTypings.encodeMod.Gradient
import typings.vegaTypings.encodeMod.Interpolate
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.encodeMod.SymbolShape
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.encodeMod.TextBaseline
import typings.vegaTypings.encodeMod.TextDirection
import typings.vegaTypings.layoutMod.LayoutAlign
import typings.vegaTypings.layoutMod.LayoutBounds
import typings.vegaTypings.legendMod.LegendOrient
import typings.vegaTypings.localeMod.Locale
import typings.vegaTypings.paddingMod.Padding
import typings.vegaTypings.projectionMod.Fit
import typings.vegaTypings.projectionMod.GeoJsonFeature
import typings.vegaTypings.projectionMod.ProjectionType
import typings.vegaTypings.scaleMod.RangeRawArray
import typings.vegaTypings.scaleMod.RangeScheme
import typings.vegaTypings.signalMod.InitSignal
import typings.vegaTypings.signalMod.NewSignal
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.streamMod.EventType
import typings.vegaTypings.titleMod.TitleAnchor
import typings.vegaTypings.titleMod.TitleFrame
import typings.vegaTypings.titleMod.TitleOrient
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector3
import typings.vegaTypings.valuesMod.AlignValue
import typings.vegaTypings.valuesMod.AnchorValue
import typings.vegaTypings.valuesMod.BooleanValue
import typings.vegaTypings.valuesMod.ColorValue
import typings.vegaTypings.valuesMod.DashArrayValue
import typings.vegaTypings.valuesMod.FontStyleValue
import typings.vegaTypings.valuesMod.FontWeightValue
import typings.vegaTypings.valuesMod.NumberValue
import typings.vegaTypings.valuesMod.OrientValue
import typings.vegaTypings.valuesMod.StringValue
import typings.vegaTypings.valuesMod.StrokeCapValue
import typings.vegaTypings.valuesMod.SymbolShapeValue
import typings.vegaTypings.valuesMod.TextBaselineValue
import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  /* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/axis.BaseAxis> */
  trait AxisConfig extends StObject {
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var bandPosition: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var description: js.UndefOr[
        (Exclude[js.UndefOr[String], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
      ] = js.undefined
    
    var domain: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var domainCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ] = js.undefined
    
    var domainColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.undefined
    
    var domainDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ] = js.undefined
    
    var domainDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var domainOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var domainWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var grid: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var gridCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ] = js.undefined
    
    var gridColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.undefined
    
    var gridDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ] = js.undefined
    
    var gridDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var gridOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var gridWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var labelAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ] = js.undefined
    
    var labelAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var labelBaseline: js.UndefOr[
        (Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ] = js.undefined
    
    var labelBound: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | Boolean | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
      ] = js.undefined
    
    var labelColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.undefined
    
    var labelFlush: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | Boolean | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
      ] = js.undefined
    
    var labelFlushOffset: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
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
    
    var labelLineHeight: js.UndefOr[
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
    
    var labels: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var maxExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var minExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var tickBand: js.UndefOr[
        (Exclude[
          js.UndefOr[center | extent | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[center | extent | SignalRef]])
      ] = js.undefined
    
    var tickCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ] = js.undefined
    
    var tickColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.undefined
    
    var tickDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ] = js.undefined
    
    var tickDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var tickExtra: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ] = js.undefined
    
    var tickOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var tickOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var tickRound: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ] = js.undefined
    
    var tickSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var tickWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var ticks: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ] = js.undefined
    
    var titleAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ] = js.undefined
    
    var titleAnchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
      ] = js.undefined
    
    var titleAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
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
    
    var titlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var titleX: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var titleY: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var translate: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var zindex: js.UndefOr[
        (Exclude[js.UndefOr[Double], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
      ] = js.undefined
  }
  object AxisConfig {
    
    inline def apply(): AxisConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisConfig]
    }
    
    extension [Self <: AxisConfig](x: Self) {
      
      inline def setAria(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setBandPosition(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      inline def setDescription(
        value: (Exclude[js.UndefOr[String], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDomain(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
      
      inline def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
      
      inline def setDomainColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
      
      inline def setDomainColorNull: Self = StObject.set(x, "domainColor", null)
      
      inline def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
      
      inline def setDomainDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
      
      inline def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
      
      inline def setDomainDashVarargs(value: Double*): Self = StObject.set(x, "domainDash", js.Array(value*))
      
      inline def setDomainOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
      
      inline def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDomainWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
      
      inline def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
      
      inline def setGrid(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
      
      inline def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
      
      inline def setGridColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      inline def setGridColorNull: Self = StObject.set(x, "gridColor", null)
      
      inline def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      inline def setGridDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      inline def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      inline def setGridDashVarargs(value: Double*): Self = StObject.set(x, "gridDash", js.Array(value*))
      
      inline def setGridOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      inline def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setGridWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      inline def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      inline def setLabelAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      inline def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      inline def setLabelBaseline(
        value: (Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      inline def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      inline def setLabelBound(
        value: (Exclude[
              js.UndefOr[Double | Boolean | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
      ): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
      
      inline def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
      
      inline def setLabelColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLabelFlush(
        value: (Exclude[
              js.UndefOr[Double | Boolean | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
      ): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffset(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
      
      inline def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
      
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
      
      inline def setLabelLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      inline def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
      
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
      
      inline def setLabels(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMaxExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
      
      inline def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
      
      inline def setMinExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
      
      inline def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
      
      inline def setTickBand(
        value: (Exclude[
              js.UndefOr[center | extent | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[center | extent | SignalRef]])
      ): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
      
      inline def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
      
      inline def setTickCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
      
      inline def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
      
      inline def setTickColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      inline def setTickColorNull: Self = StObject.set(x, "tickColor", null)
      
      inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      inline def setTickDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      inline def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      inline def setTickDashVarargs(value: Double*): Self = StObject.set(x, "tickDash", js.Array(value*))
      
      inline def setTickExtra(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      inline def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
      
      inline def setTickOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
      
      inline def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
      
      inline def setTickOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      inline def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      inline def setTickRound(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      inline def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
      
      inline def setTickSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTickWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      inline def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      inline def setTicks(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTitleAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      inline def setTitleAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      inline def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      inline def setTitleAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      inline def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
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
      
      inline def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
      
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
      
      inline def setTitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      inline def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      inline def setTitleX(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
      
      inline def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
      
      inline def setTitleY(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
      
      inline def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
      
      inline def setTranslate(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setZindex(
        value: (Exclude[js.UndefOr[Double], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.axis
    - typings.vegaTypings.vegaTypingsStrings.axisX
    - typings.vegaTypings.vegaTypingsStrings.axisY
    - typings.vegaTypings.vegaTypingsStrings.axisTop
    - typings.vegaTypings.vegaTypingsStrings.axisRight
    - typings.vegaTypings.vegaTypingsStrings.axisBottom
    - typings.vegaTypings.vegaTypingsStrings.axisLeft
    - typings.vegaTypings.vegaTypingsStrings.axisBand
  */
  trait AxisConfigKeys extends StObject
  object AxisConfigKeys {
    
    inline def axis: typings.vegaTypings.vegaTypingsStrings.axis = "axis".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axis]
    
    inline def axisBand: typings.vegaTypings.vegaTypingsStrings.axisBand = "axisBand".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisBand]
    
    inline def axisBottom: typings.vegaTypings.vegaTypingsStrings.axisBottom = "axisBottom".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisBottom]
    
    inline def axisLeft: typings.vegaTypings.vegaTypingsStrings.axisLeft = "axisLeft".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisLeft]
    
    inline def axisRight: typings.vegaTypings.vegaTypingsStrings.axisRight = "axisRight".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisRight]
    
    inline def axisTop: typings.vegaTypings.vegaTypingsStrings.axisTop = "axisTop".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisTop]
    
    inline def axisX: typings.vegaTypings.vegaTypingsStrings.axisX = "axisX".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisX]
    
    inline def axisY: typings.vegaTypings.vegaTypingsStrings.axisY = "axisY".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisY]
  }
  
  trait BaseLegendLayout extends StObject {
    
    /**
      * The anchor point for legend orient group layout.
      */
    var anchor: js.UndefOr[TitleAnchor | SignalRef] = js.undefined
    
    /**
      * The bounds calculation to use for legend orient group layout.
      */
    var bounds: js.UndefOr[LayoutBounds] = js.undefined
    
    /**
      * A flag to center legends within a shared orient group.
      */
    var center: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    /**
      * The layout direction for legend orient group layout.
      */
    var direction: js.UndefOr[Orientation | SignalRef] = js.undefined
    
    /**
      * The pixel margin between legends within a orient group.
      */
    var margin: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The pixel offset from the chart body for a legend orient group.
      */
    var offset: js.UndefOr[Double | SignalRef] = js.undefined
  }
  object BaseLegendLayout {
    
    inline def apply(): BaseLegendLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseLegendLayout]
    }
    
    extension [Self <: BaseLegendLayout](x: Self) {
      
      inline def setAnchor(value: TitleAnchor | SignalRef): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setBounds(value: LayoutBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCenter(value: Boolean | SignalRef): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setDirection(value: Orientation | SignalRef): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setMargin(value: Double | SignalRef): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOffset(value: Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<std.Record<vega-typings.vega-typings/types/spec/config.MarkConfigKeys, vega-typings.vega-typings/types/spec/config.MarkConfig>> */
  /* Inlined parent std.Partial<std.Record<vega-typings.vega-typings/types/spec/config.AxisConfigKeys, vega-typings.vega-typings/types/spec/config.AxisConfig>> */
  trait Config extends StObject {
    
    var arc: js.UndefOr[MarkConfig] = js.undefined
    
    var area: js.UndefOr[MarkConfig] = js.undefined
    
    var autosize: js.UndefOr[AutoSize | SignalRef] = js.undefined
    
    var axis: js.UndefOr[AxisConfig] = js.undefined
    
    var axisBand: js.UndefOr[AxisConfig] = js.undefined
    
    var axisBottom: js.UndefOr[AxisConfig] = js.undefined
    
    var axisLeft: js.UndefOr[AxisConfig] = js.undefined
    
    var axisRight: js.UndefOr[AxisConfig] = js.undefined
    
    var axisTop: js.UndefOr[AxisConfig] = js.undefined
    
    var axisX: js.UndefOr[AxisConfig] = js.undefined
    
    var axisY: js.UndefOr[AxisConfig] = js.undefined
    
    var background: js.UndefOr[Null | Color | SignalRef] = js.undefined
    
    // TODO
    var events: js.UndefOr[Bind] = js.undefined
    
    var group: js.UndefOr[Any] = js.undefined
    
    var image: js.UndefOr[MarkConfig] = js.undefined
    
    var legend: js.UndefOr[LegendConfig] = js.undefined
    
    var line: js.UndefOr[MarkConfig] = js.undefined
    
    /**
      * A delimiter, such as a newline character, upon which to break text strings into multiple lines. This property provides a global default for text marks, which is overridden by mark or style config settings, and by the "lineBreak" mark encoding channel. If signal-valued, either string or regular expression (regexp) values are valid.
      */
    var lineBreak: js.UndefOr[String | SignalRef] = js.undefined
    
    var locale: js.UndefOr[Locale] = js.undefined
    
    var mark: js.UndefOr[MarkConfig] = js.undefined
    
    var padding: js.UndefOr[Padding | SignalRef] = js.undefined
    
    var path: js.UndefOr[MarkConfig] = js.undefined
    
    var projection: js.UndefOr[ProjectionConfig] = js.undefined
    
    var range: js.UndefOr[RangeConfig] = js.undefined
    
    var rect: js.UndefOr[MarkConfig] = js.undefined
    
    var rule: js.UndefOr[MarkConfig] = js.undefined
    
    var shape: js.UndefOr[MarkConfig] = js.undefined
    
    var signals: js.UndefOr[js.Array[InitSignal | NewSignal]] = js.undefined
    
    var style: js.UndefOr[StringDictionary[MarkConfig]] = js.undefined
    
    var symbol: js.UndefOr[MarkConfig] = js.undefined
    
    var text: js.UndefOr[MarkConfig] = js.undefined
    
    var title: js.UndefOr[TitleConfig] = js.undefined
    
    var trail: js.UndefOr[MarkConfig] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setArc(value: MarkConfig): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
      
      inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
      
      inline def setArea(value: MarkConfig): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setAutosize(value: AutoSize | SignalRef): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
      
      inline def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
      
      inline def setAxis(value: AxisConfig): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisBand(value: AxisConfig): Self = StObject.set(x, "axisBand", value.asInstanceOf[js.Any])
      
      inline def setAxisBandUndefined: Self = StObject.set(x, "axisBand", js.undefined)
      
      inline def setAxisBottom(value: AxisConfig): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
      
      inline def setAxisBottomUndefined: Self = StObject.set(x, "axisBottom", js.undefined)
      
      inline def setAxisLeft(value: AxisConfig): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
      
      inline def setAxisLeftUndefined: Self = StObject.set(x, "axisLeft", js.undefined)
      
      inline def setAxisRight(value: AxisConfig): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
      
      inline def setAxisRightUndefined: Self = StObject.set(x, "axisRight", js.undefined)
      
      inline def setAxisTop(value: AxisConfig): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
      
      inline def setAxisTopUndefined: Self = StObject.set(x, "axisTop", js.undefined)
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setAxisX(value: AxisConfig): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
      
      inline def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
      
      inline def setAxisY(value: AxisConfig): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
      
      inline def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
      
      inline def setBackground(value: Color | SignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundNull: Self = StObject.set(x, "background", null)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setEvents(value: Bind): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setGroup(value: Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setImage(value: MarkConfig): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLegend(value: LegendConfig): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLine(value: MarkConfig): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineBreak(value: String | SignalRef): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMark(value: MarkConfig): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setPadding(value: Padding | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPath(value: MarkConfig): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProjection(value: ProjectionConfig): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRange(value: RangeConfig): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRect(value: MarkConfig): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
      
      inline def setRule(value: MarkConfig): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setShape(value: MarkConfig): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSignals(value: js.Array[InitSignal | NewSignal]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      inline def setSignalsVarargs(value: (InitSignal | NewSignal)*): Self = StObject.set(x, "signals", js.Array(value*))
      
      inline def setStyle(value: StringDictionary[MarkConfig]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSymbol(value: MarkConfig): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setText(value: MarkConfig): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: TitleConfig): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrail(value: MarkConfig): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
      
      inline def setTrailUndefined: Self = StObject.set(x, "trail", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.auto
    - typings.vegaTypings.vegaTypingsStrings.default
    - typings.vegaTypings.vegaTypingsStrings.none
    - typings.vegaTypings.vegaTypingsStrings.`context-menu`
    - typings.vegaTypings.vegaTypingsStrings.help
    - typings.vegaTypings.vegaTypingsStrings.pointer
    - typings.vegaTypings.vegaTypingsStrings.progress
    - typings.vegaTypings.vegaTypingsStrings.wait
    - typings.vegaTypings.vegaTypingsStrings.cell
    - typings.vegaTypings.vegaTypingsStrings.crosshair
    - typings.vegaTypings.vegaTypingsStrings.text
    - typings.vegaTypings.vegaTypingsStrings.`vertical-text`
    - typings.vegaTypings.vegaTypingsStrings.alias
    - typings.vegaTypings.vegaTypingsStrings.copy
    - typings.vegaTypings.vegaTypingsStrings.move
    - typings.vegaTypings.vegaTypingsStrings.`no-drop`
    - typings.vegaTypings.vegaTypingsStrings.`not-allowed`
    - typings.vegaTypings.vegaTypingsStrings.`e-resize`
    - typings.vegaTypings.vegaTypingsStrings.`n-resize`
    - typings.vegaTypings.vegaTypingsStrings.`ne-resize`
    - typings.vegaTypings.vegaTypingsStrings.`nw-resize`
    - typings.vegaTypings.vegaTypingsStrings.`s-resize`
    - typings.vegaTypings.vegaTypingsStrings.`se-resize`
    - typings.vegaTypings.vegaTypingsStrings.`sw-resize`
    - typings.vegaTypings.vegaTypingsStrings.`w-resize`
    - typings.vegaTypings.vegaTypingsStrings.`ew-resize`
    - typings.vegaTypings.vegaTypingsStrings.`ns-resize`
    - typings.vegaTypings.vegaTypingsStrings.`nesw-resize`
    - typings.vegaTypings.vegaTypingsStrings.`nwse-resize`
    - typings.vegaTypings.vegaTypingsStrings.`col-resize`
    - typings.vegaTypings.vegaTypingsStrings.`row-resize`
    - typings.vegaTypings.vegaTypingsStrings.`all-scroll`
    - typings.vegaTypings.vegaTypingsStrings.`zoom-in`
    - typings.vegaTypings.vegaTypingsStrings.`zoom-out`
    - typings.vegaTypings.vegaTypingsStrings.grab
    - typings.vegaTypings.vegaTypingsStrings.grabbing
  */
  trait Cursor extends StObject
  object Cursor {
    
    inline def default: typings.vegaTypings.vegaTypingsStrings.default = "default".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.default]
    
    inline def alias: typings.vegaTypings.vegaTypingsStrings.alias = "alias".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.alias]
    
    inline def `all-scroll`: typings.vegaTypings.vegaTypingsStrings.`all-scroll` = "all-scroll".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`all-scroll`]
    
    inline def auto: typings.vegaTypings.vegaTypingsStrings.auto = "auto".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.auto]
    
    inline def cell: typings.vegaTypings.vegaTypingsStrings.cell = "cell".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.cell]
    
    inline def `col-resize`: typings.vegaTypings.vegaTypingsStrings.`col-resize` = "col-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`col-resize`]
    
    inline def `context-menu`: typings.vegaTypings.vegaTypingsStrings.`context-menu` = "context-menu".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`context-menu`]
    
    inline def copy: typings.vegaTypings.vegaTypingsStrings.copy = "copy".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.copy]
    
    inline def crosshair: typings.vegaTypings.vegaTypingsStrings.crosshair = "crosshair".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.crosshair]
    
    inline def `e-resize`: typings.vegaTypings.vegaTypingsStrings.`e-resize` = "e-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`e-resize`]
    
    inline def `ew-resize`: typings.vegaTypings.vegaTypingsStrings.`ew-resize` = "ew-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`ew-resize`]
    
    inline def grab: typings.vegaTypings.vegaTypingsStrings.grab = "grab".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.grab]
    
    inline def grabbing: typings.vegaTypings.vegaTypingsStrings.grabbing = "grabbing".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.grabbing]
    
    inline def help: typings.vegaTypings.vegaTypingsStrings.help = "help".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.help]
    
    inline def move: typings.vegaTypings.vegaTypingsStrings.move = "move".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.move]
    
    inline def `n-resize`: typings.vegaTypings.vegaTypingsStrings.`n-resize` = "n-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`n-resize`]
    
    inline def `ne-resize`: typings.vegaTypings.vegaTypingsStrings.`ne-resize` = "ne-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`ne-resize`]
    
    inline def `nesw-resize`: typings.vegaTypings.vegaTypingsStrings.`nesw-resize` = "nesw-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`nesw-resize`]
    
    inline def `no-drop`: typings.vegaTypings.vegaTypingsStrings.`no-drop` = "no-drop".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`no-drop`]
    
    inline def none: typings.vegaTypings.vegaTypingsStrings.none = "none".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.none]
    
    inline def `not-allowed`: typings.vegaTypings.vegaTypingsStrings.`not-allowed` = "not-allowed".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`not-allowed`]
    
    inline def `ns-resize`: typings.vegaTypings.vegaTypingsStrings.`ns-resize` = "ns-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`ns-resize`]
    
    inline def `nw-resize`: typings.vegaTypings.vegaTypingsStrings.`nw-resize` = "nw-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`nw-resize`]
    
    inline def `nwse-resize`: typings.vegaTypings.vegaTypingsStrings.`nwse-resize` = "nwse-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`nwse-resize`]
    
    inline def pointer: typings.vegaTypings.vegaTypingsStrings.pointer = "pointer".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.pointer]
    
    inline def progress: typings.vegaTypings.vegaTypingsStrings.progress = "progress".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.progress]
    
    inline def `row-resize`: typings.vegaTypings.vegaTypingsStrings.`row-resize` = "row-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`row-resize`]
    
    inline def `s-resize`: typings.vegaTypings.vegaTypingsStrings.`s-resize` = "s-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`s-resize`]
    
    inline def `se-resize`: typings.vegaTypings.vegaTypingsStrings.`se-resize` = "se-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`se-resize`]
    
    inline def `sw-resize`: typings.vegaTypings.vegaTypingsStrings.`sw-resize` = "sw-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`sw-resize`]
    
    inline def text: typings.vegaTypings.vegaTypingsStrings.text = "text".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.text]
    
    inline def `vertical-text`: typings.vegaTypings.vegaTypingsStrings.`vertical-text` = "vertical-text".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`vertical-text`]
    
    inline def `w-resize`: typings.vegaTypings.vegaTypingsStrings.`w-resize` = "w-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`w-resize`]
    
    inline def `zoom-in`: typings.vegaTypings.vegaTypingsStrings.`zoom-in` = "zoom-in".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`zoom-in`]
    
    inline def `zoom-out`: typings.vegaTypings.vegaTypingsStrings.`zoom-out` = "zoom-out".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`zoom-out`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.anon.RecordpreventbooleanArray
    - typings.vegaTypings.anon.RecordallowbooleanArrayEv
  */
  trait DefaultsConfig extends StObject
  object DefaultsConfig {
    
    inline def RecordallowbooleanArrayEv(allow: Boolean | js.Array[EventType]): typings.vegaTypings.anon.RecordallowbooleanArrayEv = {
      val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.RecordallowbooleanArrayEv]
    }
    
    inline def RecordpreventbooleanArray(prevent: Boolean | js.Array[EventType]): typings.vegaTypings.anon.RecordpreventbooleanArray = {
      val __obj = js.Dynamic.literal(prevent = prevent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.RecordpreventbooleanArray]
    }
  }
  
  type ExcludeMappedValueRef[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Exclude<T[P], vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/config.KeepSignal<T[P]>}
    */ typings.vegaTypings.vegaTypingsStrings.ExcludeMappedValueRef & TopLevel[Any]
  
  type KeepSignal[T] = SignalRef
  
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
      
      inline def setFillColorNull: Self = StObject.set(x, "fillColor", null)
      
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
      
      inline def setGradientStrokeColorNull: Self = StObject.set(x, "gradientStrokeColor", null)
      
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
      
      inline def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
      
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
      
      inline def setStrokeColorNull: Self = StObject.set(x, "strokeColor", null)
      
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
      
      inline def setSymbolDashVarargs(value: Double*): Self = StObject.set(x, "symbolDash", js.Array(value*))
      
      inline def setSymbolDirection(value: Orientation): Self = StObject.set(x, "symbolDirection", value.asInstanceOf[js.Any])
      
      inline def setSymbolDirectionUndefined: Self = StObject.set(x, "symbolDirection", js.undefined)
      
      inline def setSymbolFillColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "symbolFillColor", value.asInstanceOf[js.Any])
      
      inline def setSymbolFillColorNull: Self = StObject.set(x, "symbolFillColor", null)
      
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
      
      inline def setSymbolStrokeColorNull: Self = StObject.set(x, "symbolStrokeColor", null)
      
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
      
      inline def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
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
      
      inline def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
      
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
  
  trait LegendLayout
    extends StObject
       with BaseLegendLayout {
    
    var bottom: js.UndefOr[BaseLegendLayout] = js.undefined
    
    var `bottom-left`: js.UndefOr[BaseLegendLayout] = js.undefined
    
    var `bottom-right`: js.UndefOr[BaseLegendLayout] = js.undefined
    
    var left: js.UndefOr[BaseLegendLayout] = js.undefined
    
    var right: js.UndefOr[BaseLegendLayout] = js.undefined
    
    var top: js.UndefOr[BaseLegendLayout] = js.undefined
    
    var `top-left`: js.UndefOr[BaseLegendLayout] = js.undefined
    
    var `top-right`: js.UndefOr[BaseLegendLayout] = js.undefined
  }
  object LegendLayout {
    
    inline def apply(): LegendLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendLayout]
    }
    
    extension [Self <: LegendLayout](x: Self) {
      
      inline def setBottom(value: BaseLegendLayout): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def `setBottom-left`(value: BaseLegendLayout): Self = StObject.set(x, "bottom-left", value.asInstanceOf[js.Any])
      
      inline def `setBottom-leftUndefined`: Self = StObject.set(x, "bottom-left", js.undefined)
      
      inline def `setBottom-right`(value: BaseLegendLayout): Self = StObject.set(x, "bottom-right", value.asInstanceOf[js.Any])
      
      inline def `setBottom-rightUndefined`: Self = StObject.set(x, "bottom-right", js.undefined)
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: BaseLegendLayout): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: BaseLegendLayout): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: BaseLegendLayout): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def `setTop-left`(value: BaseLegendLayout): Self = StObject.set(x, "top-left", value.asInstanceOf[js.Any])
      
      inline def `setTop-leftUndefined`: Self = StObject.set(x, "top-left", js.undefined)
      
      inline def `setTop-right`(value: BaseLegendLayout): Self = StObject.set(x, "top-right", value.asInstanceOf[js.Any])
      
      inline def `setTop-rightUndefined`: Self = StObject.set(x, "top-right", js.undefined)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait MarkConfig extends StObject {
    
    // Text / Label Mark Config
    /**
      * The horizontal alignment of the text. One of `"left"`, `"right"`, `"center"`.
      */
    var align: js.UndefOr[Align | SignalRef] = js.undefined
    
    /**
      * The rotation angle of the text, in degrees.
      *
      * @minimum 0
      * @maximum 360
      */
    var angle: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * A boolean flag indicating if [ARIA attributes](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) should be included (SVG output only).
      * If `false`, the "aria-hidden" attribute will be set on the output SVG element, removing the mark item from the ARIA accessibility tree.
      */
    var aria: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    /**
      * Sets the type of user interface element of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
      * If specified, this property determines the "role" attribute.
      * Warning: this property is experimental and may be changed in the future.
      */
    var ariaRole: js.UndefOr[String | SignalRef] = js.undefined
    
    /**
      * A human-readable, author-localized description for the role of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
      * If specified, this property determines the "aria-roledescription" attribute.
      * Warning: this property is experimental and may be changed in the future.
      */
    var ariaRoleDescription: js.UndefOr[String | SignalRef] = js.undefined
    
    /**
      * Whether to keep aspect ratio of image marks.
      */
    var aspect: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    /**
      * The vertical alignment of the text. One of `"top"`, `"bottom"`, `"middle"`, `"alphabetic"`.
      *
      * __Default value:__ `"middle"`
      *
      */
    var baseline: js.UndefOr[TextBaseline | SignalRef] = js.undefined
    
    /**
      * The color blend mode for drawing an item on its current background. Any valid [CSS mix-blend-mode](https://developer.mozilla.org/en-US/docs/Web/CSS/mix-blend-mode) value can be used.
      *
      * __Default value: `"source-over"`
      */
    var blend: js.UndefOr[Blend] = js.undefined
    
    // ---------- Corner Radius: Bar, Tick, Rect ----------
    /**
      * The radius in pixels of rounded rectangles or arcs' corners.
      *
      * __Default value:__ `0`
      */
    var cornerRadius: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The radius in pixels of rounded rectangles' bottom left corner.
      *
      * __Default value:__ `0`
      */
    var cornerRadiusBottomLeft: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The radius in pixels of rounded rectangles' bottom right corner.
      *
      * __Default value:__ `0`
      */
    var cornerRadiusBottomRight: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The radius in pixels of rounded rectangles' top right corner.
      *
      * __Default value:__ `0`
      */
    var cornerRadiusTopLeft: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The radius in pixels of rounded rectangles' top left corner.
      *
      * __Default value:__ `0`
      */
    var cornerRadiusTopRight: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The mouse cursor used over the mark. Any valid [CSS cursor type](https://developer.mozilla.org/en-US/docs/Web/CSS/cursor#Values) can be used.
      */
    var cursor: js.UndefOr[Cursor | SignalRef] = js.undefined
    
    /**
      * A text description of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
      * If specified, this property determines the ["aria-label" attribute](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/ARIA_Techniques/Using_the_aria-label_attribute).
      */
    var description: js.UndefOr[String | SignalRef] = js.undefined
    
    /**
      * The direction of the text. One of `"ltr"` (left-to-right) or `"rtl"` (right-to-left). This property determines on which side is truncated in response to the limit parameter.
      *
      * __Default value:__ `"ltr"`
      */
    var dir: js.UndefOr[TextDirection | SignalRef] = js.undefined
    
    /**
      * The horizontal offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
      */
    var dx: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The vertical offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
      */
    var dy: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The ellipsis string for text truncated in response to the limit parameter.
      *
      * __Default value:__ `"…"`
      */
    var ellipsis: js.UndefOr[String] = js.undefined
    
    /**
      * The end angle in radians for arc marks.
      * A value of `0` indicates up (north), increasing values proceed clockwise.
      */
    var endAngle: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * Default fill color.
      *
      * __Default value:__ (None)
      *
      */
    var fill: js.UndefOr[Color | Gradient | Null | SignalRef] = js.undefined
    
    /**
      * The fill opacity (value between [0,1]).
      *
      * __Default value:__ `1`
      *
      * @minimum 0
      * @maximum 1
      */
    var fillOpacity: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The typeface to set the text in (e.g., `"Helvetica Neue"`).
      */
    var font: js.UndefOr[String | SignalRef] = js.undefined
    
    /**
      * The font size, in pixels.
      *
      * __Default value:__ `11`
      *
      *  @minimum 0
      */
    var fontSize: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The font style (e.g., `"italic"`).
      */
    var fontStyle: js.UndefOr[FontStyle | SignalRef] = js.undefined
    
    /**
      * The font weight.
      * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
      */
    var fontWeight: js.UndefOr[FontWeight | SignalRef] = js.undefined
    
    /**
      * Height of the marks.
      */
    var height: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * A URL to load upon mouse click. If defined, the mark acts as a hyperlink.
      */
    var href: js.UndefOr[URI | SignalRef] = js.undefined
    
    /**
      * The inner radius in pixels of arc marks.
      *
      * __Default value:__ `0`
      * @minimum 0
      */
    var innerRadius: js.UndefOr[Double | SignalRef] = js.undefined
    
    // ---------- Interpolation: Line / area ----------
    /**
      * The line interpolation method to use for line and area marks. One of the following:
      * - `"linear"`: piecewise linear segments, as in a polyline.
      * - `"linear-closed"`: close the linear segments to form a polygon.
      * - `"step"`: alternate between horizontal and vertical segments, as in a step function.
      * - `"step-before"`: alternate between vertical and horizontal segments, as in a step function.
      * - `"step-after"`: alternate between horizontal and vertical segments, as in a step function.
      * - `"basis"`: a B-spline, with control point duplication on the ends.
      * - `"basis-open"`: an open B-spline; may not intersect the start or end.
      * - `"basis-closed"`: a closed B-spline, as in a loop.
      * - `"cardinal"`: a Cardinal spline, with control point duplication on the ends.
      * - `"cardinal-open"`: an open Cardinal spline; may not intersect the start or end, but will intersect other control points.
      * - `"cardinal-closed"`: a closed Cardinal spline, as in a loop.
      * - `"bundle"`: equivalent to basis, except the tension parameter is used to straighten the spline.
      * - `"monotone"`: cubic interpolation that preserves monotonicity in y.
      */
    var interpolate: js.UndefOr[Interpolate | SignalRef] = js.undefined
    
    /**
      * The maximum length of the text mark in pixels. The text value will be automatically truncated if the rendered size exceeds the limit.
      *
      * __Default value:__ `0` -- indicating no limit
      */
    var limit: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * A delimiter, such as a newline character, upon which to break text strings into multiple lines. This property is ignored if the text is array-valued.
      */
    var lineBreak: js.UndefOr[String | SignalRef] = js.undefined
    
    /**
      * The line height in pixels (the spacing between subsequent lines of text) for multi-line text marks.
      */
    var lineHeight: js.UndefOr[Double | SignalRef] = js.undefined
    
    // ---------- Opacity ----------
    /**
      * The overall opacity (value between [0,1]).
      *
      * @minimum 0
      * @maximum 1
      */
    var opacity: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The orientation of the area mark. One of `horizontal` or `vertical` (the default). With a vertical orientation, an area mark is defined by the `x`, `y`, and (`y2` or `height`) properties; with a horizontal orientation, the `y`, `x` and (`x2` or `width`) properties must be specified instead.
      */
    var orient: js.UndefOr[Orientation | SignalRef] = js.undefined
    
    /**
      * The outer radius in pixels of arc marks.
      *
      * __Default value:__ `0`
      * @minimum 0
      */
    var outerRadius: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The angular padding applied to sides of the arc, in radians.
      */
    var padAngle: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * Polar coordinate radial offset, in pixels, of the text label from the origin determined by the `x` and `y` properties.
      *
      * @minimum 0
      */
    var radius: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * Shape of the point marks. Supported values include:
      * - plotting shapes: `"circle"`, `"square"`, `"cross"`, `"diamond"`, `"triangle-up"`, `"triangle-down"`, `"triangle-right"`, or `"triangle-left"`.
      * - the line symbol `"stroke"`
      * - centered directional shapes `"arrow"`, `"wedge"`, or `"triangle"`
      * - a custom [SVG path string](https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths) (For correct sizing, custom shape paths should be defined within a square bounding box with coordinates ranging from -1 to 1 along both the x and y dimensions.)
      *
      * __Default value:__ `"circle"`
      */
    var shape: js.UndefOr[SymbolShape | String | SignalRef] = js.undefined
    
    /**
      * The area in pixels of the symbols bounding box. Note that this value sets the area of the symbol; the side lengths will increase with the square root of this value.
      *
      * __Default value:__ `30`
      *
      * @minimum 0
      */
    var size: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * A boolean flag (default true) indicating if the image should be smoothed when resized. If false, individual pixels should be scaled directly rather than interpolated with smoothing. For SVG rendering, this option may not work in some browsers due to lack of standardization.
      */
    var smooth: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    /**
      * The start angle in radians for arc marks.
      * A value of `0` indicates up (north), increasing values proceed clockwise.
      */
    var startAngle: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * Default stroke color.
      *
      * __Default value:__ (None)
      *
      */
    var stroke: js.UndefOr[Color | Gradient | Null | SignalRef] = js.undefined
    
    /**
      * The stroke cap for line ending style. One of `"butt"`, `"round"`, or `"square"`.
      *
      * __Default value:__ `"butt"`
      *
      */
    var strokeCap: js.UndefOr[StrokeCap | SignalRef] = js.undefined
    
    /**
      * An array of alternating stroke, space lengths for creating dashed or dotted lines.
      */
    var strokeDash: js.UndefOr[js.Array[Double] | SignalRef] = js.undefined
    
    /**
      * The offset (in pixels) into which to begin drawing with the stroke dash array.
      */
    var strokeDashOffset: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The stroke line join method. One of `"miter"`, `"round"` or `"bevel"`.
      *
      * __Default value:__ `"miter"`
      *
      */
    var strokeJoin: js.UndefOr[StrokeJoin | SignalRef] = js.undefined
    
    /**
      * The miter limit at which to bevel a line join.
      */
    var strokeMiterLimit: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The offset in pixels at which to draw the group stroke and fill. If unspecified, the default behavior is to dynamically offset stroked groups such that 1 pixel stroke widths align with the pixel grid.
      */
    var strokeOffset: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The stroke opacity (value between [0,1]).
      *
      * __Default value:__ `1`
      *
      * @minimum 0
      * @maximum 1
      */
    var strokeOpacity: js.UndefOr[Double | SignalRef] = js.undefined
    
    // ---------- Stroke Style ----------
    /**
      * The stroke width, in pixels.
      *
      * @minimum 0
      */
    var strokeWidth: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * Depending on the interpolation type, sets the tension parameter (for line and area marks).
      */
    var tension: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * Placeholder text if the `text` channel is not specified
      */
    var text: js.UndefOr[Text | SignalRef] = js.undefined
    
    /**
      * Polar coordinate angle, in radians, of the text label from the origin determined by the `x` and `y` properties. Values for `theta` follow the same convention of `arc` mark `startAngle` and `endAngle` properties: angles are measured in radians, with `0` indicating "north".
      */
    var theta: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The tooltip text to show upon mouse hover.
      */
    var tooltip: js.UndefOr[String | SignalRef] = js.undefined
    
    /**
      * The URL of the image file for image marks.
      */
    var url: js.UndefOr[URI | SignalRef] = js.undefined
    
    /**
      * Width of the marks.
      */
    var width: js.UndefOr[Double | SignalRef] = js.undefined
  }
  object MarkConfig {
    
    inline def apply(): MarkConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkConfig]
    }
    
    extension [Self <: MarkConfig](x: Self) {
      
      inline def setAlign(value: Align | SignalRef): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAngle(value: Double | SignalRef): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setAria(value: Boolean | SignalRef): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaRole(value: String | SignalRef): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
      
      inline def setAriaRoleDescription(value: String | SignalRef): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
      
      inline def setAriaRoleDescriptionUndefined: Self = StObject.set(x, "ariaRoleDescription", js.undefined)
      
      inline def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setAspect(value: Boolean | SignalRef): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
      
      inline def setBaseline(value: TextBaseline | SignalRef): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      inline def setBlend(value: Blend): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
      
      inline def setBlendNull: Self = StObject.set(x, "blend", null)
      
      inline def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
      
      inline def setCornerRadius(value: Double | SignalRef): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusBottomLeft(value: Double | SignalRef): Self = StObject.set(x, "cornerRadiusBottomLeft", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusBottomLeftUndefined: Self = StObject.set(x, "cornerRadiusBottomLeft", js.undefined)
      
      inline def setCornerRadiusBottomRight(value: Double | SignalRef): Self = StObject.set(x, "cornerRadiusBottomRight", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusBottomRightUndefined: Self = StObject.set(x, "cornerRadiusBottomRight", js.undefined)
      
      inline def setCornerRadiusTopLeft(value: Double | SignalRef): Self = StObject.set(x, "cornerRadiusTopLeft", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusTopLeftUndefined: Self = StObject.set(x, "cornerRadiusTopLeft", js.undefined)
      
      inline def setCornerRadiusTopRight(value: Double | SignalRef): Self = StObject.set(x, "cornerRadiusTopRight", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusTopRightUndefined: Self = StObject.set(x, "cornerRadiusTopRight", js.undefined)
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setCursor(value: Cursor | SignalRef): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDescription(value: String | SignalRef): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDir(value: TextDirection | SignalRef): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDx(value: Double | SignalRef): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double | SignalRef): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setEndAngle(value: Double | SignalRef): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setFill(value: Color | Gradient | SignalRef): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillNull: Self = StObject.set(x, "fill", null)
      
      inline def setFillOpacity(value: Double | SignalRef): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: String | SignalRef): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double | SignalRef): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: FontStyle | SignalRef): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontWeight(value: FontWeight | SignalRef): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setHeight(value: Double | SignalRef): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHref(value: URI | SignalRef): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setInnerRadius(value: Double | SignalRef): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      inline def setInterpolate(value: Interpolate | SignalRef): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setLimit(value: Double | SignalRef): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLineBreak(value: String | SignalRef): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      inline def setLineHeight(value: Double | SignalRef): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setOpacity(value: Double | SignalRef): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOrient(value: Orientation | SignalRef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setOuterRadius(value: Double | SignalRef): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
      
      inline def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
      
      inline def setPadAngle(value: Double | SignalRef): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
      
      inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
      
      inline def setRadius(value: Double | SignalRef): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setShape(value: SymbolShape | String | SignalRef): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: Double | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSmooth(value: Boolean | SignalRef): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      inline def setStartAngle(value: Double | SignalRef): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setStroke(value: Color | Gradient | SignalRef): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeCap(value: StrokeCap | SignalRef): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
      
      inline def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
      
      inline def setStrokeDash(value: js.Array[Double] | SignalRef): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashOffset(value: Double | SignalRef): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
      
      inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      inline def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value*))
      
      inline def setStrokeJoin(value: StrokeJoin | SignalRef): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
      
      inline def setStrokeMiterLimit(value: Double | SignalRef): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterLimitUndefined: Self = StObject.set(x, "strokeMiterLimit", js.undefined)
      
      inline def setStrokeNull: Self = StObject.set(x, "stroke", null)
      
      inline def setStrokeOffset(value: Double | SignalRef): Self = StObject.set(x, "strokeOffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeOffsetUndefined: Self = StObject.set(x, "strokeOffset", js.undefined)
      
      inline def setStrokeOpacity(value: Double | SignalRef): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: Double | SignalRef): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTension(value: Double | SignalRef): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
      
      inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
      
      inline def setText(value: Text | SignalRef): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTheta(value: Double | SignalRef): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      inline def setTooltip(value: String | SignalRef): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUrl(value: URI | SignalRef): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWidth(value: Double | SignalRef): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined 'mark' | vega-typings.vega-typings/types/spec.Mark['type'] */
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.area
    - typings.vegaTypings.vegaTypingsStrings.trail
    - typings.vegaTypings.vegaTypingsStrings.group
    - typings.vegaTypings.vegaTypingsStrings.path
    - typings.vegaTypings.vegaTypingsStrings.image
    - typings.vegaTypings.vegaTypingsStrings.text
    - typings.vegaTypings.vegaTypingsStrings.shape
    - typings.vegaTypings.vegaTypingsStrings.symbol
    - typings.vegaTypings.vegaTypingsStrings.arc
    - typings.vegaTypings.vegaTypingsStrings.rule
    - typings.vegaTypings.vegaTypingsStrings.mark
    - typings.vegaTypings.vegaTypingsStrings.rect
    - typings.vegaTypings.vegaTypingsStrings.line
  */
  trait MarkConfigKeys extends StObject
  object MarkConfigKeys {
    
    inline def arc: typings.vegaTypings.vegaTypingsStrings.arc = "arc".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.arc]
    
    inline def area: typings.vegaTypings.vegaTypingsStrings.area = "area".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.area]
    
    inline def group: typings.vegaTypings.vegaTypingsStrings.group = "group".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.group]
    
    inline def image: typings.vegaTypings.vegaTypingsStrings.image = "image".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.image]
    
    inline def line: typings.vegaTypings.vegaTypingsStrings.line = "line".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.line]
    
    inline def mark: typings.vegaTypings.vegaTypingsStrings.mark = "mark".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mark]
    
    inline def path: typings.vegaTypings.vegaTypingsStrings.path = "path".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.path]
    
    inline def rect: typings.vegaTypings.vegaTypingsStrings.rect = "rect".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.rect]
    
    inline def rule: typings.vegaTypings.vegaTypingsStrings.rule = "rule".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.rule]
    
    inline def shape: typings.vegaTypings.vegaTypingsStrings.shape = "shape".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.shape]
    
    inline def symbol: typings.vegaTypings.vegaTypingsStrings.symbol = "symbol".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.symbol]
    
    inline def text: typings.vegaTypings.vegaTypingsStrings.text = "text".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.text]
    
    inline def trail: typings.vegaTypings.vegaTypingsStrings.trail = "trail".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.trail]
  }
  
  /* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/projection.BaseProjection> */
  trait ProjectionConfig extends StObject {
    
    var center: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ] = js.undefined
    
    var clipAngle: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var clipExtent: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
      ] = js.undefined
    
    var coefficient: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var distance: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var extent: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
      ] = js.undefined
    
    var fit: js.UndefOr[
        (Exclude[
          js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]])
      ] = js.undefined
    
    var fraction: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var lobes: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var parallel: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var parallels: js.UndefOr[
        (Exclude[
          js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]])
      ] = js.undefined
    
    var pointRadius: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var precision: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var radius: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var ratio: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var reflectX: js.UndefOr[
        (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
      ] = js.undefined
    
    var reflectY: js.UndefOr[
        (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
      ] = js.undefined
    
    var rotate: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[
          js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
        ])
      ] = js.undefined
    
    var scale: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var size: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ] = js.undefined
    
    var spacing: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var tilt: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.undefined
    
    var translate: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ] = js.undefined
    
    var `type`: js.UndefOr[
        (Exclude[
          js.UndefOr[ProjectionType | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[ProjectionType | SignalRef]])
      ] = js.undefined
  }
  object ProjectionConfig {
    
    inline def apply(): ProjectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectionConfig]
    }
    
    extension [Self <: ProjectionConfig](x: Self) {
      
      inline def setCenter(
        value: (Exclude[
              js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setClipAngle(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "clipAngle", value.asInstanceOf[js.Any])
      
      inline def setClipAngleUndefined: Self = StObject.set(x, "clipAngle", js.undefined)
      
      inline def setClipExtent(
        value: (Exclude[
              js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
      ): Self = StObject.set(x, "clipExtent", value.asInstanceOf[js.Any])
      
      inline def setClipExtentUndefined: Self = StObject.set(x, "clipExtent", js.undefined)
      
      inline def setCoefficient(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
      
      inline def setCoefficientUndefined: Self = StObject.set(x, "coefficient", js.undefined)
      
      inline def setDistance(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setExtent(
        value: (Exclude[
              js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
      ): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setFit(
        value: (Exclude[
              js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]])
      ): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setFitVarargs(value: (Fit | GeoJsonFeature)*): Self = StObject.set(x, "fit", js.Array(value*))
      
      inline def setFraction(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      inline def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
      
      inline def setLobes(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "lobes", value.asInstanceOf[js.Any])
      
      inline def setLobesUndefined: Self = StObject.set(x, "lobes", js.undefined)
      
      inline def setParallel(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setParallels(
        value: (Exclude[
              js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]])
      ): Self = StObject.set(x, "parallels", value.asInstanceOf[js.Any])
      
      inline def setParallelsUndefined: Self = StObject.set(x, "parallels", js.undefined)
      
      inline def setParallelsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "parallels", js.Array(value*))
      
      inline def setPointRadius(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "pointRadius", value.asInstanceOf[js.Any])
      
      inline def setPointRadiusUndefined: Self = StObject.set(x, "pointRadius", js.undefined)
      
      inline def setPrecision(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRadius(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRatio(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setReflectX(
        value: (Exclude[
              js.UndefOr[Boolean | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
      ): Self = StObject.set(x, "reflectX", value.asInstanceOf[js.Any])
      
      inline def setReflectXUndefined: Self = StObject.set(x, "reflectX", js.undefined)
      
      inline def setReflectY(
        value: (Exclude[
              js.UndefOr[Boolean | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
      ): Self = StObject.set(x, "reflectY", value.asInstanceOf[js.Any])
      
      inline def setReflectYUndefined: Self = StObject.set(x, "reflectY", js.undefined)
      
      inline def setRotate(
        value: (Exclude[
              js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[
              js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
            ])
      ): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSize(
        value: (Exclude[
              js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpacing(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setTilt(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
      
      inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
      
      inline def setTranslate(
        value: (Exclude[
              js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setType(
        value: (Exclude[
              js.UndefOr[ProjectionType | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[ProjectionType | SignalRef]])
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RangeConfig
    extends StObject
       with /* name */ StringDictionary[RangeScheme | (js.Array[Boolean | Double | String | SymbolShape])] {
    
    /**
      * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for categorical data.
      */
    var category: js.UndefOr[RangeScheme | js.Array[Color]] = js.undefined
    
    /**
      * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for diverging quantitative ramps.
      */
    var diverging: js.UndefOr[RangeScheme | js.Array[Color]] = js.undefined
    
    /**
      * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for quantitative heatmaps.
      */
    var heatmap: js.UndefOr[RangeScheme | js.Array[Color]] = js.undefined
    
    /**
      * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for rank-ordered data.
      */
    var ordinal: js.UndefOr[RangeScheme | js.Array[Color]] = js.undefined
    
    /**
      * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for sequential quantitative ramps.
      */
    var ramp: js.UndefOr[RangeScheme | js.Array[Color]] = js.undefined
    
    /**
      * Array of [symbol](https://vega.github.io/vega/docs/marks/symbol/) names or paths for the default shape palette.
      */
    var symbol: js.UndefOr[js.Array[SymbolShape]] = js.undefined
  }
  object RangeConfig {
    
    inline def apply(): RangeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeConfig]
    }
    
    extension [Self <: RangeConfig](x: Self) {
      
      inline def setCategory(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setCategoryVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "category", js.Array(value*))
      
      inline def setDiverging(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "diverging", value.asInstanceOf[js.Any])
      
      inline def setDivergingUndefined: Self = StObject.set(x, "diverging", js.undefined)
      
      inline def setDivergingVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "diverging", js.Array(value*))
      
      inline def setHeatmap(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "heatmap", value.asInstanceOf[js.Any])
      
      inline def setHeatmapUndefined: Self = StObject.set(x, "heatmap", js.undefined)
      
      inline def setHeatmapVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "heatmap", js.Array(value*))
      
      inline def setOrdinal(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
      
      inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      inline def setOrdinalVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "ordinal", js.Array(value*))
      
      inline def setRamp(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "ramp", value.asInstanceOf[js.Any])
      
      inline def setRampUndefined: Self = StObject.set(x, "ramp", js.undefined)
      
      inline def setRampVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "ramp", js.Array(value*))
      
      inline def setSymbol(value: js.Array[SymbolShape]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setSymbolVarargs(value: SymbolShape*): Self = StObject.set(x, "symbol", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.butt
    - typings.vegaTypings.vegaTypingsStrings.round
    - typings.vegaTypings.vegaTypingsStrings.square
  */
  trait StrokeCap extends StObject
  object StrokeCap {
    
    inline def butt: typings.vegaTypings.vegaTypingsStrings.butt = "butt".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.butt]
    
    inline def round: typings.vegaTypings.vegaTypingsStrings.round = "round".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.round]
    
    inline def square: typings.vegaTypings.vegaTypingsStrings.square = "square".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.square]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.miter
    - typings.vegaTypings.vegaTypingsStrings.round
    - typings.vegaTypings.vegaTypingsStrings.bevel
  */
  trait StrokeJoin extends StObject
  object StrokeJoin {
    
    inline def bevel: typings.vegaTypings.vegaTypingsStrings.bevel = "bevel".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.bevel]
    
    inline def miter: typings.vegaTypings.vegaTypingsStrings.miter = "miter".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.miter]
    
    inline def round: typings.vegaTypings.vegaTypingsStrings.round = "round".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.round]
  }
  
  /* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/title.BaseTitle> */
  trait TitleConfig extends StObject {
    
    var align: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ] = js.undefined
    
    var anchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
      ] = js.undefined
    
    var angle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ] = js.undefined
    
    var baseline: js.UndefOr[
        (Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ] = js.undefined
    
    var color: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.undefined
    
    var dx: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var dy: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var font: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ] = js.undefined
    
    var fontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var fontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ] = js.undefined
    
    var fontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ] = js.undefined
    
    var frame: js.UndefOr[
        (Exclude[
          js.UndefOr[TitleFrame | StringValue], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[TitleFrame | StringValue]])
      ] = js.undefined
    
    var limit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var lineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var offset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var orient: js.UndefOr[
        (Exclude[
          js.UndefOr[TitleOrient | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[TitleOrient | SignalRef]])
      ] = js.undefined
    
    var subtitleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.undefined
    
    var subtitleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ] = js.undefined
    
    var subtitleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var subtitleFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ] = js.undefined
    
    var subtitleFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ] = js.undefined
    
    var subtitleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var subtitlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.undefined
    
    var zindex: js.UndefOr[
        (Exclude[js.UndefOr[Double], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
      ] = js.undefined
  }
  object TitleConfig {
    
    inline def apply(): TitleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleConfig]
    }
    
    extension [Self <: TitleConfig](x: Self) {
      
      inline def setAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
      ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setAria(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setBaseline(
        value: (Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      inline def setColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDx(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFrame(
        value: (Exclude[
              js.UndefOr[TitleFrame | StringValue], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[TitleFrame | StringValue]])
      ): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrient(
        value: (Exclude[
              js.UndefOr[TitleOrient | SignalRef], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[TitleOrient | SignalRef]])
      ): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setSubtitleColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
      
      inline def setSubtitleColorNull: Self = StObject.set(x, "subtitleColor", null)
      
      inline def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
      
      inline def setSubtitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ): Self = StObject.set(x, "subtitleFont", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "subtitleFontSize", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontSizeUndefined: Self = StObject.set(x, "subtitleFontSize", js.undefined)
      
      inline def setSubtitleFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ): Self = StObject.set(x, "subtitleFontStyle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontStyleUndefined: Self = StObject.set(x, "subtitleFontStyle", js.undefined)
      
      inline def setSubtitleFontUndefined: Self = StObject.set(x, "subtitleFont", js.undefined)
      
      inline def setSubtitleFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ): Self = StObject.set(x, "subtitleFontWeight", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontWeightUndefined: Self = StObject.set(x, "subtitleFontWeight", js.undefined)
      
      inline def setSubtitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "subtitleLineHeight", value.asInstanceOf[js.Any])
      
      inline def setSubtitleLineHeightUndefined: Self = StObject.set(x, "subtitleLineHeight", js.undefined)
      
      inline def setSubtitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "subtitlePadding", value.asInstanceOf[js.Any])
      
      inline def setSubtitlePaddingUndefined: Self = StObject.set(x, "subtitlePadding", js.undefined)
      
      inline def setZindex(
        value: (Exclude[js.UndefOr[Double], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
}
