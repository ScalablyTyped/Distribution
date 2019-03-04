package typings
package xhrLib.xhrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrResponse extends js.Object {
  var body: js.Object | java.lang.String
  var headers: XhrHeaders
  var method: java.lang.String
  var rawRequest: stdLib.XMLHttpRequest
  var statusCode: scala.Double
  var url: java.lang.String
}

object XhrResponse {
  @scala.inline
  def apply(
    body: js.Object | java.lang.String,
    headers: XhrHeaders,
    method: java.lang.String,
    rawRequest: stdLib.XMLHttpRequest,
    statusCode: scala.Double,
    url: java.lang.String
  ): XhrResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers, method = method, rawRequest = rawRequest, statusCode = statusCode, url = url)
  
    __obj.asInstanceOf[XhrResponse]
  }
}

