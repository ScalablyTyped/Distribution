package typings.vegaTypings.typesSpecConfigMod

import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecDataMod.URI
import typings.vegaTypings.typesSpecEncodeMod.Align
import typings.vegaTypings.typesSpecEncodeMod.Blend
import typings.vegaTypings.typesSpecEncodeMod.FontStyle
import typings.vegaTypings.typesSpecEncodeMod.FontWeight
import typings.vegaTypings.typesSpecEncodeMod.Gradient
import typings.vegaTypings.typesSpecEncodeMod.Interpolate
import typings.vegaTypings.typesSpecEncodeMod.Orientation
import typings.vegaTypings.typesSpecEncodeMod.SymbolShape
import typings.vegaTypings.typesSpecEncodeMod.Text
import typings.vegaTypings.typesSpecEncodeMod.TextBaseline
import typings.vegaTypings.typesSpecEncodeMod.TextDirection
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
