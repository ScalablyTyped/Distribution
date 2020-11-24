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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLegend extends js.Object {
  
  // ---------- ARIA ----------
  /**
    * A boolean flag indicating if [ARIA attributes](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) should be included (SVG output only).
    * If `false`, the "aria-hidden" attribute will be set on the output SVG group, removing the legend from the ARIA accessibility tree.
    *
    * __Default value:__ `true`
    */
  var aria: js.UndefOr[Boolean] = js.native
  
  // ---------- Symbol Layout ----------
  /**
    * The height in pixels to clip symbol legend entries and limit their size.
    */
  var clipHeight: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * The horizontal padding in pixels between symbol legend entries.
    *
    * __Default value:__ `10`.
    */
  var columnPadding: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * The number of columns in which to arrange symbol legend entries. A value of `0` or lower indicates a single row with one column per entry.
    */
  var columns: js.UndefOr[Double | SignalRef] = js.native
  
  // ---------- Legend Group ----------
  /**
    * Corner radius for the full legend.
    */
  var cornerRadius: js.UndefOr[NumberValue] = js.native
  
  /**
    * A text description of this legend for [ARIA accessibility](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA) (SVG output only).
    * If the `aria` property is true, for SVG output the ["aria-label" attribute](https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/ARIA_Techniques/Using_the_aria-label_attribute) will be set to this description.
    * If the description is unspecified it will be automatically generated.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Background fill color for the full legend.
    */
  var fillColor: js.UndefOr[ColorValue] = js.native
  
  // ---------- Gradient ----------
  /**
    * The length in pixels of the primary axis of a color gradient. This value corresponds to the height of a vertical gradient or the width of a horizontal gradient.
    *
    * __Default value:__ `200`.
    * @minimum 0
    */
  var gradientLength: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * Opacity of the color gradient.
    */
  var gradientOpacity: js.UndefOr[NumberValue] = js.native
  
  /**
    * The color of the gradient stroke, can be in hex color code or regular color name.
    *
    * __Default value:__ `"lightGray"`.
    */
  var gradientStrokeColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * The width of the gradient stroke, in pixels.
    *
    * __Default value:__ `0`.
    * @minimum 0
    */
  var gradientStrokeWidth: js.UndefOr[NumberValue] = js.native
  
  /**
    * The thickness in pixels of the color gradient. This value corresponds to the width of a vertical gradient or the height of a horizontal gradient.
    *
    * __Default value:__ `16`.
    * @minimum 0
    */
  var gradientThickness: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * The alignment to apply to symbol legends rows and columns. The supported string values are `"all"`, `"each"` (the default), and `none`. For more information, see the [grid layout documentation](https://vega.github.io/vega/docs/layout).
    *
    * __Default value:__ `"each"`.
    */
  var gridAlign: js.UndefOr[LayoutAlign | SignalRef] = js.native
  
  // ---------- Label ----------
  /**
    * The alignment of the legend label, can be left, center, or right.
    */
  var labelAlign: js.UndefOr[AlignValue] = js.native
  
  /**
    * The position of the baseline of legend label, can be `"top"`, `"middle"`, `"bottom"`, or `"alphabetic"`.
    *
    * __Default value:__ `"middle"`.
    */
  var labelBaseline: js.UndefOr[TextBaselineValue] = js.native
  
  /**
    * The color of the legend label, can be in hex color code or regular color name.
    */
  var labelColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * The font of the legend label.
    */
  var labelFont: js.UndefOr[StringValue] = js.native
  
  /**
    * The font size of legend label.
    *
    * __Default value:__ `10`.
    *
    * @minimum 0
    */
  var labelFontSize: js.UndefOr[NumberValue] = js.native
  
  /**
    * The font style of legend label.
    */
  var labelFontStyle: js.UndefOr[FontStyleValue] = js.native
  
  /**
    * The font weight of legend label.
    */
  var labelFontWeight: js.UndefOr[FontWeightValue] = js.native
  
  /**
    * Maximum allowed pixel width of legend tick labels.
    *
    * __Default value:__ `160`.
    */
  var labelLimit: js.UndefOr[NumberValue] = js.native
  
  /**
    * The offset of the legend label.
    * @minimum 0
    *
    * __Default value:__ `4`.
    */
  var labelOffset: js.UndefOr[NumberValue] = js.native
  
  /**
    * Opacity of labels.
    */
  var labelOpacity: js.UndefOr[NumberValue] = js.native
  
  /**
    * The strategy to use for resolving overlap of labels in gradient legends. If `false`, no overlap reduction is attempted. If set to `true` (default) or `"parity"`, a strategy of removing every other label is used. If set to `"greedy"`, a linear scan of the labels is performed, removing any label that overlaps with the last visible label (this often works better for log-scaled axes).
    *
    * __Default value:__ `true`.
    */
  var labelOverlap: js.UndefOr[LabelOverlap | SignalRef] = js.native
  
  /**
    * Padding in pixels between the legend and legend labels.
    */
  var labelPadding: js.UndefOr[NumberValue] = js.native
  
  /**
    * The minimum separation that must be between label bounding boxes for them to be considered non-overlapping (default `0`). This property is ignored if *labelOverlap* resolution is not enabled.
    */
  var labelSeparation: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * Custom x-position for legend with orient "none".
    */
  var legendX: js.UndefOr[NumberValue] = js.native
  
  /**
    * Custom y-position for legend with orient "none".
    */
  var legendY: js.UndefOr[NumberValue] = js.native
  
  /**
    * The offset in pixels by which to displace the legend from the data rectangle and axes.
    *
    * __Default value:__ `18`.
    */
  var offset: js.UndefOr[NumberValue] = js.native
  
  /**
    * The orientation of the legend, which determines how the legend is positioned within the scene. One of "left", "right", "top-left", "top-right", "bottom-left", "bottom-right", "none".
    *
    * __Default value:__ `"right"`
    */
  var orient: js.UndefOr[LegendOrient | SignalRef] = js.native
  
  /**
    * The padding between the border and content of the legend group.
    *
    * __Default value:__ `0`.
    */
  var padding: js.UndefOr[NumberValue] = js.native
  
  /**
    * The vertical padding in pixels between symbol legend entries.
    *
    * __Default value:__ `2`.
    */
  var rowPadding: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * Border stroke color for the full legend.
    */
  var strokeColor: js.UndefOr[ColorValue] = js.native
  
  // ---------- Symbols ----------
  /**
    * An array of alternating [stroke, space] lengths for dashed symbol strokes.
    */
  var symbolDash: js.UndefOr[DashArrayValue] = js.native
  
  /**
    * The pixel offset at which to start drawing with the symbol stroke dash array.
    */
  var symbolDashOffset: js.UndefOr[NumberValue] = js.native
  
  /**
    * The color of the legend symbol,
    */
  var symbolFillColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * The maximum number of allowed entries for a symbol legend. Additional entries will be dropped.
    */
  var symbolLimit: js.UndefOr[NumberValue] = js.native
  
  /**
    * Horizontal pixel offset for legend symbols.
    *
    * __Default value:__ `0`.
    */
  var symbolOffset: js.UndefOr[NumberValue] = js.native
  
  /**
    * Opacity of the legend symbols.
    */
  var symbolOpacity: js.UndefOr[NumberValue] = js.native
  
  /**
    * The size of the legend symbol, in pixels.
    *
    * __Default value:__ `100`.
    * @minimum 0
    */
  var symbolSize: js.UndefOr[NumberValue] = js.native
  
  /**
    * Stroke color for legend symbols.
    */
  var symbolStrokeColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * The width of the symbol's stroke.
    *
    * __Default value:__ `1.5`.
    * @minimum 0
    */
  var symbolStrokeWidth: js.UndefOr[NumberValue] = js.native
  
  /**
    * The symbol shape. One of the plotting shapes `circle` (default), `square`, `cross`, `diamond`, `triangle-up`, `triangle-down`, `triangle-right`, or `triangle-left`, the line symbol `stroke`, or one of the centered directional shapes `arrow`, `wedge`, or `triangle`. Alternatively, a custom [SVG path string](https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths) can be provided. For correct sizing, custom shape paths should be defined within a square bounding box with coordinates ranging from -1 to 1 along both the x and y dimensions.
    *
    * __Default value:__ `"circle"`.
    */
  var symbolType: js.UndefOr[SymbolShapeValue | SignalRef] = js.native
  
  /**
    * The desired number of tick values for quantitative legends.
    */
  var tickCount: js.UndefOr[TickCount] = js.native
  
  // ---------- Title ----------
  /**
    * Horizontal text alignment for legend titles.
    *
    * __Default value:__ `"left"`.
    */
  var titleAlign: js.UndefOr[AlignValue] = js.native
  
  /**
    * Text anchor position for placing legend titles.
    */
  var titleAnchor: js.UndefOr[AnchorValue] = js.native
  
  /**
    * Vertical text baseline for legend titles.  One of `"alphabetic"` (default), `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`. The `"line-top"` and `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated relative to the *lineHeight* rather than *fontSize* alone.
    *
    * __Default value:__ `"top"`.
    */
  var titleBaseline: js.UndefOr[TextBaselineValue] = js.native
  
  /**
    * The color of the legend title, can be in hex color code or regular color name.
    */
  var titleColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * The font of the legend title.
    */
  var titleFont: js.UndefOr[StringValue] = js.native
  
  /**
    * The font size of the legend title.
    */
  var titleFontSize: js.UndefOr[NumberValue] = js.native
  
  /**
    * The font style of the legend title.
    */
  var titleFontStyle: js.UndefOr[FontStyleValue] = js.native
  
  /**
    * The font weight of the legend title.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var titleFontWeight: js.UndefOr[FontWeightValue] = js.native
  
  /**
    * Maximum allowed pixel width of legend titles.
    *
    * __Default value:__ `180`.
    * @minimum 0
    */
  var titleLimit: js.UndefOr[NumberValue] = js.native
  
  /**
    * Line height in pixels for multi-line title text or title text with `"line-top"` or `"line-bottom"` baseline.
    */
  var titleLineHeight: js.UndefOr[NumberValue] = js.native
  
  /**
    * Opacity of the legend title.
    */
  var titleOpacity: js.UndefOr[NumberValue] = js.native
  
  /**
    * Orientation of the legend title.
    */
  var titleOrient: js.UndefOr[OrientValue] = js.native
  
  /**
    * The padding, in pixels, between title and legend.
    *
    * __Default value:__ `5`.
    */
  var titlePadding: js.UndefOr[NumberValue] = js.native
  
  /**
    * The integer z-index indicating the layering of the legend group relative to other axis, mark, and legend groups.
    *
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[Double] = js.native
}
object BaseLegend {
  
  @scala.inline
  def apply(): BaseLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLegend]
  }
  
  @scala.inline
  implicit class BaseLegendOps[Self <: BaseLegend] (val x: Self) extends AnyVal {
    
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
    def setClipHeight(value: Double | SignalRef): Self = this.set("clipHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipHeight: Self = this.set("clipHeight", js.undefined)
    
    @scala.inline
    def setColumnPadding(value: Double | SignalRef): Self = this.set("columnPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnPadding: Self = this.set("columnPadding", js.undefined)
    
    @scala.inline
    def setColumns(value: Double | SignalRef): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCornerRadius(value: NumberValue): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFillColor(value: ColorValue): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFillColorNull: Self = this.set("fillColor", null)
    
    @scala.inline
    def setGradientLength(value: Double | SignalRef): Self = this.set("gradientLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientLength: Self = this.set("gradientLength", js.undefined)
    
    @scala.inline
    def setGradientOpacity(value: NumberValue): Self = this.set("gradientOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientOpacity: Self = this.set("gradientOpacity", js.undefined)
    
    @scala.inline
    def setGradientStrokeColor(value: ColorValue): Self = this.set("gradientStrokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientStrokeColor: Self = this.set("gradientStrokeColor", js.undefined)
    
    @scala.inline
    def setGradientStrokeColorNull: Self = this.set("gradientStrokeColor", null)
    
    @scala.inline
    def setGradientStrokeWidth(value: NumberValue): Self = this.set("gradientStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientStrokeWidth: Self = this.set("gradientStrokeWidth", js.undefined)
    
    @scala.inline
    def setGradientThickness(value: Double | SignalRef): Self = this.set("gradientThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientThickness: Self = this.set("gradientThickness", js.undefined)
    
    @scala.inline
    def setGridAlign(value: LayoutAlign | SignalRef): Self = this.set("gridAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAlign: Self = this.set("gridAlign", js.undefined)
    
    @scala.inline
    def setLabelAlign(value: AlignValue): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    
    @scala.inline
    def setLabelBaseline(value: TextBaselineValue): Self = this.set("labelBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBaseline: Self = this.set("labelBaseline", js.undefined)
    
    @scala.inline
    def setLabelColor(value: ColorValue): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
    @scala.inline
    def setLabelColorNull: Self = this.set("labelColor", null)
    
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
    def setLegendX(value: NumberValue): Self = this.set("legendX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendX: Self = this.set("legendX", js.undefined)
    
    @scala.inline
    def setLegendY(value: NumberValue): Self = this.set("legendY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendY: Self = this.set("legendY", js.undefined)
    
    @scala.inline
    def setOffset(value: NumberValue): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrient(value: LegendOrient | SignalRef): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    
    @scala.inline
    def setPadding(value: NumberValue): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRowPadding(value: Double | SignalRef): Self = this.set("rowPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowPadding: Self = this.set("rowPadding", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: ColorValue): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeColorNull: Self = this.set("strokeColor", null)
    
    @scala.inline
    def setSymbolDashVarargs(value: Double*): Self = this.set("symbolDash", js.Array(value :_*))
    
    @scala.inline
    def setSymbolDash(value: DashArrayValue): Self = this.set("symbolDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolDash: Self = this.set("symbolDash", js.undefined)
    
    @scala.inline
    def setSymbolDashOffset(value: NumberValue): Self = this.set("symbolDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolDashOffset: Self = this.set("symbolDashOffset", js.undefined)
    
    @scala.inline
    def setSymbolFillColor(value: ColorValue): Self = this.set("symbolFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolFillColor: Self = this.set("symbolFillColor", js.undefined)
    
    @scala.inline
    def setSymbolFillColorNull: Self = this.set("symbolFillColor", null)
    
    @scala.inline
    def setSymbolLimit(value: NumberValue): Self = this.set("symbolLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolLimit: Self = this.set("symbolLimit", js.undefined)
    
    @scala.inline
    def setSymbolOffset(value: NumberValue): Self = this.set("symbolOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolOffset: Self = this.set("symbolOffset", js.undefined)
    
    @scala.inline
    def setSymbolOpacity(value: NumberValue): Self = this.set("symbolOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolOpacity: Self = this.set("symbolOpacity", js.undefined)
    
    @scala.inline
    def setSymbolSize(value: NumberValue): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
    
    @scala.inline
    def setSymbolStrokeColor(value: ColorValue): Self = this.set("symbolStrokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolStrokeColor: Self = this.set("symbolStrokeColor", js.undefined)
    
    @scala.inline
    def setSymbolStrokeColorNull: Self = this.set("symbolStrokeColor", null)
    
    @scala.inline
    def setSymbolStrokeWidth(value: NumberValue): Self = this.set("symbolStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolStrokeWidth: Self = this.set("symbolStrokeWidth", js.undefined)
    
    @scala.inline
    def setSymbolType(value: SymbolShapeValue | SignalRef): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbolType: Self = this.set("symbolType", js.undefined)
    
    @scala.inline
    def setTickCount(value: TickCount): Self = this.set("tickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickCount: Self = this.set("tickCount", js.undefined)
    
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
    def setTitleOrient(value: OrientValue): Self = this.set("titleOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleOrient: Self = this.set("titleOrient", js.undefined)
    
    @scala.inline
    def setTitlePadding(value: NumberValue): Self = this.set("titlePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePadding: Self = this.set("titlePadding", js.undefined)
    
    @scala.inline
    def setZindex(value: Double): Self = this.set("zindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZindex: Self = this.set("zindex", js.undefined)
  }
}
