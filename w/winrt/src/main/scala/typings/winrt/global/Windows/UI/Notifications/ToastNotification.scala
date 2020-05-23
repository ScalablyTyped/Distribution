package typings.winrt.global.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ToastNotification")
@js.native
class ToastNotification protected ()
  extends typings.winrt.Windows.UI.Notifications.ToastNotification {
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

