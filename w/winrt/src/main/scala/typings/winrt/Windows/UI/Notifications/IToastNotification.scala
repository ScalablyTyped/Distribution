package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
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
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any], ondismissed = ondismissed.asInstanceOf[js.Any], onfailed = onfailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastNotification]
  }
}

