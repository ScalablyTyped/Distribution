package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResponse extends ResponseBase {
  val error: java.lang.String
}

object ErrorResponse {
  @scala.inline
  def apply(
    error: java.lang.String,
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: java.lang.String,
    responseText: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String,
    responseXML: stdLib.Document = null
  ): ErrorResponse = {
    val __obj = js.Dynamic.literal(error = error, readyState = readyState, response = response, responseHeaders = responseHeaders, responseText = responseText, status = status, statusText = statusText)
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML)
    __obj.asInstanceOf[ErrorResponse]
  }
}

