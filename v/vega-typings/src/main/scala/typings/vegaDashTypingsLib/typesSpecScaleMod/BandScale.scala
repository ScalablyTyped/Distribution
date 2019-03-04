package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BandScale
  extends BaseBandScale
     with Scale {
  var paddingInner: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  @JSName("type")
  var type_BandScale: vegaDashTypingsLib.vegaDashTypingsLibStrings.band
}

object BandScale {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.band,
    align: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domain: (js.Array[
      scala.Null | java.lang.String | scala.Double | scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
    ]) | ScaleData | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMax: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMid: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainMin: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    domainRaw: js.Array[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    padding: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    paddingInner: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    paddingOuter: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    range: RangeBand = null,
    reverse: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    round: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): BandScale = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (domainMax != null) __obj.updateDynamic("domainMax")(domainMax.asInstanceOf[js.Any])
    if (domainMid != null) __obj.updateDynamic("domainMid")(domainMid.asInstanceOf[js.Any])
    if (domainMin != null) __obj.updateDynamic("domainMin")(domainMin.asInstanceOf[js.Any])
    if (domainRaw != null) __obj.updateDynamic("domainRaw")(domainRaw.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingInner != null) __obj.updateDynamic("paddingInner")(paddingInner.asInstanceOf[js.Any])
    if (paddingOuter != null) __obj.updateDynamic("paddingOuter")(paddingOuter.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reverse != null) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandScale]
  }
}

