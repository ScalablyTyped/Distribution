package typings
package vegaDashLiteLib.buildSrcScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleConfig extends js.Object {
  /**
    * Default inner padding for `x` and `y` band-ordinal scales.
    *
    * __Default value:__ `0.1`
    *
    * @minimum 0
    * @maximum 1
    */
  var bandPaddingInner: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default outer padding for `x` and `y` band-ordinal scales.
    * If not specified, by default, band scale's paddingOuter is paddingInner/2.
    * @minimum 0
    * @maximum 1
    */
  var bandPaddingOuter: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, values that exceed the data domain are clamped to either the minimum or maximum range value
    */
  var clamp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default padding for continuous scales.
    *
    * __Default:__ `5` for continuous x-scale of a vertical bar and continuous y-scale of a horizontal bar.; `0` otherwise.
    *
    * @minimum 0
    */
  var continuousPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The default max value for mapping quantitative fields to bar's size/bandSize.
    *
    * If undefined (default), we will use the scale's `rangeStep` - 1.
    * @minimum 0
    */
  var maxBandSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The default max value for mapping quantitative fields to text's size/fontSize.
    *
    * __Default value:__ `40`
    *
    * @minimum 0
    */
  var maxFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default max opacity for mapping a field to opacity.
    *
    * __Default value:__ `0.8`
    *
    * @minimum 0
    * @maximum 1
    */
  var maxOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default max value for point size scale.
    * @minimum 0
    */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default max strokeWidth for the scale of strokeWidth for rule and line marks and of size for trail marks.
    *
    * __Default value:__ `4`
    *
    * @minimum 0
    */
  var maxStrokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The default min value for mapping quantitative fields to bar and tick's size/bandSize scale with zero=false.
    *
    * __Default value:__ `2`
    *
    * @minimum 0
    */
  var minBandSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The default min value for mapping quantitative fields to tick's size/fontSize scale with zero=false
    *
    * __Default value:__ `8`
    *
    * @minimum 0
    */
  var minFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default minimum opacity for mapping a field to opacity.
    *
    * __Default value:__ `0.3`
    *
    * @minimum 0
    * @maximum 1
    */
  var minOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default minimum value for point size scale with zero=false.
    *
    * __Default value:__ `9`
    *
    * @minimum 0
    */
  var minSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default minimum strokeWidth for the scale of strokeWidth for rule and line marks and of size for trail marks with zero=false.
    *
    * __Default value:__ `1`
    *
    * @minimum 0
    */
  var minStrokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default outer padding for `x` and `y` point-ordinal scales.
    *
    * __Default value:__ `0.5`
    *
    * @minimum 0
    * @maximum 1
    */
  var pointPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default range step for band and point scales of (1) the `y` channel
    * and (2) the `x` channel when the mark is not `text`.
    *
    * __Default value:__ `21`
    *
    * @minimum 0
    */
  var rangeStep: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * If true, rounds numeric output values to integers.
    * This can be helpful for snapping to the pixel grid.
    * (Only available for `x`, `y`, and `size` scales.)
    */
  var round: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Default range step for `x` band and point scales of text marks.
    *
    * __Default value:__ `90`
    *
    *  @minimum 0
    */
  var textXRangeStep: js.UndefOr[scala.Double] = js.undefined
  /**
    * Use the source data range before aggregation as scale domain instead of aggregated data for aggregate axis.
    *
    * This is equivalent to setting `domain` to `"unaggregate"` for aggregated _quantitative_ fields by default.
    *
    * This property only works with aggregate functions that produce values within the raw data domain (`"mean"`, `"average"`, `"median"`, `"q1"`, `"q3"`, `"min"`, `"max"`). For other aggregations that produce values outside of the raw data domain (e.g. `"count"`, `"sum"`), this property is ignored.
    *
    * __Default value:__ `false`
    */
  var useUnaggregatedDomain: js.UndefOr[scala.Boolean] = js.undefined
}

object ScaleConfig {
  @scala.inline
  def apply(
    bandPaddingInner: scala.Int | scala.Double = null,
    bandPaddingOuter: scala.Int | scala.Double = null,
    clamp: js.UndefOr[scala.Boolean] = js.undefined,
    continuousPadding: scala.Int | scala.Double = null,
    maxBandSize: scala.Int | scala.Double = null,
    maxFontSize: scala.Int | scala.Double = null,
    maxOpacity: scala.Int | scala.Double = null,
    maxSize: scala.Int | scala.Double = null,
    maxStrokeWidth: scala.Int | scala.Double = null,
    minBandSize: scala.Int | scala.Double = null,
    minFontSize: scala.Int | scala.Double = null,
    minOpacity: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    minStrokeWidth: scala.Int | scala.Double = null,
    pointPadding: scala.Int | scala.Double = null,
    rangeStep: scala.Int | scala.Double = null,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    textXRangeStep: scala.Int | scala.Double = null,
    useUnaggregatedDomain: js.UndefOr[scala.Boolean] = js.undefined
  ): ScaleConfig = {
    val __obj = js.Dynamic.literal()
    if (bandPaddingInner != null) __obj.updateDynamic("bandPaddingInner")(bandPaddingInner.asInstanceOf[js.Any])
    if (bandPaddingOuter != null) __obj.updateDynamic("bandPaddingOuter")(bandPaddingOuter.asInstanceOf[js.Any])
    if (!js.isUndefined(clamp)) __obj.updateDynamic("clamp")(clamp)
    if (continuousPadding != null) __obj.updateDynamic("continuousPadding")(continuousPadding.asInstanceOf[js.Any])
    if (maxBandSize != null) __obj.updateDynamic("maxBandSize")(maxBandSize.asInstanceOf[js.Any])
    if (maxFontSize != null) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (maxOpacity != null) __obj.updateDynamic("maxOpacity")(maxOpacity.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (maxStrokeWidth != null) __obj.updateDynamic("maxStrokeWidth")(maxStrokeWidth.asInstanceOf[js.Any])
    if (minBandSize != null) __obj.updateDynamic("minBandSize")(minBandSize.asInstanceOf[js.Any])
    if (minFontSize != null) __obj.updateDynamic("minFontSize")(minFontSize.asInstanceOf[js.Any])
    if (minOpacity != null) __obj.updateDynamic("minOpacity")(minOpacity.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (minStrokeWidth != null) __obj.updateDynamic("minStrokeWidth")(minStrokeWidth.asInstanceOf[js.Any])
    if (pointPadding != null) __obj.updateDynamic("pointPadding")(pointPadding.asInstanceOf[js.Any])
    if (rangeStep != null) __obj.updateDynamic("rangeStep")(rangeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (textXRangeStep != null) __obj.updateDynamic("textXRangeStep")(textXRangeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(useUnaggregatedDomain)) __obj.updateDynamic("useUnaggregatedDomain")(useUnaggregatedDomain)
    __obj.asInstanceOf[ScaleConfig]
  }
}

