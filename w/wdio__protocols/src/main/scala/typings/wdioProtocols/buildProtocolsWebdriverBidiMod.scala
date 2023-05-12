package typings.wdioProtocols

import typings.wdioProtocols.anon.Socket
import typings.wdioProtocols.anon.SocketCommandDescriptionParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildProtocolsWebdriverBidiMod {
  
  object default {
    
    @JSImport("@wdio/protocols/build/protocols/webdriverBidi", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/protocols/build/protocols/webdriverBidi", "default.sendAsyncCommand")
    @js.native
    def sendAsyncCommand: SocketCommandDescriptionParameters = js.native
    inline def sendAsyncCommand_=(x: SocketCommandDescriptionParameters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendAsyncCommand")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/protocols/build/protocols/webdriverBidi", "default.sendCommand")
    @js.native
    def sendCommand: Socket = js.native
    inline def sendCommand_=(x: Socket): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendCommand")(x.asInstanceOf[js.Any])
  }
}
