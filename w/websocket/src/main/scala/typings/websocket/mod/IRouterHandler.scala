package typings.websocket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRouterHandler extends StObject {
  
  def callback(request: IRouterRequest): Unit
  
  var path: String
  
  var pathString: String
  
  var protocol: String
}
object IRouterHandler {
  
  inline def apply(callback: IRouterRequest => Unit, path: String, pathString: String, protocol: String): IRouterHandler = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), path = path.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouterHandler]
  }
  
  extension [Self <: IRouterHandler](x: Self) {
    
    inline def setCallback(value: IRouterRequest => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathString(value: String): Self = StObject.set(x, "pathString", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
