package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[TContext] extends ResponseBase {
  val context: TContext
  val finalUrl: java.lang.String
}

object Response {
  @scala.inline
  def apply[TContext](
    context: TContext,
    finalUrl: java.lang.String,
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: java.lang.String,
    responseText: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String,
    responseXML: stdLib.Document = null
  ): Response[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], finalUrl = finalUrl, readyState = readyState, response = response, responseHeaders = responseHeaders, responseText = responseText, status = status, statusText = statusText)
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML)
    __obj.asInstanceOf[Response[TContext]]
  }
}

