package typings.xhr.xhrMod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrResponse extends js.Object {
  var body: js.Object | String
  var headers: XhrHeaders
  var method: String
  var rawRequest: XMLHttpRequest
  var statusCode: Double
  var url: String
}

object XhrResponse {
  @scala.inline
  def apply(
    body: js.Object | String,
    headers: XhrHeaders,
    method: String,
    rawRequest: XMLHttpRequest,
    statusCode: Double,
    url: String
  ): XhrResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], rawRequest = rawRequest.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XhrResponse]
  }
}

