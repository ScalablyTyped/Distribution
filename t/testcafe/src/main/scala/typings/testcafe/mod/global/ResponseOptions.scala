package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseOptions extends StObject {
  
  /**
    * Response body.
    */
  var body: ResponseBody
  
  /**
    * Response headers.
    */
  var headers: js.Object
  
  /**
    * Response status.
    */
  var status: Double
  
  /**
    * Response status text.
    */
  var statusText: String
}
object ResponseOptions {
  
  inline def apply(body: ResponseBody, headers: js.Object, status: Double, statusText: String): ResponseOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseOptions]
  }
  
  extension [Self <: ResponseOptions](x: Self) {
    
    inline def setBody(value: ResponseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
