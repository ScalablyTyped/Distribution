package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSystemSubscriptionChannel extends SubscriptionChannelWithAddress

object UserSystemSubscriptionChannel {
  @scala.inline
  def apply(address: String, `type`: String, useCustomAddress: Boolean): UserSystemSubscriptionChannel = {
    val __obj = js.Dynamic.literal(address = address, useCustomAddress = useCustomAddress)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UserSystemSubscriptionChannel]
  }
}

