package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionChannelWithAddress extends js.Object {
  var address: java.lang.String
  var `type`: java.lang.String
  var useCustomAddress: scala.Boolean
}

object SubscriptionChannelWithAddress {
  @scala.inline
  def apply(address: java.lang.String, `type`: java.lang.String, useCustomAddress: scala.Boolean): SubscriptionChannelWithAddress = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("useCustomAddress")(useCustomAddress)
    __obj.asInstanceOf[SubscriptionChannelWithAddress]
  }
}

