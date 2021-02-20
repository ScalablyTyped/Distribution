package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUssdSession extends StObject {
  
  def close(): Unit = js.native
  
  def sendMessageAndGetReplyAsync(message: UssdMessage): IAsyncOperation[UssdReply] = js.native
}
object IUssdSession {
  
  @scala.inline
  def apply(close: () => Unit, sendMessageAndGetReplyAsync: UssdMessage => IAsyncOperation[UssdReply]): IUssdSession = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), sendMessageAndGetReplyAsync = js.Any.fromFunction1(sendMessageAndGetReplyAsync))
    __obj.asInstanceOf[IUssdSession]
  }
  
  @scala.inline
  implicit class IUssdSessionMutableBuilder[Self <: IUssdSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSendMessageAndGetReplyAsync(value: UssdMessage => IAsyncOperation[UssdReply]): Self = StObject.set(x, "sendMessageAndGetReplyAsync", js.Any.fromFunction1(value))
  }
}
