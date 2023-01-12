package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseAPI extends StObject {
  
  /**
    * Promise that returns response body.
    */
  var body: js.Promise[ResponseBody]
  
  /**
    * Promise that returns response headers.
    */
  var headers: js.Promise[js.Object]
  
  /**
    * Promise that returns response status.
    */
  var status: js.Promise[Double]
  
  /**
    * Promise that returns response status text.
    */
  var statusText: js.Promise[String]
}
object ResponseAPI {
  
  inline def apply(
    body: js.Promise[ResponseBody],
    headers: js.Promise[js.Object],
    status: js.Promise[Double],
    statusText: js.Promise[String]
  ): ResponseAPI = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseAPI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseAPI] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Promise[ResponseBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Promise[js.Object]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: js.Promise[Double]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: js.Promise[String]): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
