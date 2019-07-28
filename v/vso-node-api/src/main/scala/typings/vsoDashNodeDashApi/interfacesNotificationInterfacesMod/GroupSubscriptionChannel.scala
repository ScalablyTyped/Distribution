package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupSubscriptionChannel extends SubscriptionChannelWithAddress

object GroupSubscriptionChannel {
  @scala.inline
  def apply(address: String, `type`: String, useCustomAddress: Boolean): GroupSubscriptionChannel = {
    val __obj = js.Dynamic.literal(address = address, useCustomAddress = useCustomAddress)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GroupSubscriptionChannel]
  }
}

