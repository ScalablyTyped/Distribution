package typings.vegaTypings.axisMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.valuesMod.AlignValue
import typings.vegaTypings.valuesMod.AnchorValue
import typings.vegaTypings.valuesMod.BooleanValue
import typings.vegaTypings.valuesMod.ColorValue
import typings.vegaTypings.valuesMod.DashArrayValue
import typings.vegaTypings.valuesMod.FontStyleValue
import typings.vegaTypings.valuesMod.FontWeightValue
import typings.vegaTypings.valuesMod.NumberValue
import typings.vegaTypings.valuesMod.StringValue
import typings.vegaTypings.valuesMod.StrokeCapValue
import typings.vegaTypings.valuesMod.TextBaselineValue
import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAxis extends js.Object {
  // ---------- ARIA ----------
  /**
    * A boolean flag indicating if [ARIA attributes](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) should be included (SVG output only).
    * If `false`, the "aria-hidden" attribute will be set on the output SVG group, removing the axis from the ARIA accessibility tree.
    *
    * __Default value:__ `true`
    */
  var aria: js.UndefOr[Boolean] = js.undefined
  /**
    * An interpolation fraction indicating where, for `band` scales, axis ticks should be positioned. A value of `0` places ticks at the left edge of their bands. A value of `0.5` places ticks in the middle of their bands.
    *
    *  __Default value:__ `0.5`
    */
  var bandPosition: js.UndefOr[NumberValue] = js.undefined
  /**
    * A text description of this axis for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If the `aria` property is true, for SVG output the ["aria-label" attribute](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/ARIA_Techniques/Using_the_aria-label_attribute) will be set to this description.
    * If the description is unspecified it will be automatically generated.
    */
  var description: js.UndefOr[String] = js.undefined
  // ---------- Domain ----------
  /**
    * A boolean flag indicating if the domain (the axis baseline) should be included as part of the axis.
    *
    * __Default value:__ `true`
    */
  var domain: js.UndefOr[Boolean] = js.undefined
  /**
    * The stroke cap for the domain line's ending style. One of `"butt"`, `"round"` or `"square"`.
    *
    * __Default value:__ `"butt"`
    */
  var domainCap: js.UndefOr[StrokeCapValue] = js.undefined
  /**
    * Color of axis domain line.
    *
    * __Default value:__ `"gray"`.
    */
  var domainColor: js.UndefOr[ColorValue] = js.undefined
  /**
    * An array of alternating [stroke, space] lengths for dashed domain lines.
    */
  var domainDash: js.UndefOr[DashArrayValue] = js.undefined
  /**
    * The pixel offset at which to start drawing with the domain dash array.
    */
  var domainDashOffset: js.UndefOr[NumberValue] = js.undefined
  /**
    * Opacity of the axis domain line.
    */
  var domainOpacity: js.UndefOr[NumberValue] = js.undefined
  /**
    * Stroke width of axis domain line
    *
    * __Default value:__ `1`
    */
  var domainWidth: js.UndefOr[NumberValue] = js.undefined
  // ---------- Grid ----------
  /**
    * A boolean flag indicating if grid lines should be included as part of the axis.
    */
  var grid: js.UndefOr[Boolean] = js.undefined
  /**
    * The stroke cap for grid lines' ending style. One of `"butt"`, `"round"` or `"square"`.
    *
    * __Default value:__ `"butt"`
    */
  var gridCap: js.UndefOr[StrokeCapValue] = js.undefined
  /**
    * Color of gridlines.
    *
    * __Default value:__ `"lightGray"`.
    */
  var gridColor: js.UndefOr[ColorValue] = js.undefined
  /**
    * An array of alternating [stroke, space] lengths for dashed grid lines.
    */
  var gridDash: js.UndefOr[DashArrayValue] = js.undefined
  /**
    * The pixel offset at which to start drawing with the grid dash array.
    */
  var gridDashOffset: js.UndefOr[NumberValue] = js.undefined
  /**
    * The stroke opacity of grid (value between [0,1])
    *
    * __Default value:__ `1`
    * @minimum 0
    * @maximum 1
    */
  var gridOpacity: js.UndefOr[NumberValue] = js.undefined
  /**
    * The grid width, in pixels.
    *
    * __Default value:__ `1`
    * @minimum 0
    */
  var gridWidth: js.UndefOr[NumberValue] = js.undefined
  /**
    * Horizontal text alignment of axis tick labels, overriding the default setting for the current axis orientation.
    */
  var labelAlign: js.UndefOr[AlignValue] = js.undefined
  /**
    * The rotation angle of the axis labels.
    *
    * __Default value:__ `-90` for nominal and ordinal fields; `0` otherwise.
    *
    * @minimum -360
    * @maximum 360
    */
  var labelAngle: js.UndefOr[NumberValue] = js.undefined
  /**
    * Vertical text baseline of axis tick labels, overriding the default setting for the current axis orientation.
    * One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`. The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the *lineHeight* rather than *fontSize* alone.
    */
  var labelBaseline: js.UndefOr[TextBaselineValue] = js.undefined
  /**
    * Indicates if labels should be hidden if they exceed the axis range. If `false` (the default) no bounds overlap analysis is performed. If `true`, labels will be hidden if they exceed the axis range by more than 1 pixel. If this property is a number, it specifies the pixel tolerance: the maximum amount by which a label bounding box may exceed the axis range.
    *
    * __Default value:__ `false`.
    */
  var labelBound: js.UndefOr[Double | Boolean | SignalRef] = js.undefined
  /**
    * The color of the tick label, can be in hex color code or regular color name.
    */
  var labelColor: js.UndefOr[ColorValue] = js.undefined
  /**
    * Indicates if the first and last axis labels should be aligned flush with the scale range. Flush alignment for a horizontal axis will left-align the first label and right-align the last label. For vertical axes, bottom and top text baselines are applied instead. If this property is a number, it also indicates the number of pixels by which to offset the first and last labels; for example, a value of 2 will flush-align the first and last labels and also push them 2 pixels outward from the center of the axis. The additional adjustment can sometimes help the labels better visually group with corresponding axis ticks.
    */
  var labelFlush: js.UndefOr[Double | Boolean | SignalRef] = js.undefined
  /**
    * Indicates the number of pixels by which to offset flush-adjusted labels. For example, a value of `2` will push flush-adjusted labels 2 pixels outward from the center of the axis. Offsets can help the labels better visually group with corresponding axis ticks.
    *
    * __Default value:__ `0`.
    */
  var labelFlushOffset: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The font of the tick label.
    */
  var labelFont: js.UndefOr[StringValue] = js.undefined
  /**
    * The font size of the label, in pixels.
    *
    * @minimum 0
    */
  var labelFontSize: js.UndefOr[NumberValue] = js.undefined
  /**
    * Font style of the title.
    */
  var labelFontStyle: js.UndefOr[FontStyleValue] = js.undefined
  /**
    * Font weight of axis tick labels.
    */
  var labelFontWeight: js.UndefOr[FontWeightValue] = js.undefined
  /**
    * Maximum allowed pixel width of axis tick labels.
    *
    * __Default value:__ `180`
    */
  var labelLimit: js.UndefOr[NumberValue] = js.undefined
  /**
    * Line height in pixels for multi-line label text or label text with `"line-top"` or `"line-bottom"` baseline.
    */
  var labelLineHeight: js.UndefOr[NumberValue] = js.undefined
  /**
    * Position offset in pixels to apply to labels, in addition to tickOffset.
    *
    * __Default value:__ `0`
    */
  var labelOffset: js.UndefOr[NumberValue] = js.undefined
  /**
    * The opacity of the labels.
    */
  var labelOpacity: js.UndefOr[NumberValue] = js.undefined
  /**
    * The strategy to use for resolving overlap of axis labels. If `false` (the default), no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used (this works well for standard linear axes). If set to `"greedy"`, a linear scan of the labels is performed, removing any labels that overlaps with the last visible label (this often works better for log-scaled axes).
    */
  var labelOverlap: js.UndefOr[LabelOverlap | SignalRef] = js.undefined
  /**
    * The padding in pixels between labels and ticks.
    *
    * __Default value:__ `2`
    */
  var labelPadding: js.UndefOr[NumberValue] = js.undefined
  /**
    * The minimum separation that must be between label bounding boxes for them to be considered non-overlapping (default `0`). This property is ignored if *labelOverlap* resolution is not enabled.
    */
  var labelSeparation: js.UndefOr[Double | SignalRef] = js.undefined
  // ---------- Labels ----------
  /**
    * A boolean flag indicating if labels should be included as part of the axis.
    *
    * __Default value:__ `true`.
    */
  var labels: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum extent in pixels that axis ticks and labels should use. This determines a maximum offset value for axis titles.
    *
    * __Default value:__ `undefined`.
    */
  var maxExtent: js.UndefOr[NumberValue] = js.undefined
  /**
    * The minimum extent in pixels that axis ticks and labels should use. This determines a minimum offset value for axis titles.
    *
    * __Default value:__ `30` for y-axis; `undefined` for x-axis.
    */
  var minExtent: js.UndefOr[NumberValue] = js.undefined
  /**
    * For band scales, indicates if ticks and grid lines should be placed at the `"center"` of a band (default) or at the band `"extent"`s to indicate intervals
    */
  var tickBand: js.UndefOr[center | extent | SignalRef] = js.undefined
  /**
    * The stroke cap for the tick lines' ending style. One of `"butt"`, `"round"` or `"square"`.
    *
    * __Default value:__ `"butt"`
    */
  var tickCap: js.UndefOr[StrokeCapValue] = js.undefined
  /**
    * The color of the axis's tick.
    *
    * __Default value:__ `"gray"`
    */
  var tickColor: js.UndefOr[ColorValue] = js.undefined
  /**
    * An array of alternating [stroke, space] lengths for dashed tick mark lines.
    */
  var tickDash: js.UndefOr[DashArrayValue] = js.undefined
  /**
    * The pixel offset at which to start drawing with the tick mark dash array.
    */
  var tickDashOffset: js.UndefOr[NumberValue] = js.undefined
  /**
    * Boolean flag indicating if an extra axis tick should be added for the initial position of the axis. This flag is useful for styling axes for `band` scales such that ticks are placed on band boundaries rather in the middle of a band. Use in conjunction with `"bandPosition": 1` and an axis `"padding"` value of `0`.
    */
  var tickExtra: js.UndefOr[BooleanValue] = js.undefined
  /**
    * Position offset in pixels to apply to ticks, labels, and gridlines.
    */
  var tickOffset: js.UndefOr[NumberValue] = js.undefined
  /**
    * Opacity of the ticks.
    */
  var tickOpacity: js.UndefOr[NumberValue] = js.undefined
  /**
    * Boolean flag indicating if pixel position values should be rounded to the nearest integer.
    *
    * __Default value:__ `true`
    */
  var tickRound: js.UndefOr[BooleanValue] = js.undefined
  /**
    * The size in pixels of axis ticks.
    *
    * __Default value:__ `5`
    * @minimum 0
    */
  var tickSize: js.UndefOr[NumberValue] = js.undefined
  /**
    * The width, in pixels, of ticks.
    *
    * __Default value:__ `1`
    * @minimum 0
    */
  var tickWidth: js.UndefOr[NumberValue] = js.undefined
  // ---------- Ticks ----------
  /**
    * Boolean value that determines whether the axis should include ticks.
    *
    * __Default value:__ `true`
    */
  var ticks: js.UndefOr[BooleanValue] = js.undefined
  /**
    * Horizontal text alignment of axis titles.
    */
  var titleAlign: js.UndefOr[AlignValue] = js.undefined
  /**
    * Text anchor position for placing axis titles.
    */
  var titleAnchor: js.UndefOr[AnchorValue] = js.undefined
  /**
    * Angle in degrees of axis titles.
    */
  var titleAngle: js.UndefOr[NumberValue] = js.undefined
  /**
    * Vertical text baseline for axis titles. One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`. The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the *lineHeight* rather than *fontSize* alone.
    */
  var titleBaseline: js.UndefOr[TextBaselineValue] = js.undefined
  /**
    * Color of the title, can be in hex color code or regular color name.
    */
  var titleColor: js.UndefOr[ColorValue] = js.undefined
  /**
    * Font of the title. (e.g., `"Helvetica Neue"`).
    */
  var titleFont: js.UndefOr[StringValue] = js.undefined
  /**
    * Font size of the title.
    *
    * @minimum 0
    */
  var titleFontSize: js.UndefOr[NumberValue] = js.undefined
  /**
    * Font style of the title.
    */
  var titleFontStyle: js.UndefOr[FontStyleValue] = js.undefined
  /**
    * Font weight of the title.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var titleFontWeight: js.UndefOr[FontWeightValue] = js.undefined
  /**
    * Maximum allowed pixel width of axis titles.
    *
    * @minimum 0
    */
  var titleLimit: js.UndefOr[NumberValue] = js.undefined
  /**
    * Line height in pixels for multi-line title text or title text with `"line-top"` or `"line-bottom"` baseline.
    */
  var titleLineHeight: js.UndefOr[NumberValue] = js.undefined
  /**
    * Opacity of the axis title.
    */
  var titleOpacity: js.UndefOr[NumberValue] = js.undefined
  // ---------- Title ----------
  /**
    * The padding, in pixels, between title and axis.
    */
  var titlePadding: js.UndefOr[NumberValue] = js.undefined
  /**
    * X-coordinate of the axis title relative to the axis group.
    */
  var titleX: js.UndefOr[NumberValue] = js.undefined
  /**
    * Y-coordinate of the axis title relative to the axis group.
    */
  var titleY: js.UndefOr[NumberValue] = js.undefined
  /**
    * Coordinate space translation offset for axis layout. By default, axes are translated by a 0.5 pixel offset for both the x and y coordinates in order to align stroked lines with the pixel grid. However, for vector graphics output these pixel-specific adjustments may be undesirable, in which case translate can be changed (for example, to zero).
    *
    * __Default value:__ `0.5`
    */
  var translate: js.UndefOr[NumberValue] = js.undefined
  /**
    * The integer z-index indicating the layering of the axis group relative to other axis, mark, and legend groups.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[Double] = js.undefined
}

