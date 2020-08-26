package typings.xummApi.mod

import typings.xummApi.anon.Applicationuuidv4
import typings.xummApi.anon.Payloaduuidv4
import typings.xummApi.anon.Tokenexpiration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummWebhookBody extends js.Object {
  var custom_meta: XummCustomMeta = js.native
  var meta: Applicationuuidv4 = js.native
  var payloadResponse: Payloaduuidv4 = js.native
  var userToken: Tokenexpiration | Null = js.native
}

object XummWebhookBody {
  @scala.inline
  def apply(custom_meta: XummCustomMeta, meta: Applicationuuidv4, payloadResponse: Payloaduuidv4): XummWebhookBody = {
    val __obj = js.Dynamic.literal(custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payloadResponse = payloadResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummWebhookBody]
  }
  @scala.inline
  implicit class XummWebhookBodyOps[Self <: XummWebhookBody] (val x: Self) extends AnyVal {
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
    def setCustom_meta(value: XummCustomMeta): Self = this.set("custom_meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: Applicationuuidv4): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayloadResponse(value: Payloaduuidv4): Self = this.set("payloadResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserToken(value: Tokenexpiration): Self = this.set("userToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserTokenNull: Self = this.set("userToken", null)
  }
  
}

