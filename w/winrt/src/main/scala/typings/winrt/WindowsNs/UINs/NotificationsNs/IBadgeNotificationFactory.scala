package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBadgeNotificationFactory extends js.Object {
  def createBadgeNotification(content: XmlDocument): BadgeNotification
}

object IBadgeNotificationFactory {
  @scala.inline
  def apply(createBadgeNotification: XmlDocument => BadgeNotification): IBadgeNotificationFactory = {
    val __obj = js.Dynamic.literal(createBadgeNotification = js.Any.fromFunction1(createBadgeNotification))
  
    __obj.asInstanceOf[IBadgeNotificationFactory]
  }
}

