package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChatIdInlineMsgIdMessageId extends js.Object {
  var chatId: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var inlineMsgId: scala.Double
  var messageId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ChatIdInlineMsgIdMessageId {
  @scala.inline
  def apply(
    inlineMsgId: scala.Double,
    chatId: scala.Double | java.lang.String = null,
    messageId: scala.Int | scala.Double = null
  ): Anon_ChatIdInlineMsgIdMessageId = {
    val __obj = js.Dynamic.literal(inlineMsgId = inlineMsgId)
    if (chatId != null) __obj.updateDynamic("chatId")(chatId.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChatIdInlineMsgIdMessageId]
  }
}

