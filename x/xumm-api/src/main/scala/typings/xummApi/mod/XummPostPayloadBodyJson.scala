package typings.xummApi.mod

import typings.xummApi.anon.Expire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummPostPayloadBodyJson extends XummPayloadBodyBase {
  var txjson: XummJsonTransaction
}

object XummPostPayloadBodyJson {
  @scala.inline
  def apply(
    txjson: XummJsonTransaction,
    custom_meta: XummCustomMeta = null,
    options: Expire = null,
    user_token: String = null
  ): XummPostPayloadBodyJson = {
    val __obj = js.Dynamic.literal(txjson = txjson.asInstanceOf[js.Any])
    if (custom_meta != null) __obj.updateDynamic("custom_meta")(custom_meta.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (user_token != null) __obj.updateDynamic("user_token")(user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPostPayloadBodyJson]
  }
}

