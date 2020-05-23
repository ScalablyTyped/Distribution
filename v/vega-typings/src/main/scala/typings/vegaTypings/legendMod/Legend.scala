package typings.vegaTypings.legendMod

import typings.vegaTypings.axisMod.FormatType
import typings.vegaTypings.axisMod.TimeFormatSpecifier
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend extends BaseLegend {
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
  var values: js.UndefOr[js.Array[_] | SignalRef] = js.undefined
}

