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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  /* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/axis.BaseAxis> */
  @js.native
  trait AxisConfig extends StObject {
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ] = js.native
    
    var bandPosition: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var description: js.UndefOr[
        (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
      ] = js.native
    
    var domain: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ] = js.native
    
    var domainCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ] = js.native
    
    var domainColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var domainDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ] = js.native
    
    var domainDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var domainOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var domainWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var grid: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ] = js.native
    
    var gridCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ] = js.native
    
    var gridColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var gridDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ] = js.native
    
    var gridDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var gridOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var gridWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ] = js.native
    
    var labelAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ] = js.native
    
    var labelBound: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
      ] = js.native
    
    var labelColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var labelFlush: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
      ] = js.native
    
    var labelFlushOffset: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var labelFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ] = js.native
    
    var labelFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ] = js.native
    
    var labelFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ] = js.native
    
    var labelLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelOverlap: js.UndefOr[
        (Exclude[
          js.UndefOr[LabelOverlap | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]])
      ] = js.native
    
    var labelPadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelSeparation: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var labels: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ] = js.native
    
    var maxExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var minExtent: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var tickBand: js.UndefOr[
        (Exclude[
          js.UndefOr[center | extent | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[center | extent | SignalRef]])
      ] = js.native
    
    var tickCap: js.UndefOr[
        (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ] = js.native
    
    var tickColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var tickDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ] = js.native
    
    var tickDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var tickExtra: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ] = js.native
    
    var tickOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var tickOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var tickRound: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ] = js.native
    
    var tickSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var tickWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var ticks: js.UndefOr[
        (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ] = js.native
    
    var titleAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ] = js.native
    
    var titleAnchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
      ] = js.native
    
    var titleAngle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var titleBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ] = js.native
    
    var titleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var titleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ] = js.native
    
    var titleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var titleFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ] = js.native
    
    var titleFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ] = js.native
    
    var titleLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var titleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var titleOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var titlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var titleX: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var titleY: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var translate: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var zindex: js.UndefOr[
        (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
      ] = js.native
  }
  object AxisConfig {
    
    @scala.inline
    def apply(): AxisConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisConfig]
    }
    
    @scala.inline
    implicit class AxisConfigMutableBuilder[Self <: AxisConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAria(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setBandPosition(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      @scala.inline
      def setDescription(
        value: (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDomain(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
      
      @scala.inline
      def setDomainColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
      
      @scala.inline
      def setDomainDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
      
      @scala.inline
      def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
      
      @scala.inline
      def setDomainDashVarargs(value: Double*): Self = StObject.set(x, "domainDash", js.Array(value :_*))
      
      @scala.inline
      def setDomainOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomainWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
      
      @scala.inline
      def setGrid(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
      
      @scala.inline
      def setGridColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      @scala.inline
      def setGridDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      @scala.inline
      def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      @scala.inline
      def setGridDashVarargs(value: Double*): Self = StObject.set(x, "gridDash", js.Array(value :_*))
      
      @scala.inline
      def setGridOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setGridWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      @scala.inline
      def setLabelAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      @scala.inline
      def setLabelBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelBound(
        value: (Exclude[
              js.UndefOr[Double | Boolean | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
      ): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
      
      @scala.inline
      def setLabelColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelFlush(
        value: (Exclude[
              js.UndefOr[Double | Boolean | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
      ): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFlushOffset(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
      
      @scala.inline
      def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
      
      @scala.inline
      def setLabelFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      @scala.inline
      def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      @scala.inline
      def setLabelFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      @scala.inline
      def setLabelLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
      
      @scala.inline
      def setLabelOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      @scala.inline
      def setLabelOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      @scala.inline
      def setLabelOverlap(
        value: (Exclude[
              js.UndefOr[LabelOverlap | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]])
      ): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      @scala.inline
      def setLabelPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setLabelSeparation(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      @scala.inline
      def setLabels(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setMaxExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
      
      @scala.inline
      def setMinExtent(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
      
      @scala.inline
      def setTickBand(
        value: (Exclude[
              js.UndefOr[center | extent | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[center | extent | SignalRef]])
      ): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
      
      @scala.inline
      def setTickCap(
        value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
      ): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
      
      @scala.inline
      def setTickColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      @scala.inline
      def setTickDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      @scala.inline
      def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      @scala.inline
      def setTickDashVarargs(value: Double*): Self = StObject.set(x, "tickDash", js.Array(value :_*))
      
      @scala.inline
      def setTickExtra(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
      
      @scala.inline
      def setTickOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
      
      @scala.inline
      def setTickOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      @scala.inline
      def setTickRound(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
      
      @scala.inline
      def setTickSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      @scala.inline
      def setTickWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      @scala.inline
      def setTicks(
        value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
      ): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      @scala.inline
      def setTitleAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
      @scala.inline
      def setTitleBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      @scala.inline
      def setTitleColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      @scala.inline
      def setTitleFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      @scala.inline
      def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      @scala.inline
      def setTitleFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      @scala.inline
      def setTitleLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      @scala.inline
      def setTitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      @scala.inline
      def setTitleOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      @scala.inline
      def setTitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      @scala.inline
      def setTitleX(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
      
      @scala.inline
      def setTitleY(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
      
      @scala.inline
      def setTranslate(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setZindex(
        value: (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
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
    
    @scala.inline
    def axis: typings.vegaTypings.vegaTypingsStrings.axis = "axis".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axis]
    
    @scala.inline
    def axisBand: typings.vegaTypings.vegaTypingsStrings.axisBand = "axisBand".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisBand]
    
    @scala.inline
    def axisBottom: typings.vegaTypings.vegaTypingsStrings.axisBottom = "axisBottom".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisBottom]
    
    @scala.inline
    def axisLeft: typings.vegaTypings.vegaTypingsStrings.axisLeft = "axisLeft".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisLeft]
    
    @scala.inline
    def axisRight: typings.vegaTypings.vegaTypingsStrings.axisRight = "axisRight".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisRight]
    
    @scala.inline
    def axisTop: typings.vegaTypings.vegaTypingsStrings.axisTop = "axisTop".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisTop]
    
    @scala.inline
    def axisX: typings.vegaTypings.vegaTypingsStrings.axisX = "axisX".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisX]
    
    @scala.inline
    def axisY: typings.vegaTypings.vegaTypingsStrings.axisY = "axisY".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.axisY]
  }
  
  @js.native
  trait BaseLegendLayout extends StObject {
    
    /**
      * The anchor point for legend orient group layout.
      */
    var anchor: js.UndefOr[TitleAnchor | SignalRef] = js.native
    
    /**
      * The bounds calculation to use for legend orient group layout.
      */
    var bounds: js.UndefOr[LayoutBounds] = js.native
    
    /**
      * A flag to center legends within a shared orient group.
      */
    var center: js.UndefOr[Boolean | SignalRef] = js.native
    
    /**
      * The layout direction for legend orient group layout.
      */
    var direction: js.UndefOr[Orientation | SignalRef] = js.native
    
    /**
      * The pixel margin between legends within a orient group.
      */
    var margin: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The pixel offset from the chart body for a legend orient group.
      */
    var offset: js.UndefOr[Double | SignalRef] = js.native
  }
  object BaseLegendLayout {
    
    @scala.inline
    def apply(): BaseLegendLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseLegendLayout]
    }
    
    @scala.inline
    implicit class BaseLegendLayoutMutableBuilder[Self <: BaseLegendLayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: TitleAnchor | SignalRef): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorNull: Self = StObject.set(x, "anchor", null)
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setBounds(value: LayoutBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean | SignalRef): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setDirection(value: Orientation | SignalRef): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setMargin(value: Double | SignalRef): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<std.Record<vega-typings.vega-typings/types/spec/config.MarkConfigKeys, vega-typings.vega-typings/types/spec/config.MarkConfig>> */
  /* Inlined parent std.Partial<std.Record<vega-typings.vega-typings/types/spec/config.AxisConfigKeys, vega-typings.vega-typings/types/spec/config.AxisConfig>> */
  @js.native
  trait Config extends StObject {
    
    var arc: js.UndefOr[MarkConfig] = js.native
    
    var area: js.UndefOr[MarkConfig] = js.native
    
    var autosize: js.UndefOr[AutoSize | SignalRef] = js.native
    
    var axis: js.UndefOr[AxisConfig] = js.native
    
    var axisBand: js.UndefOr[AxisConfig] = js.native
    
    var axisBottom: js.UndefOr[AxisConfig] = js.native
    
    var axisLeft: js.UndefOr[AxisConfig] = js.native
    
    var axisRight: js.UndefOr[AxisConfig] = js.native
    
    var axisTop: js.UndefOr[AxisConfig] = js.native
    
    var axisX: js.UndefOr[AxisConfig] = js.native
    
    var axisY: js.UndefOr[AxisConfig] = js.native
    
    var background: js.UndefOr[Null | Color | SignalRef] = js.native
    
    // TODO
    var events: js.UndefOr[Bind] = js.native
    
    var group: js.UndefOr[js.Any] = js.native
    
    var image: js.UndefOr[MarkConfig] = js.native
    
    var legend: js.UndefOr[LegendConfig] = js.native
    
    var line: js.UndefOr[MarkConfig] = js.native
    
    /**
      * A delimiter, such as a newline character, upon which to break text strings into multiple lines. This property provides a global default for text marks, which is overridden by mark or style config settings, and by the "lineBreak" mark encoding channel. If signal-valued, either string or regular expression (regexp) values are valid.
      */
    var lineBreak: js.UndefOr[String | SignalRef] = js.native
    
    var locale: js.UndefOr[Locale] = js.native
    
    var mark: js.UndefOr[MarkConfig] = js.native
    
    var padding: js.UndefOr[Padding | SignalRef] = js.native
    
    var path: js.UndefOr[MarkConfig] = js.native
    
    var projection: js.UndefOr[ProjectionConfig] = js.native
    
    var range: js.UndefOr[RangeConfig] = js.native
    
    var rect: js.UndefOr[MarkConfig] = js.native
    
    var rule: js.UndefOr[MarkConfig] = js.native
    
    var shape: js.UndefOr[MarkConfig] = js.native
    
    var signals: js.UndefOr[js.Array[InitSignal | NewSignal]] = js.native
    
    var style: js.UndefOr[StringDictionary[MarkConfig]] = js.native
    
    var symbol: js.UndefOr[MarkConfig] = js.native
    
    var text: js.UndefOr[MarkConfig] = js.native
    
    var title: js.UndefOr[TitleConfig] = js.native
    
    var trail: js.UndefOr[MarkConfig] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArc(value: MarkConfig): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
      
      @scala.inline
      def setArea(value: MarkConfig): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      @scala.inline
      def setAutosize(value: AutoSize | SignalRef): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
      
      @scala.inline
      def setAxis(value: AxisConfig): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisBand(value: AxisConfig): Self = StObject.set(x, "axisBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisBandUndefined: Self = StObject.set(x, "axisBand", js.undefined)
      
      @scala.inline
      def setAxisBottom(value: AxisConfig): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisBottomUndefined: Self = StObject.set(x, "axisBottom", js.undefined)
      
      @scala.inline
      def setAxisLeft(value: AxisConfig): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisLeftUndefined: Self = StObject.set(x, "axisLeft", js.undefined)
      
      @scala.inline
      def setAxisRight(value: AxisConfig): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisRightUndefined: Self = StObject.set(x, "axisRight", js.undefined)
      
      @scala.inline
      def setAxisTop(value: AxisConfig): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisTopUndefined: Self = StObject.set(x, "axisTop", js.undefined)
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setAxisX(value: AxisConfig): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
      
      @scala.inline
      def setAxisY(value: AxisConfig): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
      
      @scala.inline
      def setBackground(value: Color | SignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundNull: Self = StObject.set(x, "background", null)
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setEvents(value: Bind): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setGroup(value: js.Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setImage(value: MarkConfig): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setLegend(value: LegendConfig): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setLine(value: MarkConfig): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineBreak(value: String | SignalRef): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMark(value: MarkConfig): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setPadding(value: Padding | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPath(value: MarkConfig): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionConfig): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setRange(value: RangeConfig): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRect(value: MarkConfig): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
      
      @scala.inline
      def setRule(value: MarkConfig): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      @scala.inline
      def setShape(value: MarkConfig): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSignals(value: js.Array[InitSignal | NewSignal]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      @scala.inline
      def setSignalsVarargs(value: (InitSignal | NewSignal)*): Self = StObject.set(x, "signals", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: StringDictionary[MarkConfig]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSymbol(value: MarkConfig): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setText(value: MarkConfig): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTitle(value: TitleConfig): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTrail(value: MarkConfig): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailUndefined: Self = StObject.set(x, "trail", js.undefined)
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
    
    @scala.inline
    def default: typings.vegaTypings.vegaTypingsStrings.default = "default".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.default]
    
    @scala.inline
    def alias: typings.vegaTypings.vegaTypingsStrings.alias = "alias".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.alias]
    
    @scala.inline
    def `all-scroll`: typings.vegaTypings.vegaTypingsStrings.`all-scroll` = "all-scroll".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`all-scroll`]
    
    @scala.inline
    def auto: typings.vegaTypings.vegaTypingsStrings.auto = "auto".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.auto]
    
    @scala.inline
    def cell: typings.vegaTypings.vegaTypingsStrings.cell = "cell".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.cell]
    
    @scala.inline
    def `col-resize`: typings.vegaTypings.vegaTypingsStrings.`col-resize` = "col-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`col-resize`]
    
    @scala.inline
    def `context-menu`: typings.vegaTypings.vegaTypingsStrings.`context-menu` = "context-menu".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`context-menu`]
    
    @scala.inline
    def copy: typings.vegaTypings.vegaTypingsStrings.copy = "copy".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.copy]
    
    @scala.inline
    def crosshair: typings.vegaTypings.vegaTypingsStrings.crosshair = "crosshair".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.crosshair]
    
    @scala.inline
    def `e-resize`: typings.vegaTypings.vegaTypingsStrings.`e-resize` = "e-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`e-resize`]
    
    @scala.inline
    def `ew-resize`: typings.vegaTypings.vegaTypingsStrings.`ew-resize` = "ew-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`ew-resize`]
    
    @scala.inline
    def grab: typings.vegaTypings.vegaTypingsStrings.grab = "grab".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.grab]
    
    @scala.inline
    def grabbing: typings.vegaTypings.vegaTypingsStrings.grabbing = "grabbing".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.grabbing]
    
    @scala.inline
    def help: typings.vegaTypings.vegaTypingsStrings.help = "help".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.help]
    
    @scala.inline
    def move: typings.vegaTypings.vegaTypingsStrings.move = "move".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.move]
    
    @scala.inline
    def `n-resize`: typings.vegaTypings.vegaTypingsStrings.`n-resize` = "n-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`n-resize`]
    
    @scala.inline
    def `ne-resize`: typings.vegaTypings.vegaTypingsStrings.`ne-resize` = "ne-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`ne-resize`]
    
    @scala.inline
    def `nesw-resize`: typings.vegaTypings.vegaTypingsStrings.`nesw-resize` = "nesw-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`nesw-resize`]
    
    @scala.inline
    def `no-drop`: typings.vegaTypings.vegaTypingsStrings.`no-drop` = "no-drop".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`no-drop`]
    
    @scala.inline
    def none: typings.vegaTypings.vegaTypingsStrings.none = "none".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.none]
    
    @scala.inline
    def `not-allowed`: typings.vegaTypings.vegaTypingsStrings.`not-allowed` = "not-allowed".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`not-allowed`]
    
    @scala.inline
    def `ns-resize`: typings.vegaTypings.vegaTypingsStrings.`ns-resize` = "ns-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`ns-resize`]
    
    @scala.inline
    def `nw-resize`: typings.vegaTypings.vegaTypingsStrings.`nw-resize` = "nw-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`nw-resize`]
    
    @scala.inline
    def `nwse-resize`: typings.vegaTypings.vegaTypingsStrings.`nwse-resize` = "nwse-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`nwse-resize`]
    
    @scala.inline
    def pointer: typings.vegaTypings.vegaTypingsStrings.pointer = "pointer".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.pointer]
    
    @scala.inline
    def progress: typings.vegaTypings.vegaTypingsStrings.progress = "progress".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.progress]
    
    @scala.inline
    def `row-resize`: typings.vegaTypings.vegaTypingsStrings.`row-resize` = "row-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`row-resize`]
    
    @scala.inline
    def `s-resize`: typings.vegaTypings.vegaTypingsStrings.`s-resize` = "s-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`s-resize`]
    
    @scala.inline
    def `se-resize`: typings.vegaTypings.vegaTypingsStrings.`se-resize` = "se-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`se-resize`]
    
    @scala.inline
    def `sw-resize`: typings.vegaTypings.vegaTypingsStrings.`sw-resize` = "sw-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`sw-resize`]
    
    @scala.inline
    def text: typings.vegaTypings.vegaTypingsStrings.text = "text".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.text]
    
    @scala.inline
    def `vertical-text`: typings.vegaTypings.vegaTypingsStrings.`vertical-text` = "vertical-text".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`vertical-text`]
    
    @scala.inline
    def `w-resize`: typings.vegaTypings.vegaTypingsStrings.`w-resize` = "w-resize".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`w-resize`]
    
    @scala.inline
    def `zoom-in`: typings.vegaTypings.vegaTypingsStrings.`zoom-in` = "zoom-in".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`zoom-in`]
    
    @scala.inline
    def `zoom-out`: typings.vegaTypings.vegaTypingsStrings.`zoom-out` = "zoom-out".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`zoom-out`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.anon.RecordpreventbooleanArray
    - typings.vegaTypings.anon.RecordallowbooleanArrayEv
  */
  trait DefaultsConfig extends StObject
  object DefaultsConfig {
    
    @scala.inline
    def RecordallowbooleanArrayEv(allow: Boolean | js.Array[EventType]): typings.vegaTypings.anon.RecordallowbooleanArrayEv = {
      val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.RecordallowbooleanArrayEv]
    }
    
    @scala.inline
    def RecordpreventbooleanArray(prevent: Boolean | js.Array[EventType]): typings.vegaTypings.anon.RecordpreventbooleanArray = {
      val __obj = js.Dynamic.literal(prevent = prevent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.RecordpreventbooleanArray]
    }
  }
  
  type ExcludeMappedValueRef[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Exclude<T[P], vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/config.KeepSignal<T[P]>}
    */ typings.vegaTypings.vegaTypingsStrings.ExcludeMappedValueRef with TopLevel[js.Any]
  
  type KeepSignal[T] = SignalRef
  
  /* Inlined parent vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/legend.BaseLegend> */
  @js.native
  trait LegendConfig extends StObject {
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ] = js.native
    
    var clipHeight: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var columnPadding: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var columns: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var cornerRadius: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var description: js.UndefOr[
        (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
      ] = js.native
    
    var fillColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    /**
      * The default direction (`"horizontal"` or `"vertical"`) for gradient legends.
      *
      * __Default value:__ `"vertical"`.
      */
    var gradientDirection: js.UndefOr[Orientation] = js.native
    
    /**
      * The maximum allowed length in pixels of color ramp gradient labels.
      */
    var gradientLabelLimit: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * Vertical offset in pixels for color ramp gradient labels.
      *
      * __Default value:__ `2`.
      */
    var gradientLabelOffset: js.UndefOr[Double | SignalRef] = js.native
    
    var gradientLength: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var gradientOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var gradientStrokeColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var gradientStrokeWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var gradientThickness: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var gridAlign: js.UndefOr[
        (Exclude[
          js.UndefOr[LayoutAlign | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[LayoutAlign | SignalRef]])
      ] = js.native
    
    var labelAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ] = js.native
    
    var labelBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ] = js.native
    
    var labelColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var labelFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ] = js.native
    
    var labelFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ] = js.native
    
    var labelFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ] = js.native
    
    var labelLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelOverlap: js.UndefOr[
        (Exclude[
          js.UndefOr[LabelOverlap | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]])
      ] = js.native
    
    var labelPadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var labelSeparation: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    /**
      * Legend orient group layout parameters.
      */
    var layout: js.UndefOr[LegendLayout] = js.native
    
    var legendX: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var legendY: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var offset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var orient: js.UndefOr[
        (Exclude[
          js.UndefOr[LegendOrient | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[LegendOrient | SignalRef]])
      ] = js.native
    
    var padding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var rowPadding: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var strokeColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    /**
      * Border stroke dash pattern for the full legend.
      */
    var strokeDash: js.UndefOr[js.Array[Double] | SignalRef] = js.native
    
    /**
      * Border stroke width for the full legend.
      */
    var strokeWidth: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * Default fill color for legend symbols. Only applied if there is no `"fill"` scale color encoding for the legend.
      *
      * __Default value:__ `"transparent"`.
      */
    var symbolBaseFillColor: js.UndefOr[Null | Color | SignalRef] = js.native
    
    /**
      * Default stroke color for legend symbols. Only applied if there is no `"fill"` scale color encoding for the legend.
      *
      * __Default value:__ `"gray"`.
      */
    var symbolBaseStrokeColor: js.UndefOr[Null | Color | SignalRef] = js.native
    
    var symbolDash: js.UndefOr[
        (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ] = js.native
    
    var symbolDashOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    /**
      * The default direction (`"horizontal"` or `"vertical"`) for symbol legends.
      *
      * __Default value:__ `"vertical"`.
      */
    var symbolDirection: js.UndefOr[Orientation] = js.native
    
    var symbolFillColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var symbolLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var symbolOffset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var symbolOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var symbolSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var symbolStrokeColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var symbolStrokeWidth: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var symbolType: js.UndefOr[
        (Exclude[
          js.UndefOr[SymbolShapeValue | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[SymbolShapeValue | SignalRef]])
      ] = js.native
    
    var tickCount: js.UndefOr[
        (Exclude[js.UndefOr[TickCount], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TickCount]]
      ] = js.native
    
    var titleAlign: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ] = js.native
    
    var titleAnchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
      ] = js.native
    
    var titleBaseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ] = js.native
    
    var titleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var titleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ] = js.native
    
    var titleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var titleFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ] = js.native
    
    var titleFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ] = js.native
    
    var titleLimit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var titleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var titleOpacity: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var titleOrient: js.UndefOr[
        (Exclude[js.UndefOr[OrientValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[OrientValue]]
      ] = js.native
    
    var titlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var zindex: js.UndefOr[
        (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
      ] = js.native
  }
  object LegendConfig {
    
    @scala.inline
    def apply(): LegendConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendConfig]
    }
    
    @scala.inline
    implicit class LegendConfigMutableBuilder[Self <: LegendConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAria(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setClipHeight(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "clipHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipHeightUndefined: Self = StObject.set(x, "clipHeight", js.undefined)
      
      @scala.inline
      def setColumnPadding(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "columnPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnPaddingUndefined: Self = StObject.set(x, "columnPadding", js.undefined)
      
      @scala.inline
      def setColumns(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setCornerRadius(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setDescription(
        value: (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFillColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setGradientDirection(value: Orientation): Self = StObject.set(x, "gradientDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientDirectionUndefined: Self = StObject.set(x, "gradientDirection", js.undefined)
      
      @scala.inline
      def setGradientLabelLimit(value: Double | SignalRef): Self = StObject.set(x, "gradientLabelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientLabelLimitUndefined: Self = StObject.set(x, "gradientLabelLimit", js.undefined)
      
      @scala.inline
      def setGradientLabelOffset(value: Double | SignalRef): Self = StObject.set(x, "gradientLabelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientLabelOffsetUndefined: Self = StObject.set(x, "gradientLabelOffset", js.undefined)
      
      @scala.inline
      def setGradientLength(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "gradientLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientLengthUndefined: Self = StObject.set(x, "gradientLength", js.undefined)
      
      @scala.inline
      def setGradientOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "gradientOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientOpacityUndefined: Self = StObject.set(x, "gradientOpacity", js.undefined)
      
      @scala.inline
      def setGradientStrokeColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "gradientStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientStrokeColorUndefined: Self = StObject.set(x, "gradientStrokeColor", js.undefined)
      
      @scala.inline
      def setGradientStrokeWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "gradientStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientStrokeWidthUndefined: Self = StObject.set(x, "gradientStrokeWidth", js.undefined)
      
      @scala.inline
      def setGradientThickness(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "gradientThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientThicknessUndefined: Self = StObject.set(x, "gradientThickness", js.undefined)
      
      @scala.inline
      def setGridAlign(
        value: (Exclude[
              js.UndefOr[LayoutAlign | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[LayoutAlign | SignalRef]])
      ): Self = StObject.set(x, "gridAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAlignUndefined: Self = StObject.set(x, "gridAlign", js.undefined)
      
      @scala.inline
      def setLabelAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      @scala.inline
      def setLabelColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      @scala.inline
      def setLabelFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      @scala.inline
      def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      @scala.inline
      def setLabelFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      @scala.inline
      def setLabelLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      @scala.inline
      def setLabelOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      @scala.inline
      def setLabelOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      @scala.inline
      def setLabelOverlap(
        value: (Exclude[
              js.UndefOr[LabelOverlap | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]])
      ): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      @scala.inline
      def setLabelPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      @scala.inline
      def setLabelSeparation(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      @scala.inline
      def setLayout(value: LegendLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLegendX(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "legendX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendXUndefined: Self = StObject.set(x, "legendX", js.undefined)
      
      @scala.inline
      def setLegendY(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "legendY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendYUndefined: Self = StObject.set(x, "legendY", js.undefined)
      
      @scala.inline
      def setOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(
        value: (Exclude[
              js.UndefOr[LegendOrient | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[LegendOrient | SignalRef]])
      ): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setPadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRowPadding(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "rowPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowPaddingUndefined: Self = StObject.set(x, "rowPadding", js.undefined)
      
      @scala.inline
      def setStrokeColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeDash(value: js.Array[Double] | SignalRef): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      @scala.inline
      def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value :_*))
      
      @scala.inline
      def setStrokeWidth(value: Double | SignalRef): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setSymbolBaseFillColor(value: Color | SignalRef): Self = StObject.set(x, "symbolBaseFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolBaseFillColorNull: Self = StObject.set(x, "symbolBaseFillColor", null)
      
      @scala.inline
      def setSymbolBaseFillColorUndefined: Self = StObject.set(x, "symbolBaseFillColor", js.undefined)
      
      @scala.inline
      def setSymbolBaseStrokeColor(value: Color | SignalRef): Self = StObject.set(x, "symbolBaseStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolBaseStrokeColorNull: Self = StObject.set(x, "symbolBaseStrokeColor", null)
      
      @scala.inline
      def setSymbolBaseStrokeColorUndefined: Self = StObject.set(x, "symbolBaseStrokeColor", js.undefined)
      
      @scala.inline
      def setSymbolDash(
        value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
      ): Self = StObject.set(x, "symbolDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolDashOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "symbolDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolDashOffsetUndefined: Self = StObject.set(x, "symbolDashOffset", js.undefined)
      
      @scala.inline
      def setSymbolDashUndefined: Self = StObject.set(x, "symbolDash", js.undefined)
      
      @scala.inline
      def setSymbolDashVarargs(value: Double*): Self = StObject.set(x, "symbolDash", js.Array(value :_*))
      
      @scala.inline
      def setSymbolDirection(value: Orientation): Self = StObject.set(x, "symbolDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolDirectionUndefined: Self = StObject.set(x, "symbolDirection", js.undefined)
      
      @scala.inline
      def setSymbolFillColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "symbolFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolFillColorUndefined: Self = StObject.set(x, "symbolFillColor", js.undefined)
      
      @scala.inline
      def setSymbolLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "symbolLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolLimitUndefined: Self = StObject.set(x, "symbolLimit", js.undefined)
      
      @scala.inline
      def setSymbolOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "symbolOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolOffsetUndefined: Self = StObject.set(x, "symbolOffset", js.undefined)
      
      @scala.inline
      def setSymbolOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "symbolOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolOpacityUndefined: Self = StObject.set(x, "symbolOpacity", js.undefined)
      
      @scala.inline
      def setSymbolSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
      
      @scala.inline
      def setSymbolStrokeColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "symbolStrokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolStrokeColorUndefined: Self = StObject.set(x, "symbolStrokeColor", js.undefined)
      
      @scala.inline
      def setSymbolStrokeWidth(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "symbolStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolStrokeWidthUndefined: Self = StObject.set(x, "symbolStrokeWidth", js.undefined)
      
      @scala.inline
      def setSymbolType(
        value: (Exclude[
              js.UndefOr[SymbolShapeValue | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[SymbolShapeValue | SignalRef]])
      ): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
      
      @scala.inline
      def setTickCount(
        value: (Exclude[js.UndefOr[TickCount], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TickCount]]
      ): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      @scala.inline
      def setTitleAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      @scala.inline
      def setTitleAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
      ): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      @scala.inline
      def setTitleColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      @scala.inline
      def setTitleFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      @scala.inline
      def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      @scala.inline
      def setTitleFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      @scala.inline
      def setTitleLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      @scala.inline
      def setTitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      @scala.inline
      def setTitleOpacity(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      @scala.inline
      def setTitleOrient(
        value: (Exclude[js.UndefOr[OrientValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[OrientValue]]
      ): Self = StObject.set(x, "titleOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleOrientUndefined: Self = StObject.set(x, "titleOrient", js.undefined)
      
      @scala.inline
      def setTitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      @scala.inline
      def setZindex(
        value: (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  @js.native
  trait LegendLayout extends BaseLegendLayout {
    
    var bottom: js.UndefOr[BaseLegendLayout] = js.native
    
    var `bottom-left`: js.UndefOr[BaseLegendLayout] = js.native
    
    var `bottom-right`: js.UndefOr[BaseLegendLayout] = js.native
    
    var left: js.UndefOr[BaseLegendLayout] = js.native
    
    var right: js.UndefOr[BaseLegendLayout] = js.native
    
    var top: js.UndefOr[BaseLegendLayout] = js.native
    
    var `top-left`: js.UndefOr[BaseLegendLayout] = js.native
    
    var `top-right`: js.UndefOr[BaseLegendLayout] = js.native
  }
  object LegendLayout {
    
    @scala.inline
    def apply(): LegendLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendLayout]
    }
    
    @scala.inline
    implicit class LegendLayoutMutableBuilder[Self <: LegendLayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: BaseLegendLayout): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-left`(value: BaseLegendLayout): Self = StObject.set(x, "bottom-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-leftUndefined`: Self = StObject.set(x, "bottom-left", js.undefined)
      
      @scala.inline
      def `setBottom-right`(value: BaseLegendLayout): Self = StObject.set(x, "bottom-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBottom-rightUndefined`: Self = StObject.set(x, "bottom-right", js.undefined)
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: BaseLegendLayout): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: BaseLegendLayout): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: BaseLegendLayout): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-left`(value: BaseLegendLayout): Self = StObject.set(x, "top-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-leftUndefined`: Self = StObject.set(x, "top-left", js.undefined)
      
      @scala.inline
      def `setTop-right`(value: BaseLegendLayout): Self = StObject.set(x, "top-right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTop-rightUndefined`: Self = StObject.set(x, "top-right", js.undefined)
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait MarkConfig extends StObject {
    
    // Text / Label Mark Config
    /**
      * The horizontal alignment of the text. One of `"left"`, `"right"`, `"center"`.
      */
    var align: js.UndefOr[Align | SignalRef] = js.native
    
    /**
      * The rotation angle of the text, in degrees.
      *
      * @minimum 0
      * @maximum 360
      */
    var angle: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * A boolean flag indicating if [ARIA attributes](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) should be included (SVG output only).
      * If `false`, the "aria-hidden" attribute will be set on the output SVG element, removing the mark item from the ARIA accessibility tree.
      */
    var aria: js.UndefOr[Boolean | SignalRef] = js.native
    
    /**
      * Sets the type of user interface element of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
      * If specified, this property determines the "role" attribute.
      * Warning: this property is experimental and may be changed in the future.
      */
    var ariaRole: js.UndefOr[String | SignalRef] = js.native
    
    /**
      * A human-readable, author-localized description for the role of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
      * If specified, this property determines the "aria-roledescription" attribute.
      * Warning: this property is experimental and may be changed in the future.
      */
    var ariaRoleDescription: js.UndefOr[String | SignalRef] = js.native
    
    /**
      * Whether to keep aspect ratio of image marks.
      */
    var aspect: js.UndefOr[Boolean | SignalRef] = js.native
    
    /**
      * The vertical alignment of the text. One of `"top"`, `"bottom"`, `"middle"`, `"alphabetic"`.
      *
      * __Default value:__ `"middle"`
      *
      */
    var baseline: js.UndefOr[TextBaseline | SignalRef] = js.native
    
    /**
      * The color blend mode for drawing an item on its current background. Any valid [CSS mix-blend-mode](https://developer.mozilla.org/en-US/docs/Web/CSS/mix-blend-mode) value can be used.
      *
      * __Default value: `"source-over"`
      */
    var blend: js.UndefOr[Blend] = js.native
    
    // ---------- Corner Radius: Bar, Tick, Rect ----------
    /**
      * The radius in pixels of rounded rectangles or arcs' corners.
      *
      * __Default value:__ `0`
      */
    var cornerRadius: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The radius in pixels of rounded rectangles' bottom left corner.
      *
      * __Default value:__ `0`
      */
    var cornerRadiusBottomLeft: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The radius in pixels of rounded rectangles' bottom right corner.
      *
      * __Default value:__ `0`
      */
    var cornerRadiusBottomRight: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The radius in pixels of rounded rectangles' top right corner.
      *
      * __Default value:__ `0`
      */
    var cornerRadiusTopLeft: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The radius in pixels of rounded rectangles' top left corner.
      *
      * __Default value:__ `0`
      */
    var cornerRadiusTopRight: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The mouse cursor used over the mark. Any valid [CSS cursor type](https://developer.mozilla.org/en-US/docs/Web/CSS/cursor#Values) can be used.
      */
    var cursor: js.UndefOr[Cursor | SignalRef] = js.native
    
    /**
      * A text description of the mark item for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
      * If specified, this property determines the ["aria-label" attribute](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/ARIA_Techniques/Using_the_aria-label_attribute).
      */
    var description: js.UndefOr[String | SignalRef] = js.native
    
    /**
      * The direction of the text. One of `"ltr"` (left-to-right) or `"rtl"` (right-to-left). This property determines on which side is truncated in response to the limit parameter.
      *
      * __Default value:__ `"ltr"`
      */
    var dir: js.UndefOr[TextDirection | SignalRef] = js.native
    
    /**
      * The horizontal offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
      */
    var dx: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The vertical offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
      */
    var dy: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The ellipsis string for text truncated in response to the limit parameter.
      *
      * __Default value:__ `"…"`
      */
    var ellipsis: js.UndefOr[String] = js.native
    
    /**
      * The end angle in radians for arc marks.
      * A value of `0` indicates up (north), increasing values proceed clockwise.
      */
    var endAngle: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * Default fill color.
      *
      * __Default value:__ (None)
      *
      */
    var fill: js.UndefOr[Color | Gradient | Null | SignalRef] = js.native
    
    /**
      * The fill opacity (value between [0,1]).
      *
      * __Default value:__ `1`
      *
      * @minimum 0
      * @maximum 1
      */
    var fillOpacity: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The typeface to set the text in (e.g., `"Helvetica Neue"`).
      */
    var font: js.UndefOr[String | SignalRef] = js.native
    
    /**
      * The font size, in pixels.
      *
      * __Default value:__ `11`
      *
      *  @minimum 0
      */
    var fontSize: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The font style (e.g., `"italic"`).
      */
    var fontStyle: js.UndefOr[FontStyle | SignalRef] = js.native
    
    /**
      * The font weight.
      * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
      */
    var fontWeight: js.UndefOr[FontWeight | SignalRef] = js.native
    
    /**
      * Height of the marks.
      */
    var height: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * A URL to load upon mouse click. If defined, the mark acts as a hyperlink.
      */
    var href: js.UndefOr[URI | SignalRef] = js.native
    
    /**
      * The inner radius in pixels of arc marks.
      *
      * @minimum 0
      * __Default value:__ `0`
      */
    var innerRadius: js.UndefOr[Double | SignalRef] = js.native
    
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
    var interpolate: js.UndefOr[Interpolate | SignalRef] = js.native
    
    /**
      * The maximum length of the text mark in pixels. The text value will be automatically truncated if the rendered size exceeds the limit.
      *
      * __Default value:__ `0` -- indicating no limit
      */
    var limit: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * A delimiter, such as a newline character, upon which to break text strings into multiple lines. This property is ignored if the text is array-valued.
      */
    var lineBreak: js.UndefOr[String | SignalRef] = js.native
    
    /**
      * The line height in pixels (the spacing between subsequent lines of text) for multi-line text marks.
      */
    var lineHeight: js.UndefOr[Double | SignalRef] = js.native
    
    // ---------- Opacity ----------
    /**
      * The overall opacity (value between [0,1]).
      *
      * @minimum 0
      * @maximum 1
      */
    var opacity: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The orientation of the area mark. One of `horizontal` or `vertical` (the default). With a vertical orientation, an area mark is defined by the `x`, `y`, and (`y2` or `height`) properties; with a horizontal orientation, the `y`, `x` and (`x2` or `width`) properties must be specified instead.
      */
    var orient: js.UndefOr[Orientation | SignalRef] = js.native
    
    /**
      * The outer radius in pixels of arc marks.
      *
      * @minimum 0
      * __Default value:__ `0`
      */
    var outerRadius: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The angular padding applied to sides of the arc, in radians.
      */
    var padAngle: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * Polar coordinate radial offset, in pixels, of the text label from the origin determined by the `x` and `y` properties.
      *
      * @minimum 0
      */
    var radius: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * Shape of the point marks. Supported values include:
      * - plotting shapes: `"circle"`, `"square"`, `"cross"`, `"diamond"`, `"triangle-up"`, `"triangle-down"`, `"triangle-right"`, or `"triangle-left"`.
      * - the line symbol `"stroke"`
      * - centered directional shapes `"arrow"`, `"wedge"`, or `"triangle"`
      * - a custom [SVG path string](https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths) (For correct sizing, custom shape paths should be defined within a square bounding box with coordinates ranging from -1 to 1 along both the x and y dimensions.)
      *
      * __Default value:__ `"circle"`
      */
    var shape: js.UndefOr[SymbolShape | String | SignalRef] = js.native
    
    /**
      * The area in pixels of the symbols bounding box. Note that this value sets the area of the symbol; the side lengths will increase with the square root of this value.
      *
      * __Default value:__ `30`
      *
      * @minimum 0
      */
    var size: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * A boolean flag (default true) indicating if the image should be smoothed when resized. If false, individual pixels should be scaled directly rather than interpolated with smoothing. For SVG rendering, this option may not work in some browsers due to lack of standardization.
      */
    var smooth: js.UndefOr[Boolean | SignalRef] = js.native
    
    /**
      * The start angle in radians for arc marks.
      * A value of `0` indicates up (north), increasing values proceed clockwise.
      */
    var startAngle: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * Default stroke color.
      *
      * __Default value:__ (None)
      *
      */
    var stroke: js.UndefOr[Color | Gradient | Null | SignalRef] = js.native
    
    /**
      * The stroke cap for line ending style. One of `"butt"`, `"round"`, or `"square"`.
      *
      * __Default value:__ `"butt"`
      *
      */
    var strokeCap: js.UndefOr[StrokeCap | SignalRef] = js.native
    
    /**
      * An array of alternating stroke, space lengths for creating dashed or dotted lines.
      */
    var strokeDash: js.UndefOr[js.Array[Double] | SignalRef] = js.native
    
    /**
      * The offset (in pixels) into which to begin drawing with the stroke dash array.
      */
    var strokeDashOffset: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The stroke line join method. One of `"miter"`, `"round"` or `"bevel"`.
      *
      * __Default value:__ `"miter"`
      *
      */
    var strokeJoin: js.UndefOr[StrokeJoin | SignalRef] = js.native
    
    /**
      * The miter limit at which to bevel a line join.
      */
    var strokeMiterLimit: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The offset in pixels at which to draw the group stroke and fill. If unspecified, the default behavior is to dynamically offset stroked groups such that 1 pixel stroke widths align with the pixel grid.
      */
    var strokeOffset: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The stroke opacity (value between [0,1]).
      *
      * __Default value:__ `1`
      *
      * @minimum 0
      * @maximum 1
      */
    var strokeOpacity: js.UndefOr[Double | SignalRef] = js.native
    
    // ---------- Stroke Style ----------
    /**
      * The stroke width, in pixels.
      *
      * @minimum 0
      */
    var strokeWidth: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * Depending on the interpolation type, sets the tension parameter (for line and area marks).
      */
    var tension: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * Placeholder text if the `text` channel is not specified
      */
    var text: js.UndefOr[Text | SignalRef] = js.native
    
    /**
      * Polar coordinate angle, in radians, of the text label from the origin determined by the `x` and `y` properties. Values for `theta` follow the same convention of `arc` mark `startAngle` and `endAngle` properties: angles are measured in radians, with `0` indicating "north".
      */
    var theta: js.UndefOr[Double | SignalRef] = js.native
    
    /**
      * The tooltip text to show upon mouse hover.
      */
    var tooltip: js.UndefOr[String | SignalRef] = js.native
    
    /**
      * The URL of the image file for image marks.
      */
    var url: js.UndefOr[URI | SignalRef] = js.native
    
    /**
      * Width of the marks.
      */
    var width: js.UndefOr[Double | SignalRef] = js.native
  }
  object MarkConfig {
    
    @scala.inline
    def apply(): MarkConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkConfig]
    }
    
    @scala.inline
    implicit class MarkConfigMutableBuilder[Self <: MarkConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Align | SignalRef): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAngle(value: Double | SignalRef): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setAria(value: Boolean | SignalRef): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaRole(value: String | SignalRef): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaRoleDescription(value: String | SignalRef): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaRoleDescriptionUndefined: Self = StObject.set(x, "ariaRoleDescription", js.undefined)
      
      @scala.inline
      def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setAspect(value: Boolean | SignalRef): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
      
      @scala.inline
      def setBaseline(value: TextBaseline | SignalRef): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      @scala.inline
      def setBlend(value: Blend): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlendNull: Self = StObject.set(x, "blend", null)
      
      @scala.inline
      def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
      
      @scala.inline
      def setCornerRadius(value: Double | SignalRef): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusBottomLeft(value: Double | SignalRef): Self = StObject.set(x, "cornerRadiusBottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusBottomLeftUndefined: Self = StObject.set(x, "cornerRadiusBottomLeft", js.undefined)
      
      @scala.inline
      def setCornerRadiusBottomRight(value: Double | SignalRef): Self = StObject.set(x, "cornerRadiusBottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusBottomRightUndefined: Self = StObject.set(x, "cornerRadiusBottomRight", js.undefined)
      
      @scala.inline
      def setCornerRadiusTopLeft(value: Double | SignalRef): Self = StObject.set(x, "cornerRadiusTopLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusTopLeftUndefined: Self = StObject.set(x, "cornerRadiusTopLeft", js.undefined)
      
      @scala.inline
      def setCornerRadiusTopRight(value: Double | SignalRef): Self = StObject.set(x, "cornerRadiusTopRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusTopRightUndefined: Self = StObject.set(x, "cornerRadiusTopRight", js.undefined)
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setCursor(value: Cursor | SignalRef): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDescription(value: String | SignalRef): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDir(value: TextDirection | SignalRef): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDx(value: Double | SignalRef): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(value: Double | SignalRef): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      @scala.inline
      def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setEndAngle(value: Double | SignalRef): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      @scala.inline
      def setFill(value: Color | Gradient | SignalRef): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillNull: Self = StObject.set(x, "fill", null)
      
      @scala.inline
      def setFillOpacity(value: Double | SignalRef): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: String | SignalRef): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double | SignalRef): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | SignalRef): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | SignalRef): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | SignalRef): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHref(value: URI | SignalRef): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setInnerRadius(value: Double | SignalRef): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      @scala.inline
      def setInterpolate(value: Interpolate | SignalRef): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      @scala.inline
      def setLimit(value: Double | SignalRef): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLineBreak(value: String | SignalRef): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      @scala.inline
      def setLineHeight(value: Double | SignalRef): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double | SignalRef): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrient(value: Orientation | SignalRef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setOuterRadius(value: Double | SignalRef): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
      
      @scala.inline
      def setPadAngle(value: Double | SignalRef): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
      
      @scala.inline
      def setRadius(value: Double | SignalRef): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setShape(value: SymbolShape | String | SignalRef): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: Double | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSmooth(value: Boolean | SignalRef): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      @scala.inline
      def setStartAngle(value: Double | SignalRef): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      @scala.inline
      def setStroke(value: Color | Gradient | SignalRef): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeCap(value: StrokeCap | SignalRef): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
      
      @scala.inline
      def setStrokeDash(value: js.Array[Double] | SignalRef): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashOffset(value: Double | SignalRef): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
      
      @scala.inline
      def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      @scala.inline
      def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value :_*))
      
      @scala.inline
      def setStrokeJoin(value: StrokeJoin | SignalRef): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
      
      @scala.inline
      def setStrokeMiterLimit(value: Double | SignalRef): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterLimitUndefined: Self = StObject.set(x, "strokeMiterLimit", js.undefined)
      
      @scala.inline
      def setStrokeNull: Self = StObject.set(x, "stroke", null)
      
      @scala.inline
      def setStrokeOffset(value: Double | SignalRef): Self = StObject.set(x, "strokeOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOffsetUndefined: Self = StObject.set(x, "strokeOffset", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: Double | SignalRef): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double | SignalRef): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setTension(value: Double | SignalRef): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
      
      @scala.inline
      def setText(value: Text | SignalRef): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
      
      @scala.inline
      def setTheta(value: Double | SignalRef): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      @scala.inline
      def setTooltip(value: String | SignalRef): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setUrl(value: URI | SignalRef): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | SignalRef): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    
    @scala.inline
    def arc: typings.vegaTypings.vegaTypingsStrings.arc = "arc".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.arc]
    
    @scala.inline
    def area: typings.vegaTypings.vegaTypingsStrings.area = "area".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.area]
    
    @scala.inline
    def group: typings.vegaTypings.vegaTypingsStrings.group = "group".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.group]
    
    @scala.inline
    def image: typings.vegaTypings.vegaTypingsStrings.image = "image".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.image]
    
    @scala.inline
    def line: typings.vegaTypings.vegaTypingsStrings.line = "line".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.line]
    
    @scala.inline
    def mark: typings.vegaTypings.vegaTypingsStrings.mark = "mark".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mark]
    
    @scala.inline
    def path: typings.vegaTypings.vegaTypingsStrings.path = "path".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.path]
    
    @scala.inline
    def rect: typings.vegaTypings.vegaTypingsStrings.rect = "rect".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.rect]
    
    @scala.inline
    def rule: typings.vegaTypings.vegaTypingsStrings.rule = "rule".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.rule]
    
    @scala.inline
    def shape: typings.vegaTypings.vegaTypingsStrings.shape = "shape".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.shape]
    
    @scala.inline
    def symbol: typings.vegaTypings.vegaTypingsStrings.symbol = "symbol".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.symbol]
    
    @scala.inline
    def text: typings.vegaTypings.vegaTypingsStrings.text = "text".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.text]
    
    @scala.inline
    def trail: typings.vegaTypings.vegaTypingsStrings.trail = "trail".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.trail]
  }
  
  /* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/projection.BaseProjection> */
  @js.native
  trait ProjectionConfig extends StObject {
    
    var center: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ] = js.native
    
    var clipAngle: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var clipExtent: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
      ] = js.native
    
    var coefficient: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var distance: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var extent: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
      ] = js.native
    
    var fit: js.UndefOr[
        (Exclude[
          js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]])
      ] = js.native
    
    var fraction: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var lobes: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var parallel: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var parallels: js.UndefOr[
        (Exclude[
          js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]])
      ] = js.native
    
    var pointRadius: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var precision: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var radius: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var ratio: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var reflectX: js.UndefOr[
        (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
      ] = js.native
    
    var reflectY: js.UndefOr[
        (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
      ] = js.native
    
    var rotate: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[
          js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
        ])
      ] = js.native
    
    var scale: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var size: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ] = js.native
    
    var spacing: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var tilt: js.UndefOr[
        (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ] = js.native
    
    var translate: js.UndefOr[
        (Exclude[
          js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ] = js.native
    
    var `type`: js.UndefOr[
        (Exclude[
          js.UndefOr[ProjectionType | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[ProjectionType | SignalRef]])
      ] = js.native
  }
  object ProjectionConfig {
    
    @scala.inline
    def apply(): ProjectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectionConfig]
    }
    
    @scala.inline
    implicit class ProjectionConfigMutableBuilder[Self <: ProjectionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(
        value: (Exclude[
              js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setClipAngle(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "clipAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipAngleUndefined: Self = StObject.set(x, "clipAngle", js.undefined)
      
      @scala.inline
      def setClipExtent(
        value: (Exclude[
              js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
      ): Self = StObject.set(x, "clipExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipExtentUndefined: Self = StObject.set(x, "clipExtent", js.undefined)
      
      @scala.inline
      def setCoefficient(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoefficientUndefined: Self = StObject.set(x, "coefficient", js.undefined)
      
      @scala.inline
      def setDistance(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setExtent(
        value: (Exclude[
              js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]])
      ): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setFit(
        value: (Exclude[
              js.UndefOr[Fit | js.Array[Fit] | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]])
      ): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setFitVarargs(value: GeoJsonFeature*): Self = StObject.set(x, "fit", js.Array(value :_*))
      
      @scala.inline
      def setFraction(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
      
      @scala.inline
      def setLobes(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "lobes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLobesUndefined: Self = StObject.set(x, "lobes", js.undefined)
      
      @scala.inline
      def setParallel(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setParallels(
        value: (Exclude[
              js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]])
      ): Self = StObject.set(x, "parallels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelsUndefined: Self = StObject.set(x, "parallels", js.undefined)
      
      @scala.inline
      def setParallelsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "parallels", js.Array(value :_*))
      
      @scala.inline
      def setPointRadius(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "pointRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointRadiusUndefined: Self = StObject.set(x, "pointRadius", js.undefined)
      
      @scala.inline
      def setPrecision(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setRadius(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRatio(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      @scala.inline
      def setReflectX(
        value: (Exclude[
              js.UndefOr[Boolean | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
      ): Self = StObject.set(x, "reflectX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReflectXUndefined: Self = StObject.set(x, "reflectX", js.undefined)
      
      @scala.inline
      def setReflectY(
        value: (Exclude[
              js.UndefOr[Boolean | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Boolean | SignalRef]])
      ): Self = StObject.set(x, "reflectY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReflectYUndefined: Self = StObject.set(x, "reflectY", js.undefined)
      
      @scala.inline
      def setRotate(
        value: (Exclude[
              js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[
              js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
            ])
      ): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setScale(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSize(
        value: (Exclude[
              js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpacing(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setTilt(
        value: (Exclude[
              js.UndefOr[Double | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
      ): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
      
      @scala.inline
      def setTranslate(
        value: (Exclude[
              js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]])
      ): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setType(
        value: (Exclude[
              js.UndefOr[ProjectionType | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[ProjectionType | SignalRef]])
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RangeConfig
    extends /* name */ StringDictionary[RangeScheme | (js.Array[Boolean | Double | String | SymbolShape])] {
    
    /**
      * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for categorical data.
      */
    var category: js.UndefOr[RangeScheme | js.Array[Color]] = js.native
    
    /**
      * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for diverging quantitative ramps.
      */
    var diverging: js.UndefOr[RangeScheme | js.Array[Color]] = js.native
    
    /**
      * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for quantitative heatmaps.
      */
    var heatmap: js.UndefOr[RangeScheme | js.Array[Color]] = js.native
    
    /**
      * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for rank-ordered data.
      */
    var ordinal: js.UndefOr[RangeScheme | js.Array[Color]] = js.native
    
    /**
      * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for sequential quantitative ramps.
      */
    var ramp: js.UndefOr[RangeScheme | js.Array[Color]] = js.native
    
    /**
      * Array of [symbol](https://vega.github.io/vega/docs/marks/symbol/) names or paths for the default shape palette.
      */
    var symbol: js.UndefOr[js.Array[SymbolShape]] = js.native
  }
  object RangeConfig {
    
    @scala.inline
    def apply(): RangeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeConfig]
    }
    
    @scala.inline
    implicit class RangeConfigMutableBuilder[Self <: RangeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setCategoryVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "category", js.Array(value :_*))
      
      @scala.inline
      def setDiverging(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "diverging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivergingUndefined: Self = StObject.set(x, "diverging", js.undefined)
      
      @scala.inline
      def setDivergingVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "diverging", js.Array(value :_*))
      
      @scala.inline
      def setHeatmap(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "heatmap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeatmapUndefined: Self = StObject.set(x, "heatmap", js.undefined)
      
      @scala.inline
      def setHeatmapVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "heatmap", js.Array(value :_*))
      
      @scala.inline
      def setOrdinal(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      @scala.inline
      def setOrdinalVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "ordinal", js.Array(value :_*))
      
      @scala.inline
      def setRamp(value: RangeScheme | js.Array[Color]): Self = StObject.set(x, "ramp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRampUndefined: Self = StObject.set(x, "ramp", js.undefined)
      
      @scala.inline
      def setRampVarargs(value: (Boolean | Color | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "ramp", js.Array(value :_*))
      
      @scala.inline
      def setSymbol(value: js.Array[SymbolShape]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setSymbolVarargs(value: SymbolShape*): Self = StObject.set(x, "symbol", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.butt
    - typings.vegaTypings.vegaTypingsStrings.round
    - typings.vegaTypings.vegaTypingsStrings.square
  */
  trait StrokeCap extends StObject
  object StrokeCap {
    
    @scala.inline
    def butt: typings.vegaTypings.vegaTypingsStrings.butt = "butt".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.butt]
    
    @scala.inline
    def round: typings.vegaTypings.vegaTypingsStrings.round = "round".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.round]
    
    @scala.inline
    def square: typings.vegaTypings.vegaTypingsStrings.square = "square".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.square]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.miter
    - typings.vegaTypings.vegaTypingsStrings.round
    - typings.vegaTypings.vegaTypingsStrings.bevel
  */
  trait StrokeJoin extends StObject
  object StrokeJoin {
    
    @scala.inline
    def bevel: typings.vegaTypings.vegaTypingsStrings.bevel = "bevel".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.bevel]
    
    @scala.inline
    def miter: typings.vegaTypings.vegaTypingsStrings.miter = "miter".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.miter]
    
    @scala.inline
    def round: typings.vegaTypings.vegaTypingsStrings.round = "round".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.round]
  }
  
  /* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/title.BaseTitle> */
  @js.native
  trait TitleConfig extends StObject {
    
    var align: js.UndefOr[
        (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ] = js.native
    
    var anchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
      ] = js.native
    
    var angle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ] = js.native
    
    var baseline: js.UndefOr[
        (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ] = js.native
    
    var color: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var dx: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var dy: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var font: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ] = js.native
    
    var fontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var fontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ] = js.native
    
    var fontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ] = js.native
    
    var frame: js.UndefOr[
        (Exclude[
          js.UndefOr[TitleFrame | StringValue], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[TitleFrame | StringValue]])
      ] = js.native
    
    var limit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var lineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var offset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var orient: js.UndefOr[
        (Exclude[
          js.UndefOr[TitleOrient | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[TitleOrient | SignalRef]])
      ] = js.native
    
    var subtitleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ] = js.native
    
    var subtitleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ] = js.native
    
    var subtitleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var subtitleFontStyle: js.UndefOr[
        (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ] = js.native
    
    var subtitleFontWeight: js.UndefOr[
        (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ] = js.native
    
    var subtitleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var subtitlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ] = js.native
    
    var zindex: js.UndefOr[
        (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
      ] = js.native
  }
  object TitleConfig {
    
    @scala.inline
    def apply(): TitleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleConfig]
    }
    
    @scala.inline
    implicit class TitleConfigMutableBuilder[Self <: TitleConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(
        value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
      ): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
      ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setAria(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setBaseline(
        value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
      ): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      @scala.inline
      def setColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDx(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      @scala.inline
      def setFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFrame(
        value: (Exclude[
              js.UndefOr[TitleFrame | StringValue], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[TitleFrame | StringValue]])
      ): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(
        value: (Exclude[
              js.UndefOr[TitleOrient | SignalRef], 
              ScaledValueRef[_] | NumericValueRef | ColorValueRef
            ]) | (KeepSignal[js.UndefOr[TitleOrient | SignalRef]])
      ): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setSubtitleColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
      ): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
      
      @scala.inline
      def setSubtitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
      ): Self = StObject.set(x, "subtitleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "subtitleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontSizeUndefined: Self = StObject.set(x, "subtitleFontSize", js.undefined)
      
      @scala.inline
      def setSubtitleFontStyle(
        value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
      ): Self = StObject.set(x, "subtitleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontStyleUndefined: Self = StObject.set(x, "subtitleFontStyle", js.undefined)
      
      @scala.inline
      def setSubtitleFontUndefined: Self = StObject.set(x, "subtitleFont", js.undefined)
      
      @scala.inline
      def setSubtitleFontWeight(
        value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
      ): Self = StObject.set(x, "subtitleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontWeightUndefined: Self = StObject.set(x, "subtitleFontWeight", js.undefined)
      
      @scala.inline
      def setSubtitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "subtitleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleLineHeightUndefined: Self = StObject.set(x, "subtitleLineHeight", js.undefined)
      
      @scala.inline
      def setSubtitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
      ): Self = StObject.set(x, "subtitlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitlePaddingUndefined: Self = StObject.set(x, "subtitlePadding", js.undefined)
      
      @scala.inline
      def setZindex(
        value: (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
}
