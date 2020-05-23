package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineMsgId extends js.Object {
  var chatId: Double | String
  var inlineMsgId: js.UndefOr[Double] = js.undefined
  var messageId: Double
}

object InlineMsgId {
  @scala.inline
  def apply(chatId: Double | String, messageId: Double, inlineMsgId: js.UndefOr[Double] = js.undefined): InlineMsgId = {
    val __obj = js.Dynamic.literal(chatId = chatId.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineMsgId)) __obj.updateDynamic("inlineMsgId")(inlineMsgId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineMsgId]
  }
}

