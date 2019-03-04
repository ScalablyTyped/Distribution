package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkOperatorNotificationTriggerFactory extends js.Object {
  def create(networkAccountId: java.lang.String): NetworkOperatorNotificationTrigger
}

object INetworkOperatorNotificationTriggerFactory {
  @scala.inline
  def apply(create: js.Function1[java.lang.String, NetworkOperatorNotificationTrigger]): INetworkOperatorNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal(create = create)
  
    __obj.asInstanceOf[INetworkOperatorNotificationTriggerFactory]
  }
}

