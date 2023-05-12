package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpResponseMod {
  
  @JSImport("twilio/lib/http/response", JSImport.Default)
  @js.native
  open class default[TPayload] protected ()
    extends StObject
       with Response[TPayload] {
    def this(statusCode: Double, body: TPayload, headers: Any) = this()
    
    /* CompleteClass */
    var body: TPayload = js.native
    
    /* CompleteClass */
    var headers: Any = js.native
    
    /* CompleteClass */
    var statusCode: Double = js.native
  }
  
  trait Response[TPayload] extends StObject {
    
    var body: TPayload
    
    var headers: Any
    
    var statusCode: Double
  }
  object Response {
    
    inline def apply[TPayload](body: TPayload, headers: Any, statusCode: Double): Response[TPayload] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response[TPayload]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response[?], TPayload] (val x: Self & Response[TPayload]) extends AnyVal {
      
      inline def setBody(value: TPayload): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
