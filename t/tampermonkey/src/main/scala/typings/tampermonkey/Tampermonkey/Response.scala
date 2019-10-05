package typings.tampermonkey.Tampermonkey

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[TContext] extends ResponseBase {
  val context: TContext
  val finalUrl: String
}

object Response {
  @scala.inline
  def apply[TContext](
    context: TContext,
    finalUrl: String,
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String,
    responseXML: Document = null
  ): Response[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], finalUrl = finalUrl, readyState = readyState, response = response, responseHeaders = responseHeaders, responseText = responseText, status = status, statusText = statusText)
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML)
    __obj.asInstanceOf[Response[TContext]]
  }
}

