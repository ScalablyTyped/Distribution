package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBadgeNotification extends js.Object {
  var content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
  var expirationTime: stdLib.Date
}

object IBadgeNotification {
  @scala.inline
  def apply(content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, expirationTime: stdLib.Date): IBadgeNotification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("expirationTime")(expirationTime)
    __obj.asInstanceOf[IBadgeNotification]
  }
}

