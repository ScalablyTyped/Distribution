package typings.vegaDashTypings.typesSpecConfigMod

import typings.vegaDashTypings.typesSpecEncodeMod.Align
import typings.vegaDashTypings.typesSpecEncodeMod.FontStyle
import typings.vegaDashTypings.typesSpecEncodeMod.FontWeight
import typings.vegaDashTypings.typesSpecEncodeMod.Interpolate
import typings.vegaDashTypings.typesSpecEncodeMod.Orientation
import typings.vegaDashTypings.typesSpecEncodeMod.SymbolShape
import typings.vegaDashTypings.typesSpecEncodeMod.TextBaseline
import typings.vegaDashTypings.vegaDashTypingsStrings.`all-scroll`
import typings.vegaDashTypings.vegaDashTypingsStrings.`col-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`context-menu`
import typings.vegaDashTypings.vegaDashTypingsStrings.`e-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`ew-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`n-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`ne-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`nesw-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`no-drop`
import typings.vegaDashTypings.vegaDashTypingsStrings.`not-allowed`
import typings.vegaDashTypings.vegaDashTypingsStrings.`ns-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`nw-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`nwse-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`row-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`s-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`se-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`sw-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`vertical-text`
import typings.vegaDashTypings.vegaDashTypingsStrings.`w-resize`
import typings.vegaDashTypings.vegaDashTypingsStrings.`zoom-in`
import typings.vegaDashTypings.vegaDashTypingsStrings.`zoom-out`
import typings.vegaDashTypings.vegaDashTypingsStrings.alias
import typings.vegaDashTypings.vegaDashTypingsStrings.auto
import typings.vegaDashTypings.vegaDashTypingsStrings.cell
import typings.vegaDashTypings.vegaDashTypingsStrings.copy
import typings.vegaDashTypings.vegaDashTypingsStrings.crosshair
import typings.vegaDashTypings.vegaDashTypingsStrings.default
import typings.vegaDashTypings.vegaDashTypingsStrings.grab
import typings.vegaDashTypings.vegaDashTypingsStrings.grabbing
import typings.vegaDashTypings.vegaDashTypingsStrings.help
import typings.vegaDashTypings.vegaDashTypingsStrings.move
import typings.vegaDashTypings.vegaDashTypingsStrings.none
import typings.vegaDashTypings.vegaDashTypingsStrings.pointer
import typings.vegaDashTypings.vegaDashTypingsStrings.progress
import typings.vegaDashTypings.vegaDashTypingsStrings.text
import typings.vegaDashTypings.vegaDashTypingsStrings.wait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkConfig extends js.Object {
  // Text / Label Mark Config
  /**
    * The horizontal alignment of the text. One of `"left"`, `"right"`, `"center"`.
    */
  var align: js.UndefOr[Align] = js.undefined
  /**
    * The rotation angle of the text, in degrees.
    * @minimum 0
    * @maximum 360
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * The vertical alignment of the text. One of `"top"`, `"bottom"`, `"middle"`, `"alphabetic"`.
    *
    * __Default value:__ `"middle"`
    *
    */
  var baseline: js.UndefOr[TextBaseline] = js.undefined
  /**
    * The mouse cursor used over the mark. Any valid [CSS cursor type](https://developer.mozilla.org/en-US/docs/Web/CSS/cursor#Values) can be used.
    */
  var cursor: js.UndefOr[
    auto | default | none | `context-menu` | help | pointer | progress | wait | cell | crosshair | text | `vertical-text` | alias | copy | move | `no-drop` | `not-allowed` | `e-resize` | `n-resize` | `ne-resize` | `nw-resize` | `s-resize` | `se-resize` | `sw-resize` | `w-resize` | `ew-resize` | `ns-resize` | `nesw-resize` | `nwse-resize` | `col-resize` | `row-resize` | `all-scroll` | `zoom-in` | `zoom-out` | grab | grabbing
  ] = js.undefined
  /**
    * The horizontal offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
    */
  var dx: js.UndefOr[Double] = js.undefined
  /**
    * The vertical offset, in pixels, between the text label and its anchor point. The offset is applied after rotation by the _angle_ property.
    */
  var dy: js.UndefOr[Double] = js.undefined
  /**
    * Default Fill Color.  This has higher precedence than config.color
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
  var interpolate: js.UndefOr[Interpolate] = js.undefined
  /**
    * The maximum length of the text mark in pixels (default 0, indicating no limit). The text value will be automatically truncated if the rendered size exceeds the limit.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * A delimiter, such as a newline character, upon which to break text strings into multiple lines. This property is ignored if the text is array-valued.
    */
  var lineBreak: js.UndefOr[String] = js.undefined
  /**
    * The line height in pixels (the spacing between subsequent lines of text) for multi-line text marks.
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
  // ---------- Opacity ----------
  /**
    * The overall opacity (value between [0,1]).
    *
    * __Default value:__ `0.7` for non-aggregate plots with `point`, `tick`, `circle`, or `square` marks or layered `bar` charts and `1` otherwise.
    *
    * @minimum 0
    * @maximum 1
    */
  var opacity: js.UndefOr[Double] = js.undefined
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
  var orient: js.UndefOr[Orientation] = js.undefined
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
  var shape: js.UndefOr[SymbolShape] = js.undefined
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
    * Default Stroke Color.  This has higher precedence than config.color
    *
    * __Default value:__ (None)
    *
    */
  var stroke: js.UndefOr[String] = js.undefined
  /**
    * The stroke cap for line ending style.
    *
    * __Default value:__ `butt`
    *
    */
  var strokeCap: js.UndefOr[String] = js.undefined
  /**
    * An array of alternating stroke, space lengths for creating dashed or dotted lines.
    */
  var strokeDash: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The offset (in pixels) into which to begin drawing with the stroke dash array.
    */
  var strokeDashOffset: js.UndefOr[Double] = js.undefined
  /**
    * The stroke line join method.
    *
    * __Default value:__ `miter`
    *
    */
  var strokeJoin: js.UndefOr[String] = js.undefined
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
  // ---------- Stroke Style ----------
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
}

object MarkConfig {
  @scala.inline
  def apply(
    align: Align = null,
    angle: Int | Double = null,
    baseline: TextBaseline = null,
    cursor: auto | default | none | `context-menu` | help | pointer | progress | wait | cell | crosshair | text | `vertical-text` | alias | copy | move | `no-drop` | `not-allowed` | `e-resize` | `n-resize` | `ne-resize` | `nw-resize` | `s-resize` | `se-resize` | `sw-resize` | `w-resize` | `ew-resize` | `ns-resize` | `nesw-resize` | `nwse-resize` | `col-resize` | `row-resize` | `all-scroll` | `zoom-in` | `zoom-out` | grab | grabbing = null,
    dx: Int | Double = null,
    dy: Int | Double = null,
    fill: String = null,
    fillOpacity: Int | Double = null,
    font: String = null,
    fontSize: Int | Double = null,
    fontStyle: FontStyle = null,
    fontWeight: FontWeight = null,
    href: String = null,
    interpolate: Interpolate = null,
    limit: Int | Double = null,
    lineBreak: String = null,
    lineHeight: Int | Double = null,
    opacity: Int | Double = null,
    orient: Orientation = null,
    radius: Int | Double = null,
    shape: SymbolShape = null,
    size: Int | Double = null,
    stroke: String = null,
    strokeCap: String = null,
    strokeDash: js.Array[Double] = null,
    strokeDashOffset: Int | Double = null,
    strokeJoin: String = null,
    strokeMiterLimit: Int | Double = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null,
    tension: Int | Double = null,
    text: String = null,
    theta: Int | Double = null
  ): MarkConfig = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (baseline != null) __obj.updateDynamic("baseline")(baseline)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (href != null) __obj.updateDynamic("href")(href)
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lineBreak != null) __obj.updateDynamic("lineBreak")(lineBreak)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[MarkConfig]
  }
}

