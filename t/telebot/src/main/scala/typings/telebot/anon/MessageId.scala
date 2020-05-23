package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageId extends js.Object {
  var chatId: js.UndefOr[Double | String] = js.undefined
  var inlineMsgId: Double
  var messageId: js.UndefOr[Double] = js.undefined
}

object MessageId {
  @scala.inline
  def apply(inlineMsgId: Double, chatId: Double | String = null, messageId: js.UndefOr[Double] = js.undefined): MessageId = {
    val __obj = js.Dynamic.literal(inlineMsgId = inlineMsgId.asInstanceOf[js.Any])
    if (chatId != null) __obj.updateDynamic("chatId")(chatId.asInstanceOf[js.Any])
    if (!js.isUndefined(messageId)) __obj.updateDynamic("messageId")(messageId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageId]
  }
}

