package typings.vegaTypings

import typings.vegaTypings.axisMod.FormatType
import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.axisMod.TickCount
import typings.vegaTypings.axisMod.TimeFormatSpecifier
import typings.vegaTypings.encodeMod.GroupEncodeEntry
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.RectEncodeEntry
import typings.vegaTypings.encodeMod.SymbolEncodeEntry
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.encodeMod.TextEncodeEntry
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendMod {
  
  trait BaseLegend extends StObject {
    
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
  object BaseLegend {
    
    inline def apply(): BaseLegend = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseLegend]
    }
    
    extension [Self <: BaseLegend](x: Self) {
      
      inline def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setClipHeight(value: Double | SignalRef): Self = StObject.set(x, "clipHeight", value.asInstanceOf[js.Any])
      
      inline def setClipHeightUndefined: Self = StObject.set(x, "clipHeight", js.undefined)
      
      inline def setColumnPadding(value: Double | SignalRef): Self = StObject.set(x, "columnPadding", value.asInstanceOf[js.Any])
      
      inline def setColumnPaddingUndefined: Self = StObject.set(x, "columnPadding", js.undefined)
      
      inline def setColumns(value: Double | SignalRef): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setCornerRadius(value: NumberValue): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFillColor(value: ColorValue): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorNull: Self = StObject.set(x, "fillColor", null)
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setGradientLength(value: Double | SignalRef): Self = StObject.set(x, "gradientLength", value.asInstanceOf[js.Any])
      
      inline def setGradientLengthUndefined: Self = StObject.set(x, "gradientLength", js.undefined)
      
      inline def setGradientOpacity(value: NumberValue): Self = StObject.set(x, "gradientOpacity", value.asInstanceOf[js.Any])
      
      inline def setGradientOpacityUndefined: Self = StObject.set(x, "gradientOpacity", js.undefined)
      
      inline def setGradientStrokeColor(value: ColorValue): Self = StObject.set(x, "gradientStrokeColor", value.asInstanceOf[js.Any])
      
      inline def setGradientStrokeColorNull: Self = StObject.set(x, "gradientStrokeColor", null)
      
      inline def setGradientStrokeColorUndefined: Self = StObject.set(x, "gradientStrokeColor", js.undefined)
      
      inline def setGradientStrokeWidth(value: NumberValue): Self = StObject.set(x, "gradientStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setGradientStrokeWidthUndefined: Self = StObject.set(x, "gradientStrokeWidth", js.undefined)
      
      inline def setGradientThickness(value: Double | SignalRef): Self = StObject.set(x, "gradientThickness", value.asInstanceOf[js.Any])
      
      inline def setGradientThicknessUndefined: Self = StObject.set(x, "gradientThickness", js.undefined)
      
      inline def setGridAlign(value: LayoutAlign | SignalRef): Self = StObject.set(x, "gridAlign", value.asInstanceOf[js.Any])
      
      inline def setGridAlignUndefined: Self = StObject.set(x, "gridAlign", js.undefined)
      
      inline def setLabelAlign(value: AlignValue): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelBaseline(value: TextBaselineValue): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      inline def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      inline def setLabelColor(value: ColorValue): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLabelFont(value: StringValue): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSize(value: NumberValue): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      inline def setLabelFontStyle(value: FontStyleValue): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      inline def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      inline def setLabelFontWeight(value: FontWeightValue): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      inline def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      inline def setLabelLimit(value: NumberValue): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      inline def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      inline def setLabelOffset(value: NumberValue): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      inline def setLabelOpacity(value: NumberValue): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      inline def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      inline def setLabelOverlap(value: LabelOverlap | SignalRef): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      inline def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      inline def setLabelPadding(value: NumberValue): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      inline def setLabelSeparation(value: Double | SignalRef): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      inline def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      inline def setLegendX(value: NumberValue): Self = StObject.set(x, "legendX", value.asInstanceOf[js.Any])
      
      inline def setLegendXUndefined: Self = StObject.set(x, "legendX", js.undefined)
      
      inline def setLegendY(value: NumberValue): Self = StObject.set(x, "legendY", value.asInstanceOf[js.Any])
      
      inline def setLegendYUndefined: Self = StObject.set(x, "legendY", js.undefined)
      
      inline def setOffset(value: NumberValue): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrient(value: LegendOrient | SignalRef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setPadding(value: NumberValue): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRowPadding(value: Double | SignalRef): Self = StObject.set(x, "rowPadding", value.asInstanceOf[js.Any])
      
      inline def setRowPaddingUndefined: Self = StObject.set(x, "rowPadding", js.undefined)
      
      inline def setStrokeColor(value: ColorValue): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorNull: Self = StObject.set(x, "strokeColor", null)
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setSymbolDash(value: DashArrayValue): Self = StObject.set(x, "symbolDash", value.asInstanceOf[js.Any])
      
      inline def setSymbolDashOffset(value: NumberValue): Self = StObject.set(x, "symbolDashOffset", value.asInstanceOf[js.Any])
      
      inline def setSymbolDashOffsetUndefined: Self = StObject.set(x, "symbolDashOffset", js.undefined)
      
      inline def setSymbolDashUndefined: Self = StObject.set(x, "symbolDash", js.undefined)
      
      inline def setSymbolDashVarargs(value: Double*): Self = StObject.set(x, "symbolDash", js.Array(value :_*))
      
      inline def setSymbolFillColor(value: ColorValue): Self = StObject.set(x, "symbolFillColor", value.asInstanceOf[js.Any])
      
      inline def setSymbolFillColorNull: Self = StObject.set(x, "symbolFillColor", null)
      
      inline def setSymbolFillColorUndefined: Self = StObject.set(x, "symbolFillColor", js.undefined)
      
      inline def setSymbolLimit(value: NumberValue): Self = StObject.set(x, "symbolLimit", value.asInstanceOf[js.Any])
      
      inline def setSymbolLimitUndefined: Self = StObject.set(x, "symbolLimit", js.undefined)
      
      inline def setSymbolOffset(value: NumberValue): Self = StObject.set(x, "symbolOffset", value.asInstanceOf[js.Any])
      
      inline def setSymbolOffsetUndefined: Self = StObject.set(x, "symbolOffset", js.undefined)
      
      inline def setSymbolOpacity(value: NumberValue): Self = StObject.set(x, "symbolOpacity", value.asInstanceOf[js.Any])
      
      inline def setSymbolOpacityUndefined: Self = StObject.set(x, "symbolOpacity", js.undefined)
      
      inline def setSymbolSize(value: NumberValue): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
      
      inline def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
      
      inline def setSymbolStrokeColor(value: ColorValue): Self = StObject.set(x, "symbolStrokeColor", value.asInstanceOf[js.Any])
      
      inline def setSymbolStrokeColorNull: Self = StObject.set(x, "symbolStrokeColor", null)
      
      inline def setSymbolStrokeColorUndefined: Self = StObject.set(x, "symbolStrokeColor", js.undefined)
      
      inline def setSymbolStrokeWidth(value: NumberValue): Self = StObject.set(x, "symbolStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setSymbolStrokeWidthUndefined: Self = StObject.set(x, "symbolStrokeWidth", js.undefined)
      
      inline def setSymbolType(value: SymbolShapeValue | SignalRef): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      inline def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
      
      inline def setTickCount(value: TickCount): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      inline def setTitleAlign(value: AlignValue): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      inline def setTitleAnchor(value: AnchorValue): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      inline def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      inline def setTitleBaseline(value: TextBaselineValue): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      inline def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      inline def setTitleColor(value: ColorValue): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      inline def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
      
      inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      inline def setTitleFont(value: StringValue): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      inline def setTitleFontSize(value: NumberValue): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      inline def setTitleFontStyle(value: FontStyleValue): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      inline def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      inline def setTitleFontWeight(value: FontWeightValue): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      inline def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      inline def setTitleLimit(value: NumberValue): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      inline def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      inline def setTitleLineHeight(value: NumberValue): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      inline def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      inline def setTitleOpacity(value: NumberValue): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      inline def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      inline def setTitleOrient(value: OrientValue): Self = StObject.set(x, "titleOrient", value.asInstanceOf[js.Any])
      
      inline def setTitleOrientUndefined: Self = StObject.set(x, "titleOrient", js.undefined)
      
      inline def setTitlePadding(value: NumberValue): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      inline def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  trait GuideEncodeEntry[T] extends StObject {
    
    var enter: js.UndefOr[T] = js.undefined
    
    var exit: js.UndefOr[T] = js.undefined
    
    var hover: js.UndefOr[T] = js.undefined
    
    /**
      * A boolean flag indicating if the guide element should respond to input events such as mouse hover.
      */
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A mark style property to apply to the guide group mark.
      */
    var style: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var update: js.UndefOr[T] = js.undefined
  }
  object GuideEncodeEntry {
    
    inline def apply[T](): GuideEncodeEntry[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GuideEncodeEntry[T]]
    }
    
    extension [Self <: GuideEncodeEntry[?], T](x: Self & GuideEncodeEntry[T]) {
      
      inline def setEnter(value: T): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: T): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setHover(value: T): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      inline def setUpdate(value: T): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait Legend
    extends StObject
       with BaseLegend {
    
    /**
      * The direction of the legend, one of `"vertical"` (default) or `"horizontal"`.
      *
      * __Default value:__ `"vertical"`
      */
    var direction: js.UndefOr[Orientation] = js.undefined
    
    /**
      * Mark definitions for custom legend encoding.
      */
    var encode: js.UndefOr[LegendEncode] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    /**
      * The format specifier pattern for legend labels. For numerical values, must be a legal [d3-format](https://github.com/d3/d3-format#locale_format) specifier. For date-time values, must be a legal [d3-time-format](https://github.com/d3/d3-time-format#locale_format) specifier or multi-format object.
      */
    var format: js.UndefOr[String | TimeFormatSpecifier | SignalRef] = js.undefined
    
    /**
      * The format type for legend labels (number, time, or utc).
      */
    var formatType: js.UndefOr[FormatType | SignalRef] = js.undefined
    
    var opacity: js.UndefOr[String] = js.undefined
    
    var shape: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var strokeDash: js.UndefOr[String] = js.undefined
    
    var strokeWidth: js.UndefOr[String] = js.undefined
    
    /**
      * The minimum desired step between tick values for quantitative legends, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
      */
    var tickMinStep: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * The title for the legend.
      */
    var title: js.UndefOr[Text | SignalRef] = js.undefined
    
    /**
      * The type of legend to include. One of `"symbol"` for discrete symbol legends, or `"gradient"` for a continuous color gradient. If gradient is used only the fill or stroke scale parameters are considered. If unspecified, the type will be inferred based on the scale parameters used and their backing scale types.
      */
    var `type`: js.UndefOr[LegendType] = js.undefined
    
    /**
      * Explicitly set the visible legend values.
      */
    var values: js.UndefOr[js.Array[js.Any] | SignalRef] = js.undefined
  }
  object Legend {
    
    inline def apply(): Legend = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Legend]
    }
    
    extension [Self <: Legend](x: Self) {
      
      inline def setDirection(value: Orientation): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEncode(value: LegendEncode): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFormat(value: String | TimeFormatSpecifier | SignalRef): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatType(value: FormatType | SignalRef): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
      
      inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDash(value: String): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTickMinStep(value: Double | SignalRef): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      inline def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      inline def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
      
      inline def setType(value: LegendType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValues(value: js.Array[js.Any] | SignalRef): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait LegendEncode extends StObject {
    
    var entries: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.undefined
    
    var gradient: js.UndefOr[GuideEncodeEntry[RectEncodeEntry]] = js.undefined
    
    var labels: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
    
    var legend: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.undefined
    
    var symbols: js.UndefOr[GuideEncodeEntry[SymbolEncodeEntry]] = js.undefined
    
    var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
  }
  object LegendEncode {
    
    inline def apply(): LegendEncode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendEncode]
    }
    
    extension [Self <: LegendEncode](x: Self) {
      
      inline def setEntries(value: GuideEncodeEntry[GroupEncodeEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setGradient(value: GuideEncodeEntry[RectEncodeEntry]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      inline def setLabels(value: GuideEncodeEntry[TextEncodeEntry]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLegend(value: GuideEncodeEntry[GroupEncodeEntry]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setSymbols(value: GuideEncodeEntry[SymbolEncodeEntry]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      
      inline def setTitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.none
    - typings.vegaTypings.vegaTypingsStrings.left
    - typings.vegaTypings.vegaTypingsStrings.right
    - typings.vegaTypings.vegaTypingsStrings.top
    - typings.vegaTypings.vegaTypingsStrings.bottom
    - typings.vegaTypings.vegaTypingsStrings.`top-left`
    - typings.vegaTypings.vegaTypingsStrings.`top-right`
    - typings.vegaTypings.vegaTypingsStrings.`bottom-left`
    - typings.vegaTypings.vegaTypingsStrings.`bottom-right`
  */
  trait LegendOrient extends StObject
  object LegendOrient {
    
    inline def bottom: typings.vegaTypings.vegaTypingsStrings.bottom = "bottom".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.bottom]
    
    inline def `bottom-left`: typings.vegaTypings.vegaTypingsStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.vegaTypings.vegaTypingsStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`bottom-right`]
    
    inline def left: typings.vegaTypings.vegaTypingsStrings.left = "left".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.left]
    
    inline def none: typings.vegaTypings.vegaTypingsStrings.none = "none".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.none]
    
    inline def right: typings.vegaTypings.vegaTypingsStrings.right = "right".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.right]
    
    inline def top: typings.vegaTypings.vegaTypingsStrings.top = "top".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.top]
    
    inline def `top-left`: typings.vegaTypings.vegaTypingsStrings.`top-left` = "top-left".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`top-left`]
    
    inline def `top-right`: typings.vegaTypings.vegaTypingsStrings.`top-right` = "top-right".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.`top-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.gradient
    - typings.vegaTypings.vegaTypingsStrings.symbol
  */
  trait LegendType extends StObject
  object LegendType {
    
    inline def gradient: typings.vegaTypings.vegaTypingsStrings.gradient = "gradient".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.gradient]
    
    inline def symbol: typings.vegaTypings.vegaTypingsStrings.symbol = "symbol".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.symbol]
  }
}
