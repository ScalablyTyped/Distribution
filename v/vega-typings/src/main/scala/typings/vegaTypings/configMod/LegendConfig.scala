package typings.vegaTypings.configMod

import typings.std.Exclude
import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.axisMod.TickCount
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.ScaledValueRef
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/legend.BaseLegend> */
@js.native
trait LegendConfig extends js.Object {
  
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
  implicit class LegendConfigOps[Self <: LegendConfig] (val x: Self) extends AnyVal {
    
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
    def setClipHeight(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("clipHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipHeight: Self = this.set("clipHeight", js.undefined)
    
    @scala.inline
    def setColumnPadding(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("columnPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnPadding: Self = this.set("columnPadding", js.undefined)
    
    @scala.inline
    def setColumns(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCornerRadius(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setDescription(
      value: (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[String]]
    ): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFillColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setGradientDirection(value: Orientation): Self = this.set("gradientDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientDirection: Self = this.set("gradientDirection", js.undefined)
    
    @scala.inline
    def setGradientLabelLimit(value: Double | SignalRef): Self = this.set("gradientLabelLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientLabelLimit: Self = this.set("gradientLabelLimit", js.undefined)
    
    @scala.inline
    def setGradientLabelOffset(value: Double | SignalRef): Self = this.set("gradientLabelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientLabelOffset: Self = this.set("gradientLabelOffset", js.undefined)
    
    @scala.inline
    def setGradientLength(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("gradientLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientLength: Self = this.set("gradientLength", js.undefined)
    
    @scala.inline
    def setGradientOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("gradientOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientOpacity: Self = this.set("gradientOpacity", js.undefined)
    
    @scala.inline
    def setGradientStrokeColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = this.set("gradientStrokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientStrokeColor: Self = this.set("gradientStrokeColor", js.undefined)
    
    @scala.inline
    def setGradientStrokeWidth(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("gradientStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientStrokeWidth: Self = this.set("gradientStrokeWidth", js.undefined)
    
    @scala.inline
    def setGradientThickness(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("gradientThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientThickness: Self = this.set("gradientThickness", js.undefined)
    
    @scala.inline
    def setGridAlign(
      value: (Exclude[
          js.UndefOr[LayoutAlign | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[LayoutAlign | SignalRef]])
    ): Self = this.set("gridAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAlign: Self = this.set("gridAlign", js.undefined)
    
    @scala.inline
    def setLabelAlign(
      value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
    ): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    
    @scala.inline
    def setLabelBaseline(
      value: (Exclude[js.UndefOr[TextBaselineValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TextBaselineValue]]
    ): Self = this.set("labelBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBaseline: Self = this.set("labelBaseline", js.undefined)
    
    @scala.inline
    def setLabelColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
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
    def setLayout(value: LegendLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLegendX(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("legendX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendX: Self = this.set("legendX", js.undefined)
    
    @scala.inline
    def setLegendY(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("legendY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendY: Self = this.set("legendY", js.undefined)
    
    @scala.inline
    def setOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrient(
      value: (Exclude[
          js.UndefOr[LegendOrient | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[LegendOrient | SignalRef]])
    ): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    
    @scala.inline
    def setPadding(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRowPadding(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[Double | SignalRef]])
    ): Self = this.set("rowPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowPadding: Self = this.set("rowPadding", js.undefined)
    
    @scala.inline
    def setStrokeColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeDashVarargs(value: Double*): Self = this.set("strokeDash", js.Array(value :_*))
    
    @scala.inline
    def setStrokeDash(value: js.Array[Double] | SignalRef): Self = this.set("strokeDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDash: Self = this.set("strokeDash", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double | SignalRef): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setSymbolBaseFillColor(value: Color | SignalRef): Self = this.set("symbolBaseFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolBaseFillColor: Self = this.set("symbolBaseFillColor", js.undefined)
    
    @scala.inline
    def setSymbolBaseFillColorNull: Self = this.set("symbolBaseFillColor", null)
    
    @scala.inline
    def setSymbolBaseStrokeColor(value: Color | SignalRef): Self = this.set("symbolBaseStrokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolBaseStrokeColor: Self = this.set("symbolBaseStrokeColor", js.undefined)
    
    @scala.inline
    def setSymbolBaseStrokeColorNull: Self = this.set("symbolBaseStrokeColor", null)
    
    @scala.inline
    def setSymbolDashVarargs(value: Double*): Self = this.set("symbolDash", js.Array(value :_*))
    
    @scala.inline
    def setSymbolDash(
      value: (Exclude[js.UndefOr[DashArrayValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[DashArrayValue]]
    ): Self = this.set("symbolDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolDash: Self = this.set("symbolDash", js.undefined)
    
    @scala.inline
    def setSymbolDashOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("symbolDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolDashOffset: Self = this.set("symbolDashOffset", js.undefined)
    
    @scala.inline
    def setSymbolDirection(value: Orientation): Self = this.set("symbolDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolDirection: Self = this.set("symbolDirection", js.undefined)
    
    @scala.inline
    def setSymbolFillColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = this.set("symbolFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolFillColor: Self = this.set("symbolFillColor", js.undefined)
    
    @scala.inline
    def setSymbolLimit(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("symbolLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolLimit: Self = this.set("symbolLimit", js.undefined)
    
    @scala.inline
    def setSymbolOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("symbolOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolOffset: Self = this.set("symbolOffset", js.undefined)
    
    @scala.inline
    def setSymbolOpacity(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("symbolOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolOpacity: Self = this.set("symbolOpacity", js.undefined)
    
    @scala.inline
    def setSymbolSize(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
    
    @scala.inline
    def setSymbolStrokeColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = this.set("symbolStrokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolStrokeColor: Self = this.set("symbolStrokeColor", js.undefined)
    
    @scala.inline
    def setSymbolStrokeWidth(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("symbolStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolStrokeWidth: Self = this.set("symbolStrokeWidth", js.undefined)
    
    @scala.inline
    def setSymbolType(
      value: (Exclude[
          js.UndefOr[SymbolShapeValue | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[SymbolShapeValue | SignalRef]])
    ): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolType: Self = this.set("symbolType", js.undefined)
    
    @scala.inline
    def setTickCount(
      value: (Exclude[js.UndefOr[TickCount], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[TickCount]]
    ): Self = this.set("tickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickCount: Self = this.set("tickCount", js.undefined)
    
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
    def setTitleOrient(
      value: (Exclude[js.UndefOr[OrientValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[OrientValue]]
    ): Self = this.set("titleOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleOrient: Self = this.set("titleOrient", js.undefined)
    
    @scala.inline
    def setTitlePadding(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = this.set("titlePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePadding: Self = this.set("titlePadding", js.undefined)
    
    @scala.inline
    def setZindex(
      value: (Exclude[js.UndefOr[Double], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
    ): Self = this.set("zindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZindex: Self = this.set("zindex", js.undefined)
  }
}
