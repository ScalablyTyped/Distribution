package typings.vegaTypings.typesSpecConfigMod

import typings.std.Exclude
import typings.vegaTypings.typesSpecAxisMod.LabelOverlap
import typings.vegaTypings.typesSpecEncodeMod.ColorValueRef
import typings.vegaTypings.typesSpecEncodeMod.NumericValueRef
import typings.vegaTypings.typesSpecEncodeMod.ScaledValueRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecValuesMod.AlignValue
import typings.vegaTypings.typesSpecValuesMod.AnchorValue
import typings.vegaTypings.typesSpecValuesMod.BooleanValue
import typings.vegaTypings.typesSpecValuesMod.ColorValue
import typings.vegaTypings.typesSpecValuesMod.DashArrayValue
import typings.vegaTypings.typesSpecValuesMod.FontStyleValue
import typings.vegaTypings.typesSpecValuesMod.FontWeightValue
import typings.vegaTypings.typesSpecValuesMod.NumberValue
import typings.vegaTypings.typesSpecValuesMod.StringValue
import typings.vegaTypings.typesSpecValuesMod.StrokeCapValue
import typings.vegaTypings.typesSpecValuesMod.TextBaselineValue
import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    
    inline def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
    
    inline def setDomainDash(
      value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
    ): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
    
    inline def setDomainDashOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
    
    inline def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
    
    inline def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
    
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
    
    inline def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
    
    inline def setGridDash(
      value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
    ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
    
    inline def setGridDashOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
    
    inline def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
    
    inline def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
    
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
    
    inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
    
    inline def setTickDash(
      value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
    ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
    
    inline def setTickDashOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
    
    inline def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
    
    inline def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
    
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
