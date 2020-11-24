package typings.twilsock

import typings.twilsock.channelMod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/websocketchannel", JSImport.Namespace)
@js.native
object websocketchannelMod extends js.Object {
  
  @js.native
  class WebSocketChannel protected () extends Channel {
    def this(url: String) = this()
    
    var WebSocket: js.Any = js.native
    
    def close(): Unit = js.native
    
    def connect(): Unit = js.native
    
    @JSName("isConnected")
    def isConnected_MWebSocketChannel: Boolean = js.native
    
    var socket: js.Any = js.native
    
    val url: js.Any = js.native
  }
}
