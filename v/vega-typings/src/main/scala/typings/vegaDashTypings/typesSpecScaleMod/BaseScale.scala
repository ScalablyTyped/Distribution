package typings.vegaDashTypings.typesSpecScaleMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseScale extends js.Object {
  var domain: js.UndefOr[(js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef] = js.undefined
  var domainMax: js.UndefOr[Double | SignalRef] = js.undefined
  var domainMid: js.UndefOr[Double | SignalRef] = js.undefined
  var domainMin: js.UndefOr[Double | SignalRef] = js.undefined
  var domainRaw: js.UndefOr[Null | js.Array[_] | SignalRef] = js.undefined
  var name: String
  var reverse: js.UndefOr[Boolean | SignalRef] = js.undefined
  var round: js.UndefOr[Boolean | SignalRef] = js.undefined
  var `type`: js.UndefOr[ScaleType] = js.undefined
}

object BaseScale {
  @scala.inline
  def apply(
    name: String,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    `type`: ScaleType = null
  ): BaseScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseScale]
  }
}

