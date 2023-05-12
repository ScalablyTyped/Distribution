package typings.webdriver

import typings.node.eventsMod.EventEmitter
import typings.wdioProtocols.buildTypesMod.BidiRequest
import typings.wdioProtocols.buildTypesMod.BidiResponse
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildBidiMod {
  
  @JSImport("webdriver/build/bidi", "BidiHandler")
  @js.native
  open class BidiHandler protected () extends EventEmitter {
    def this(_webSocketUrl: String) = this()
    
    /* private */ var _webSocketUrl: Any = js.native
    
    def connect(): js.Promise[Unit] = js.native
    
    def isConnected: Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    def send(params: BidiRequest): js.Promise[BidiResponse] = js.native
    
    def sendAsync(params: BidiRequest): Unit = js.native
    
    def socket: WebSocket = js.native
  }
}
