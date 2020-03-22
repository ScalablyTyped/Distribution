package typings.vegaTypings

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNice extends js.Object {
  var count: js.UndefOr[Double | SignalRef] = js.undefined
  var nice: js.UndefOr[Double | SignalRef] = js.undefined
}

object AnonNice {
  @scala.inline
  def apply(count: Double | SignalRef = null, nice: Double | SignalRef = null): AnonNice = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNice]
  }
}

