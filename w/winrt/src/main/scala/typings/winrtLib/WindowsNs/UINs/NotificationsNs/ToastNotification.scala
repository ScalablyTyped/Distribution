package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ToastNotification")
@js.native
class ToastNotification protected () extends IToastNotification {
  def this(content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument) = this()
  /* CompleteClass */
  override var content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /* CompleteClass */
  override var expirationTime: stdLib.Date = js.native
  /* CompleteClass */
  override var onactivated: js.Any = js.native
  /* CompleteClass */
  override var ondismissed: js.Any = js.native
  /* CompleteClass */
  override var onfailed: js.Any = js.native
}

