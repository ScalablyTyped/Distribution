package typings.vegaTypings.anon

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thresholds extends js.Object {
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
}

object Thresholds {
  @scala.inline
  def apply(thresholds: (js.Array[Double | SignalRef]) | SignalRef = null): Thresholds = {
    val __obj = js.Dynamic.literal()
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thresholds]
  }
}

