package typings.winrt.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkOperatorNotificationTriggerFactory extends js.Object {
  def create(networkAccountId: String): NetworkOperatorNotificationTrigger
}

object INetworkOperatorNotificationTriggerFactory {
  @scala.inline
  def apply(create: String => NetworkOperatorNotificationTrigger): INetworkOperatorNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[INetworkOperatorNotificationTriggerFactory]
  }
}

