package typings.vegaTypings.configMod

import typings.std.Exclude
import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.ScaledValueRef
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
import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/axis.BaseAxis> */
@js.native
trait AxisConfig extends js.Object {
  
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
  implicit class AxisConfigOps[Self <: AxisConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAria(
      value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
    ): Self = this.set("aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    
    @scala.inline
    def setBandPosition(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("bandPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandPosition: Self = this.set("bandPosition", js.undefined)
    
    @scala.inline
    def setDescription(
      value: (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
    ): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDomain(
      value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
    ): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDomainCap(
      value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
    ): Self = this.set("domainCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainCap: Self = this.set("domainCap", js.undefined)
    
    @scala.inline
    def setDomainColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = this.set("domainColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainColor: Self = this.set("domainColor", js.undefined)
    
    @scala.inline
    def setDomainDashVarargs(value: Double*): Self = this.set("domainDash", js.Array(value :_*))
    
    @scala.inline
    def setDomainDash(
      value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
    ): Self = this.set("domainDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainDash: Self = this.set("domainDash", js.undefined)
    
    @scala.inline
    def setDomainDashOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("domainDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainDashOffset: Self = this.set("domainDashOffset", js.undefined)
    
    @scala.inline
    def setDomainOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("domainOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainOpacity: Self = this.set("domainOpacity", js.undefined)
    
    @scala.inline
    def setDomainWidth(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("domainWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainWidth: Self = this.set("domainWidth", js.undefined)
    
    @scala.inline
    def setGrid(
      value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
    ): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setGridCap(
      value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
    ): Self = this.set("gridCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridCap: Self = this.set("gridCap", js.undefined)
    
    @scala.inline
    def setGridColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = this.set("gridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridColor: Self = this.set("gridColor", js.undefined)
    
    @scala.inline
    def setGridDashVarargs(value: Double*): Self = this.set("gridDash", js.Array(value :_*))
    
    @scala.inline
    def setGridDash(
      value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
    ): Self = this.set("gridDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridDash: Self = this.set("gridDash", js.undefined)
    
    @scala.inline
    def setGridDashOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("gridDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridDashOffset: Self = this.set("gridDashOffset", js.undefined)
    
    @scala.inline
    def setGridOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("gridOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridOpacity: Self = this.set("gridOpacity", js.undefined)
    
    @scala.inline
    def setGridWidth(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("gridWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridWidth: Self = this.set("gridWidth", js.undefined)
    
    @scala.inline
    def setLabelAlign(
      value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
    ): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    
    @scala.inline
    def setLabelAngle(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("labelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAngle: Self = this.set("labelAngle", js.undefined)
    
    @scala.inline
    def setLabelBaseline(
      value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
    ): Self = this.set("labelBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBaseline: Self = this.set("labelBaseline", js.undefined)
    
    @scala.inline
    def setLabelBound(
      value: (Exclude[
          js.UndefOr[Double | Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
    ): Self = this.set("labelBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBound: Self = this.set("labelBound", js.undefined)
    
    @scala.inline
    def setLabelColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
    @scala.inline
    def setLabelFlush(
      value: (Exclude[
          js.UndefOr[Double | Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | Boolean | SignalRef]])
    ): Self = this.set("labelFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFlush: Self = this.set("labelFlush", js.undefined)
    
    @scala.inline
    def setLabelFlushOffset(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("labelFlushOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFlushOffset: Self = this.set("labelFlushOffset", js.undefined)
    
    @scala.inline
    def setLabelFont(
      value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
    ): Self = this.set("labelFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFont: Self = this.set("labelFont", js.undefined)
    
    @scala.inline
    def setLabelFontSize(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("labelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFontSize: Self = this.set("labelFontSize", js.undefined)
    
    @scala.inline
    def setLabelFontStyle(
      value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
    ): Self = this.set("labelFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFontStyle: Self = this.set("labelFontStyle", js.undefined)
    
    @scala.inline
    def setLabelFontWeight(
      value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
    ): Self = this.set("labelFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFontWeight: Self = this.set("labelFontWeight", js.undefined)
    
    @scala.inline
    def setLabelLimit(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("labelLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLimit: Self = this.set("labelLimit", js.undefined)
    
    @scala.inline
    def setLabelLineHeight(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("labelLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLineHeight: Self = this.set("labelLineHeight", js.undefined)
    
    @scala.inline
    def setLabelOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("labelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOffset: Self = this.set("labelOffset", js.undefined)
    
    @scala.inline
    def setLabelOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("labelOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOpacity: Self = this.set("labelOpacity", js.undefined)
    
    @scala.inline
    def setLabelOverlap(
      value: (Exclude[
          js.UndefOr[LabelOverlap | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[LabelOverlap | SignalRef]])
    ): Self = this.set("labelOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOverlap: Self = this.set("labelOverlap", js.undefined)
    
    @scala.inline
    def setLabelPadding(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("labelPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPadding: Self = this.set("labelPadding", js.undefined)
    
    @scala.inline
    def setLabelSeparation(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("labelSeparation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSeparation: Self = this.set("labelSeparation", js.undefined)
    
    @scala.inline
    def setLabels(
      value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMaxExtent(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("maxExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxExtent: Self = this.set("maxExtent", js.undefined)
    
    @scala.inline
    def setMinExtent(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("minExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinExtent: Self = this.set("minExtent", js.undefined)
    
    @scala.inline
    def setTickBand(
      value: (Exclude[
          js.UndefOr[center | extent | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[center | extent | SignalRef]])
    ): Self = this.set("tickBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickBand: Self = this.set("tickBand", js.undefined)
    
    @scala.inline
    def setTickCap(
      value: (Exclude[js.UndefOr[StrokeCapValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StrokeCapValue]]
    ): Self = this.set("tickCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickCap: Self = this.set("tickCap", js.undefined)
    
    @scala.inline
    def setTickColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = this.set("tickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickColor: Self = this.set("tickColor", js.undefined)
    
    @scala.inline
    def setTickDashVarargs(value: Double*): Self = this.set("tickDash", js.Array(value :_*))
    
    @scala.inline
    def setTickDash(
      value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
    ): Self = this.set("tickDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickDash: Self = this.set("tickDash", js.undefined)
    
    @scala.inline
    def setTickDashOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("tickDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickDashOffset: Self = this.set("tickDashOffset", js.undefined)
    
    @scala.inline
    def setTickExtra(
      value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
    ): Self = this.set("tickExtra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickExtra: Self = this.set("tickExtra", js.undefined)
    
    @scala.inline
    def setTickOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("tickOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickOffset: Self = this.set("tickOffset", js.undefined)
    
    @scala.inline
    def setTickOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("tickOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickOpacity: Self = this.set("tickOpacity", js.undefined)
    
    @scala.inline
    def setTickRound(
      value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
    ): Self = this.set("tickRound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickRound: Self = this.set("tickRound", js.undefined)
    
    @scala.inline
    def setTickSize(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickSize: Self = this.set("tickSize", js.undefined)
    
    @scala.inline
    def setTickWidth(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("tickWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickWidth: Self = this.set("tickWidth", js.undefined)
    
    @scala.inline
    def setTicks(
      value: (Exclude[js.UndefOr[BooleanValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[BooleanValue]]
    ): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setTitleAlign(
      value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
    ): Self = this.set("titleAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAlign: Self = this.set("titleAlign", js.undefined)
    
    @scala.inline
    def setTitleAnchor(
      value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
    ): Self = this.set("titleAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAnchor: Self = this.set("titleAnchor", js.undefined)
    
    @scala.inline
    def setTitleAngle(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("titleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAngle: Self = this.set("titleAngle", js.undefined)
    
    @scala.inline
    def setTitleBaseline(
      value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
    ): Self = this.set("titleBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleBaseline: Self = this.set("titleBaseline", js.undefined)
    
    @scala.inline
    def setTitleColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
    
    @scala.inline
    def setTitleFont(
      value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
    ): Self = this.set("titleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFont: Self = this.set("titleFont", js.undefined)
    
    @scala.inline
    def setTitleFontSize(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontSize: Self = this.set("titleFontSize", js.undefined)
    
    @scala.inline
    def setTitleFontStyle(
      value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
    ): Self = this.set("titleFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontStyle: Self = this.set("titleFontStyle", js.undefined)
    
    @scala.inline
    def setTitleFontWeight(
      value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
    ): Self = this.set("titleFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontWeight: Self = this.set("titleFontWeight", js.undefined)
    
    @scala.inline
    def setTitleLimit(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("titleLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLimit: Self = this.set("titleLimit", js.undefined)
    
    @scala.inline
    def setTitleLineHeight(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("titleLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLineHeight: Self = this.set("titleLineHeight", js.undefined)
    
    @scala.inline
    def setTitleOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("titleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleOpacity: Self = this.set("titleOpacity", js.undefined)
    
    @scala.inline
    def setTitlePadding(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("titlePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePadding: Self = this.set("titlePadding", js.undefined)
    
    @scala.inline
    def setTitleX(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("titleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleX: Self = this.set("titleX", js.undefined)
    
    @scala.inline
    def setTitleY(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("titleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleY: Self = this.set("titleY", js.undefined)
    
    @scala.inline
    def setTranslate(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setZindex(
      value: (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
    ): Self = this.set("zindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZindex: Self = this.set("zindex", js.undefined)
  }
}
