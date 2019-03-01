package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousScale extends BaseScale {
  var bins: js.UndefOr[ScaleBins] = js.undefined
  var clamp: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  var padding: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var range: js.UndefOr[RangeScheme] = js.undefined
}

object ContinuousScale {
  @scala.inline
  def apply(
    name: java.lang.String,
    bins: ScaleBins = null,
    clamp: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domain: (js.Array[
      scala.Null | java.lang.String | scala.Double | scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
    ]) | ScaleData | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMax: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMid: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMin: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainRaw: js.Array[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    interpolate: ScaleInterpolate = null,
    padding: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    range: RangeScheme = null,
    reverse: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    round: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    `type`: ScaleType = null
  ): ContinuousScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (bins != null) __obj.updateDynamic("bins")(bins.asInstanceOf[js.Any])
    if (clamp != null) __obj.updateDynamic("clamp")(clamp.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContinuousScale]
  }
}

