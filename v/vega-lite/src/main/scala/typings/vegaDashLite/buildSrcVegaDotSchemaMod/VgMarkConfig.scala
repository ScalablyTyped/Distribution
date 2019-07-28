package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgMarkConfig extends js.Object {
  /**
    * The horizontal alignment of the text. One of `"left"`, `"right"`, `"center"`.
    */
  var align: js.UndefOr[HorizontalAlign] = js.undefined
  /**
    * The rotation angle of the text, in degrees.
    * @minimum 0
    * @maximum 360
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * The vertical alignment of the text. One of `"top"`, `"middle"`, `"bottom"`.
    *
    * __Default value:__ `"middle"`
    *
    */
  var baseline: js.UndefOr[VerticalAlign] = js.undefined
  /**
    * The radius in pixels of rounded rectangle corners.
    *
    * __Default value:__ `0`
    */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  /**
    * The mouse cursor used over the mark. Any valid [CSS cursor type](https://developer.mozilla.org/en-US/docs/Web/CSS/cursor#Values) can be used.
    */
  var cursor: js.UndefOr[Cursor] = js.undefined
  /**
    * The direction of the text. One of `"ltr"` (left-to-right) or `"rtl"` (right-to-left). This property determines on which side is truncated in response to the limit parameter.
    *
    * __Default value:__ `"ltr"`
    */
  var dir: js.UndefOr[Dir] = js.undefined
  /**
    * The horizontal offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
    */
  var dx: js.UndefOr[Double] = js.undefined
  /**
    * The vertical offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
    */
  var dy: js.UndefOr[Double] = js.undefined
  /**
    * The ellipsis string for text truncated in response to the limit parameter.
    *
    * __Default value:__ `"…"`
    */
  var ellipsis: js.UndefOr[String] = js.undefined
  /**
    * Default Fill Color.  This has higher precedence than `config.color`
    *
    * __Default value:__ (None)
    *
    */
  var fill: js.UndefOr[String] = js.undefined
  /**
    * The fill opacity (value between [0,1]).
    *
    * __Default value:__ `1`
    *
    * @minimum 0
    * @maximum 1
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The typeface to set the text in (e.g., `"Helvetica Neue"`).
    */
  var font: js.UndefOr[String] = js.undefined
  /**
    * The font size, in pixels.
    * @minimum 0
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * The font style (e.g., `"italic"`).
    */
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  /**
    * The font weight.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  /**
    * A URL to load upon mouse click. If defined, the mark acts as a hyperlink.
    *
    * @format uri
    */
  var href: js.UndefOr[String] = js.undefined
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
  var interpolate: js.UndefOr[Interpolate] = js.undefined
  /**
    * The maximum length of the text mark in pixels. The text value will be automatically truncated if the rendered size exceeds the limit.
    *
    * __Default value:__ `0`, indicating no limit
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * The overall opacity (value between [0,1]).
    *
    * __Default value:__ `0.7` for non-aggregate plots with `point`, `tick`, `circle`, or `square` marks or layered `bar` charts and `1` otherwise.
    *
    * @minimum 0
    * @maximum 1
    */
  var opacity: js.UndefOr[Double] = js.undefined
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
  var orient: js.UndefOr[Orient] = js.undefined
  /**
    * Polar coordinate radial offset, in pixels, of the text label from the origin determined by the `x` and `y` properties.
    * @minimum 0
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * The default symbol shape to use. One of: `"circle"` (default), `"square"`, `"cross"`, `"diamond"`, `"triangle-up"`, or `"triangle-down"`, or a custom SVG path.
    *
    * __Default value:__ `"circle"`
    *
    */
  var shape: js.UndefOr[String] = js.undefined
  /**
    * The pixel area each the point/circle/square.
    * For example: in the case of circles, the radius is determined in part by the square root of the size value.
    *
    * __Default value:__ `30`
    *
    * @minimum 0
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * Default Stroke Color.  This has higher precedence than `config.color`
    *
    * __Default value:__ (None)
    *
    */
  var stroke: js.UndefOr[String] = js.undefined
  /**
    * The stroke cap for line ending style. One of `"butt"`, `"round"`, or `"square"`.
    *
    * __Default value:__ `"square"`
    */
  var strokeCap: js.UndefOr[StrokeCap] = js.undefined
  /**
    * An array of alternating stroke, space lengths for creating dashed or dotted lines.
    */
  var strokeDash: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The offset (in pixels) into which to begin drawing with the stroke dash array.
    */
  var strokeDashOffset: js.UndefOr[Double] = js.undefined
  /**
    * The stroke line join method. One of `"miter"`, `"round"` or `"bevel"`.
    *
    * __Default value:__ `"miter"`
    */
  var strokeJoin: js.UndefOr[StrokeJoin] = js.undefined
  /**
    * The miter limit at which to bevel a line join.
    */
  var strokeMiterLimit: js.UndefOr[Double] = js.undefined
  /**
    * The stroke opacity (value between [0,1]).
    *
    * __Default value:__ `1`
    *
    * @minimum 0
    * @maximum 1
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The stroke width, in pixels.
    *
    * @minimum 0
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  /**
    * Depending on the interpolation type, sets the tension parameter (for line and area marks).
    * @minimum 0
    * @maximum 1
    */
  var tension: js.UndefOr[Double] = js.undefined
  /**
    * Placeholder text if the `text` channel is not specified
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Polar coordinate angle, in radians, of the text label from the origin determined by the `x` and `y` properties. Values for `theta` follow the same convention of `arc` mark `startAngle` and `endAngle` properties: angles are measured in radians, with `0` indicating "north".
    */
  var theta: js.UndefOr[Double] = js.undefined
  /**
    * The tooltip text to show upon mouse hover.
    */
  var tooltip: js.UndefOr[js.Any] = js.undefined
}

object VgMarkConfig {
  @scala.inline
  def apply(
    align: HorizontalAlign = null,
    angle: Int | Double = null,
    baseline: VerticalAlign = null,
    cornerRadius: Int | Double = null,
    cursor: Cursor = null,
    dir: Dir = null,
    dx: Int | Double = null,
    dy: Int | Double = null,
    ellipsis: String = null,
    fill: String = null,
    fillOpacity: Int | Double = null,
    font: String = null,
    fontSize: Int | Double = null,
    fontStyle: FontStyle = null,
    fontWeight: FontWeight = null,
    href: String = null,
    interpolate: Interpolate = null,
    limit: Int | Double = null,
    opacity: Int | Double = null,
    orient: Orient = null,
    radius: Int | Double = null,
    shape: String = null,
    size: Int | Double = null,
    stroke: String = null,
    strokeCap: StrokeCap = null,
    strokeDash: js.Array[Double] = null,
    strokeDashOffset: Int | Double = null,
    strokeJoin: StrokeJoin = null,
    strokeMiterLimit: Int | Double = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null,
    tension: Int | Double = null,
    text: String = null,
    theta: Int | Double = null,
    tooltip: js.Any = null
  ): VgMarkConfig = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline)
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap)
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash)
    if (strokeDashOffset != null) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.asInstanceOf[js.Any])
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin)
    if (strokeMiterLimit != null) __obj.updateDynamic("strokeMiterLimit")(strokeMiterLimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (tension != null) __obj.updateDynamic("tension")(tension.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (theta != null) __obj.updateDynamic("theta")(theta.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[VgMarkConfig]
  }
}

