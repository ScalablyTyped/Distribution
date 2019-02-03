package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

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
  def createToastNotifier(): winrtLib.WindowsNs.UINs.NotificationsNs.ToastNotifier = js.native
  def createToastNotifier(applicationId: java.lang.String): winrtLib.WindowsNs.UINs.NotificationsNs.ToastNotifier = js.native
  def getTemplateContent(`type`: winrtLib.WindowsNs.UINs.NotificationsNs.ToastTemplateType): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

