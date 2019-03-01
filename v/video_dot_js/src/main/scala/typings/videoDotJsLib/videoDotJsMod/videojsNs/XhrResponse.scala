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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("rawRequest")(rawRequest)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[XhrResponse]
  }
}

