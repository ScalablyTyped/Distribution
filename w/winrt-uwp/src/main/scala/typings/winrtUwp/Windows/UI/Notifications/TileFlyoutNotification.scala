package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileFlyoutNotification extends js.Object {
  var content: js.Any = js.native
   /* unmapped type */ var expirationTime: js.Any = js.native
}

object TileFlyoutNotification {
  @scala.inline
  def apply(content: js.Any, expirationTime: js.Any): TileFlyoutNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileFlyoutNotification]
  }
  @scala.inline
  implicit class TileFlyoutNotificationOps[Self <: TileFlyoutNotification] (val x: Self) extends AnyVal {
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
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationTime(value: js.Any): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
  }
  
}

