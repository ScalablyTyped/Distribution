package typings.vegaTypings.axisMod

import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.valuesMod.NumberValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axis extends BaseAxis {
  
  /**
    * Mark definitions for custom axis encoding.
    */
  var encode: js.UndefOr[AxisEncode] = js.native
  
  /**
    * The format specifier pattern for axis labels. For numerical values, must be a legal [d3-format](https://github.com/d3/d3-format#locale_format) specifier. For date-time values, must be a legal [d3-time-format](https://github.com/d3/d3-time-format#locale_format) specifier or multi-format object.
    */
  var format: js.UndefOr[String | TimeFormatSpecifier | SignalRef] = js.native
  
  /**
    * The format type for axis labels (number, time, or utc).
    */
  var formatType: js.UndefOr[FormatType | SignalRef] = js.native
  
  /**
    * The name of the scale to use for including grid lines. By default grid lines are driven by the same scale as the ticks and labels.
    */
  var gridScale: js.UndefOr[String] = js.native
  
  /**
    * The orthogonal offset in pixels by which to displace the axis from its position along the edge of the chart.
    */
  var offset: js.UndefOr[NumberValue] = js.native
  
  /**
    * The orientation of the axis. One of `"top"`, `"bottom"`, `"left"` or `"right"`. The orientation can be used to further specialize the axis type (e.g., a y axis oriented for the right edge of the chart).
    *
    * __Default value:__ `"bottom"` for x-axes and `"left"` for y-axes.
    */
  var orient: AxisOrient | SignalRef = js.native
  
  /**
    * The anchor position of the axis in pixels. For x-axes with top or bottom orientation, this sets the axis group x coordinate. For y-axes with left or right orientation, this sets the axis group y coordinate.
    *
    * __Default value__: `0`
    */
  var position: js.UndefOr[NumberValue] = js.native
  
  /**
    * The name of the scale backing the axis component.
    */
  var scale: String = js.native
  
  /**
    * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of `2`, `5`, `10`) and lie within the underlying scale's range.
    *
    * For scales of type `"time"` or `"utc"`, the tick count can instead be a time interval specifier. Legal string values are `"millisecond"`, `"second"`, `"minute"`, `"hour"`, `"day"`, `"week"`, `"month"`, and "year". Alternatively, an object-valued interval specifier of the form `{"interval": "month", "step": 3}` includes a desired number of interval steps. Here, ticks are generated for each quarter (Jan, Apr, Jul, Oct) boundary.
    *
    * @minimum 0
    */
  var tickCount: js.UndefOr[TickCount] = js.native
  
  /**
    * The minimum desired step between axis ticks, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
    */
  var tickMinStep: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * A title for the axis (none by default).
    */
  var title: js.UndefOr[Text | SignalRef] = js.native
  
  /**
    * Explicitly set the visible axis tick and label values.
    */
  var values: js.UndefOr[js.Array[_] | SignalRef] = js.native
}
object Axis {
  
  @scala.inline
  def apply(orient: AxisOrient | SignalRef, scale: String): Axis = {
    val __obj = js.Dynamic.literal(orient = orient.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
    
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
    def setOrient(value: AxisOrient | SignalRef): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: String): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncode(value: AxisEncode): Self = this.set("encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    
    @scala.inline
    def setFormat(value: String | TimeFormatSpecifier | SignalRef): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatType(value: FormatType | SignalRef): Self = this.set("formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatType: Self = this.set("formatType", js.undefined)
    
    @scala.inline
    def setGridScale(value: String): Self = this.set("gridScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridScale: Self = this.set("gridScale", js.undefined)
    
    @scala.inline
    def setOffset(value: NumberValue): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: NumberValue): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTickCount(value: TickCount): Self = this.set("tickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickCount: Self = this.set("tickCount", js.undefined)
    
    @scala.inline
    def setTickMinStep(value: Double | SignalRef): Self = this.set("tickMinStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickMinStep: Self = this.set("tickMinStep", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: String*): Self = this.set("title", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: Text | SignalRef): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_] | SignalRef): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
