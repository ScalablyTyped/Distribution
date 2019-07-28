package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
@js.native
class ToastNotificationManager () extends js.Object

/* static members */
@JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
@js.native
object ToastNotificationManager extends js.Object {
  def createToastNotifier(): ToastNotifier = js.native
  def createToastNotifier(applicationId: String): ToastNotifier = js.native
  def getTemplateContent(`type`: ToastTemplateType): XmlDocument = js.native
}

