package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastNotification extends js.Object {
  var content: XmlDocument
  var expirationTime: Date
  var onactivated: js.Any
  var ondismissed: js.Any
  var onfailed: js.Any
}

object IToastNotification {
  @scala.inline
  def apply(
    content: XmlDocument,
    expirationTime: Date,
    onactivated: js.Any,
    ondismissed: js.Any,
    onfailed: js.Any
  ): IToastNotification = {
    val __obj = js.Dynamic.literal(content = content, expirationTime = expirationTime, onactivated = onactivated, ondismissed = ondismissed, onfailed = onfailed)
  
    __obj.asInstanceOf[IToastNotification]
  }
}

