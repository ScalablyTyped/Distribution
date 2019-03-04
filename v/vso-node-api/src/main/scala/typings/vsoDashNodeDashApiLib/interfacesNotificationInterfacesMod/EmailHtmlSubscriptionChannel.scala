package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailHtmlSubscriptionChannel extends SubscriptionChannelWithAddress

object EmailHtmlSubscriptionChannel {
  @scala.inline
  def apply(address: java.lang.String, `type`: java.lang.String, useCustomAddress: scala.Boolean): EmailHtmlSubscriptionChannel = {
    val __obj = js.Dynamic.literal(address = address, useCustomAddress = useCustomAddress)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EmailHtmlSubscriptionChannel]
  }
}

