package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdinalScale
  extends BaseScale
     with Scale {
  var domainImplicit: js.UndefOr[Boolean | SignalRef] = js.undefined
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  var range: js.UndefOr[RangeScheme | ScaleData] = js.undefined
  @JSName("type")
  var type_OrdinalScale: ordinal
}

object OrdinalScale {
  @scala.inline
  def apply(
    name: String,
    `type`: ordinal,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainImplicit: Boolean | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.UndefOr[Null | js.Array[_] | SignalRef] = js.undefined,
    interpolate: ScaleInterpolate = null,
    range: RangeScheme | ScaleData = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null
  ): OrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainImplicit != null) __obj.updateDynamic("domainImplicit")(domainImplicit.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (!js.isUndefined(domainRaw)) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdinalScale]
  }
}

