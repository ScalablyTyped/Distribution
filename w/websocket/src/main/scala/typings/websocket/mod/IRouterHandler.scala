package typings.websocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouterHandler extends js.Object {
  
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
  implicit class IRouterHandlerOps[Self <: IRouterHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallback(value: IRouterRequest => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathString(value: String): Self = this.set("pathString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
  }
}
