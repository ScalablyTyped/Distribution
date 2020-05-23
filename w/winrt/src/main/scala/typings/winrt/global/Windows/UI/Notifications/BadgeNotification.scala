package typings.winrt.global.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.BadgeNotification")
@js.native
class BadgeNotification protected ()
  extends typings.winrt.Windows.UI.Notifications.BadgeNotification {
  def this(content: XmlDocument) = this()
  /* CompleteClass */
  override var content: XmlDocument = js.native
  /* CompleteClass */
  override var expirationTime: Date = js.native
}

