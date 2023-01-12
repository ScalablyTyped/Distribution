package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseResponse extends StObject {
  
  var response: typings.std.Response
}
object ResponseResponse {
  
  inline def apply(response: typings.std.Response): ResponseResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseResponse] (val x: Self) extends AnyVal {
    
    inline def setResponse(value: typings.std.Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
