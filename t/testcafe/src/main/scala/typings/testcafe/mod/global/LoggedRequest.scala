package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggedRequest extends StObject {
  
  /**
    * The request part of the logged request
    */
  var request: RequestData
  
  /**
    * The response part of the logged request
    */
  var response: ResponseData
  
  /**
    * The user agent that sent the request.
    */
  var userAgent: String
}
object LoggedRequest {
  
  inline def apply(request: RequestData, response: ResponseData, userAgent: String): LoggedRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggedRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggedRequest] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: RequestData): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: ResponseData): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
  }
}
