package typings.vegaDashTypings.typesSpecScaleMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThresholdScale
  extends BaseScale
     with Scale {
  var nice: js.UndefOr[Boolean | Double | SignalRef] = js.undefined
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  var range: js.UndefOr[RangeScheme] = js.undefined
  @JSName("type")
  var type_ThresholdScale: js.UndefOr[threshold] = js.undefined
  var zero: js.UndefOr[Boolean | SignalRef] = js.undefined
}

object ThresholdScale {
  @scala.inline
  def apply(
    name: String,
    domain: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef = null,
    domainMax: Double | SignalRef = null,
    domainMid: Double | SignalRef = null,
    domainMin: Double | SignalRef = null,
    domainRaw: js.Array[_] | SignalRef = null,
    nice: Boolean | Double | SignalRef = null,
    padding: Double | SignalRef = null,
    range: RangeScheme = null,
    reverse: Boolean | SignalRef = null,
    round: Boolean | SignalRef = null,
    `type`: threshold = null,
    zero: Boolean | SignalRef = null
  ): ThresholdScale = {
    val __obj = js.Dynamic.literal(name = name)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThresholdScale]
  }
}

