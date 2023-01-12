package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response[R] extends StObject {
  
  var data: R
  
  var statusCode: Double
  
  var statusText: String
}
object Response {
  
  inline def apply[R](data: R, statusCode: Double, statusText: String): Response[R] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[R]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Response[?], R] (val x: Self & Response[R]) extends AnyVal {
    
    inline def setData(value: R): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
