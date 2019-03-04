package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrResponse extends js.Object {
  var body: js.Any
  var headers: js.Any
  var method: java.lang.String
  var rawRequest: stdLib.XMLHttpRequest
  var statusCode: scala.Double
  var url: java.lang.String
}

object XhrResponse {
  @scala.inline
  def apply(
    body: js.Any,
    headers: js.Any,
    method: java.lang.String,
    rawRequest: stdLib.XMLHttpRequest,
    statusCode: scala.Double,
    url: java.lang.String
  ): XhrResponse = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, method = method, rawRequest = rawRequest, statusCode = statusCode, url = url)
  
    __obj.asInstanceOf[XhrResponse]
  }
}

