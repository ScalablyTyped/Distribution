package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChatId extends js.Object {
  var chatId: js.UndefOr[scala.Double] = js.undefined
  var disableEditMessage: js.UndefOr[scala.Boolean] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var inlineMessageId: js.UndefOr[java.lang.String] = js.undefined
  var messageId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ChatId {
  @scala.inline
  def apply(
    chatId: scala.Int | scala.Double = null,
    disableEditMessage: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    inlineMessageId: java.lang.String = null,
    messageId: scala.Int | scala.Double = null
  ): Anon_ChatId = {
    val __obj = js.Dynamic.literal()
    if (chatId != null) __obj.updateDynamic("chatId")(chatId.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEditMessage)) __obj.updateDynamic("disableEditMessage")(disableEditMessage)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (inlineMessageId != null) __obj.updateDynamic("inlineMessageId")(inlineMessageId)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChatId]
  }
}

