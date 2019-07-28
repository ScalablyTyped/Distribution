package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduledToastNotificationFactory extends js.Object {
  def createScheduledToastNotification(content: XmlDocument, deliveryTime: Date): ScheduledToastNotification = js.native
  def createScheduledToastNotification(content: XmlDocument, deliveryTime: Date, snoozeInterval: Double, maximumSnoozeCount: Double): ScheduledToastNotification = js.native
}

