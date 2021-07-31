package typings.vegaLite.srcMarkMod

import typings.std.Exclude
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.vegaLiteStrings.filter
import typings.vegaLite.vegaLiteStrings.height
import typings.vegaLite.vegaLiteStrings.transparent
import typings.vegaLite.vegaLiteStrings.width
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.configMod.Cursor
import typings.vegaTypings.configMod.StrokeCap
import typings.vegaTypings.configMod.StrokeJoin
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
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent vega-lite.vega-lite/build/src/mark.GenericMarkDef<M> */
/* Inlined parent std.Omit<vega-lite.vega-lite/build/src/mark.MarkConfig<ES> & vega-lite.vega-lite/build/src/mark.AreaConfig<ES> & vega-lite.vega-lite/build/src/mark.BarConfig<ES> & // always extends RectConfig
vega-lite.vega-lite/build/src/mark.LineConfig<ES> & vega-lite.vega-lite/build/src/mark.TickConfig<ES>, 'startAngle' | 'endAngle'> */
/* Inlined parent vega-lite.vega-lite/build/src/mark.MarkDefMixins<ES> */
trait MarkDef[M /* <: String | Mark */, ES /* <: ExprRef | SignalRef */] extends StObject {
  
  var align: js.UndefOr[Align | ES] = js.undefined
  
  var angle: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var aria: js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var ariaRole: js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var ariaRoleDescription: js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var aspect: js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var bandSize: js.UndefOr[Double] = js.undefined
  
  var baseline: js.UndefOr[TextBaseline | ES] = js.undefined
  
  var binSpacing: js.UndefOr[Double] = js.undefined
  
