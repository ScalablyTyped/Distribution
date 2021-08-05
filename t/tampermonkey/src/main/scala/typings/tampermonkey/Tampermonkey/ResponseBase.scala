package typings.tampermonkey.Tampermonkey

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBase extends StObject {
  
  val readyState: ReadyState
  
  val response: js.Any
  
  val responseHeaders: String
  
  val responseText: String
  
  val responseXML: Document | Null
  
  val status: Double
  
  val statusText: String
}
object ResponseBase {
  
  inline def apply(
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String
  ): ResponseBase = {
    val __obj = js.Dynamic.literal(readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], responseXML = null)
    __obj.asInstanceOf[ResponseBase]
  }
  
  extension [Self <: ResponseBase](x: Self) {
    
    inline def setReadyState(value: ReadyState): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaders(value: String): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
    
    inline def setResponseXML(value: Document): Self = StObject.set(x, "responseXML", value.asInstanceOf[js.Any])
    
    inline def setResponseXMLNull: Self = StObject.set(x, "responseXML", null)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
