package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailHtmlSubscriptionChannel extends SubscriptionChannelWithAddress

object EmailHtmlSubscriptionChannel {
  @scala.inline
  def apply(address: String, `type`: String, useCustomAddress: Boolean): EmailHtmlSubscriptionChannel = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], useCustomAddress = useCustomAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailHtmlSubscriptionChannel]
  }
}

