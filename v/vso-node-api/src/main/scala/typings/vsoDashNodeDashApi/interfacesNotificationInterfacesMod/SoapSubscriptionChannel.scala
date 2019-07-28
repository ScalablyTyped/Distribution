package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoapSubscriptionChannel extends SubscriptionChannelWithAddress

object SoapSubscriptionChannel {
  @scala.inline
  def apply(address: String, `type`: String, useCustomAddress: Boolean): SoapSubscriptionChannel = {
    val __obj = js.Dynamic.literal(address = address, useCustomAddress = useCustomAddress)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SoapSubscriptionChannel]
  }
}

