package typings.xummApi.mod

import typings.xummApi.AnonCancelled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummDeletePayloadResponse extends js.Object {
  var custom_meta: XummCustomMeta
  var meta: XummPayloadMeta
  var result: AnonCancelled
}

object XummDeletePayloadResponse {
  @scala.inline
  def apply(custom_meta: XummCustomMeta, meta: XummPayloadMeta, result: AnonCancelled): XummDeletePayloadResponse = {
    val __obj = js.Dynamic.literal(custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummDeletePayloadResponse]
  }
}

