package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplyToMessage extends js.Object {
  var caption: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var fileName: js.UndefOr[String] = js.native
  var notification: js.UndefOr[Boolean] = js.native
  var replyMarkup: js.UndefOr[js.Any] = js.native
  var replyToMessage: js.UndefOr[Double] = js.native
  var serverDownload: js.UndefOr[Boolean] = js.native
}

object ReplyToMessage {
  @scala.inline
  def apply(): ReplyToMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplyToMessage]
  }
  @scala.inline
  implicit class ReplyToMessageOps[Self <: ReplyToMessage] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setNotification(value: Boolean): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setReplyMarkup(value: js.Any): Self = this.set("replyMarkup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyMarkup: Self = this.set("replyMarkup", js.undefined)
    @scala.inline
    def setReplyToMessage(value: Double): Self = this.set("replyToMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToMessage: Self = this.set("replyToMessage", js.undefined)
    @scala.inline
    def setServerDownload(value: Boolean): Self = this.set("serverDownload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerDownload: Self = this.set("serverDownload", js.undefined)
  }
  
}

