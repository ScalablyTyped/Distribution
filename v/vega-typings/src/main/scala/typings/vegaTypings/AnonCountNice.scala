package typings.vegaTypings

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountNice extends js.Object {
  var count: js.UndefOr[Double | SignalRef] = js.undefined
  var nice: js.UndefOr[Double | SignalRef] = js.undefined
}

object AnonCountNice {
  @scala.inline
  def apply(count: Double | SignalRef = null, nice: Double | SignalRef = null): AnonCountNice = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (nice != null) __obj.updateDynamic("nice")(nice.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountNice]
  }
}

