package typings.vegaTypings.configMod

import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.dataMod.URI
import typings.vegaTypings.encodeMod.Align
import typings.vegaTypings.encodeMod.Blend
import typings.vegaTypings.encodeMod.FontStyle
import typings.vegaTypings.encodeMod.FontWeight
import typings.vegaTypings.encodeMod.Gradient
import typings.vegaTypings.encodeMod.Interpolate
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.SymbolShape
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.encodeMod.TextBaseline
import typings.vegaTypings.encodeMod.TextDirection
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkConfig extends js.Object {
  
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
  implicit class MarkConfigOps[Self <: MarkConfig] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: Align | SignalRef): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAngle(value: Double | SignalRef): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setAria(value: Boolean | SignalRef): Self = this.set("aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    
    @scala.inline
    def setAriaRole(value: String | SignalRef): Self = this.set("ariaRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaRole: Self = this.set("ariaRole", js.undefined)
    
    @scala.inline
    def setAriaRoleDescription(value: String | SignalRef): Self = this.set("ariaRoleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaRoleDescription: Self = this.set("ariaRoleDescription", js.undefined)
    
    @scala.inline
    def setAspect(value: Boolean | SignalRef): Self = this.set("aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspect: Self = this.set("aspect", js.undefined)
    
    @scala.inline
    def setBaseline(value: TextBaseline | SignalRef): Self = this.set("baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseline: Self = this.set("baseline", js.undefined)
    
    @scala.inline
    def setBlend(value: Blend): Self = this.set("blend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlend: Self = this.set("blend", js.undefined)
    
    @scala.inline
    def setBlendNull: Self = this.set("blend", null)
    
    @scala.inline
    def setCornerRadius(value: Double | SignalRef): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setCornerRadiusBottomLeft(value: Double | SignalRef): Self = this.set("cornerRadiusBottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadiusBottomLeft: Self = this.set("cornerRadiusBottomLeft", js.undefined)
    
    @scala.inline
    def setCornerRadiusBottomRight(value: Double | SignalRef): Self = this.set("cornerRadiusBottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadiusBottomRight: Self = this.set("cornerRadiusBottomRight", js.undefined)
    
    @scala.inline
    def setCornerRadiusTopLeft(value: Double | SignalRef): Self = this.set("cornerRadiusTopLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadiusTopLeft: Self = this.set("cornerRadiusTopLeft", js.undefined)
    
    @scala.inline
    def setCornerRadiusTopRight(value: Double | SignalRef): Self = this.set("cornerRadiusTopRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadiusTopRight: Self = this.set("cornerRadiusTopRight", js.undefined)
    
    @scala.inline
    def setCursor(value: Cursor | SignalRef): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDescription(value: String | SignalRef): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDir(value: TextDirection | SignalRef): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDx(value: Double | SignalRef): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    
    @scala.inline
    def setDy(value: Double | SignalRef): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    
    @scala.inline
    def setEllipsis(value: String): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double | SignalRef): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setFill(value: Color | Gradient | SignalRef): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillNull: Self = this.set("fill", null)
    
    @scala.inline
    def setFillOpacity(value: Double | SignalRef): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFont(value: String | SignalRef): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double | SignalRef): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle | SignalRef): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight | SignalRef): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | SignalRef): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHref(value: URI | SignalRef): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double | SignalRef): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    
    @scala.inline
    def setInterpolate(value: Interpolate | SignalRef): Self = this.set("interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolate: Self = this.set("interpolate", js.undefined)
    
    @scala.inline
    def setLimit(value: Double | SignalRef): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLineBreak(value: String | SignalRef): Self = this.set("lineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineBreak: Self = this.set("lineBreak", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double | SignalRef): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | SignalRef): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOrient(value: Orientation | SignalRef): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    
    @scala.inline
    def setOuterRadius(value: Double | SignalRef): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterRadius: Self = this.set("outerRadius", js.undefined)
    
    @scala.inline
    def setPadAngle(value: Double | SignalRef): Self = this.set("padAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadAngle: Self = this.set("padAngle", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | SignalRef): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setShape(value: SymbolShape | String | SignalRef): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setSize(value: Double | SignalRef): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean | SignalRef): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double | SignalRef): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setStroke(value: Color | Gradient | SignalRef): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeNull: Self = this.set("stroke", null)
    
    @scala.inline
    def setStrokeCap(value: StrokeCap | SignalRef): Self = this.set("strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeCap: Self = this.set("strokeCap", js.undefined)
    
    @scala.inline
    def setStrokeDashVarargs(value: Double*): Self = this.set("strokeDash", js.Array(value :_*))
    
    @scala.inline
    def setStrokeDash(value: js.Array[Double] | SignalRef): Self = this.set("strokeDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDash: Self = this.set("strokeDash", js.undefined)
    
    @scala.inline
    def setStrokeDashOffset(value: Double | SignalRef): Self = this.set("strokeDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDashOffset: Self = this.set("strokeDashOffset", js.undefined)
    
    @scala.inline
    def setStrokeJoin(value: StrokeJoin | SignalRef): Self = this.set("strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeJoin: Self = this.set("strokeJoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterLimit(value: Double | SignalRef): Self = this.set("strokeMiterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeMiterLimit: Self = this.set("strokeMiterLimit", js.undefined)
    
    @scala.inline
    def setStrokeOffset(value: Double | SignalRef): Self = this.set("strokeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOffset: Self = this.set("strokeOffset", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double | SignalRef): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double | SignalRef): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setTension(value: Double | SignalRef): Self = this.set("tension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTension: Self = this.set("tension", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    
    @scala.inline
    def setText(value: Text | SignalRef): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTheta(value: Double | SignalRef): Self = this.set("theta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheta: Self = this.set("theta", js.undefined)
    
    @scala.inline
    def setTooltip(value: String | SignalRef): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setUrl(value: URI | SignalRef): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | SignalRef): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
