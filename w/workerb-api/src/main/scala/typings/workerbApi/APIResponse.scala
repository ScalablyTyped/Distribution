package typings.workerbApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIResponse extends StObject {
  
  /**
    * A string that has the response returned by the remote server.
    */
  var response: String = js.native
  
  /**
    * A number that is the Status Code returned by the remote server.
    */
  var status: Double = js.native
}
object APIResponse {
  
  @scala.inline
  def apply(response: String, status: Double): APIResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponse]
  }
  
  @scala.inline
  implicit class APIResponseMutableBuilder[Self <: APIResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
