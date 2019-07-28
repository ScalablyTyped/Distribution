package typings.twilioDashChat.twilioDashChatMod.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSortingOptions extends js.Object {
  var criteria: ChannelSortingCriteria
  var order: js.UndefOr[ChannelSortingOrder] = js.undefined
}

object ChannelSortingOptions {
  @scala.inline
  def apply(criteria: ChannelSortingCriteria, order: ChannelSortingOrder = null): ChannelSortingOptions = {
    val __obj = js.Dynamic.literal(criteria = criteria)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[ChannelSortingOptions]
  }
}

