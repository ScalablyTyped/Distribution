package typings.winrt.Windows.Networking.PushNotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawNotification extends IRawNotification

object RawNotification {
  @scala.inline
  def apply(content: String): RawNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawNotification]
  }
}

