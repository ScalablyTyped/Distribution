package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressResponse[TContext]
  extends StObject
     with Response[TContext]
     with ProgressResponseBase
object ProgressResponse {
  
  inline def apply[TContext](
    context: TContext,
    done: Double,
    finalUrl: String,
    lengthComputable: Boolean,
    loaded: Double,
    position: Double,
    readyState: ReadyState,
    response: Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String,
    total: Double,
    totalSize: Double
  ): ProgressResponse[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], finalUrl = finalUrl.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any], responseXML = null)
    __obj.asInstanceOf[ProgressResponse[TContext]]
  }
}
