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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAxis extends js.Object {
  
  // ---------- ARIA ----------
  /**
    * A boolean flag indicating if [ARIA attributes](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) should be included (SVG output only).
    * If `false`, the "aria-hidden" attribute will be set on the output SVG group, removing the axis from the ARIA accessibility tree.
    *
    * __Default value:__ `true`
    */
  var aria: js.UndefOr[Boolean] = js.native
  
  /**
    * An interpolation fraction indicating where, for `band` scales, axis ticks should be positioned. A value of `0` places ticks at the left edge of their bands. A value of `0.5` places ticks in the middle of their bands.
    *
    *  __Default value:__ `0.5`
    */
  var bandPosition: js.UndefOr[NumberValue] = js.native
  
  /**
    * A text description of this axis for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If the `aria` property is true, for SVG output the ["aria-label" attribute](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/ARIA_Techniques/Using_the_aria-label_attribute) will be set to this description.
    * If the description is unspecified it will be automatically generated.
    */
  var description: js.UndefOr[String] = js.native
  
  // ---------- Domain ----------
  /**
    * A boolean flag indicating if the domain (the axis baseline) should be included as part of the axis.
    *
    * __Default value:__ `true`
    */
  var domain: js.UndefOr[Boolean] = js.native
  
  /**
    * The stroke cap for the domain line's ending style. One of `"butt"`, `"round"` or `"square"`.
    *
    * __Default value:__ `"butt"`
    */
  var domainCap: js.UndefOr[StrokeCapValue] = js.native
  
  /**
    * Color of axis domain line.
    *
    * __Default value:__ `"gray"`.
    */
  var domainColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * An array of alternating [stroke, space] lengths for dashed domain lines.
    */
  var domainDash: js.UndefOr[DashArrayValue] = js.native
  
  /**
    * The pixel offset at which to start drawing with the domain dash array.
    */
  var domainDashOffset: js.UndefOr[NumberValue] = js.native
  
  /**
    * Opacity of the axis domain line.
    */
  var domainOpacity: js.UndefOr[NumberValue] = js.native
  
  /**
    * Stroke width of axis domain line
    *
    * __Default value:__ `1`
    */
  var domainWidth: js.UndefOr[NumberValue] = js.native
  
  // ---------- Grid ----------
  /**
    * A boolean flag indicating if grid lines should be included as part of the axis.
    */
  var grid: js.UndefOr[Boolean] = js.native
  
  /**
    * The stroke cap for grid lines' ending style. One of `"butt"`, `"round"` or `"square"`.
    *
    * __Default value:__ `"butt"`
    */
  var gridCap: js.UndefOr[StrokeCapValue] = js.native
  
  /**
    * Color of gridlines.
    *
    * __Default value:__ `"lightGray"`.
    */
  var gridColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * An array of alternating [stroke, space] lengths for dashed grid lines.
    */
  var gridDash: js.UndefOr[DashArrayValue] = js.native
  
  /**
    * The pixel offset at which to start drawing with the grid dash array.
    */
  var gridDashOffset: js.UndefOr[NumberValue] = js.native
  
  /**
    * The stroke opacity of grid (value between [0,1])
    *
    * __Default value:__ `1`
    * @minimum 0
    * @maximum 1
    */
  var gridOpacity: js.UndefOr[NumberValue] = js.native
  
  /**
    * The grid width, in pixels.
    *
    * __Default value:__ `1`
    * @minimum 0
    */
  var gridWidth: js.UndefOr[NumberValue] = js.native
  
  /**
    * Horizontal text alignment of axis tick labels, overriding the default setting for the current axis orientation.
    */
  var labelAlign: js.UndefOr[AlignValue] = js.native
  
  /**
    * The rotation angle of the axis labels.
    *
    * __Default value:__ `-90` for nominal and ordinal fields; `0` otherwise.
    *
    * @minimum -360
    * @maximum 360
    */
  var labelAngle: js.UndefOr[NumberValue] = js.native
  
  /**
    * Vertical text baseline of axis tick labels, overriding the default setting for the current axis orientation.
    * One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`. The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the *lineHeight* rather than *fontSize* alone.
    */
  var labelBaseline: js.UndefOr[TextBaselineValue] = js.native
  
  /**
    * Indicates if labels should be hidden if they exceed the axis range. If `false` (the default) no bounds overlap analysis is performed. If `true`, labels will be hidden if they exceed the axis range by more than 1 pixel. If this property is a number, it specifies the pixel tolerance: the maximum amount by which a label bounding box may exceed the axis range.
    *
    * __Default value:__ `false`.
    */
  var labelBound: js.UndefOr[Double | Boolean | SignalRef] = js.native
  
  /**
    * The color of the tick label, can be in hex color code or regular color name.
    */
  var labelColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Indicates if the first and last axis labels should be aligned flush with the scale range. Flush alignment for a horizontal axis will left-align the first label and right-align the last label. For vertical axes, bottom and top text baselines are applied instead. If this property is a number, it also indicates the number of pixels by which to offset the first and last labels; for example, a value of 2 will flush-align the first and last labels and also push them 2 pixels outward from the center of the axis. The additional adjustment can sometimes help the labels better visually group with corresponding axis ticks.
    */
  var labelFlush: js.UndefOr[Double | Boolean | SignalRef] = js.native
  
  /**
    * Indicates the number of pixels by which to offset flush-adjusted labels. For example, a value of `2` will push flush-adjusted labels 2 pixels outward from the center of the axis. Offsets can help the labels better visually group with corresponding axis ticks.
    *
    * __Default value:__ `0`.
    */
  var labelFlushOffset: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * The font of the tick label.
    */
  var labelFont: js.UndefOr[StringValue] = js.native
  
  /**
    * The font size of the label, in pixels.
    *
    * @minimum 0
    */
  var labelFontSize: js.UndefOr[NumberValue] = js.native
  
  /**
    * Font style of the title.
    */
  var labelFontStyle: js.UndefOr[FontStyleValue] = js.native
  
  /**
    * Font weight of axis tick labels.
    */
  var labelFontWeight: js.UndefOr[FontWeightValue] = js.native
  
  /**
    * Maximum allowed pixel width of axis tick labels.
    *
    * __Default value:__ `180`
    */
  var labelLimit: js.UndefOr[NumberValue] = js.native
  
  /**
    * Line height in pixels for multi-line label text or label text with `"line-top"` or `"line-bottom"` baseline.
    */
  var labelLineHeight: js.UndefOr[NumberValue] = js.native
  
  /**
    * Position offset in pixels to apply to labels, in addition to tickOffset.
    *
    * __Default value:__ `0`
    */
  var labelOffset: js.UndefOr[NumberValue] = js.native
  
  /**
    * The opacity of the labels.
    */
  var labelOpacity: js.UndefOr[NumberValue] = js.native
  
  /**
    * The strategy to use for resolving overlap of axis labels. If `false` (the default), no overlap reduction is attempted. If set to `true` or `"parity"`, a strategy of removing every other label is used (this works well for standard linear axes). If set to `"greedy"`, a linear scan of the labels is performed, removing any labels that overlaps with the last visible label (this often works better for log-scaled axes).
    */
  var labelOverlap: js.UndefOr[LabelOverlap | SignalRef] = js.native
  
  /**
    * The padding in pixels between labels and ticks.
    *
    * __Default value:__ `2`
    */
  var labelPadding: js.UndefOr[NumberValue] = js.native
  
  /**
    * The minimum separation that must be between label bounding boxes for them to be considered non-overlapping (default `0`). This property is ignored if *labelOverlap* resolution is not enabled.
    */
  var labelSeparation: js.UndefOr[Double | SignalRef] = js.native
  
  // ---------- Labels ----------
  /**
    * A boolean flag indicating if labels should be included as part of the axis.
    *
    * __Default value:__ `true`.
    */
  var labels: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum extent in pixels that axis ticks and labels should use. This determines a maximum offset value for axis titles.
    *
    * __Default value:__ `undefined`.
    */
  var maxExtent: js.UndefOr[NumberValue] = js.native
  
  /**
    * The minimum extent in pixels that axis ticks and labels should use. This determines a minimum offset value for axis titles.
    *
    * __Default value:__ `30` for y-axis; `undefined` for x-axis.
    */
  var minExtent: js.UndefOr[NumberValue] = js.native
  
  /**
    * For band scales, indicates if ticks and grid lines should be placed at the `"center"` of a band (default) or at the band `"extent"`s to indicate intervals
    */
  var tickBand: js.UndefOr[center | extent | SignalRef] = js.native
  
  /**
    * The stroke cap for the tick lines' ending style. One of `"butt"`, `"round"` or `"square"`.
    *
    * __Default value:__ `"butt"`
    */
  var tickCap: js.UndefOr[StrokeCapValue] = js.native
  
  /**
    * The color of the axis's tick.
    *
    * __Default value:__ `"gray"`
    */
  var tickColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * An array of alternating [stroke, space] lengths for dashed tick mark lines.
    */
  var tickDash: js.UndefOr[DashArrayValue] = js.native
  
  /**
    * The pixel offset at which to start drawing with the tick mark dash array.
    */
  var tickDashOffset: js.UndefOr[NumberValue] = js.native
  
  /**
    * Boolean flag indicating if an extra axis tick should be added for the initial position of the axis. This flag is useful for styling axes for `band` scales such that ticks are placed on band boundaries rather in the middle of a band. Use in conjunction with `"bandPosition": 1` and an axis `"padding"` value of `0`.
    */
  var tickExtra: js.UndefOr[BooleanValue] = js.native
  
  /**
    * Position offset in pixels to apply to ticks, labels, and gridlines.
    */
  var tickOffset: js.UndefOr[NumberValue] = js.native
  
  /**
    * Opacity of the ticks.
    */
  var tickOpacity: js.UndefOr[NumberValue] = js.native
  
  /**
    * Boolean flag indicating if pixel position values should be rounded to the nearest integer.
    *
    * __Default value:__ `true`
    */
  var tickRound: js.UndefOr[BooleanValue] = js.native
  
  /**
    * The size in pixels of axis ticks.
    *
    * __Default value:__ `5`
    * @minimum 0
    */
  var tickSize: js.UndefOr[NumberValue] = js.native
  
  /**
    * The width, in pixels, of ticks.
    *
    * __Default value:__ `1`
    * @minimum 0
    */
  var tickWidth: js.UndefOr[NumberValue] = js.native
  
  // ---------- Ticks ----------
  /**
    * Boolean value that determines whether the axis should include ticks.
    *
    * __Default value:__ `true`
    */
  var ticks: js.UndefOr[BooleanValue] = js.native
  
  /**
    * Horizontal text alignment of axis titles.
    */
  var titleAlign: js.UndefOr[AlignValue] = js.native
  
  /**
    * Text anchor position for placing axis titles.
    */
  var titleAnchor: js.UndefOr[AnchorValue] = js.native
  
  /**
    * Angle in degrees of axis titles.
    */
  var titleAngle: js.UndefOr[NumberValue] = js.native
  
  /**
    * Vertical text baseline for axis titles. One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`. The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the *lineHeight* rather than *fontSize* alone.
    */
  var titleBaseline: js.UndefOr[TextBaselineValue] = js.native
  
  /**
    * Color of the title, can be in hex color code or regular color name.
    */
  var titleColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * Font of the title. (e.g., `"Helvetica Neue"`).
    */
  var titleFont: js.UndefOr[StringValue] = js.native
  
  /**
    * Font size of the title.
    *
    * @minimum 0
    */
  var titleFontSize: js.UndefOr[NumberValue] = js.native
  
  /**
    * Font style of the title.
    */
  var titleFontStyle: js.UndefOr[FontStyleValue] = js.native
  
  /**
    * Font weight of the title.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var titleFontWeight: js.UndefOr[FontWeightValue] = js.native
  
  /**
    * Maximum allowed pixel width of axis titles.
    *
    * @minimum 0
    */
  var titleLimit: js.UndefOr[NumberValue] = js.native
  
  /**
    * Line height in pixels for multi-line title text or title text with `"line-top"` or `"line-bottom"` baseline.
    */
  var titleLineHeight: js.UndefOr[NumberValue] = js.native
  
  /**
    * Opacity of the axis title.
    */
  var titleOpacity: js.UndefOr[NumberValue] = js.native
  
  // ---------- Title ----------
  /**
    * The padding, in pixels, between title and axis.
    */
  var titlePadding: js.UndefOr[NumberValue] = js.native
  
  /**
    * X-coordinate of the axis title relative to the axis group.
    */
  var titleX: js.UndefOr[NumberValue] = js.native
  
  /**
    * Y-coordinate of the axis title relative to the axis group.
    */
  var titleY: js.UndefOr[NumberValue] = js.native
  
  /**
    * Coordinate space translation offset for axis layout. By default, axes are translated by a 0.5 pixel offset for both the x and y coordinates in order to align stroked lines with the pixel grid. However, for vector graphics output these pixel-specific adjustments may be undesirable, in which case translate can be changed (for example, to zero).
    *
    * __Default value:__ `0.5`
    */
  var translate: js.UndefOr[NumberValue] = js.native
  
  /**
    * The integer z-index indicating the layering of the axis group relative to other axis, mark, and legend groups.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[Double] = js.native
}
object BaseAxis {
  
  @scala.inline
  def apply(): BaseAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAxis]
  }
  
  @scala.inline
  implicit class BaseAxisOps[Self <: BaseAxis] (val x: Self) extends AnyVal {
    
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
    def setAria(value: Boolean): Self = this.set("aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    
    @scala.inline
    def setBandPosition(value: NumberValue): Self = this.set("bandPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandPosition: Self = this.set("bandPosition", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDomain(value: Boolean): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDomainCap(value: StrokeCapValue): Self = this.set("domainCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainCap: Self = this.set("domainCap", js.undefined)
    
    @scala.inline
    def setDomainColor(value: ColorValue): Self = this.set("domainColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainColor: Self = this.set("domainColor", js.undefined)
    
    @scala.inline
    def setDomainColorNull: Self = this.set("domainColor", null)
    
    @scala.inline
    def setDomainDashVarargs(value: Double*): Self = this.set("domainDash", js.Array(value :_*))
    
    @scala.inline
    def setDomainDash(value: DashArrayValue): Self = this.set("domainDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainDash: Self = this.set("domainDash", js.undefined)
    
    @scala.inline
    def setDomainDashOffset(value: NumberValue): Self = this.set("domainDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainDashOffset: Self = this.set("domainDashOffset", js.undefined)
    
    @scala.inline
    def setDomainOpacity(value: NumberValue): Self = this.set("domainOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainOpacity: Self = this.set("domainOpacity", js.undefined)
    
    @scala.inline
    def setDomainWidth(value: NumberValue): Self = this.set("domainWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainWidth: Self = this.set("domainWidth", js.undefined)
    
    @scala.inline
    def setGrid(value: Boolean): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setGridCap(value: StrokeCapValue): Self = this.set("gridCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridCap: Self = this.set("gridCap", js.undefined)
    
    @scala.inline
    def setGridColor(value: ColorValue): Self = this.set("gridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridColor: Self = this.set("gridColor", js.undefined)
    
    @scala.inline
    def setGridColorNull: Self = this.set("gridColor", null)
    
    @scala.inline
    def setGridDashVarargs(value: Double*): Self = this.set("gridDash", js.Array(value :_*))
    
    @scala.inline
    def setGridDash(value: DashArrayValue): Self = this.set("gridDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridDash: Self = this.set("gridDash", js.undefined)
    
    @scala.inline
    def setGridDashOffset(value: NumberValue): Self = this.set("gridDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridDashOffset: Self = this.set("gridDashOffset", js.undefined)
    
    @scala.inline
    def setGridOpacity(value: NumberValue): Self = this.set("gridOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridOpacity: Self = this.set("gridOpacity", js.undefined)
    
    @scala.inline
    def setGridWidth(value: NumberValue): Self = this.set("gridWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridWidth: Self = this.set("gridWidth", js.undefined)
    
    @scala.inline
    def setLabelAlign(value: AlignValue): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    
    @scala.inline
    def setLabelAngle(value: NumberValue): Self = this.set("labelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAngle: Self = this.set("labelAngle", js.undefined)
    
    @scala.inline
    def setLabelBaseline(value: TextBaselineValue): Self = this.set("labelBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBaseline: Self = this.set("labelBaseline", js.undefined)
    
    @scala.inline
    def setLabelBound(value: Double | Boolean | SignalRef): Self = this.set("labelBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBound: Self = this.set("labelBound", js.undefined)
    
    @scala.inline
    def setLabelColor(value: ColorValue): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
    @scala.inline
    def setLabelColorNull: Self = this.set("labelColor", null)
    
    @scala.inline
    def setLabelFlush(value: Double | Boolean | SignalRef): Self = this.set("labelFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFlush: Self = this.set("labelFlush", js.undefined)
    
    @scala.inline
    def setLabelFlushOffset(value: Double | SignalRef): Self = this.set("labelFlushOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFlushOffset: Self = this.set("labelFlushOffset", js.undefined)
    
    @scala.inline
    def setLabelFont(value: StringValue): Self = this.set("labelFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFont: Self = this.set("labelFont", js.undefined)
    
    @scala.inline
    def setLabelFontSize(value: NumberValue): Self = this.set("labelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFontSize: Self = this.set("labelFontSize", js.undefined)
    
    @scala.inline
    def setLabelFontStyle(value: FontStyleValue): Self = this.set("labelFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFontStyle: Self = this.set("labelFontStyle", js.undefined)
    
    @scala.inline
    def setLabelFontWeight(value: FontWeightValue): Self = this.set("labelFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFontWeight: Self = this.set("labelFontWeight", js.undefined)
    
    @scala.inline
    def setLabelLimit(value: NumberValue): Self = this.set("labelLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLimit: Self = this.set("labelLimit", js.undefined)
    
    @scala.inline
    def setLabelLineHeight(value: NumberValue): Self = this.set("labelLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLineHeight: Self = this.set("labelLineHeight", js.undefined)
    
    @scala.inline
    def setLabelOffset(value: NumberValue): Self = this.set("labelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOffset: Self = this.set("labelOffset", js.undefined)
    
    @scala.inline
    def setLabelOpacity(value: NumberValue): Self = this.set("labelOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOpacity: Self = this.set("labelOpacity", js.undefined)
    
    @scala.inline
    def setLabelOverlap(value: LabelOverlap | SignalRef): Self = this.set("labelOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOverlap: Self = this.set("labelOverlap", js.undefined)
    
    @scala.inline
    def setLabelPadding(value: NumberValue): Self = this.set("labelPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPadding: Self = this.set("labelPadding", js.undefined)
    
    @scala.inline
    def setLabelSeparation(value: Double | SignalRef): Self = this.set("labelSeparation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSeparation: Self = this.set("labelSeparation", js.undefined)
    
    @scala.inline
    def setLabels(value: Boolean): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMaxExtent(value: NumberValue): Self = this.set("maxExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxExtent: Self = this.set("maxExtent", js.undefined)
    
    @scala.inline
    def setMinExtent(value: NumberValue): Self = this.set("minExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinExtent: Self = this.set("minExtent", js.undefined)
    
    @scala.inline
    def setTickBand(value: center | extent | SignalRef): Self = this.set("tickBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickBand: Self = this.set("tickBand", js.undefined)
    
    @scala.inline
    def setTickCap(value: StrokeCapValue): Self = this.set("tickCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickCap: Self = this.set("tickCap", js.undefined)
    
    @scala.inline
    def setTickColor(value: ColorValue): Self = this.set("tickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickColor: Self = this.set("tickColor", js.undefined)
    
    @scala.inline
    def setTickColorNull: Self = this.set("tickColor", null)
    
    @scala.inline
    def setTickDashVarargs(value: Double*): Self = this.set("tickDash", js.Array(value :_*))
    
    @scala.inline
    def setTickDash(value: DashArrayValue): Self = this.set("tickDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickDash: Self = this.set("tickDash", js.undefined)
    
    @scala.inline
    def setTickDashOffset(value: NumberValue): Self = this.set("tickDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickDashOffset: Self = this.set("tickDashOffset", js.undefined)
    
    @scala.inline
    def setTickExtra(value: BooleanValue): Self = this.set("tickExtra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickExtra: Self = this.set("tickExtra", js.undefined)
    
    @scala.inline
    def setTickOffset(value: NumberValue): Self = this.set("tickOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickOffset: Self = this.set("tickOffset", js.undefined)
    
    @scala.inline
    def setTickOpacity(value: NumberValue): Self = this.set("tickOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickOpacity: Self = this.set("tickOpacity", js.undefined)
    
    @scala.inline
    def setTickRound(value: BooleanValue): Self = this.set("tickRound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickRound: Self = this.set("tickRound", js.undefined)
    
    @scala.inline
    def setTickSize(value: NumberValue): Self = this.set("tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickSize: Self = this.set("tickSize", js.undefined)
    
    @scala.inline
    def setTickWidth(value: NumberValue): Self = this.set("tickWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickWidth: Self = this.set("tickWidth", js.undefined)
    
    @scala.inline
    def setTicks(value: BooleanValue): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setTitleAlign(value: AlignValue): Self = this.set("titleAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAlign: Self = this.set("titleAlign", js.undefined)
    
    @scala.inline
    def setTitleAnchor(value: AnchorValue): Self = this.set("titleAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAnchor: Self = this.set("titleAnchor", js.undefined)
    
    @scala.inline
    def setTitleAnchorNull: Self = this.set("titleAnchor", null)
    
    @scala.inline
    def setTitleAngle(value: NumberValue): Self = this.set("titleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAngle: Self = this.set("titleAngle", js.undefined)
    
    @scala.inline
    def setTitleBaseline(value: TextBaselineValue): Self = this.set("titleBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleBaseline: Self = this.set("titleBaseline", js.undefined)
    
    @scala.inline
    def setTitleColor(value: ColorValue): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
    
    @scala.inline
    def setTitleColorNull: Self = this.set("titleColor", null)
    
    @scala.inline
    def setTitleFont(value: StringValue): Self = this.set("titleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFont: Self = this.set("titleFont", js.undefined)
    
    @scala.inline
    def setTitleFontSize(value: NumberValue): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontSize: Self = this.set("titleFontSize", js.undefined)
    
    @scala.inline
    def setTitleFontStyle(value: FontStyleValue): Self = this.set("titleFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontStyle: Self = this.set("titleFontStyle", js.undefined)
    
    @scala.inline
    def setTitleFontWeight(value: FontWeightValue): Self = this.set("titleFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontWeight: Self = this.set("titleFontWeight", js.undefined)
    
    @scala.inline
    def setTitleLimit(value: NumberValue): Self = this.set("titleLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLimit: Self = this.set("titleLimit", js.undefined)
    
    @scala.inline
    def setTitleLineHeight(value: NumberValue): Self = this.set("titleLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLineHeight: Self = this.set("titleLineHeight", js.undefined)
    
    @scala.inline
    def setTitleOpacity(value: NumberValue): Self = this.set("titleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleOpacity: Self = this.set("titleOpacity", js.undefined)
    
    @scala.inline
    def setTitlePadding(value: NumberValue): Self = this.set("titlePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePadding: Self = this.set("titlePadding", js.undefined)
    
    @scala.inline
    def setTitleX(value: NumberValue): Self = this.set("titleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleX: Self = this.set("titleX", js.undefined)
    
    @scala.inline
    def setTitleY(value: NumberValue): Self = this.set("titleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleY: Self = this.set("titleY", js.undefined)
    
    @scala.inline
    def setTranslate(value: NumberValue): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setZindex(value: Double): Self = this.set("zindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZindex: Self = this.set("zindex", js.undefined)
  }
}
