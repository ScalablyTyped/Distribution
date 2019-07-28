package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ScheduledToastNotification")
@js.native
class ScheduledToastNotification protected () extends IScheduledToastNotification {
  def this(content: XmlDocument, deliveryTime: Date) = this()
  def this(content: XmlDocument, deliveryTime: Date, snoozeInterval: Double, maximumSnoozeCount: Double) = this()
  /* CompleteClass */
  override var content: XmlDocument = js.native
  /* CompleteClass */
  override var deliveryTime: Date = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var maximumSnoozeCount: Double = js.native
  /* CompleteClass */
  override var snoozeInterval: Double = js.native
}

