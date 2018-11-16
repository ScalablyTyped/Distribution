package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastNotificationManagerStatics extends js.Object {
  def createToastNotifier(): ToastNotifier = js.native
  def createToastNotifier(applicationId: java.lang.String): ToastNotifier = js.native
  def getTemplateContent(`type`: ToastTemplateType): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

