package typings.vegaTypings

import typings.vegaTypings.scaleMod._ScaleBins
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStart extends _ScaleBins {
  var start: js.UndefOr[Double | SignalRef] = js.undefined
  var step: Double | SignalRef
  var stop: js.UndefOr[Double | SignalRef] = js.undefined
}

object AnonStart {
  @scala.inline
  def apply(step: Double | SignalRef, start: Double | SignalRef = null, stop: Double | SignalRef = null): AnonStart = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStart]
  }
}

