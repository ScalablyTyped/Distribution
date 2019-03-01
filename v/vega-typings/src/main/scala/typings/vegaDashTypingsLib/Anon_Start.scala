package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Start
  extends vegaDashTypingsLib.typesSpecScaleMod._ScaleBins {
  var start: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var step: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  var stop: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
}

object Anon_Start {
  @scala.inline
  def apply(
    step: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef,
    start: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    stop: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): Anon_Start = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Start]
  }
}

