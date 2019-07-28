package typings.vegaDashTypings.typesSpecScaleMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.quantile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantileScale
  extends BaseScale
     with Scale {
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  var range: js.UndefOr[RangeScheme] = js.undefined
  @JSName("type")
  var type_QuantileScale: js.UndefOr[quantile] = js.undefined
}

object QuantileScale {
  @scala.inline
  def apply(
    name: String,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    interpolate: ScaleInterpolate = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    `type`: quantile = null
  ): QuantileScale = {
    val __obj = js.Dynamic.literal(name = name)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate)
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QuantileScale]
  }
}

