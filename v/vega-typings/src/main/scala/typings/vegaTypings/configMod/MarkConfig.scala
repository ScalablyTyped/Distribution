package typings.vegaTypings.configMod

import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.Align
import typings.vegaTypings.encodeMod.FontStyle
import typings.vegaTypings.encodeMod.FontWeight
import typings.vegaTypings.encodeMod.Interpolate
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.SymbolShape
import typings.vegaTypings.encodeMod.TextBaseline
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
    * The vertical alignment of the text. One of `"top"`, `"bottom"`, `"middle"`, `"alphabetic"`.
    *
    * __Default value:__ `"middle"`
    *
    */
  var baseline: js.UndefOr[TextBaseline | SignalRef] = js.undefined
  /**
    * The mouse cursor used over the mark. Any valid [CSS cursor type](https://developer.mozilla.org/en-US/docs/Web/CSS/cursor#Values) can be used.
    */
  var cursor: js.UndefOr[Cursor | SignalRef] = js.undefined
  /**
    * The horizontal offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
    */
  var dx: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The vertical offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
    */
  var dy: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * Default fill color.
    *
    * __Default value:__ (None)
    *
    */
  var fill: js.UndefOr[Color | Null | SignalRef] = js.undefined
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
    * @minimum 0
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
    * A URL to load upon mouse click. If defined, the mark acts as a hyperlink.
    *
    * @format uri
    */
  var href: js.UndefOr[String | SignalRef] = js.undefined
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
    * The maximum length of the text mark in pixels (default 0, indicating no limit). The text value will be automatically truncated if the rendered size exceeds the limit.
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
  // ---------- Orientation: Bar, Tick, Line, Area ----------
  /**
    * The orientation of a non-stacked bar, tick, area, and line charts.
    * The value is either horizontal (default) or vertical.
    * - For bar, rule and tick, this determines whether the size of the bar and tick
    * should be applied to x or y dimension.
    * - For area, this property determines the orient property of the Vega output.
    * - For line, this property determines the sort order of the points in the line
    * if `config.sortLineBy` is not specified.
    * For stacked charts, this is always determined by the orientation of the stack;
    * therefore explicitly specified value will be ignored.
    */
  var orient: js.UndefOr[Orientation | SignalRef] = js.undefined
  /**
    * Polar coordinate radial offset, in pixels, of the text label from the origin determined by the `x` and `y` properties.
    *
    * @minimum 0
    */
  var radius: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The default symbol shape to use. One of: `"circle"` (default), `"square"`, `"cross"`, `"diamond"`, `"triangle-up"`, or `"triangle-down"`, or a custom SVG path.
    *
    * __Default value:__ `"circle"`
    *
    */
  var shape: js.UndefOr[SymbolShape | SignalRef] = js.undefined
  /**
    * The pixel area each the point/circle/square.
    * For example: in the case of circles, the radius is determined in part by the square root of the size value.
    *
    * __Default value:__ `30`
    *
    * @minimum 0
    */
  var size: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * Default stroke color.
    *
    * __Default value:__ (None)
    *
    */
  var stroke: js.UndefOr[Color | Null | SignalRef] = js.undefined
  /**
    * The stroke cap for line ending style.
    *
    * __Default value:__ `butt`
    *
    */
  var strokeCap: js.UndefOr[String | SignalRef] = js.undefined
  /**
    * An array of alternating stroke, space lengths for creating dashed or dotted lines.
    */
  var strokeDash: js.UndefOr[js.Array[Double] | SignalRef] = js.undefined
  /**
    * The offset (in pixels) into which to begin drawing with the stroke dash array.
    */
  var strokeDashOffset: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The stroke line join method.
    *
    * __Default value:__ `miter`
    *
    */
  var strokeJoin: js.UndefOr[String | SignalRef] = js.undefined
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
  var text: js.UndefOr[String | SignalRef] = js.undefined
  /**
    * Polar coordinate angle, in radians, of the text label from the origin determined by the `x` and `y` properties. Values for `theta` follow the same convention of `arc` mark `startAngle` and `endAngle` properties: angles are measured in radians, with `0` indicating "north".
    */
  var theta: js.UndefOr[Double | SignalRef] = js.undefined
}

object MarkConfig {
  @scala.inline
  def apply(
    align: Align | SignalRef = null,
    angle: Double | SignalRef = null,
    baseline: TextBaseline | SignalRef = null,
    cursor: Cursor | SignalRef = null,
    dx: Double | SignalRef = null,
    dy: Double | SignalRef = null,
    fill: Color | SignalRef = null,
    fillOpacity: Double | SignalRef = null,
    font: String | SignalRef = null,
    fontSize: Double | SignalRef = null,
    fontStyle: FontStyle | SignalRef = null,
    fontWeight: FontWeight | SignalRef = null,
    href: String | SignalRef = null,
    interpolate: Interpolate | SignalRef = null,
    limit: Double | SignalRef = null,
    lineBreak: String | SignalRef = null,
    lineHeight: Double | SignalRef = null,
    opacity: Double | SignalRef = null,
    orient: Orientation | SignalRef = null,
    radius: Double | SignalRef = null,
    shape: SymbolShape | SignalRef = null,
    size: Double | SignalRef = null,
    stroke: Color | SignalRef = null,
    strokeCap: String | SignalRef = null,
    strokeDash: js.Array[Double] | SignalRef = null,
    strokeDashOffset: Double | SignalRef = null,
    strokeJoin: String | SignalRef = null,
    strokeMiterLimit: Double | SignalRef = null,
    strokeOffset: Double | SignalRef = null,
    strokeOpacity: Double | SignalRef = null,
    strokeWidth: Double | SignalRef = null,
    tension: Double | SignalRef = null,
    text: String | SignalRef = null,
    theta: Double | SignalRef = null
  ): MarkConfig = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lineBreak != null) __obj.updateDynamic("lineBreak")(lineBreak.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[MarkConfig]
  }
}

