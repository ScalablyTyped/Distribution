package typings
package webDashPushLib.webDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDetails extends js.Object {
  var body: nodeLib.Buffer | scala.Null
  var endpoint: java.lang.String
  var headers: Headers
  var method: webDashPushLib.webDashPushLibStrings.POST
  var proxy: js.UndefOr[java.lang.String] = js.undefined
}

object RequestDetails {
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    headers: Headers,
    method: webDashPushLib.webDashPushLibStrings.POST,
    body: nodeLib.Buffer = null,
    proxy: java.lang.String = null
  ): RequestDetails = {
    val __obj = js.Dynamic.literal(endpoint = endpoint, headers = headers, method = method)
    if (body != null) __obj.updateDynamic("body")(body)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[RequestDetails]
  }
}

