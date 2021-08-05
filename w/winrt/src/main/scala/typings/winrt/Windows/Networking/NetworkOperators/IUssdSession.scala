package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUssdSession extends StObject {
  
  def close(): Unit
  
  def sendMessageAndGetReplyAsync(message: UssdMessage): IAsyncOperation[UssdReply]
}
object IUssdSession {
  
  inline def apply(close: () => Unit, sendMessageAndGetReplyAsync: UssdMessage => IAsyncOperation[UssdReply]): IUssdSession = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), sendMessageAndGetReplyAsync = js.Any.fromFunction1(sendMessageAndGetReplyAsync))
    __obj.asInstanceOf[IUssdSession]
  }
  
  extension [Self <: IUssdSession](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setSendMessageAndGetReplyAsync(value: UssdMessage => IAsyncOperation[UssdReply]): Self = StObject.set(x, "sendMessageAndGetReplyAsync", js.Any.fromFunction1(value))
  }
}
