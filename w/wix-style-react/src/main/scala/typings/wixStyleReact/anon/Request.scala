package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  var request: Any
}
object Request {
  
  inline def apply(request: Any): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
