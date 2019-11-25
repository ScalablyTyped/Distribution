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
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], finalUrl = finalUrl.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressResponse[TContext]]
  }
}

