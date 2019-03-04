package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChatIdInlineMsgId extends js.Object {
  var chatId: scala.Double | java.lang.String
  var inlineMsgId: js.UndefOr[scala.Double] = js.undefined
  var messageId: scala.Double
}

object Anon_ChatIdInlineMsgId {
  @scala.inline
  def apply(
    chatId: scala.Double | java.lang.String,
    messageId: scala.Double,
    inlineMsgId: scala.Int | scala.Double = null
  ): Anon_ChatIdInlineMsgId = {
    val __obj = js.Dynamic.literal(chatId = chatId.asInstanceOf[js.Any], messageId = messageId)
    if (inlineMsgId != null) __obj.updateDynamic("inlineMsgId")(inlineMsgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChatIdInlineMsgId]
  }
}

