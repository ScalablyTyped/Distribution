package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends js.Object {
  var notification: js.UndefOr[Boolean] = js.native
  var parseMode: js.UndefOr[String] = js.native
  var replyMarkup: js.UndefOr[js.Any] = js.native
  var replyToMessage: js.UndefOr[Double] = js.native
  var webPreview: js.UndefOr[Boolean] = js.native
}

object Notification {
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
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
    def setNotification(value: Boolean): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setParseMode(value: String): Self = this.set("parseMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseMode: Self = this.set("parseMode", js.undefined)
    @scala.inline
    def setReplyMarkup(value: js.Any): Self = this.set("replyMarkup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyMarkup: Self = this.set("replyMarkup", js.undefined)
    @scala.inline
    def setReplyToMessage(value: Double): Self = this.set("replyToMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToMessage: Self = this.set("replyToMessage", js.undefined)
    @scala.inline
    def setWebPreview(value: Boolean): Self = this.set("webPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPreview: Self = this.set("webPreview", js.undefined)
  }
  
}

