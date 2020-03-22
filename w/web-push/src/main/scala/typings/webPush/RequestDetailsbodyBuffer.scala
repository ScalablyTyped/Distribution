package typings.webPush

import typings.node.Buffer
import typings.webPush.mod.Headers
import typings.webPush.webPushStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined web-push.web-push.RequestDetails & {  body  :node.Buffer} */
trait RequestDetailsbodyBuffer extends js.Object {
  var body: (Buffer | Null) with Buffer
  var endpoint: String
  var headers: Headers
  var method: POST
  var proxy: js.UndefOr[String] = js.undefined
}

object RequestDetailsbodyBuffer {
  @scala.inline
  def apply(
    body: (Buffer | Null) with Buffer,
    endpoint: String,
    headers: Headers,
    method: POST,
    proxy: String = null
  ): RequestDetailsbodyBuffer = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetailsbodyBuffer]
  }
}

