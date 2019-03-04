package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdinalScale
  extends BaseScale
     with Scale {
  var domainImplicit: js.UndefOr[scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  var range: js.UndefOr[RangeScheme | ScaleData] = js.undefined
  @JSName("type")
  var type_OrdinalScale: vegaDashTypingsLib.vegaDashTypingsLibStrings.ordinal
}

object OrdinalScale {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.ordinal,
    domain: (js.Array[
      scala.Null | java.lang.String | scala.Double | scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
    ]) | ScaleData | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainImplicit: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMax: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMid: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMin: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainRaw: js.Array[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    interpolate: ScaleInterpolate = null,
    range: RangeScheme | ScaleData = null,
    reverse: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    round: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): OrdinalScale = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainImplicit != null) __obj.updateDynamic("domainImplicit")(domainImplicit.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate)
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdinalScale]
  }
}

