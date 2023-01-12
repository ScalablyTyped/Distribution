package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response[TContext]
  extends StObject
     with ResponseBase {
  
  val context: TContext
  
  val finalUrl: String
}
object Response {
  
  inline def apply[TContext](
    context: TContext,
    finalUrl: String,
    readyState: ReadyState,
    response: Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String
  ): Response[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], finalUrl = finalUrl.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], responseXML = null)
    __obj.asInstanceOf[Response[TContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Response[?], TContext] (val x: Self & Response[TContext]) extends AnyVal {
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
  }
}
