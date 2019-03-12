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
  def apply(createToastNotification: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument => ToastNotification): IToastNotificationFactory = {
    val __obj = js.Dynamic.literal(createToastNotification = js.Any.fromFunction1(createToastNotification))
  
    __obj.asInstanceOf[IToastNotificationFactory]
  }
}

