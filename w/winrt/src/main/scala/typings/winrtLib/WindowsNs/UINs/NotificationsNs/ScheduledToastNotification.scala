package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ScheduledToastNotification")
@js.native
class ScheduledToastNotification protected () extends IScheduledToastNotification {
  def this(content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, deliveryTime: stdLib.Date) = this()
  def this(content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, deliveryTime: stdLib.Date, snoozeInterval: scala.Double, maximumSnoozeCount: scala.Double) = this()
  /* CompleteClass */
  override var content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /* CompleteClass */
  override var deliveryTime: stdLib.Date = js.native
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override var maximumSnoozeCount: scala.Double = js.native
  /* CompleteClass */
  override var snoozeInterval: scala.Double = js.native
}

