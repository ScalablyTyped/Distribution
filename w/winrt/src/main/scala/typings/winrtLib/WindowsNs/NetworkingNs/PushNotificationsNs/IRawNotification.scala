package typings
package winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawNotification extends js.Object {
  var content: java.lang.String
}

object IRawNotification {
  @scala.inline
  def apply(content: java.lang.String): IRawNotification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[IRawNotification]
  }
}

