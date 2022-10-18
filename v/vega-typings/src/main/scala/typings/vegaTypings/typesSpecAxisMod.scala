package typings.vegaTypings

import typings.vegaTypings.typesSpecEncodeMod.GroupEncodeEntry
import typings.vegaTypings.typesSpecEncodeMod.RuleEncodeEntry
import typings.vegaTypings.typesSpecEncodeMod.Text
import typings.vegaTypings.typesSpecEncodeMod.TextEncodeEntry
import typings.vegaTypings.typesSpecLegendMod.GuideEncodeEntry
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecValuesMod.AlignValue
import typings.vegaTypings.typesSpecValuesMod.AnchorValue
import typings.vegaTypings.typesSpecValuesMod.BooleanValue
import typings.vegaTypings.typesSpecValuesMod.ColorValue
import typings.vegaTypings.typesSpecValuesMod.DashArrayValue
import typings.vegaTypings.typesSpecValuesMod.FontStyleValue
import typings.vegaTypings.typesSpecValuesMod.FontWeightValue
import typings.vegaTypings.typesSpecValuesMod.NumberValue
import typings.vegaTypings.typesSpecValuesMod.StringValue
import typings.vegaTypings.typesSpecValuesMod.StrokeCapValue
import typings.vegaTypings.typesSpecValuesMod.TextBaselineValue
import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecAxisMod {
  
  trait Axis
    extends StObject
       with BaseAxis {
    
    /**
      * Mark definitions for custom axis encoding.
      */
    var encode: js.UndefOr[AxisEncode] = js.undefined
    
    /**
      * The format specifier pattern for axis labels. For numerical values, must be a legal [d3-format](https://github.com/d3/d3-format#locale_format) specifier. For date-time values, must be a legal [d3-time-format](https://github.com/d3/d3-time-format#locale_format) specifier or multi-format object.
      */
    var format: js.UndefOr[String | TimeFormatSpecifier | SignalRef] = js.undefined
    
    /**
      * The format type for axis labels (number, time, or utc).
      */
    var formatType: js.UndefOr[FormatType | SignalRef] = js.undefined
    
    /**
      * The name of the scale to use for including grid lines. By default grid lines are driven by the same scale as the ticks and labels.
      */
    var gridScale: js.UndefOr[String] = js.undefined
    
    /**
      * The orthogonal offset in pixels by which to displace the axis from its position along the edge of the chart.
      */
    var offset: js.UndefOr[NumberValue] = js.undefined
    
    /**
      * The orientation of the axis. One of `"top"`, `"bottom"`, `"left"` or `"right"`. The orientation can be used to further specialize the axis type (e.g., a y axis oriented for the right edge of the chart).
      *
      * __Default value:__ `"bottom"` for x-axes and `"left"` for y-axes.
      */
    var orient: AxisOrient | SignalRef
    
    /**
      * The anchor position of the axis in pixels. For x-axes with top or bottom orientation, this sets the axis group x coordinate. For y-axes with left or right orientation, this sets the axis group y coordinate.
      *
      * __Default value__: `0`
      */
    var position: js.UndefOr[NumberValue] = js.undefined
    
    /**
      * The name of the scale backing the axis component.
      */
    var scale: String
    
    /**
      * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of `2`, `5`, `10`) and lie within the underlying scale's range.
      *
      * For scales of type `"time"` or `"utc"`, the tick count can instead be a time interval specifier. Legal string values are `"millisecond"`, `"second"`, `"minute"`, `"hour"`, `"day"`, `"week"`, `"month"`, and "year". Alternatively, an object-valued interval specifier of the form `{"interval": "month", "step": 3}` includes a desired number of interval steps. Here, ticks are generated for each quarter (Jan, Apr, Jul, Oct) boundary.
      *
      * @minimum 0
      */
    var tickCount: js.UndefOr[TickCount] = js.undefined
    
    /**
      * The minimum desired step between axis ticks, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
      */
    var tickMinStep: js.UndefOr[Double | SignalRef] = js.undefined
    
    /**
      * A title for the axis (none by default).
      */
    var title: js.UndefOr[Text | SignalRef] = js.undefined
    
    /**
      * Explicitly set the visible axis tick and label values.
      */
    var values: js.UndefOr[js.Array[Any] | SignalRef] = js.undefined
  }
  object Axis {
    
    inline def apply(orient: AxisOrient | SignalRef, scale: String): Axis = {
      val __obj = js.Dynamic.literal(orient = orient.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Axis]
    }
    
    extension [Self <: Axis](x: Self) {
      
      inline def setEncode(value: AxisEncode): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setFormat(value: String | TimeFormatSpecifier | SignalRef): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatType(value: FormatType | SignalRef): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
      
      inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGridScale(value: String): Self = StObject.set(x, "gridScale", value.asInstanceOf[js.Any])
      
      inline def setGridScaleUndefined: Self = StObject.set(x, "gridScale", js.undefined)
      
      inline def setOffset(value: NumberValue): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrient(value: AxisOrient | SignalRef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: NumberValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTickCount(value: TickCount): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      inline def setTickMinStep(value: Double | SignalRef): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      inline def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      inline def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setValues(value: js.Array[Any] | SignalRef): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait AxisEncode extends StObject {
    
    /**
      * Custom encoding for the axis container.
      */
    var axis: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.undefined
    
    /**
      * Custom encoding for the axis domain rule mark.
      */
    var domain: js.UndefOr[GuideEncodeEntry[RuleEncodeEntry]] = js.undefined
    
    /**
      * Custom encoding for axis gridline rule marks.
      */
    var grid: js.UndefOr[GuideEncodeEntry[RuleEncodeEntry]] = js.undefined
    
    /**
      * Custom encoding for axis label text marks.
      */
    var labels: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
    
    /**
      * Custom encoding for axis tick rule marks.
      */
    var ticks: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.undefined
    
    /**
      * Custom encoding for the axis title text mark.
      */
    var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
  }
  object AxisEncode {
    
    inline def apply(): AxisEncode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisEncode]
    }
    
    extension [Self <: AxisEncode](x: Self) {
      
      inline def setAxis(value: GuideEncodeEntry[GroupEncodeEntry]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setDomain(value: GuideEncodeEntry[RuleEncodeEntry]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setGrid(value: GuideEncodeEntry[RuleEncodeEntry]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setLabels(value: GuideEncodeEntry[TextEncodeEntry]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setTicks(value: GuideEncodeEntry[GroupEncodeEntry]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.top
    - typings.vegaTypings.vegaTypingsStrings.bottom
    - typings.vegaTypings.vegaTypingsStrings.left
    - typings.vegaTypings.vegaTypingsStrings.right
  */
  trait AxisOrient extends StObject
  object AxisOrient {
    
    inline def bottom: typings.vegaTypings.vegaTypingsStrings.bottom = "bottom".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.bottom]
    
    inline def left: typings.vegaTypings.vegaTypingsStrings.left = "left".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.left]
    
    inline def right: typings.vegaTypings.vegaTypingsStrings.right = "right".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.right]
    
    inline def top: typings.vegaTypings.vegaTypingsStrings.top = "top".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.top]
  }
  
  trait BaseAxis extends StObject {
    
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
  object BaseAxis {
    
    inline def apply(): BaseAxis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseAxis]
    }
    
    extension [Self <: BaseAxis](x: Self) {
      
      inline def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setBandPosition(value: NumberValue): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDomain(value: Boolean): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainCap(value: StrokeCapValue): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
      
      inline def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
      
      inline def setDomainColor(value: ColorValue): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
      
      inline def setDomainColorNull: Self = StObject.set(x, "domainColor", null)
      
      inline def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
      
      inline def setDomainDash(value: DashArrayValue): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffset(value: NumberValue): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
      
      inline def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
      
      inline def setDomainDashVarargs(value: Double*): Self = StObject.set(x, "domainDash", js.Array(value*))
      
      inline def setDomainOpacity(value: NumberValue): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
      
      inline def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDomainWidth(value: NumberValue): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
      
      inline def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
      
      inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridCap(value: StrokeCapValue): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
      
      inline def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
      
      inline def setGridColor(value: ColorValue): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      inline def setGridColorNull: Self = StObject.set(x, "gridColor", null)
      
      inline def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      inline def setGridDash(value: DashArrayValue): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffset(value: NumberValue): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      inline def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      inline def setGridDashVarargs(value: Double*): Self = StObject.set(x, "gridDash", js.Array(value*))
      
      inline def setGridOpacity(value: NumberValue): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      inline def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setGridWidth(value: NumberValue): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      inline def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      inline def setLabelAlign(value: AlignValue): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelAngle(value: NumberValue): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      inline def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      inline def setLabelBaseline(value: TextBaselineValue): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      inline def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      inline def setLabelBound(value: Double | Boolean | SignalRef): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
      
      inline def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
      
      inline def setLabelColor(value: ColorValue): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorNull: Self = StObject.set(x, "labelColor", null)
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLabelFlush(value: Double | Boolean | SignalRef): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffset(value: Double | SignalRef): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
      
      inline def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
      
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
      
      inline def setLabelLineHeight(value: NumberValue): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      inline def setLabelLineHeightUndefined: Self = StObject.set(x, "labelLineHeight", js.undefined)
      
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
      
      inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMaxExtent(value: NumberValue): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
      
      inline def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
      
      inline def setMinExtent(value: NumberValue): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
      
      inline def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
      
      inline def setTickBand(value: center | extent | SignalRef): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
      
      inline def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
      
      inline def setTickCap(value: StrokeCapValue): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
      
      inline def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
      
      inline def setTickColor(value: ColorValue): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      inline def setTickColorNull: Self = StObject.set(x, "tickColor", null)
      
      inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      inline def setTickDash(value: DashArrayValue): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffset(value: NumberValue): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      inline def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      inline def setTickDashVarargs(value: Double*): Self = StObject.set(x, "tickDash", js.Array(value*))
      
      inline def setTickExtra(value: BooleanValue): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      inline def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
      
      inline def setTickOffset(value: NumberValue): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
      
      inline def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
      
      inline def setTickOpacity(value: NumberValue): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      inline def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      inline def setTickRound(value: BooleanValue): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      inline def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
      
      inline def setTickSize(value: NumberValue): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTickWidth(value: NumberValue): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      inline def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      inline def setTicks(value: BooleanValue): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTitleAlign(value: AlignValue): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      inline def setTitleAnchor(value: AnchorValue): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      inline def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      inline def setTitleAngle(value: NumberValue): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      inline def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
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
      
      inline def setTitlePadding(value: NumberValue): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      inline def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      inline def setTitleX(value: NumberValue): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
      
      inline def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
      
      inline def setTitleY(value: NumberValue): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
      
      inline def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
      
      inline def setTranslate(value: NumberValue): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.number
    - typings.vegaTypings.vegaTypingsStrings.time
    - typings.vegaTypings.vegaTypingsStrings.utc
  */
  trait FormatType extends StObject
  object FormatType {
    
    inline def number: typings.vegaTypings.vegaTypingsStrings.number = "number".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.number]
    
    inline def time: typings.vegaTypings.vegaTypingsStrings.time = "time".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.time]
    
    inline def utc: typings.vegaTypings.vegaTypingsStrings.utc = "utc".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.utc]
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.vegaTypings.vegaTypingsStrings.parity
    - typings.vegaTypings.vegaTypingsStrings.greedy
  */
  type LabelOverlap = _LabelOverlap | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.vegaTypings.typesSpecScaleMod.TimeInterval
    - typings.vegaTypings.typesSpecScaleMod.TimeIntervalStep
    - typings.vegaTypings.typesSpecSignalMod.SignalRef
  */
  type TickCount = _TickCount | Double
  
  trait TimeFormatSpecifier extends StObject {
    
    var date: js.UndefOr[String] = js.undefined
    
    var day: js.UndefOr[String] = js.undefined
    
    var hours: js.UndefOr[String] = js.undefined
    
    var milliseconds: js.UndefOr[String] = js.undefined
    
    var minutes: js.UndefOr[String] = js.undefined
    
    var month: js.UndefOr[String] = js.undefined
    
    var quarter: js.UndefOr[String] = js.undefined
    
    var seconds: js.UndefOr[String] = js.undefined
    
    var week: js.UndefOr[String] = js.undefined
    
    var year: js.UndefOr[String] = js.undefined
  }
  object TimeFormatSpecifier {
    
    inline def apply(): TimeFormatSpecifier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeFormatSpecifier]
    }
    
    extension [Self <: TimeFormatSpecifier](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setHours(value: String): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      inline def setMilliseconds(value: String): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      inline def setMinutes(value: String): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setQuarter(value: String): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
      
      inline def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
      
      inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      inline def setWeek(value: String): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait _LabelOverlap extends StObject
  
  trait _TickCount extends StObject
}
