package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatId extends js.Object {
  var chatId: js.UndefOr[Double] = js.native
  var disableEditMessage: js.UndefOr[Boolean] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var inlineMessageId: js.UndefOr[String] = js.native
  var messageId: js.UndefOr[Double] = js.native
}

object ChatId {
  @scala.inline
  def apply(): ChatId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatId]
  }
  @scala.inline
  implicit class ChatIdOps[Self <: ChatId] (val x: Self) extends AnyVal {
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
    def setChatId(value: Double): Self = this.set("chatId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChatId: Self = this.set("chatId", js.undefined)
    @scala.inline
    def setDisableEditMessage(value: Boolean): Self = this.set("disableEditMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableEditMessage: Self = this.set("disableEditMessage", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setInlineMessageId(value: String): Self = this.set("inlineMessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineMessageId: Self = this.set("inlineMessageId", js.undefined)
    @scala.inline
    def setMessageId(value: Double): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
  }
  
}

