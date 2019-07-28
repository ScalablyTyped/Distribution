package typings.tgfancy.tgfancyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TgfancyOptions extends js.Object {
  var chatIdResolution: js.UndefOr[Boolean | ChatIdResolutionOptions] = js.undefined
  var emojification: js.UndefOr[Boolean | EmojificationOptions] = js.undefined
  var kickWithoutBan: js.UndefOr[Boolean] = js.undefined
  var openshiftWebHook: js.UndefOr[Boolean] = js.undefined
  var orderedSending: js.UndefOr[Boolean] = js.undefined
  var ratelimiting: js.UndefOr[Boolean | RatelimitingOptions] = js.undefined
  var textPaging: js.UndefOr[Boolean] = js.undefined
  var webSocket: js.UndefOr[Boolean | WebSocketOptions] = js.undefined
}

object TgfancyOptions {
  @scala.inline
  def apply(
    chatIdResolution: Boolean | ChatIdResolutionOptions = null,
    emojification: Boolean | EmojificationOptions = null,
    kickWithoutBan: js.UndefOr[Boolean] = js.undefined,
    openshiftWebHook: js.UndefOr[Boolean] = js.undefined,
    orderedSending: js.UndefOr[Boolean] = js.undefined,
    ratelimiting: Boolean | RatelimitingOptions = null,
    textPaging: js.UndefOr[Boolean] = js.undefined,
    webSocket: Boolean | WebSocketOptions = null
  ): TgfancyOptions = {
    val __obj = js.Dynamic.literal()
    if (chatIdResolution != null) __obj.updateDynamic("chatIdResolution")(chatIdResolution.asInstanceOf[js.Any])
    if (emojification != null) __obj.updateDynamic("emojification")(emojification.asInstanceOf[js.Any])
    if (!js.isUndefined(kickWithoutBan)) __obj.updateDynamic("kickWithoutBan")(kickWithoutBan)
    if (!js.isUndefined(openshiftWebHook)) __obj.updateDynamic("openshiftWebHook")(openshiftWebHook)
    if (!js.isUndefined(orderedSending)) __obj.updateDynamic("orderedSending")(orderedSending)
    if (ratelimiting != null) __obj.updateDynamic("ratelimiting")(ratelimiting.asInstanceOf[js.Any])
    if (!js.isUndefined(textPaging)) __obj.updateDynamic("textPaging")(textPaging)
    if (webSocket != null) __obj.updateDynamic("webSocket")(webSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[TgfancyOptions]
  }
}

