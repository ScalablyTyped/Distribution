package typings.xummApi.mod

import typings.xummApi.AnonAccount
import typings.xummApi.AnonCreatedat
import typings.xummApi.AnonDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummGetPayloadResponse extends js.Object {
  var application: AnonDescription
  var custom_meta: XummCustomMeta
  var meta: XummPayloadMeta
  var payload: AnonCreatedat
  var response: AnonAccount
}

object XummGetPayloadResponse {
  @scala.inline
  def apply(
    application: AnonDescription,
    custom_meta: XummCustomMeta,
    meta: XummPayloadMeta,
    payload: AnonCreatedat,
    response: AnonAccount
  ): XummGetPayloadResponse = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XummGetPayloadResponse]
  }
}

