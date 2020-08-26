package typings.twilioChat.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSortingOptions extends js.Object {
  var criteria: ChannelSortingCriteria = js.native
  var order: js.UndefOr[ChannelSortingOrder] = js.native
}

object ChannelSortingOptions {
  @scala.inline
  def apply(criteria: ChannelSortingCriteria): ChannelSortingOptions = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSortingOptions]
  }
  @scala.inline
  implicit class ChannelSortingOptionsOps[Self <: ChannelSortingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCriteria(value: ChannelSortingCriteria): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: ChannelSortingOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

