package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoapSubscriptionChannel extends SubscriptionChannelWithAddress

object SoapSubscriptionChannel {
  @scala.inline
  def apply(address: java.lang.String, `type`: java.lang.String, useCustomAddress: scala.Boolean): SoapSubscriptionChannel = {
    val __obj = js.Dynamic.literal(address = address, useCustomAddress = useCustomAddress)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SoapSubscriptionChannel]
  }
}

