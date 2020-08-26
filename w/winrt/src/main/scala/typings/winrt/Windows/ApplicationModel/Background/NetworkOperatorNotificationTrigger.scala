package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkOperatorNotificationTrigger extends INetworkOperatorNotificationTrigger

object NetworkOperatorNotificationTrigger {
  @scala.inline
  def apply(networkAccountId: String): NetworkOperatorNotificationTrigger = {
    val __obj = js.Dynamic.literal(networkAccountId = networkAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorNotificationTrigger]
  }
}

