package typings.wdioProtocols

import typings.wdioProtocols.buildTypesMod.BidiResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsWebdriverBidiMod {
  
  trait WebdriverBidiCommands extends StObject {
    
    /**
      * WebdriverBidi Protocol Command
      *
      * Send socket commands via WebDriver Bidi
      * @ref https://github.com/w3c/webdriver-bidi
      *
      */
    def send(params: js.Object): js.Promise[BidiResponse]
    
    /**
      * WebdriverBidi Protocol Command
      *
      * Send asynchronous socket commands via WebDriver Bidi
      * @ref https://github.com/w3c/webdriver-bidi
      *
      */
    def sendAsync(params: js.Object): js.Promise[Unit]
  }
  object WebdriverBidiCommands {
    
    inline def apply(send: js.Object => js.Promise[BidiResponse], sendAsync: js.Object => js.Promise[Unit]): WebdriverBidiCommands = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendAsync = js.Any.fromFunction1(sendAsync))
      __obj.asInstanceOf[WebdriverBidiCommands]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebdriverBidiCommands] (val x: Self) extends AnyVal {
      
      inline def setSend(value: js.Object => js.Promise[BidiResponse]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setSendAsync(value: js.Object => js.Promise[Unit]): Self = StObject.set(x, "sendAsync", js.Any.fromFunction1(value))
    }
  }
}
