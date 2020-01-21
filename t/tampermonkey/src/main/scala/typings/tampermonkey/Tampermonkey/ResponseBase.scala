package typings.tampermonkey.Tampermonkey

import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseBase extends js.Object {
  val readyState: ReadyState
  val response: js.Any
  val responseHeaders: String
  val responseText: String
  val responseXML: Document_ | Null
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
    responseXML: Document_ = null
  ): ResponseBase = {
    val __obj = js.Dynamic.literal(readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBase]
  }
}

