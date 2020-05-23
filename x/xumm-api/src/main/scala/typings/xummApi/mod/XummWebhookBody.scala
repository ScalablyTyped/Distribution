package typings.xummApi.mod

import typings.xummApi.anon.Applicationuuidv4
import typings.xummApi.anon.Payloaduuidv4
import typings.xummApi.anon.Tokenexpiration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummWebhookBody extends js.Object {
  var custom_meta: XummCustomMeta
  var meta: Applicationuuidv4
  var payloadResponse: Payloaduuidv4
  var userToken: Tokenexpiration | Null
}

object XummWebhookBody {
  @scala.inline
  def apply(
    custom_meta: XummCustomMeta,
    meta: Applicationuuidv4,
    payloadResponse: Payloaduuidv4,
    userToken: Tokenexpiration = null
  ): XummWebhookBody = {
    val __obj = js.Dynamic.literal(custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payloadResponse = payloadResponse.asInstanceOf[js.Any], userToken = userToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummWebhookBody]
  }
}

