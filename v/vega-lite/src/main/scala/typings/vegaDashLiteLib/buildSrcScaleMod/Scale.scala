package typings
package vegaDashLiteLib.buildSrcScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale extends js.Object {
  /**
    * The logarithm base of the `log` scale (default `10`).
    */
  var base: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `true`, values that exceed the data domain are clamped to either the minimum or maximum range value
    *
    * __Default value:__ derived from the [scale config](https://vega.github.io/vega-lite/docs/config.html#scale-config)'s `clamp` (`true` by default).
    */
  var clamp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Customized domain values.
    *
    * For _quantitative_ fields, `domain` can take the form of a two-element array with minimum and maximum values.  [Piecewise scales](https://vega.github.io/vega-lite/docs/scale.html#piecewise) can be created by providing a `domain` with more than two entries.
    * If the input field is aggregated, `domain` can also be a string value `"unaggregated"`, indicating that the domain should include the raw data values prior to the aggregation.
    *
    * For _temporal_ fields, `domain` can be a two-element array minimum and maximum values, in the form of either timestamps or the [DateTime definition objects](https://vega.github.io/vega-lite/docs/types.html#datetime).
    *
    * For _ordinal_ and _nominal_ fields, `domain` can be an array that lists valid input values.
    *
    * The `selection` property can be used to [interactively determine](https://vega.github.io/vega-lite/docs/selection.html#scale-domains) the scale domain.
    */
  var domain: js.UndefOr[
    js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[scala.Boolean] | js.Array[vegaDashLiteLib.buildSrcDatetimeMod.DateTime] | vegaDashLiteLib.vegaDashLiteLibStrings.unaggregated | SelectionDomain
  ] = js.undefined
  /**
    * The exponent of the `pow` scale.
    */
  var exponent: js.UndefOr[scala.Double] = js.undefined
  /**
    * The interpolation method for range values. By default, a general interpolator for numbers, dates, strings and colors (in RGB space) is used. For color ranges, this property allows interpolation in alternative color spaces. Legal values include `rgb`, `hsl`, `hsl-long`, `lab`, `hcl`, `hcl-long`, `cubehelix` and `cubehelix-long` ('-long' variants use longer paths in polar coordinate spaces). If object-valued, this property accepts an object with a string-valued _type_ property and an optional numeric _gamma_ property applicable to rgb and cubehelix interpolators. For more, see the [d3-interpolate documentation](https://github.com/d3/d3-interpolate).
    *
    * __Note:__ Sequential scales do not support `interpolate` as they have a fixed interpolator.  Since Vega-Lite uses sequential scales for quantitative fields by default, you have to set the scale `type` to other quantitative scale type such as `"linear"` to customize `interpolate`.
    */
  var interpolate: js.UndefOr[
    vegaDashLiteLib.buildSrcVegaDotSchemaMod.ScaleInterpolate | vegaDashLiteLib.buildSrcVegaDotSchemaMod.ScaleInterpolateParams
  ] = js.undefined
  /**
    * Extending the domain so that it starts and ends on nice round values. This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value. Nicing is useful if the domain is computed from data and may be irregular. For example, for a domain of _[0.201479…, 0.996679…]_, a nice domain might be _[0.2, 1.0]_.
    *
    * For quantitative scales such as linear, `nice` can be either a boolean flag or a number. If `nice` is a number, it will represent a desired tick count. This allows greater control over the step size used to extend the bounds, guaranteeing that the returned ticks will exactly cover the domain.
    *
    * For temporal fields with time and utc scales, the `nice` value can be a string indicating the desired time interval. Legal values are `"millisecond"`, `"second"`, `"minute"`, `"hour"`, `"day"`, `"week"`, `"month"`, and `"year"`. Alternatively, `time` and `utc` scales can accept an object-valued interval specifier of the form `{"interval": "month", "step": 3}`, which includes a desired number of interval steps. Here, the domain would snap to quarter (Jan, Apr, Jul, Oct) boundaries.
    *
    * __Default value:__ `true` for unbinned _quantitative_ fields; `false` otherwise.
    *
    */
  var nice: js.UndefOr[scala.Boolean | scala.Double | NiceTime | vegaDashLiteLib.Anon_Interval] = js.undefined
  /**
    * For _[continuous](https://vega.github.io/vega-lite/docs/scale.html#continuous)_ scales, expands the scale domain to accommodate the specified number of pixels on each of the scale range. The scale range must represent pixels for this parameter to function as intended. Padding adjustment is performed prior to all other adjustments, including the effects of the zero, nice, domainMin, and domainMax properties.
    *
    * For _[band](https://vega.github.io/vega-lite/docs/scale.html#band)_ scales, shortcut for setting `paddingInner` and `paddingOuter` to the same value.
    *
    * For _[point](https://vega.github.io/vega-lite/docs/scale.html#point)_ scales, alias for `paddingOuter`.
    *
    * __Default value:__ For _continuous_ scales, derived from the [scale config](https://vega.github.io/vega-lite/docs/scale.html#config)'s `continuousPadding`.
    * For _band and point_ scales, see `paddingInner` and `paddingOuter`.
    *
    * @minimum 0
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The inner padding (spacing) within each band step of band scales, as a fraction of the step size. This value must lie in the range [0,1].
    *
    * For point scale, this property is invalid as point scales do not have internal band widths (only step sizes between bands).
    *
    * __Default value:__ derived from the [scale config](https://vega.github.io/vega-lite/docs/scale.html#config)'s `bandPaddingInner`.
    *
    * @minimum 0
    * @maximum 1
    */
  var paddingInner: js.UndefOr[scala.Double] = js.undefined
  /**
    * The outer padding (spacing) at the ends of the range of band and point scales,
    * as a fraction of the step size. This value must lie in the range [0,1].
    *
    * __Default value:__ derived from the [scale config](https://vega.github.io/vega-lite/docs/scale.html#config)'s `bandPaddingOuter` for band scales and `pointPadding` for point scales.
    *
    * @minimum 0
    * @maximum 1
    */
  var paddingOuter: js.UndefOr[scala.Double] = js.undefined
  /**
    * The range of the scale. One of:
    *
    * - A string indicating a [pre-defined named scale range](https://vega.github.io/vega-lite/docs/scale.html#range-config) (e.g., example, `"symbol"`, or `"diverging"`).
    *
    * - For [continuous scales](https://vega.github.io/vega-lite/docs/scale.html#continuous), two-element array indicating  minimum and maximum values, or an array with more than two entries for specifying a [piecewise scale](https://vega.github.io/vega-lite/docs/scale.html#piecewise).
    *
    * - For [discrete](https://vega.github.io/vega-lite/docs/scale.html#discrete) and [discretizing](https://vega.github.io/vega-lite/docs/scale.html#discretizing) scales, an array of desired output values.
    *
    * __Notes:__
    *
    * 1) For [sequential](https://vega.github.io/vega-lite/docs/scale.html#sequential), [ordinal](https://vega.github.io/vega-lite/docs/scale.html#ordinal), and discretizing color scales, you can also specify a color [`scheme`](https://vega.github.io/vega-lite/docs/scale.html#scheme) instead of `range`.
    *
    * 2) Any directly specified `range` for `x` and `y` channels will be ignored. Range can be customized via the view's corresponding [size](https://vega.github.io/vega-lite/docs/size.html) (`width` and `height`) or via [range steps and paddings properties](#range-step) for [band](#band) and [point](#point) scales.
    */
  var range: js.UndefOr[js.Array[scala.Double] | js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
    * The distance between the starts of adjacent bands or points in [band](https://vega.github.io/vega-lite/docs/scale.html#band) and [point](https://vega.github.io/vega-lite/docs/scale.html#point) scales.
    *
    * If `rangeStep` is `null` or if the view contains the scale's corresponding [size](https://vega.github.io/vega-lite/docs/size.html) (`width` for `x` scales and `height` for `y` scales), `rangeStep` will be automatically determined to fit the size of the view.
    *
    * __Default value:__  derived the [scale config](https://vega.github.io/vega-lite/docs/config.html#scale-config)'s `textXRangeStep` (`90` by default) for x-scales of `text` marks and `rangeStep` (`21` by default) for x-scales of other marks and y-scales.
    *
    * __Warning__: If `rangeStep` is `null` and the cardinality of the scale's domain is higher than `width` or `height`, the rangeStep might become less than one pixel and the mark might not appear correctly.
    *
    * @minimum 0
    */
  var rangeStep: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * If true, reverses the order of the scale range.
    * __Default value:__ `false`.
    *
    * @hide
    */
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, rounds numeric output values to integers. This can be helpful for snapping to the pixel grid.
    *
    * __Default value:__ `false`.
    */
  var round: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A string indicating a color [scheme](https://vega.github.io/vega-lite/docs/scale.html#scheme) name (e.g., `"category10"` or `"viridis"`) or a [scheme parameter object](https://vega.github.io/vega-lite/docs/scale.html#scheme-params).
    *
    * Discrete color schemes may be used with [discrete](https://vega.github.io/vega-lite/docs/scale.html#discrete) or [discretizing](https://vega.github.io/vega-lite/docs/scale.html#discretizing) scales. Continuous color schemes are intended for use with [sequential](https://vega.github.io/vega-lite/docs/scales.html#sequential) scales.
    *
    * For the full list of supported schemes, please refer to the [Vega Scheme](https://vega.github.io/vega/docs/schemes/#reference) reference.
    */
  var scheme: js.UndefOr[java.lang.String | SchemeParams] = js.undefined
  /**
    * The type of scale.  Vega-Lite supports the following categories of scale types:
    *
    * 1) [**Continuous Scales**](https://vega.github.io/vega-lite/docs/scale.html#continuous) -- mapping continuous domains to continuous output ranges ([`"linear"`](https://vega.github.io/vega-lite/docs/scale.html#linear), [`"pow"`](https://vega.github.io/vega-lite/docs/scale.html#pow), [`"sqrt"`](https://vega.github.io/vega-lite/docs/scale.html#sqrt), [`"log"`](https://vega.github.io/vega-lite/docs/scale.html#log), [`"time"`](https://vega.github.io/vega-lite/docs/scale.html#time), [`"utc"`](https://vega.github.io/vega-lite/docs/scale.html#utc), [`"sequential"`](https://vega.github.io/vega-lite/docs/scale.html#sequential)).
    *
    * 2) [**Discrete Scales**](https://vega.github.io/vega-lite/docs/scale.html#discrete) -- mapping discrete domains to discrete ([`"ordinal"`](https://vega.github.io/vega-lite/docs/scale.html#ordinal)) or continuous ([`"band"`](https://vega.github.io/vega-lite/docs/scale.html#band) and [`"point"`](https://vega.github.io/vega-lite/docs/scale.html#point)) output ranges.
    *
    * 3) [**Discretizing Scales**](https://vega.github.io/vega-lite/docs/scale.html#discretizing) -- mapping continuous domains to discrete output ranges ([`"bin-linear"`](https://vega.github.io/vega-lite/docs/scale.html#bin-linear) and [`"bin-ordinal"`](https://vega.github.io/vega-lite/docs/scale.html#bin-ordinal)).
    *
    * __Default value:__ please see the [scale type table](https://vega.github.io/vega-lite/docs/scale.html#type).
    */
  var `type`: js.UndefOr[ScaleType] = js.undefined
  /**
    * If `true`, ensures that a zero baseline value is included in the scale domain.
    *
    * __Default value:__ `true` for x and y channels if the quantitative field is not binned and no custom `domain` is provided; `false` otherwise.
    *
    * __Note:__ Log, time, and utc scales do not support `zero`.
    */
  var zero: js.UndefOr[scala.Boolean] = js.undefined
}

object Scale {
  @scala.inline
  def apply(
    base: scala.Int | scala.Double = null,
    clamp: js.UndefOr[scala.Boolean] = js.undefined,
    domain: js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[scala.Boolean] | js.Array[vegaDashLiteLib.buildSrcDatetimeMod.DateTime] | vegaDashLiteLib.vegaDashLiteLibStrings.unaggregated | SelectionDomain = null,
    exponent: scala.Int | scala.Double = null,
    interpolate: vegaDashLiteLib.buildSrcVegaDotSchemaMod.ScaleInterpolate | vegaDashLiteLib.buildSrcVegaDotSchemaMod.ScaleInterpolateParams = null,
    nice: scala.Boolean | scala.Double | NiceTime | vegaDashLiteLib.Anon_Interval = null,
    padding: scala.Int | scala.Double = null,
    paddingInner: scala.Int | scala.Double = null,
    paddingOuter: scala.Int | scala.Double = null,
    range: js.Array[scala.Double] | js.Array[java.lang.String] | java.lang.String = null,
    rangeStep: scala.Int | scala.Double = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    scheme: java.lang.String | SchemeParams = null,
    `type`: ScaleType = null,
    zero: js.UndefOr[scala.Boolean] = js.undefined
  ): Scale = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(clamp)) __obj.updateDynamic("clamp")(clamp)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (exponent != null) __obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingInner != null) __obj.updateDynamic("paddingInner")(paddingInner.asInstanceOf[js.Any])
    if (paddingOuter != null) __obj.updateDynamic("paddingOuter")(paddingOuter.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rangeStep != null) __obj.updateDynamic("rangeStep")(rangeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(zero)) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[Scale]
  }
}

