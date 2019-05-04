package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgScale extends js.Object {
  var base: js.UndefOr[scala.Double] = js.undefined
  var clamp: js.UndefOr[scala.Boolean] = js.undefined
  var domain: VgDomain
  var domainRaw: js.UndefOr[VgSignalRef] = js.undefined
  var exponent: js.UndefOr[scala.Double] = js.undefined
  var interpolate: js.UndefOr[ScaleInterpolate | ScaleInterpolateParams] = js.undefined
  var name: java.lang.String
  var nice: js.UndefOr[
    scala.Boolean | scala.Double | vegaDashLiteLib.buildSrcScaleMod.NiceTime | vegaDashLiteLib.Anon_Interval
  ] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var paddingInner: js.UndefOr[scala.Double] = js.undefined
  var paddingOuter: js.UndefOr[scala.Double] = js.undefined
  var range: VgRange
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var round: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: vegaDashLiteLib.buildSrcScaleMod.ScaleType
  var zero: js.UndefOr[scala.Boolean] = js.undefined
}

object VgScale {
  @scala.inline
  def apply(
    domain: VgDomain,
    name: java.lang.String,
    range: VgRange,
    `type`: vegaDashLiteLib.buildSrcScaleMod.ScaleType,
    base: scala.Int | scala.Double = null,
    clamp: js.UndefOr[scala.Boolean] = js.undefined,
    domainRaw: VgSignalRef = null,
    exponent: scala.Int | scala.Double = null,
    interpolate: ScaleInterpolate | ScaleInterpolateParams = null,
    nice: scala.Boolean | scala.Double | vegaDashLiteLib.buildSrcScaleMod.NiceTime | vegaDashLiteLib.Anon_Interval = null,
    padding: scala.Int | scala.Double = null,
    paddingInner: scala.Int | scala.Double = null,
    paddingOuter: scala.Int | scala.Double = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    zero: js.UndefOr[scala.Boolean] = js.undefined
  ): VgScale = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], name = name, range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(clamp)) __obj.updateDynamic("clamp")(clamp)
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw)
    if (exponent != null) __obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingInner != null) __obj.updateDynamic("paddingInner")(paddingInner.asInstanceOf[js.Any])
    if (paddingOuter != null) __obj.updateDynamic("paddingOuter")(paddingOuter.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (!js.isUndefined(zero)) __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[VgScale]
  }
}

