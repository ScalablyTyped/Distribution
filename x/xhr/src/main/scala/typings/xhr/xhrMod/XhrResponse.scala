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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers, method = method, rawRequest = rawRequest, statusCode = statusCode, url = url)
  
    __obj.asInstanceOf[XhrResponse]
  }
}

