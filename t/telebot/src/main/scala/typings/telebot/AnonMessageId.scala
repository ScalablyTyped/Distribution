package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageId extends js.Object {
  var chatId: js.UndefOr[Double | String] = js.undefined
  var inlineMsgId: Double
  var messageId: js.UndefOr[Double] = js.undefined
}

object AnonMessageId {
  @scala.inline
  def apply(inlineMsgId: Double, chatId: Double | String = null, messageId: Int | Double = null): AnonMessageId = {
    val __obj = js.Dynamic.literal(inlineMsgId = inlineMsgId.asInstanceOf[js.Any])
    if (chatId != null) __obj.updateDynamic("chatId")(chatId.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageId]
  }
}

