package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastNotification extends js.Object {
  var content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
  var expirationTime: stdLib.Date
  var onactivated: js.Any
  var ondismissed: js.Any
  var onfailed: js.Any
}

object IToastNotification {
  @scala.inline
  def apply(
    content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument,
    expirationTime: stdLib.Date,
    onactivated: js.Any,
    ondismissed: js.Any,
    onfailed: js.Any
  ): IToastNotification = {
    val __obj = js.Dynamic.literal(content = content, expirationTime = expirationTime, onactivated = onactivated, ondismissed = ondismissed, onfailed = onfailed)
  
    __obj.asInstanceOf[IToastNotification]
  }
}

