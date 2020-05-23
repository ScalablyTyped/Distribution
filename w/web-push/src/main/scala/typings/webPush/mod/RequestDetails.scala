package typings.webPush.mod

import typings.node.Buffer
import typings.webPush.webPushStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDetails extends js.Object {
  var body: Buffer | Null
  var endpoint: String
  var headers: Headers
  var method: POST
  var proxy: js.UndefOr[String] = js.undefined
}

object RequestDetails {
  @scala.inline
  def apply(endpoint: String, headers: Headers, method: POST, body: Buffer = null, proxy: String = null): RequestDetails = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetails]
  }
}

