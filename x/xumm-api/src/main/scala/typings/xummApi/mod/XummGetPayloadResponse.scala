package typings.xummApi.mod

import typings.xummApi.anon.Account
import typings.xummApi.anon.Createdat
import typings.xummApi.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummGetPayloadResponse extends js.Object {
  var application: Description
  var custom_meta: XummCustomMeta
  var meta: XummPayloadMeta
  var payload: Createdat
  var response: Account
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
}