  var blend: js.UndefOr[
    (Exclude[js.UndefOr[Blend], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
  ] = js.undefined
  
  /**
    * Whether a mark be clipped to the enclosing group’s width and height.
    */
  var clip: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[Color | Gradient | ES] = js.undefined
  
  var continuousBandSize: js.UndefOr[Double] = js.undefined
  
  var cornerRadius: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var cornerRadiusBottomLeft: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var cornerRadiusBottomRight: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var cornerRadiusEnd: js.UndefOr[Double | ES] = js.undefined
  
  var cornerRadiusTopLeft: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var cornerRadiusTopRight: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var cursor: js.UndefOr[
    (Exclude[
      js.UndefOr[Cursor | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var description: js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var dir: js.UndefOr[
    (Exclude[
      js.UndefOr[TextDirection | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var discreteBandSize: js.UndefOr[Double] = js.undefined
  
  var dx: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var dy: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var ellipsis: js.UndefOr[
    (Exclude[js.UndefOr[String], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
  ] = js.undefined
  
  /**
    * @hidden
    */
  var endAngle: js.UndefOr[Double | ES] = js.undefined
  
  var fill: js.UndefOr[Color | Gradient | Null | ES] = js.undefined
  
  var fillOpacity: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var filled: js.UndefOr[Boolean] = js.undefined
  
  var font: js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var fontSize: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var fontStyle: js.UndefOr[
    (Exclude[
      js.UndefOr[FontStyle | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var fontWeight: js.UndefOr[
    (Exclude[
      js.UndefOr[FontWeight | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var height: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var href: js.UndefOr[
    (Exclude[
      js.UndefOr[URI | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var innerRadius: js.UndefOr[Double | ES] = js.undefined
  
  var interpolate: js.UndefOr[
    (Exclude[
      js.UndefOr[Interpolate | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var invalid: js.UndefOr[filter | Hide | Null] = js.undefined
  
  var limit: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var line: js.UndefOr[Boolean | OverlayMarkDef[ES]] = js.undefined
  
  var lineBreak: js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var lineHeight: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var opacity: js.UndefOr[Double | ES] = js.undefined
  
  var order: js.UndefOr[Null | Boolean] = js.undefined
  
  var orient: js.UndefOr[Orientation] = js.undefined
  
  var outerRadius: js.UndefOr[Double | ES] = js.undefined
  
  var padAngle: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var point: js.UndefOr[Boolean | OverlayMarkDef[ES] | transparent] = js.undefined
  
  var radius: js.UndefOr[Double | ES] = js.undefined
  
  var radius2: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for radius2.
    */
  var radius2Offset: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for radius.
    */
  var radiusOffset: js.UndefOr[Double | ES] = js.undefined
  
  var shape: js.UndefOr[
    (Exclude[
      js.UndefOr[SymbolShape | String | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var size: js.UndefOr[Double | ES] = js.undefined
  
  var smooth: js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  /**
    * @hidden
    */
  var startAngle: js.UndefOr[Double | ES] = js.undefined
  
  var stroke: js.UndefOr[Color | Gradient | Null | ES] = js.undefined
  
  var strokeCap: js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeCap | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeDash: js.UndefOr[
    (Exclude[
      js.UndefOr[js.Array[Double] | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeDashOffset: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeJoin: js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeJoin | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeMiterLimit: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeOffset: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeOpacity: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var strokeWidth: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  /**
    * A string or array of strings indicating the name of custom styles to apply to the mark. A style is a named collection of mark property defaults defined within the [style configuration](https://vega.github.io/vega-lite/docs/mark.html#style-config). If style is an array, later styles will override earlier styles. Any [mark properties](https://vega.github.io/vega-lite/docs/encoding.html#mark-prop) explicitly defined within the `encoding` will override a style default.
    *
    * __Default value:__ The mark's name. For example, a bar mark will have style `"bar"` by default.
    * __Note:__ Any specified style will augment the default style. For example, a bar mark with `"style": "foo"` will receive from `config.style.bar` and `config.style.foo` (the specified style `"foo"` has higher precedence).
    */
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var tension: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var text: js.UndefOr[
    (Exclude[
      js.UndefOr[Text | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var theta: js.UndefOr[Double | ES] = js.undefined
  
  var theta2: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for theta2.
    */
  var theta2Offset: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for theta.
    */
  var thetaOffset: js.UndefOr[Double | ES] = js.undefined
  
  var thickness: js.UndefOr[Double | SignalRef] = js.undefined
  
  var timeUnitBand: js.UndefOr[Double] = js.undefined
  
  var timeUnitBandPosition: js.UndefOr[Double] = js.undefined
  
  var tooltip: js.UndefOr[Double | String | Boolean | TooltipContent | ES | Null] = js.undefined
  
  /**
    * The mark type. This could a primitive mark type
    * (one of `"bar"`, `"circle"`, `"square"`, `"tick"`, `"line"`,
    * `"area"`, `"point"`, `"geoshape"`, `"rule"`, and `"text"`)
    * or a composite mark type (`"boxplot"`, `"errorband"`, `"errorbar"`).
    */
  var `type`: M
  
  var url: js.UndefOr[
    (Exclude[
      js.UndefOr[URI | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var width: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.undefined
  
  var x: js.UndefOr[Double | width | ES] = js.undefined
  
  var x2: js.UndefOr[Double | width | ES] = js.undefined
  
  /**
    * Offset for x2-position.
    */
  var x2Offset: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for x-position.
    */
  var xOffset: js.UndefOr[Double | ES] = js.undefined
  
  var y: js.UndefOr[Double | height | ES] = js.undefined
  
  var y2: js.UndefOr[Double | height | ES] = js.undefined
  
  /**
    * Offset for y2-position.
    */
  var y2Offset: js.UndefOr[Double | ES] = js.undefined
  
  /**
    * Offset for y-position.
    */
  var yOffset: js.UndefOr[Double | ES] = js.undefined
}
object MarkDef {
  
  @scala.inline
  def apply[M /* <: String | Mark */, ES /* <: ExprRef | SignalRef */](`type`: M): MarkDef[M, ES] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkDef[M, ES]]
  }
  
  @scala.inline
  implicit class MarkDefMutableBuilder[Self <: MarkDef[?, ?], M /* <: String | Mark */, ES /* <: ExprRef | SignalRef */] (val x: Self & (MarkDef[M, ES])) extends AnyVal {
    
    @scala.inline
    def setAlign(value: Align | ES): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAngle(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setAria(
      value: (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRole(
      value: (Exclude[
          js.UndefOr[String | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRoleDescription(
      value: (Exclude[
          js.UndefOr[String | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRoleDescriptionUndefined: Self = StObject.set(x, "ariaRoleDescription", js.undefined)
    
    @scala.inline
    def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
    
    @scala.inline
    def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    @scala.inline
    def setAspect(
      value: (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    @scala.inline
    def setBandSize(value: Double): Self = StObject.set(x, "bandSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandSizeUndefined: Self = StObject.set(x, "bandSize", js.undefined)
    
    @scala.inline
    def setBaseline(value: TextBaseline | ES): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    @scala.inline
    def setBinSpacing(value: Double): Self = StObject.set(x, "binSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinSpacingUndefined: Self = StObject.set(x, "binSpacing", js.undefined)
    
    @scala.inline
    def setBlend(value: (Exclude[js.UndefOr[Blend], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendNull: Self = StObject.set(x, "blend", null)
    
    @scala.inline
    def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
    
    @scala.inline
    def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setColor(value: Color | Gradient | ES): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContinuousBandSize(value: Double): Self = StObject.set(x, "continuousBandSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousBandSizeUndefined: Self = StObject.set(x, "continuousBandSize", js.undefined)
    
    @scala.inline
    def setCornerRadius(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusBottomLeft(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cornerRadiusBottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusBottomLeftUndefined: Self = StObject.set(x, "cornerRadiusBottomLeft", js.undefined)
    
    @scala.inline
    def setCornerRadiusBottomRight(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cornerRadiusBottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusBottomRightUndefined: Self = StObject.set(x, "cornerRadiusBottomRight", js.undefined)
    
    @scala.inline
    def setCornerRadiusEnd(value: Double | ES): Self = StObject.set(x, "cornerRadiusEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusEndUndefined: Self = StObject.set(x, "cornerRadiusEnd", js.undefined)
    
    @scala.inline
    def setCornerRadiusTopLeft(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cornerRadiusTopLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusTopLeftUndefined: Self = StObject.set(x, "cornerRadiusTopLeft", js.undefined)
    
    @scala.inline
    def setCornerRadiusTopRight(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cornerRadiusTopRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusTopRightUndefined: Self = StObject.set(x, "cornerRadiusTopRight", js.undefined)
    
    @scala.inline
    def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    @scala.inline
    def setCursor(
      value: (Exclude[
          js.UndefOr[Cursor | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDescription(
      value: (Exclude[
          js.UndefOr[String | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDir(
      value: (Exclude[
          js.UndefOr[TextDirection | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDiscreteBandSize(value: Double): Self = StObject.set(x, "discreteBandSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscreteBandSizeUndefined: Self = StObject.set(x, "discreteBandSize", js.undefined)
    
    @scala.inline
    def setDx(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDy(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setEllipsis(
      value: (Exclude[js.UndefOr[String], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
    ): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double | ES): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setFill(value: Color | Gradient | ES): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillNull: Self = StObject.set(x, "fill", null)
    
    @scala.inline
    def setFillOpacity(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
    
    @scala.inline
    def setFont(
      value: (Exclude[
          js.UndefOr[String | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(
      value: (Exclude[
          js.UndefOr[FontStyle | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFontWeight(
      value: (Exclude[
          js.UndefOr[FontWeight | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setHeight(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHref(
      value: (Exclude[
          js.UndefOr[URI | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double | ES): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setInterpolate(
      value: (Exclude[
          js.UndefOr[Interpolate | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    @scala.inline
    def setInvalid(value: filter | Hide): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidNull: Self = StObject.set(x, "invalid", null)
    
    @scala.inline
    def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    @scala.inline
    def setLimit(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLine(value: Boolean | OverlayMarkDef[ES]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineBreak(
      value: (Exclude[
          js.UndefOr[String | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
    
    @scala.inline
    def setLineHeight(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | ES): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNull: Self = StObject.set(x, "order", null)
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrient(value: Orientation): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    @scala.inline
    def setOuterRadius(value: Double | ES): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    @scala.inline
    def setPadAngle(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
    
    @scala.inline
    def setPoint(value: Boolean | OverlayMarkDef[ES] | transparent): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | ES): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius2(value: Double | ES): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius2Offset(value: Double | ES): Self = StObject.set(x, "radius2Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius2OffsetUndefined: Self = StObject.set(x, "radius2Offset", js.undefined)
    
    @scala.inline
    def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
    
    @scala.inline
    def setRadiusOffset(value: Double | ES): Self = StObject.set(x, "radiusOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusOffsetUndefined: Self = StObject.set(x, "radiusOffset", js.undefined)
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setShape(
      value: (Exclude[
          js.UndefOr[SymbolShape | String | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSize(value: Double | ES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSmooth(
      value: (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double | ES): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setStroke(value: Color | Gradient | ES): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCap(
      value: (Exclude[
          js.UndefOr[StrokeCap | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    @scala.inline
    def setStrokeDash(
      value: (Exclude[
          js.UndefOr[js.Array[Double] | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashOffset(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
    
    @scala.inline
    def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
    
    @scala.inline
    def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value :_*))
    
    @scala.inline
    def setStrokeJoin(
      value: (Exclude[
          js.UndefOr[StrokeJoin | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterLimit(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterLimitUndefined: Self = StObject.set(x, "strokeMiterLimit", js.undefined)
    
    @scala.inline
    def setStrokeNull: Self = StObject.set(x, "stroke", null)
    
    @scala.inline
    def setStrokeOffset(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOffsetUndefined: Self = StObject.set(x, "strokeOffset", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
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
    def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
    
    @scala.inline
    def setTension(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    
    @scala.inline
    def setText(
      value: (Exclude[
          js.UndefOr[Text | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    
    @scala.inline
    def setTheta(value: Double | ES): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheta2(value: Double | ES): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheta2Offset(value: Double | ES): Self = StObject.set(x, "theta2Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheta2OffsetUndefined: Self = StObject.set(x, "theta2Offset", js.undefined)
    
    @scala.inline
    def setTheta2Undefined: Self = StObject.set(x, "theta2", js.undefined)
    
    @scala.inline
    def setThetaOffset(value: Double | ES): Self = StObject.set(x, "thetaOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaOffsetUndefined: Self = StObject.set(x, "thetaOffset", js.undefined)
    
    @scala.inline
    def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    
    @scala.inline
    def setThickness(value: Double | SignalRef): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setTimeUnitBand(value: Double): Self = StObject.set(x, "timeUnitBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitBandPosition(value: Double): Self = StObject.set(x, "timeUnitBandPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitBandPositionUndefined: Self = StObject.set(x, "timeUnitBandPosition", js.undefined)
    
    @scala.inline
    def setTimeUnitBandUndefined: Self = StObject.set(x, "timeUnitBand", js.undefined)
    
    @scala.inline
    def setTooltip(value: Double | String | Boolean | TooltipContent | ES): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipNull: Self = StObject.set(x, "tooltip", null)
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setType(value: M): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: (Exclude[
          js.UndefOr[URI | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWidth(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double | width | ES): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double | width | ES): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Offset(value: Double | ES): Self = StObject.set(x, "x2Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2OffsetUndefined: Self = StObject.set(x, "x2Offset", js.undefined)
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setXOffset(value: Double | ES): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double | height | ES): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double | height | ES): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Offset(value: Double | ES): Self = StObject.set(x, "y2Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2OffsetUndefined: Self = StObject.set(x, "y2Offset", js.undefined)
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    @scala.inline
    def setYOffset(value: Double | ES): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
