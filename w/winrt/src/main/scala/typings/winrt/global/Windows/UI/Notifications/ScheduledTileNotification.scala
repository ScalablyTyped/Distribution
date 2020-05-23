package typings.winrt.global.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ScheduledTileNotification")
@js.native
class ScheduledTileNotification protected ()
  extends typings.winrt.Windows.UI.Notifications.ScheduledTileNotification {
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

