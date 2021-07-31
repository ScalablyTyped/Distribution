package typings.twilsock

import typings.twilsock.channelMod.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websocketchannelMod {
  
  @JSImport("twilsock/lib/websocketchannel", "WebSocketChannel")
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
