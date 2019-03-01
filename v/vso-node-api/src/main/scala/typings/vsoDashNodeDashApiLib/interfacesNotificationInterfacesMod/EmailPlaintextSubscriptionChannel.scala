package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailPlaintextSubscriptionChannel extends SubscriptionChannelWithAddress

object EmailPlaintextSubscriptionChannel {
  @scala.inline
  def apply(address: java.lang.String, `type`: java.lang.String, useCustomAddress: scala.Boolean): EmailPlaintextSubscriptionChannel = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("useCustomAddress")(useCustomAddress)
    __obj.asInstanceOf[EmailPlaintextSubscriptionChannel]
  }
}

