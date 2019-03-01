package typings
package winrtLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkOperatorNotificationTrigger extends IBackgroundTrigger {
  var networkAccountId: java.lang.String
}

object INetworkOperatorNotificationTrigger {
  @scala.inline
  def apply(networkAccountId: java.lang.String): INetworkOperatorNotificationTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("networkAccountId")(networkAccountId)
    __obj.asInstanceOf[INetworkOperatorNotificationTrigger]
  }
}

