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
  def apply(create: java.lang.String => NetworkOperatorNotificationTrigger): INetworkOperatorNotificationTriggerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[INetworkOperatorNotificationTriggerFactory]
  }
}

