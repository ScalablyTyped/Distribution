package typings.tampermonkey.Tampermonkey

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResponse extends ResponseBase {
  val error: String
}

object ErrorResponse {
  @scala.inline
  def apply(
    error: String,
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String,
    responseXML: Document = null
  ): ErrorResponse = {
    val __obj = js.Dynamic.literal(error = error, readyState = readyState, response = response, responseHeaders = responseHeaders, responseText = responseText, status = status, statusText = statusText)
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML)
    __obj.asInstanceOf[ErrorResponse]
  }
}

