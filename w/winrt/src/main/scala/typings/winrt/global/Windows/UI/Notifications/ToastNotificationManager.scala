package typings.winrt.global.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
@js.native
class ToastNotificationManager ()
  extends typings.winrt.Windows.UI.Notifications.ToastNotificationManager

/* static members */
@JSGlobal("Windows.UI.Notifications.ToastNotificationManager")
@js.native
object ToastNotificationManager extends js.Object {
  def createToastNotifier(): typings.winrt.Windows.UI.Notifications.ToastNotifier = js.native
  def createToastNotifier(applicationId: String): typings.winrt.Windows.UI.Notifications.ToastNotifier = js.native
  def getTemplateContent(`type`: typings.winrt.Windows.UI.Notifications.ToastTemplateType): XmlDocument = js.native
}

