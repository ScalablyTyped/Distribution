package typings.vegaTypings.legendMod

import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.axisMod.TickCount
import typings.vegaTypings.layoutMod.LayoutAlign
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
import scala.scalajs.js.annotation._

trait BaseLegend extends js.Object {
  // ---------- ARIA ----------
  /**
    * A boolean flag indicating if [ARIA attributes](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) should be included (SVG output only).
    * If `false`, the "aria-hidden" attribute will be set on the output SVG group, removing the legend from the ARIA accessibility tree.
    *
    * __Default value:__ `true`
    */
  var aria: js.UndefOr[Boolean] = js.undefined
  // ---------- Symbol Layout ----------
  /**
    * The height in pixels to clip symbol legend entries and limit their size.
    */
  var clipHeight: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The horizontal padding in pixels between symbol legend entries.
    *
    * __Default value:__ `10`.
    */
  var columnPadding: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The number of columns in which to arrange symbol legend entries. A value of `0` or lower indicates a single row with one column per entry.
    */
  var columns: js.UndefOr[Double | SignalRef] = js.undefined
  // ---------- Legend Group ----------
  /**
    * Corner radius for the full legend.
    */
  var cornerRadius: js.UndefOr[NumberValue] = js.undefined
  /**
    * A text description of this legend for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If the `aria` property is true, for SVG output the ["aria-label" attribute](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/ARIA_Techniques/Using_the_aria-label_attribute) will be set to this description.
    * If the description is unspecified it will be automatically generated.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Background fill color for the full legend.
    */
  var fillColor: js.UndefOr[ColorValue] = js.undefined
  // ---------- Gradient ----------
  /**
    * The length in pixels of the primary axis of a color gradient. This value corresponds to the height of a vertical gradient or the width of a horizontal gradient.
    *
    * __Default value:__ `200`.
    * @minimum 0
    */
  var gradientLength: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * Opacity of the color gradient.
    */
  var gradientOpacity: js.UndefOr[NumberValue] = js.undefined
  /**
    * The color of the gradient stroke, can be in hex color code or regular color name.
    *
    * __Default value:__ `"lightGray"`.
    */
  var gradientStrokeColor: js.UndefOr[ColorValue] = js.undefined
  /**
    * The width of the gradient stroke, in pixels.
    *
    * __Default value:__ `0`.
    * @minimum 0
    */
  var gradientStrokeWidth: js.UndefOr[NumberValue] = js.undefined
  /**
    * The thickness in pixels of the color gradient. This value corresponds to the width of a vertical gradient or the height of a horizontal gradient.
    *
    * __Default value:__ `16`.
    * @minimum 0
    */
  var gradientThickness: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The alignment to apply to symbol legends rows and columns. The supported string values are `"all"`, `"each"` (the default), and `none`. For more information, see the [grid layout documentation](https://vega.github.io/vega/docs/layout).
    *
    * __Default value:__ `"each"`.
    */
  var gridAlign: js.UndefOr[LayoutAlign | SignalRef] = js.undefined
  // ---------- Label ----------
  /**
    * The alignment of the legend label, can be left, center, or right.
    */
  var labelAlign: js.UndefOr[AlignValue] = js.undefined
  /**
    * The position of the baseline of legend label, can be `"top"`, `"middle"`, `"bottom"`, or `"alphabetic"`.
    *
    * __Default value:__ `"middle"`.
    */
  var labelBaseline: js.UndefOr[TextBaselineValue] = js.undefined
  /**
    * The color of the legend label, can be in hex color code or regular color name.
    */
  var labelColor: js.UndefOr[ColorValue] = js.undefined
  /**
    * The font of the legend label.
    */
  var labelFont: js.UndefOr[StringValue] = js.undefined
  /**
    * The font size of legend label.
    *
    * __Default value:__ `10`.
    *
    * @minimum 0
    */
  var labelFontSize: js.UndefOr[NumberValue] = js.undefined
  /**
    * The font style of legend label.
    */
  var labelFontStyle: js.UndefOr[FontStyleValue] = js.undefined
  /**
    * The font weight of legend label.
    */
  var labelFontWeight: js.UndefOr[FontWeightValue] = js.undefined
  /**
    * Maximum allowed pixel width of legend tick labels.
    *
    * __Default value:__ `160`.
    */
  var labelLimit: js.UndefOr[NumberValue] = js.undefined
  /**
    * The offset of the legend label.
    * @minimum 0
    *
    * __Default value:__ `4`.
    */
  var labelOffset: js.UndefOr[NumberValue] = js.undefined
  /**
    * Opacity of labels.
    */
  var labelOpacity: js.UndefOr[NumberValue] = js.undefined
  /**
    * The strategy to use for resolving overlap of labels in gradient legends. If `false`, no overlap reduction is attempted. If set to `true` (default) or `"parity"`, a strategy of removing every other label is used. If set to `"greedy"`, a linear scan of the labels is performed, removing any label that overlaps with the last visible label (this often works better for log-scaled axes).
    *
    * __Default value:__ `true`.
    */
  var labelOverlap: js.UndefOr[LabelOverlap | SignalRef] = js.undefined
  /**
    * Padding in pixels between the legend and legend labels.
    */
  var labelPadding: js.UndefOr[NumberValue] = js.undefined
  /**
    * The minimum separation that must be between label bounding boxes for them to be considered non-overlapping (default `0`). This property is ignored if *labelOverlap* resolution is not enabled.
    */
  var labelSeparation: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * Custom x-position for legend with orient "none".
    */
  var legendX: js.UndefOr[NumberValue] = js.undefined
  /**
    * Custom y-position for legend with orient "none".
    */
  var legendY: js.UndefOr[NumberValue] = js.undefined
  /**
    * The offset in pixels by which to displace the legend from the data rectangle and axes.
    *
    * __Default value:__ `18`.
    */
  var offset: js.UndefOr[NumberValue] = js.undefined
  /**
    * The orientation of the legend, which determines how the legend is positioned within the scene. One of "left", "right", "top-left", "top-right", "bottom-left", "bottom-right", "none".
    *
    * __Default value:__ `"right"`
    */
  var orient: js.UndefOr[LegendOrient | SignalRef] = js.undefined
  /**
    * The padding between the border and content of the legend group.
    *
    * __Default value:__ `0`.
    */
  var padding: js.UndefOr[NumberValue] = js.undefined
  /**
    * The vertical padding in pixels between symbol legend entries.
    *
    * __Default value:__ `2`.
    */
  var rowPadding: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * Border stroke color for the full legend.
    */
  var strokeColor: js.UndefOr[ColorValue] = js.undefined
  // ---------- Symbols ----------
  /**
    * An array of alternating [stroke, space] lengths for dashed symbol strokes.
    */
  var symbolDash: js.UndefOr[DashArrayValue] = js.undefined
  /**
    * The pixel offset at which to start drawing with the symbol stroke dash array.
    */
  var symbolDashOffset: js.UndefOr[NumberValue] = js.undefined
  /**
    * The color of the legend symbol,
    */
  var symbolFillColor: js.UndefOr[ColorValue] = js.undefined
  /**
    * The maximum number of allowed entries for a symbol legend. Additional entries will be dropped.
    */
  var symbolLimit: js.UndefOr[NumberValue] = js.undefined
  /**
    * Horizontal pixel offset for legend symbols.
    *
    * __Default value:__ `0`.
    */
  var symbolOffset: js.UndefOr[NumberValue] = js.undefined
  /**
    * Opacity of the legend symbols.
    */
  var symbolOpacity: js.UndefOr[NumberValue] = js.undefined
  /**
    * The size of the legend symbol, in pixels.
    *
    * __Default value:__ `100`.
    * @minimum 0
    */
  var symbolSize: js.UndefOr[NumberValue] = js.undefined
  /**
    * Stroke color for legend symbols.
    */
  var symbolStrokeColor: js.UndefOr[ColorValue] = js.undefined
  /**
    * The width of the symbol's stroke.
    *
    * __Default value:__ `1.5`.
    * @minimum 0
    */
  var symbolStrokeWidth: js.UndefOr[NumberValue] = js.undefined
  /**
    * The symbol shape. One of the plotting shapes `circle` (default), `square`, `cross`, `diamond`, `triangle-up`, `triangle-down`, `triangle-right`, or `triangle-left`, the line symbol `stroke`, or one of the centered directional shapes `arrow`, `wedge`, or `triangle`. Alternatively, a custom [SVG path string](https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths) can be provided. For correct sizing, custom shape paths should be defined within a square bounding box with coordinates ranging from -1 to 1 along both the x and y dimensions.
    *
    * __Default value:__ `"circle"`.
    */
  var symbolType: js.UndefOr[SymbolShapeValue | SignalRef] = js.undefined
  /**
    * The desired number of tick values for quantitative legends.
    */
  var tickCount: js.UndefOr[TickCount] = js.undefined
  // ---------- Title ----------
  /**
    * Horizontal text alignment for legend titles.
    *
    * __Default value:__ `"left"`.
    */
  var titleAlign: js.UndefOr[AlignValue] = js.undefined
  /**
    * Text anchor position for placing legend titles.
    */
  var titleAnchor: js.UndefOr[AnchorValue] = js.undefined
  /**
    * Vertical text baseline for legend titles.  One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`. The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the *lineHeight* rather than *fontSize* alone.
    *
    * __Default value:__ `"top"`.
    */
  var titleBaseline: js.UndefOr[TextBaselineValue] = js.undefined
  /**
    * The color of the legend title, can be in hex color code or regular color name.
    */
  var titleColor: js.UndefOr[ColorValue] = js.undefined
  /**
    * The font of the legend title.
    */
  var titleFont: js.UndefOr[StringValue] = js.undefined
  /**
    * The font size of the legend title.
    */
  var titleFontSize: js.UndefOr[NumberValue] = js.undefined
  /**
    * The font style of the legend title.
    */
  var titleFontStyle: js.UndefOr[FontStyleValue] = js.undefined
  /**
    * The font weight of the legend title.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var titleFontWeight: js.UndefOr[FontWeightValue] = js.undefined
  /**
    * Maximum allowed pixel width of legend titles.
    *
    * __Default value:__ `180`.
    * @minimum 0
    */
  var titleLimit: js.UndefOr[NumberValue] = js.undefined
  /**
    * Line height in pixels for multi-line title text or title text with `"line-top"` or `"line-bottom"` baseline.
    */
  var titleLineHeight: js.UndefOr[NumberValue] = js.undefined
  /**
    * Opacity of the legend title.
    */
  var titleOpacity: js.UndefOr[NumberValue] = js.undefined
  /**
    * Orientation of the legend title.
    */
  var titleOrient: js.UndefOr[OrientValue] = js.undefined
  /**
    * The padding, in pixels, between title and legend.
    *
    * __Default value:__ `5`.
    */
  var titlePadding: js.UndefOr[NumberValue] = js.undefined
  /**
    * The integer z-index indicating the layering of the legend group relative to other axis, mark, and legend groups.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[Double] = js.undefined
}

