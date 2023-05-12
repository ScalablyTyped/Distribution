package typings.wdioTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  var response: Double
}
object Response {
  
  inline def apply(response: Double): Response = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    inline def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
