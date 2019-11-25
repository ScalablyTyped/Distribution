package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionChannelWithAddress extends js.Object {
  var address: String
  var `type`: String
  var useCustomAddress: Boolean
}

object SubscriptionChannelWithAddress {
  @scala.inline
  def apply(address: String, `type`: String, useCustomAddress: Boolean): SubscriptionChannelWithAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], useCustomAddress = useCustomAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionChannelWithAddress]
  }
}

