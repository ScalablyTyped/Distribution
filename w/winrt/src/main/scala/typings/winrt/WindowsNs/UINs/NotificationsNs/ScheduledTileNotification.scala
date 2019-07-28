package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ScheduledTileNotification")
@js.native
class ScheduledTileNotification protected () extends IScheduledTileNotification {
  def this(content: XmlDocument, deliveryTime: Date) = this()
  /* CompleteClass */
  override var content: XmlDocument = js.native
  /* CompleteClass */
  override var deliveryTime: Date = js.native
  /* CompleteClass */
  override var expirationTime: Date = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var tag: String = js.native
}

