package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduledToastNotificationFactory extends js.Object {
  def createScheduledToastNotification(content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, deliveryTime: stdLib.Date): ScheduledToastNotification = js.native
  def createScheduledToastNotification(
    content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument,
    deliveryTime: stdLib.Date,
    snoozeInterval: scala.Double,
    maximumSnoozeCount: scala.Double
  ): ScheduledToastNotification = js.native
}

