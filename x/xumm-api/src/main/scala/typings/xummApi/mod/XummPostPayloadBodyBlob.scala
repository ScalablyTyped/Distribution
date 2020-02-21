package typings.xummApi.mod

import typings.xummApi.AnonExpire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummPostPayloadBodyBlob extends XummPayloadBodyBase {
  var txblob: String
}

object XummPostPayloadBodyBlob {
  @scala.inline
  def apply(
    txblob: String,
    custom_meta: XummCustomMeta = null,
    options: AnonExpire = null,
    user_token: String = null
  ): XummPostPayloadBodyBlob = {
    val __obj = js.Dynamic.literal(txblob = txblob.asInstanceOf[js.Any])
    if (custom_meta != null) __obj.updateDynamic("custom_meta")(custom_meta.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (user_token != null) __obj.updateDynamic("user_token")(user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPostPayloadBodyBlob]
  }
}

