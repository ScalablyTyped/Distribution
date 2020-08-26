package typings.tgfancy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TgfancyOptions extends js.Object {
  var chatIdResolution: js.UndefOr[Boolean | ChatIdResolutionOptions] = js.native
  var emojification: js.UndefOr[Boolean | EmojificationOptions] = js.native
  var kickWithoutBan: js.UndefOr[Boolean] = js.native
  var openshiftWebHook: js.UndefOr[Boolean] = js.native
  var orderedSending: js.UndefOr[Boolean] = js.native
  var ratelimiting: js.UndefOr[Boolean | RatelimitingOptions] = js.native
  var textPaging: js.UndefOr[Boolean] = js.native
  var webSocket: js.UndefOr[Boolean | WebSocketOptions] = js.native
}

object TgfancyOptions {
  @scala.inline
  def apply(): TgfancyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TgfancyOptions]
  }
  @scala.inline
  implicit class TgfancyOptionsOps[Self <: TgfancyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChatIdResolution(value: Boolean | ChatIdResolutionOptions): Self = this.set("chatIdResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChatIdResolution: Self = this.set("chatIdResolution", js.undefined)
    @scala.inline
    def setEmojification(value: Boolean | EmojificationOptions): Self = this.set("emojification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmojification: Self = this.set("emojification", js.undefined)
    @scala.inline
    def setKickWithoutBan(value: Boolean): Self = this.set("kickWithoutBan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKickWithoutBan: Self = this.set("kickWithoutBan", js.undefined)
    @scala.inline
    def setOpenshiftWebHook(value: Boolean): Self = this.set("openshiftWebHook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenshiftWebHook: Self = this.set("openshiftWebHook", js.undefined)
    @scala.inline
    def setOrderedSending(value: Boolean): Self = this.set("orderedSending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderedSending: Self = this.set("orderedSending", js.undefined)
    @scala.inline
    def setRatelimiting(value: Boolean | RatelimitingOptions): Self = this.set("ratelimiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatelimiting: Self = this.set("ratelimiting", js.undefined)
    @scala.inline
    def setTextPaging(value: Boolean): Self = this.set("textPaging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPaging: Self = this.set("textPaging", js.undefined)
    @scala.inline
    def setWebSocket(value: Boolean | WebSocketOptions): Self = this.set("webSocket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebSocket: Self = this.set("webSocket", js.undefined)
  }
  
}

