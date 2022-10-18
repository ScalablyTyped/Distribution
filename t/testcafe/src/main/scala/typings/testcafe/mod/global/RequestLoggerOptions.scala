package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Request Logger
//----------------------------------------------------------------------------------------------------------------------
trait RequestLoggerOptions extends StObject {
  
  /**
    * Specifies whether the request body should be logged.
    */
  var logRequestBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Specifies whether the request headers should be logged.
    */
  var logRequestHeaders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the response body should be logged.
    */
  var logResponseBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the response headers should be logged.
    */
  var logResponseHeaders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the request body should be stored as a String or a Buffer.
    */
  var stringifyRequestBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the response body should be stored as a string or a Buffer.
    */
  var stringifyResponseBody: js.UndefOr[Boolean] = js.undefined
}
object RequestLoggerOptions {
  
  inline def apply(): RequestLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLoggerOptions]
  }
  
  extension [Self <: RequestLoggerOptions](x: Self) {
    
    inline def setLogRequestBody(value: Boolean): Self = StObject.set(x, "logRequestBody", value.asInstanceOf[js.Any])
    
    inline def setLogRequestBodyUndefined: Self = StObject.set(x, "logRequestBody", js.undefined)
    
    inline def setLogRequestHeaders(value: Boolean): Self = StObject.set(x, "logRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setLogRequestHeadersUndefined: Self = StObject.set(x, "logRequestHeaders", js.undefined)
    
    inline def setLogResponseBody(value: Boolean): Self = StObject.set(x, "logResponseBody", value.asInstanceOf[js.Any])
    
    inline def setLogResponseBodyUndefined: Self = StObject.set(x, "logResponseBody", js.undefined)
    
    inline def setLogResponseHeaders(value: Boolean): Self = StObject.set(x, "logResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setLogResponseHeadersUndefined: Self = StObject.set(x, "logResponseHeaders", js.undefined)
    
    inline def setStringifyRequestBody(value: Boolean): Self = StObject.set(x, "stringifyRequestBody", value.asInstanceOf[js.Any])
    
    inline def setStringifyRequestBodyUndefined: Self = StObject.set(x, "stringifyRequestBody", js.undefined)
    
    inline def setStringifyResponseBody(value: Boolean): Self = StObject.set(x, "stringifyResponseBody", value.asInstanceOf[js.Any])
    
    inline def setStringifyResponseBodyUndefined: Self = StObject.set(x, "stringifyResponseBody", js.undefined)
  }
}
