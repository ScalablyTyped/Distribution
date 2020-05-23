package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatId extends js.Object {
  var chatId: js.UndefOr[Double] = js.undefined
  var disableEditMessage: js.UndefOr[Boolean] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var inlineMessageId: js.UndefOr[String] = js.undefined
  var messageId: js.UndefOr[Double] = js.undefined
}

object ChatId {
  @scala.inline
  def apply(
    chatId: js.UndefOr[Double] = js.undefined,
    disableEditMessage: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    inlineMessageId: String = null,
    messageId: js.UndefOr[Double] = js.undefined
  ): ChatId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chatId)) __obj.updateDynamic("chatId")(chatId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEditMessage)) __obj.updateDynamic("disableEditMessage")(disableEditMessage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (inlineMessageId != null) __obj.updateDynamic("inlineMessageId")(inlineMessageId.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatId]
  }
}

