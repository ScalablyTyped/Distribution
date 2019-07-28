package typings.tampermonkey.TampermonkeyNs

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseBase extends js.Object {
  val readyState: ReadyState
  val response: js.Any
  val responseHeaders: String
  val responseText: String
  val responseXML: Document | Null
  val status: Double
  val statusText: String
}

object ResponseBase {
  @scala.inline
  def apply(
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String,
    responseXML: Document = null
  ): ResponseBase = {
    val __obj = js.Dynamic.literal(readyState = readyState, response = response, responseHeaders = responseHeaders, responseText = responseText, status = status, statusText = statusText)
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML)
    __obj.asInstanceOf[ResponseBase]
  }
}

