package typings.tampermonkey.Tampermonkey

import typings.std.Document
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
    done: Double,
    finalUrl: String,
    lengthComputable: Boolean,
    loaded: Double,
    position: Double,
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String,
    total: Double,
    totalSize: Double,
    responseXML: Document = null
  ): ProgressResponse[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], done = done, finalUrl = finalUrl, lengthComputable = lengthComputable, loaded = loaded, position = position, readyState = readyState, response = response, responseHeaders = responseHeaders, responseText = responseText, status = status, statusText = statusText, total = total, totalSize = totalSize)
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML)
    __obj.asInstanceOf[ProgressResponse[TContext]]
  }
}

