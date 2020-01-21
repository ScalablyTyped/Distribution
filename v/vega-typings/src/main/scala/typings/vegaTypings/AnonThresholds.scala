package typings.vegaTypings

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThresholds extends js.Object {
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
}

object AnonThresholds {
  @scala.inline
  def apply(thresholds: (js.Array[Double | SignalRef]) | SignalRef = null): AnonThresholds = {
    val __obj = js.Dynamic.literal()
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThresholds]
  }
}

