package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorResponse
  extends StObject
     with ResponseBase {
  
  val error: String
}
object ErrorResponse {
  
  @scala.inline
  def apply(
    error: String,
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String
  ): ErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], responseXML = null)
    __obj.asInstanceOf[ErrorResponse]
  }
  
  @scala.inline
  implicit class ErrorResponseMutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
