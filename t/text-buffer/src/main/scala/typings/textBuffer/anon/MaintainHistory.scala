package typings.textBuffer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintainHistory extends js.Object {
  var maintainHistory: js.UndefOr[Boolean] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
}

object MaintainHistory {
  @scala.inline
  def apply(
    maintainHistory: js.UndefOr[Boolean] = js.undefined,
    persistent: js.UndefOr[Boolean] = js.undefined
  ): MaintainHistory = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maintainHistory)) __obj.updateDynamic("maintainHistory")(maintainHistory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintainHistory]
  }
}

