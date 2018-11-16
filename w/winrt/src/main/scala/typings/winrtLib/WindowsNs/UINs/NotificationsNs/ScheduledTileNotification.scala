package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ScheduledTileNotification")
@js.native
class ScheduledTileNotification protected () extends IScheduledTileNotification {
  def this(content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, deliveryTime: stdLib.Date) = this()
  /* CompleteClass */
  override var content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /* CompleteClass */
  override var deliveryTime: stdLib.Date = js.native
  /* CompleteClass */
  override var expirationTime: stdLib.Date = js.native
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override var tag: java.lang.String = js.native
}

