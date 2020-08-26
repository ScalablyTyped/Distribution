package typings.xummApi.mod

import typings.xummApi.anon.Account
import typings.xummApi.anon.Createdat
import typings.xummApi.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummGetPayloadResponse extends js.Object {
  var application: Description = js.native
  var custom_meta: XummCustomMeta = js.native
  var meta: XummPayloadMeta = js.native
  var payload: Createdat = js.native
  var response: Account = js.native
}

object XummGetPayloadResponse {
  @scala.inline
  def apply(
    application: Description,
    custom_meta: XummCustomMeta,
    meta: XummPayloadMeta,
    payload: Createdat,
    response: Account
  ): XummGetPayloadResponse = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummGetPayloadResponse]
  }
  @scala.inline
  implicit class XummGetPayloadResponseOps[Self <: XummGetPayloadResponse] (val x: Self) extends AnyVal {
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
    def setApplication(value: Description): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_meta(value: XummCustomMeta): Self = this.set("custom_meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: XummPayloadMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Createdat): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Account): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

