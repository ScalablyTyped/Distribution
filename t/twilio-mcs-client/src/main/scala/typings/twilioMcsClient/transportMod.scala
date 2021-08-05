package typings.twilioMcsClient

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  /**
    * Provides generic network interface
    */
  @JSImport("twilio-mcs-client/lib/services/transport", "Transport")
  @js.native
  class Transport () extends StObject {
    
    /**
      * Make a GET request by given URL
      */
    def get(url: String, headers: Headers): js.Promise[Response] = js.native
    
    /**
      * Make a POST request by given URL
      */
    def post(url: String, headers: Headers): js.Promise[Response] = js.native
    def post(url: String, headers: Headers, body: js.Any): js.Promise[Response] = js.native
  }
  object Transport {
    
    @JSImport("twilio-mcs-client/lib/services/transport", "Transport")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("twilio-mcs-client/lib/services/transport", "Transport.request")
    @js.native
    def request: js.Any = js.native
    inline def request_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  }
  
  type Headers = StringDictionary[String]
  
  trait Response extends StObject {
    
    var body: js.Any
    
    var headers: Headers
    
    var status: js.Any
  }
  object Response {
    
    inline def apply(body: js.Any, headers: Headers, status: js.Any): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
