package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineMessageId extends js.Object {
  var chatId: js.UndefOr[Double] = js.native
  var inlineMessageId: js.UndefOr[String] = js.native
  var messageId: js.UndefOr[Double] = js.native
}

object InlineMessageId {
  @scala.inline
  def apply(): InlineMessageId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineMessageId]
  }
  @scala.inline
  implicit class InlineMessageIdOps[Self <: InlineMessageId] (val x: Self) extends AnyVal {
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
    def setInlineMessageId(value: String): Self = this.set("inlineMessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineMessageId: Self = this.set("inlineMessageId", js.undefined)
    @scala.inline
    def setMessageId(value: Double): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
  }
  
}

