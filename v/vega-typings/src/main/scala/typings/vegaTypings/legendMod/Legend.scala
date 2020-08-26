package typings.vegaTypings.legendMod

import typings.vegaTypings.axisMod.FormatType
import typings.vegaTypings.axisMod.TimeFormatSpecifier
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Legend extends BaseLegend {
  /**
    * The direction of the legend, one of `"vertical"` (default) or `"horizontal"`.
    *
    * __Default value:__ `"vertical"`
    */
  var direction: js.UndefOr[Orientation] = js.native
  /**
    * Mark definitions for custom legend encoding.
    */
  var encode: js.UndefOr[LegendEncode] = js.native
  var fill: js.UndefOr[String] = js.native
  /**
    * The format specifier pattern for legend labels. For numerical values, must be a legal [d3-format](https://github.com/d3/d3-format#locale_format) specifier. For date-time values, must be a legal [d3-time-format](https://github.com/d3/d3-time-format#locale_format) specifier or multi-format object.
    */
  var format: js.UndefOr[String | TimeFormatSpecifier | SignalRef] = js.native
  /**
    * The format type for legend labels (number, time, or utc).
    */
  var formatType: js.UndefOr[FormatType | SignalRef] = js.native
  var opacity: js.UndefOr[String] = js.native
  var shape: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeDash: js.UndefOr[String] = js.native
  var strokeWidth: js.UndefOr[String] = js.native
  /**
    * The minimum desired step between tick values for quantitative legends, in terms of scale domain values. For example, a value of `1` indicates that ticks should not be less than 1 unit apart. If `tickMinStep` is specified, the `tickCount` value will be adjusted, if necessary, to enforce the minimum step value.
    */
  var tickMinStep: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The title for the legend.
    */
  var title: js.UndefOr[Text | SignalRef] = js.native
  /**
    * The type of legend to include. One of `"symbol"` for discrete symbol legends, or `"gradient"` for a continuous color gradient. If gradient is used only the fill or stroke scale parameters are considered. If unspecified, the type will be inferred based on the scale parameters used and their backing scale types.
    */
  var `type`: js.UndefOr[LegendType] = js.native
  /**
    * Explicitly set the visible legend values.
    */
  var values: js.UndefOr[js.Array[_] | SignalRef] = js.native
}

object Legend {
  @scala.inline
  def apply(): Legend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Legend]
  }
  @scala.inline
  implicit class LegendOps[Self <: Legend] (val x: Self) extends AnyVal {
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
    def setDirection(value: Orientation): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEncode(value: LegendEncode): Self = this.set("encode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFormat(value: String | TimeFormatSpecifier | SignalRef): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatType(value: FormatType | SignalRef): Self = this.set("formatType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatType: Self = this.set("formatType", js.undefined)
    @scala.inline
    def setOpacity(value: String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeDash(value: String): Self = this.set("strokeDash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDash: Self = this.set("strokeDash", js.undefined)
    @scala.inline
    def setStrokeWidth(value: String): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
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
    def setType(value: LegendType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_] | SignalRef): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

