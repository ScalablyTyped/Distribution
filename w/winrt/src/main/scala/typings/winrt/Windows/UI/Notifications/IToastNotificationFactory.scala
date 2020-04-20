package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastNotificationFactory extends js.Object {
  def createToastNotification(content: XmlDocument): ToastNotification
}

object IToastNotificationFactory {
  @scala.inline
  def apply(createToastNotification: XmlDocument => ToastNotification): IToastNotificationFactory = {
    val __obj = js.Dynamic.literal(createToastNotification = js.Any.fromFunction1(createToastNotification))
    __obj.asInstanceOf[IToastNotificationFactory]
  }
}

