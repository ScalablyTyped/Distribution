package typings.workerbApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIResponse extends StObject {
  
  /**
    * A string that has the response returned by the remote server.
    */
  var response: String
  
  /**
    * A number that is the Status Code returned by the remote server.
    */
  var status: Double
}
object APIResponse {
  
  inline def apply(response: String, status: Double): APIResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: APIResponse] (val x: Self) extends AnyVal {
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
