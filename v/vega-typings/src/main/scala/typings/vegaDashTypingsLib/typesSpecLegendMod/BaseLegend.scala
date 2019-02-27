package typings
package vegaDashTypingsLib.typesSpecLegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLegend[N, NS, S, C, FW, FS, A, TB, LA, LO, SY, DA, O, AN] extends js.Object {
  // ---------- Symbol Layout ----------
  /**
    * The height in pixels to clip symbol legend entries and limit their size.
    */
  var clipHeight: js.UndefOr[NS] = js.undefined
  /**
    * The horizontal padding in pixels between symbol legend entries.
    *
    * __Default value:__ `10`.
    */
  var columnPadding: js.UndefOr[NS] = js.undefined
  /**
    * The number of columns in which to arrange symbol legend entries. A value of `0` or lower indicates a single row with one column per entry.
    */
  var columns: js.UndefOr[NS] = js.undefined
  // ---------- Legend Group ----------
  /**
    * Corner radius for the full legend.
    */
  var cornerRadius: js.UndefOr[N] = js.undefined
  /**
    * Background fill color for the full legend.
    */
  var fillColor: js.UndefOr[C] = js.undefined
  // ---------- Gradient ----------
  /**
    * The length in pixels of the primary axis of a color gradient. This value corresponds to the height of a vertical gradient or the width of a horizontal gradient.
    *
    * __Default value:__ `200`.
    * @minimum 0
    */
  var gradientLength: js.UndefOr[NS] = js.undefined
  /**
    * Opacity of the color gradient.
    */
  var gradientOpacity: js.UndefOr[N] = js.undefined
  /**
    * The color of the gradient stroke, can be in hex color code or regular color name.
    *
    * __Default value:__ `"lightGray"`.
    */
  var gradientStrokeColor: js.UndefOr[C] = js.undefined
  /**
    * The width of the gradient stroke, in pixels.
    *
    * __Default value:__ `0`.
    * @minimum 0
    */
  var gradientStrokeWidth: js.UndefOr[N] = js.undefined
  /**
    * The thickness in pixels of the color gradient. This value corresponds to the width of a vertical gradient or the height of a horizontal gradient.
    *
    * __Default value:__ `16`.
    * @minimum 0
    */
  var gradientThickness: js.UndefOr[NS] = js.undefined
  /**
    * The alignment to apply to symbol legends rows and columns. The supported string values are `"all"`, `"each"` (the default), and `none`. For more information, see the [grid layout documentation](https://vega.github.io/vega/docs/layout).
    *
    * __Default value:__ `"each"`.
    */
  var gridAlign: js.UndefOr[LA] = js.undefined
  // ---------- Label ----------
  /**
    * The alignment of the legend label, can be left, center, or right.
    */
  var labelAlign: js.UndefOr[A] = js.undefined
  /**
    * The position of the baseline of legend label, can be `"top"`, `"middle"`, `"bottom"`, or `"alphabetic"`.
    *
    * __Default value:__ `"middle"`.
    */
  var labelBaseline: js.UndefOr[TB] = js.undefined
  /**
    * The color of the legend label, can be in hex color code or regular color name.
    */
  var labelColor: js.UndefOr[C] = js.undefined
  /**
    * The font of the legend label.
    */
  var labelFont: js.UndefOr[S] = js.undefined
  /**
    * The font size of legend label.
    *
    * __Default value:__ `10`.
    *
    * @minimum 0
    */
  var labelFontSize: js.UndefOr[N] = js.undefined
  /**
    * The font style of legend label.
    */
  var labelFontStyle: js.UndefOr[FS] = js.undefined
  /**
    * The font weight of legend label.
    */
  var labelFontWeight: js.UndefOr[FW] = js.undefined
  /**
    * Maximum allowed pixel width of axis tick labels.
    *
    * __Default value:__ `160`.
    */
  var labelLimit: js.UndefOr[N] = js.undefined
  /**
    * The offset of the legend label.
    * @minimum 0
    *
    * __Default value:__ `4`.
    */
  var labelOffset: js.UndefOr[N] = js.undefined
  /**
    * Opacity of labels.
    */
  var labelOpacity: js.UndefOr[N] = js.undefined
  /**
    * The strategy to use for resolving overlap of labels in gradient legends. If `false`, no overlap reduction is attempted. If set to `true` (default) or `"parity"`, a strategy of removing every other label is used. If set to `"greedy"`, a linear scan of the labels is performed, removing any label that overlaps with the last visible label (this often works better for log-scaled axes).
    *
    * __Default value:__ `true`.
    */
  var labelOverlap: js.UndefOr[LO] = js.undefined
  /**
    * Padding in pixels between the legend and legend labels.
    */
  var labelPadding: js.UndefOr[N] = js.undefined
  /**
    * The minimum separation that must be between label bounding boxes for them to be considered non-overlapping (default `0`). This property is ignored if *labelOverlap* resolution is not enabled.
    */
  var labelSeparation: js.UndefOr[NS] = js.undefined
  /**
    * The offset in pixels by which to displace the legend from the data rectangle and axes.
    *
    * __Default value:__ `18`.
    */
  var offset: js.UndefOr[N] = js.undefined
  /**
    * The orientation of the legend, which determines how the legend is positioned within the scene. One of "left", "right", "top-left", "top-right", "bottom-left", "bottom-right", "none".
    *
    * __Default value:__ `"right"`
    */
  var orient: js.UndefOr[LegendOrient] = js.undefined
  /**
    * The padding between the border and content of the legend group.
    *
    * __Default value:__ `0`.
    */
  var padding: js.UndefOr[N] = js.undefined
  /**
    * The vertical padding in pixels between symbol legend entries.
    *
    * __Default value:__ `2`.
    */
  var rowPadding: js.UndefOr[NS] = js.undefined
  /**
    * Border stroke color for the full legend.
    */
  var strokeColor: js.UndefOr[C] = js.undefined
  // ---------- Symbols ----------
  /**
    * An array of alternating [stroke, space] lengths for dashed symbol strokes.
    */
  var symbolDash: js.UndefOr[DA] = js.undefined
  /**
    * The pixel offset at which to start drawing with the symbol stroke dash array.
    */
  var symbolDashOffset: js.UndefOr[N] = js.undefined
  /**
    * The color of the legend symbol,
    */
  var symbolFillColor: js.UndefOr[C] = js.undefined
  /**
    * Horizontal pixel offset for legend symbols.
    *
    * __Default value:__ `0`.
    */
  var symbolOffset: js.UndefOr[N] = js.undefined
  /**
    * Opacity of the legend symbols.
    */
  var symbolOpacity: js.UndefOr[N] = js.undefined
  /**
    * The size of the legend symbol, in pixels.
    *
    * __Default value:__ `100`.
    * @minimum 0
    */
  var symbolSize: js.UndefOr[N] = js.undefined
  /**
    * Stroke color for legend symbols.
    */
  var symbolStrokeColor: js.UndefOr[C] = js.undefined
  /**
    * The width of the symbol's stroke.
    *
    * __Default value:__ `1.5`.
    * @minimum 0
    */
  var symbolStrokeWidth: js.UndefOr[N] = js.undefined
  /**
    * Default shape type (such as "circle") for legend symbols.
    * Can be one of ``"circle"`, `"square"`, `"cross"`, `"diamond"`, `"triangle-up"`, `"triangle-down"`, `"triangle-right"`, or `"triangle-left"`.
    * In addition to a set of built-in shapes, custom shapes can be defined using [SVG path strings](https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths).
    *
    * __Default value:__ `"circle"`.
    */
  var symbolType: js.UndefOr[SY] = js.undefined
  // ---------- Title ----------
  /**
    * Horizontal text alignment for legend titles.
    *
    * __Default value:__ `"left"`.
    */
  var titleAlign: js.UndefOr[A] = js.undefined
  /**
    * Text anchor position for placing legend titles.
    */
  var titleAnchor: js.UndefOr[AN] = js.undefined
  /**
    * Vertical text baseline for legend titles.
    *
    * __Default value:__ `"top"`.
    */
  var titleBaseline: js.UndefOr[TB] = js.undefined
  /**
    * The color of the legend title, can be in hex color code or regular color name.
    */
  var titleColor: js.UndefOr[C] = js.undefined
  /**
    * The font of the legend title.
    */
  var titleFont: js.UndefOr[S] = js.undefined
  /**
    * The font size of the legend title.
    */
  var titleFontSize: js.UndefOr[N] = js.undefined
  /**
    * The font style of the legend title.
    */
  var titleFontStyle: js.UndefOr[FS] = js.undefined
  /**
    * The font weight of the legend title.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var titleFontWeight: js.UndefOr[FW] = js.undefined
  /**
    * Maximum allowed pixel width of axis titles.
    *
    * __Default value:__ `180`.
    * @minimum 0
    */
  var titleLimit: js.UndefOr[N] = js.undefined
  /**
    * Opacity of the legend title.
    */
  var titleOpacity: js.UndefOr[N] = js.undefined
  /**
    * Orientation of the legend title.
    */
  var titleOrient: js.UndefOr[O] = js.undefined
  /**
    * The padding, in pixels, between title and legend.
    *
    * __Default value:__ `5`.
    */
  var titlePadding: js.UndefOr[N] = js.undefined
}

