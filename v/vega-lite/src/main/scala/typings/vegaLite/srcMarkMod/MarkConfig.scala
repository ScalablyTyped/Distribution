package typings.vegaLite.srcMarkMod

import typings.std.Exclude
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.vegaLiteStrings.filter
import typings.vegaLite.vegaLiteStrings.height
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent vega-lite.vega-lite/build/src/mark.VLOnlyMarkConfig<ES> */
/* Inlined parent vega-lite.vega-lite/build/src/vega.schema.MapExcludeValueRefAndReplaceSignalWith<std.Omit<vega.vega.MarkConfig, 'tooltip' | 'fill' | 'stroke'>, ES> */
@js.native
trait MarkConfig[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  /**
    * The horizontal alignment of the text or ranged marks (area, bar, image, rect, rule). One of `"left"`, `"right"`, `"center"`.
    *
    * __Note:__ Expression reference is *not* supported for range marks.
    */
  var align: js.UndefOr[Align | ES] = js.native
  
  var angle: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var aria: js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var ariaRole: js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var ariaRoleDescription: js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var aspect: js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  /**
    * For text marks, the vertical text baseline. One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, `"line-bottom"`, or an expression reference that provides one of the valid values.
    * The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`,
    * but are calculated relative to the `lineHeight` rather than `fontSize` alone.
    *
    * For range marks, the vertical alignment of the marks. One of `"top"`, `"middle"`, `"bottom"`.
    *
    * __Note:__ Expression reference is *not* supported for range marks.
    *
    */
  var baseline: js.UndefOr[TextBaseline | ES] = js.native
  
  var blend: js.UndefOr[
    (Exclude[js.UndefOr[Blend], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  
  /**
    * Default color.
    *
    * __Default value:__ <span style="color: #4682b4;">&#9632;</span> `"#4682b4"`
    *
    * __Note:__
    * - This property cannot be used in a [style config](https://vega.github.io/vega-lite/docs/mark.html#style-config).
    * - The `fill` and `stroke` properties have higher precedence than `color` and will override `color`.
    */
  var color: js.UndefOr[Color | Gradient | ES] = js.native
  
  var cornerRadius: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var cornerRadiusBottomLeft: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var cornerRadiusBottomRight: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var cornerRadiusTopLeft: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var cornerRadiusTopRight: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var cursor: js.UndefOr[
    (Exclude[
      js.UndefOr[Cursor | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var description: js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var dir: js.UndefOr[
    (Exclude[
      js.UndefOr[TextDirection | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var dx: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var dy: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var ellipsis: js.UndefOr[
    (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  
  var endAngle: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  /**
    * Default fill color. This property has higher precedence than `config.color`. Set to `null` to remove fill.
    *
    * __Default value:__ (None)
    *
    */
  var fill: js.UndefOr[Color | Gradient | Null | ES] = js.native
  
  var fillOpacity: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  /**
    * Whether the mark's color should be used as fill color instead of stroke color.
    *
    * __Default value:__ `false` for all `point`, `line`, and `rule` marks as well as `geoshape` marks for [`graticule`](https://vega.github.io/vega-lite/docs/data.html#graticule) data sources; otherwise, `true`.
    *
    * __Note:__ This property cannot be used in a [style config](https://vega.github.io/vega-lite/docs/mark.html#style-config).
    *
    */
  var filled: js.UndefOr[Boolean] = js.native
  
  var font: js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var fontSize: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var fontStyle: js.UndefOr[
    (Exclude[
      js.UndefOr[FontStyle | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var fontWeight: js.UndefOr[
    (Exclude[
      js.UndefOr[FontWeight | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var height: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var href: js.UndefOr[
    (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  
  /**
    * The inner radius in pixels of arc marks. `innerRadius` is an alias for `radius2`.
    *
    * @minimum 0
    * __Default value:__ `0`
    */
  var innerRadius: js.UndefOr[Double | ES] = js.native
  
  var interpolate: js.UndefOr[
    (Exclude[
      js.UndefOr[Interpolate | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  /**
    * Defines how Vega-Lite should handle marks for invalid values (`null` and `NaN`).
    * - If set to `"filter"` (default), all data items with null values will be skipped (for line, trail, and area marks) or filtered (for other marks).
    * - If `null`, all data items are included. In this case, invalid values will be interpreted as zeroes.
    */
  var invalid: js.UndefOr[filter | Hide | Null] = js.native
  
  var limit: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var lineBreak: js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var lineHeight: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  /**
    * The overall opacity (value between [0,1]).
    *
    * __Default value:__ `0.7` for non-aggregate plots with `point`, `tick`, `circle`, or `square` marks or layered `bar` charts and `1` otherwise.
    *
    * @minimum 0
    * @maximum 1
    */
  var opacity: js.UndefOr[Double | ES] = js.native
  
  /**
    * For line and trail marks, this `order` property can be set to `null` or `false` to make the lines use the original order in the data sources.
    */
  var order: js.UndefOr[Null | Boolean] = js.native
  
  /**
    * The orientation of a non-stacked bar, tick, area, and line charts.
    * The value is either horizontal (default) or vertical.
    * - For bar, rule and tick, this determines whether the size of the bar and tick
    * should be applied to x or y dimension.
    * - For area, this property determines the orient property of the Vega output.
    * - For line and trail marks, this property determines the sort order of the points in the line
    * if `config.sortLineBy` is not specified.
    * For stacked charts, this is always determined by the orientation of the stack;
    * therefore explicitly specified value will be ignored.
    */
  var orient: js.UndefOr[Orientation] = js.native
  
  /**
    * The outer radius in pixels of arc marks. `outerRadius` is an alias for `radius`.
    *
    * @minimum 0
    * __Default value:__ `0`
    */
  var outerRadius: js.UndefOr[Double | ES] = js.native
  
  var padAngle: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  /**
    *
    * For arc mark, the primary (outer) radius in pixels.
    *
    * For text marks, polar coordinate radial offset, in pixels, of the text from the origin determined by the `x` and `y` properties.
    *
    * @minimum 0
    *
    * __Default value:__ `min(plot_width, plot_height)/2`
    */
  var radius: js.UndefOr[Double | ES] = js.native
  
  /**
    * The secondary (inner) radius in pixels of arc marks.
    *
    * @minimum 0
    * __Default value:__ `0`
    */
  var radius2: js.UndefOr[Double | ES] = js.native
  
  var shape: js.UndefOr[
    (Exclude[
      js.UndefOr[SymbolShape | String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  /**
    * Default size for marks.
    * - For `point`/`circle`/`square`, this represents the pixel area of the marks. Note that this value sets the area of the symbol; the side lengths will increase with the square root of this value.
    * - For `bar`, this represents the band size of the bar, in pixels.
    * - For `text`, this represents the font size, in pixels.
    *
    * __Default value:__
    * - `30` for point, circle, square marks; width/height's `step`
    * - `2` for bar marks with discrete dimensions;
    * - `5` for bar marks with continuous dimensions;
    * - `11` for text marks.
    *
    * @minimum 0
    */
  var size: js.UndefOr[Double | ES] = js.native
  
  var smooth: js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var startAngle: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  /**
    * Default stroke color. This property has higher precedence than `config.color`. Set to `null` to remove stroke.
    *
    * __Default value:__ (None)
    *
    */
  var stroke: js.UndefOr[Color | Gradient | Null | ES] = js.native
  
  var strokeCap: js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeCap | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeDash: js.UndefOr[
    (Exclude[
      js.UndefOr[js.Array[Double] | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeDashOffset: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeJoin: js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeJoin | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeMiterLimit: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeOffset: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeOpacity: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var strokeWidth: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var tension: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  var text: js.UndefOr[
    (Exclude[js.UndefOr[Text | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  
  /**
    * - For arc marks, the arc length in radians if theta2 is not specified, otherwise the start arc angle. (A value of 0 indicates up or “north”, increasing values proceed clockwise.)
    *
    * - For text marks, polar coordinate angle in radians.
    *
    * @minimum 0
    * @maximum 360
    */
  var theta: js.UndefOr[Double | ES] = js.native
  
  /**
    * The end angle of arc marks in radians. A value of 0 indicates up or “north”, increasing values proceed clockwise.
    */
  var theta2: js.UndefOr[Double | ES] = js.native
  
  /**
    * Default relative band size for a time unit. If set to `1`, the bandwidth of the marks will be equal to the time unit band step.
    * If set to `0.5`, bandwidth of the marks will be half of the time unit band step.
    */
  var timeUnitBand: js.UndefOr[Double] = js.native
  
  /**
    * Default relative band position for a time unit. If set to `0`, the marks will be positioned at the beginning of the time unit band step.
    * If set to `0.5`, the marks will be positioned in the middle of the time unit band step.
    */
  var timeUnitBandPosition: js.UndefOr[Double] = js.native
  
  /**
    * The tooltip text string to show upon mouse hover or an object defining which fields should the tooltip be derived from.
    *
    * - If `tooltip` is `true` or `{"content": "encoding"}`, then all fields from `encoding` will be used.
    * - If `tooltip` is `{"content": "data"}`, then all fields that appear in the highlighted data point will be used.
    * - If set to `null` or `false`, then no tooltip will be used.
    *
    * See the [`tooltip`](https://vega.github.io/vega-lite/docs/tooltip.html) documentation for a detailed discussion about tooltip  in Vega-Lite.
    *
    * __Default value:__ `null`
    */
  var tooltip: js.UndefOr[Double | String | Boolean | TooltipContent | ES | Null] = js.native
  
  var url: js.UndefOr[
    (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  
  var width: js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  
  /**
    * X coordinates of the marks, or width of horizontal `"bar"` and `"area"` without specified `x2` or `width`.
    *
    * The `value` of this channel can be a number or a string `"width"` for the width of the plot.
    */
  var x: js.UndefOr[Double | width | ES] = js.native
  
  /**
    * X2 coordinates for ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
    *
    * The `value` of this channel can be a number or a string `"width"` for the width of the plot.
    */
  var x2: js.UndefOr[Double | width | ES] = js.native
  
  /**
    * Y coordinates of the marks, or height of vertical `"bar"` and `"area"` without specified `y2` or `height`.
    *
    * The `value` of this channel can be a number or a string `"height"` for the height of the plot.
    */
  var y: js.UndefOr[Double | height | ES] = js.native
  
  /**
    * Y2 coordinates for ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
    *
    * The `value` of this channel can be a number or a string `"height"` for the height of the plot.
    */
  var y2: js.UndefOr[Double | height | ES] = js.native
}
object MarkConfig {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): MarkConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkConfig[ES]]
  }
  
  @scala.inline
  implicit class MarkConfigMutableBuilder[Self <: MarkConfig[_], ES /* <: ExprRef | SignalRef */] (val x: Self with MarkConfig[ES]) extends AnyVal {
    
    @scala.inline
    def setAlign(value: Align | ES): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAngle(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setAria(
      value: (Exclude[
          js.UndefOr[Boolean | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRole(
      value: (Exclude[
          js.UndefOr[String | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRoleDescription(
      value: (Exclude[
          js.UndefOr[String | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    @scala.inline
    def setBaseline(value: TextBaseline | ES): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    @scala.inline
    def setBlend(value: (Exclude[js.UndefOr[Blend], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendNull: Self = StObject.set(x, "blend", null)
    
    @scala.inline
    def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
    
    @scala.inline
    def setColor(value: Color | Gradient | ES): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCornerRadius(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusBottomLeft(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cornerRadiusBottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusBottomLeftUndefined: Self = StObject.set(x, "cornerRadiusBottomLeft", js.undefined)
    
    @scala.inline
    def setCornerRadiusBottomRight(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cornerRadiusBottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusBottomRightUndefined: Self = StObject.set(x, "cornerRadiusBottomRight", js.undefined)
    
    @scala.inline
    def setCornerRadiusTopLeft(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cornerRadiusTopLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusTopLeftUndefined: Self = StObject.set(x, "cornerRadiusTopLeft", js.undefined)
    
    @scala.inline
    def setCornerRadiusTopRight(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDescription(
      value: (Exclude[
          js.UndefOr[String | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDir(
      value: (Exclude[
          js.UndefOr[TextDirection | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDx(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDy(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setEllipsis(value: (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    @scala.inline
    def setEndAngle(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(
      value: (Exclude[
          js.UndefOr[FontStyle | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setHeight(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHref(
      value: (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLineBreak(
      value: (Exclude[
          js.UndefOr[String | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
    
    @scala.inline
    def setLineHeight(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | ES): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius2(value: Double | ES): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setShape(
      value: (Exclude[
          js.UndefOr[SymbolShape | String | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    @scala.inline
    def setStartAngle(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setStroke(value: Color | Gradient | ES): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCap(
      value: (Exclude[
          js.UndefOr[StrokeCap | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    @scala.inline
    def setStrokeDash(
      value: (Exclude[
          js.UndefOr[js.Array[Double] | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashOffset(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterLimit(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOffsetUndefined: Self = StObject.set(x, "strokeOffset", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
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
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setTension(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    
    @scala.inline
    def setText(
      value: (Exclude[js.UndefOr[Text | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
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
    def setTheta2Undefined: Self = StObject.set(x, "theta2", js.undefined)
    
    @scala.inline
    def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    
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
    def setUrl(
      value: (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWidth(
      value: (Exclude[
          js.UndefOr[Double | SignalRef], 
          ScaledValueRef[_] | NumericValueRef | ColorValueRef
        ]) | ES
    ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double | width | ES): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double | width | ES): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double | height | ES): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double | height | ES): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
