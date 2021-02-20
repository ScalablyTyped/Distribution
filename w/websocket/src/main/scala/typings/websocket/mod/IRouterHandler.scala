package typings.websocket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouterHandler extends StObject {
  
  def callback(request: IRouterRequest): Unit = js.native
  
  var path: String = js.native
  
  var pathString: String = js.native
  
  var protocol: String = js.native
}
object IRouterHandler {
  
  @scala.inline
  def apply(callback: IRouterRequest => Unit, path: String, pathString: String, protocol: String): IRouterHandler = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), path = path.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouterHandler]
  }
  
  @scala.inline
  implicit class IRouterHandlerMutableBuilder[Self <: IRouterHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: IRouterRequest => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathString(value: String): Self = StObject.set(x, "pathString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
