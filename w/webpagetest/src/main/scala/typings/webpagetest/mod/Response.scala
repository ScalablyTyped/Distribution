package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response[R] extends StObject {
  
  var data: R = js.native
  
  var statusCode: Double = js.native
  
  var statusText: String = js.native
}
object Response {
  
  @scala.inline
  def apply[R](data: R, statusCode: Double, statusText: String): Response[R] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[R]]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response[_], R] (val x: Self with Response[R]) extends AnyVal {
    
    @scala.inline
    def setData(value: R): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
