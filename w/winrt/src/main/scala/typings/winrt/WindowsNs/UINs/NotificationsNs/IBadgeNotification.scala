package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBadgeNotification extends js.Object {
  var content: XmlDocument
  var expirationTime: Date
}

object IBadgeNotification {
  @scala.inline
  def apply(content: XmlDocument, expirationTime: Date): IBadgeNotification = {
    val __obj = js.Dynamic.literal(content = content, expirationTime = expirationTime)
  
    __obj.asInstanceOf[IBadgeNotification]
  }
}

