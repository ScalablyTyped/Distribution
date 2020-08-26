package typings.winrt.Windows.UI.Notifications

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastNotification extends js.Object {
  var content: XmlDocument = js.native
  var expirationTime: Date = js.native
  var onactivated: js.Any = js.native
  var ondismissed: js.Any = js.native
  var onfailed: js.Any = js.native
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
  @scala.inline
  implicit class IToastNotificationOps[Self <: IToastNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: XmlDocument): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationTime(value: Date): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnactivated(value: js.Any): Self = this.set("onactivated", value.asInstanceOf[js.Any])
    @scala.inline
    def setOndismissed(value: js.Any): Self = this.set("ondismissed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnfailed(value: js.Any): Self = this.set("onfailed", value.asInstanceOf[js.Any])
  }
  
}

