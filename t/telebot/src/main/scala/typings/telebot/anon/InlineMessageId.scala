package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineMessageId extends js.Object {
  var chatId: js.UndefOr[Double] = js.undefined
  var inlineMessageId: js.UndefOr[String] = js.undefined
  var messageId: js.UndefOr[Double] = js.undefined
}

object InlineMessageId {
  @scala.inline
  def apply(
    chatId: js.UndefOr[Double] = js.undefined,
    inlineMessageId: String = null,
    messageId: js.UndefOr[Double] = js.undefined
  ): InlineMessageId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chatId)) __obj.updateDynamic("chatId")(chatId.get.asInstanceOf[js.Any])
    if (inlineMessageId != null) __obj.updateDynamic("inlineMessageId")(inlineMessageId.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineMessageId]
  }
}

