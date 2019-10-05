package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkOperatorNotificationTrigger extends IBackgroundTrigger {
  var networkAccountId: String
}

object INetworkOperatorNotificationTrigger {
  @scala.inline
  def apply(networkAccountId: String): INetworkOperatorNotificationTrigger = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId)
  
    __obj.asInstanceOf[INetworkOperatorNotificationTrigger]
  }
}

