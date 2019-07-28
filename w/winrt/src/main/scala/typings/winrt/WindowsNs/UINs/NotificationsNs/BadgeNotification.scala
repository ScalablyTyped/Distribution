package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.BadgeNotification")
@js.native
class BadgeNotification protected () extends IBadgeNotification {
  def this(content: XmlDocument) = this()
  /* CompleteClass */
  override var content: XmlDocument = js.native
  /* CompleteClass */
  override var expirationTime: Date = js.native
}

