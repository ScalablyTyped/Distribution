package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChatId extends js.Object {
  var chatId: js.UndefOr[Double] = js.undefined
  var disableEditMessage: js.UndefOr[Boolean] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var inlineMessageId: js.UndefOr[String] = js.undefined
  var messageId: js.UndefOr[Double] = js.undefined
}

object AnonChatId {
  @scala.inline
  def apply(
    chatId: Int | Double = null,
    disableEditMessage: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    inlineMessageId: String = null,
    messageId: Int | Double = null
  ): AnonChatId = {
    val __obj = js.Dynamic.literal()
    if (chatId != null) __obj.updateDynamic("chatId")(chatId.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEditMessage)) __obj.updateDynamic("disableEditMessage")(disableEditMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (inlineMessageId != null) __obj.updateDynamic("inlineMessageId")(inlineMessageId.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChatId]
  }
}

