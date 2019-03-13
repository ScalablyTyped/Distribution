package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseBase extends js.Object {
  val readyState: ReadyState
  val response: js.Any
  val responseHeaders: java.lang.String
  val responseText: java.lang.String
  val responseXML: stdLib.Document | scala.Null
  val status: scala.Double
  val statusText: java.lang.String
}

object ResponseBase {
  @scala.inline
  def apply(
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: java.lang.String,
    responseText: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String,
    responseXML: stdLib.Document = null
  ): ResponseBase = {
    val __obj = js.Dynamic.literal(readyState = readyState, response = response, responseHeaders = responseHeaders, responseText = responseText, status = status, statusText = statusText)
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML)
    __obj.asInstanceOf[ResponseBase]
  }
}

