package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChatIdInlineMsgIdMessageId extends js.Object {
  var chatId: js.UndefOr[Double | String] = js.undefined
  var inlineMsgId: Double
  var messageId: js.UndefOr[Double] = js.undefined
}

object Anon_ChatIdInlineMsgIdMessageId {
  @scala.inline
  def apply(inlineMsgId: Double, chatId: Double | String = null, messageId: Int | Double = null): Anon_ChatIdInlineMsgIdMessageId = {
    val __obj = js.Dynamic.literal(inlineMsgId = inlineMsgId)
    if (chatId != null) __obj.updateDynamic("chatId")(chatId.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChatIdInlineMsgIdMessageId]
  }
}

