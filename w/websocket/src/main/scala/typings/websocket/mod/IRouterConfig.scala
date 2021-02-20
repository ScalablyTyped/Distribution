package typings.websocket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouterConfig extends StObject {
  
  /*
    * The WebSocketServer instance to attach to.
    */
  var server: typings.websocket.mod.server = js.native
}
object IRouterConfig {
  
  @scala.inline
  def apply(server: server): IRouterConfig = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouterConfig]
  }
  
  @scala.inline
  implicit class IRouterConfigMutableBuilder[Self <: IRouterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
