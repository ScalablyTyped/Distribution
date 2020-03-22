package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInlineMsgId extends js.Object {
  var chatId: Double | String
  var inlineMsgId: js.UndefOr[Double] = js.undefined
  var messageId: Double
}

object AnonInlineMsgId {
  @scala.inline
  def apply(chatId: Double | String, messageId: Double, inlineMsgId: Int | Double = null): AnonInlineMsgId = {
    val __obj = js.Dynamic.literal(chatId = chatId.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    if (inlineMsgId != null) __obj.updateDynamic("inlineMsgId")(inlineMsgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInlineMsgId]
  }
}

