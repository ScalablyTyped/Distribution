package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressResponse[TContext]
  extends Response[TContext]
     with ProgressResponseBase

object ProgressResponse {
  @scala.inline
  def apply[TContext](
    context: TContext,
    done: scala.Double,
    finalUrl: java.lang.String,
    lengthComputable: scala.Boolean,
    loaded: scala.Double,
    position: scala.Double,
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: java.lang.String,
    responseText: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String,
    total: scala.Double,
    totalSize: scala.Double,
    responseXML: stdLib.Document = null
  ): ProgressResponse[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], done = done, finalUrl = finalUrl, lengthComputable = lengthComputable, loaded = loaded, position = position, readyState = readyState, response = response, responseHeaders = responseHeaders, responseText = responseText, status = status, statusText = statusText, total = total, totalSize = totalSize)
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML)
    __obj.asInstanceOf[ProgressResponse[TContext]]
  }
}

