package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UssdSession
  extends StObject
     with IUssdSession
object UssdSession {
  
  inline def apply(close: () => Unit, sendMessageAndGetReplyAsync: UssdMessage => IAsyncOperation[UssdReply]): UssdSession = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), sendMessageAndGetReplyAsync = js.Any.fromFunction1(sendMessageAndGetReplyAsync))
    __obj.asInstanceOf[UssdSession]
  }
}
