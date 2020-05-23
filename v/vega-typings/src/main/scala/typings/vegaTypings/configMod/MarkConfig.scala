package typings.vegaTypings.configMod

import typings.vegaTypings.colorMod.Color
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
import scala.scalajs.js.annotation._

trait MarkConfig extends js.Object {
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
  var aspect: js.UndefOr[Boolean] = js.undefined
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
    *
    * @format uri
    */
  var href: js.UndefOr[String | SignalRef] = js.undefined
  /**
    * The inner radius in pixels of arc marks.
    *
    * @minimum 0
    * __Default value:__ `0`
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
    * @minimum 0
    * __Default value:__ `0`
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
    * Width of the marks.
    */
  var width: js.UndefOr[Double | SignalRef] = js.undefined
}

object MarkConfig {
  @scala.inline
  def apply(
    align: Align | SignalRef = null,
    angle: Double | SignalRef = null,
    aria: Boolean | SignalRef = null,
    ariaRole: String | SignalRef = null,
    ariaRoleDescription: String | SignalRef = null,
    aspect: js.UndefOr[Boolean] = js.undefined,
    baseline: TextBaseline | SignalRef = null,
    blend: js.UndefOr[Null | Blend] = js.undefined,
    cornerRadius: Double | SignalRef = null,
    cornerRadiusBottomLeft: Double | SignalRef = null,
    cornerRadiusBottomRight: Double | SignalRef = null,
    cornerRadiusTopLeft: Double | SignalRef = null,
    cornerRadiusTopRight: Double | SignalRef = null,
    cursor: Cursor | SignalRef = null,
    description: String | SignalRef = null,
    dir: TextDirection | SignalRef = null,
    dx: Double | SignalRef = null,
    dy: Double | SignalRef = null,
    ellipsis: String = null,
    endAngle: Double | SignalRef = null,
    fill: js.UndefOr[Null | Color | Gradient | SignalRef] = js.undefined,
    fillOpacity: Double | SignalRef = null,
    font: String | SignalRef = null,
    fontSize: Double | SignalRef = null,
    fontStyle: FontStyle | SignalRef = null,
    fontWeight: FontWeight | SignalRef = null,
    height: Double | SignalRef = null,
    href: String | SignalRef = null,
    innerRadius: Double | SignalRef = null,
    interpolate: Interpolate | SignalRef = null,
    limit: Double | SignalRef = null,
    lineBreak: String | SignalRef = null,
    lineHeight: Double | SignalRef = null,
    opacity: Double | SignalRef = null,
    orient: Orientation | SignalRef = null,
    outerRadius: Double | SignalRef = null,
    padAngle: Double | SignalRef = null,
    radius: Double | SignalRef = null,
    shape: SymbolShape | String | SignalRef = null,
    size: Double | SignalRef = null,
    startAngle: Double | SignalRef = null,
    stroke: js.UndefOr[Null | Color | Gradient | SignalRef] = js.undefined,
    strokeCap: StrokeCap | SignalRef = null,
    strokeDash: js.Array[Double] | SignalRef = null,
    strokeDashOffset: Double | SignalRef = null,
    strokeJoin: StrokeJoin | SignalRef = null,
    strokeMiterLimit: Double | SignalRef = null,
    strokeOffset: Double | SignalRef = null,
    strokeOpacity: Double | SignalRef = null,
    strokeWidth: Double | SignalRef = null,
    tension: Double | SignalRef = null,
    text: Text | SignalRef = null,
    theta: Double | SignalRef = null,
    tooltip: String | SignalRef = null,
    width: Double | SignalRef = null
  ): MarkConfig = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (aria != null) __obj.updateDynamic("aria")(aria.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (ariaRoleDescription != null) __obj.updateDynamic("ariaRoleDescription")(ariaRoleDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(aspect)) __obj.updateDynamic("aspect")(aspect.get.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (!js.isUndefined(blend)) __obj.updateDynamic("blend")(blend.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (cornerRadiusBottomLeft != null) __obj.updateDynamic("cornerRadiusBottomLeft")(cornerRadiusBottomLeft.asInstanceOf[js.Any])
    if (cornerRadiusBottomRight != null) __obj.updateDynamic("cornerRadiusBottomRight")(cornerRadiusBottomRight.asInstanceOf[js.Any])
    if (cornerRadiusTopLeft != null) __obj.updateDynamic("cornerRadiusTopLeft")(cornerRadiusTopLeft.asInstanceOf[js.Any])
    if (cornerRadiusTopRight != null) __obj.updateDynamic("cornerRadiusTopRight")(cornerRadiusTopRight.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lineBreak != null) __obj.updateDynamic("lineBreak")(lineBreak.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash.asInstanceOf[js.Any])
    if (strokeDashOffset != null) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.asInstanceOf[js.Any])
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin.asInstanceOf[js.Any])
    if (strokeMiterLimit != null) __obj.updateDynamic("strokeMiterLimit")(strokeMiterLimit.asInstanceOf[js.Any])
    if (strokeOffset != null) __obj.updateDynamic("strokeOffset")(strokeOffset.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (tension != null) __obj.updateDynamic("tension")(tension.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theta != null) __obj.updateDynamic("theta")(theta.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkConfig]
  }
}

