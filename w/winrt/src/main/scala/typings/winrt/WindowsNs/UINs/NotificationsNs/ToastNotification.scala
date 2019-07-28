package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ToastNotification")
@js.native
class ToastNotification protected () extends IToastNotification {
  def this(content: XmlDocument) = this()
  /* CompleteClass */
  override var content: XmlDocument = js.native
  /* CompleteClass */
  override var expirationTime: Date = js.native
  /* CompleteClass */
  override var onactivated: js.Any = js.native
  /* CompleteClass */
  override var ondismissed: js.Any = js.native
  /* CompleteClass */
  override var onfailed: js.Any = js.native
}

