package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastNotificationFactory extends js.Object {
  def createToastNotification(content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument): ToastNotification
}

object IToastNotificationFactory {
  @scala.inline
  def apply(
    createToastNotification: js.Function1[winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, ToastNotification]
  ): IToastNotificationFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createToastNotification")(createToastNotification)
    __obj.asInstanceOf[IToastNotificationFactory]
  }
}

