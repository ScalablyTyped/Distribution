package typings.winrt.global.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ScheduledToastNotification")
@js.native
class ScheduledToastNotification protected ()
  extends typings.winrt.Windows.UI.Notifications.ScheduledToastNotification {
  def this(content: XmlDocument, deliveryTime: Date) = this()
  def this(content: XmlDocument, deliveryTime: Date, snoozeInterval: Double, maximumSnoozeCount: Double) = this()
}

