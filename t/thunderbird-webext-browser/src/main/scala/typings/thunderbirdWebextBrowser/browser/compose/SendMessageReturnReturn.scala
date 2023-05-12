package typings.thunderbirdWebextBrowser.browser.compose

import typings.thunderbirdWebextBrowser.browser.messages.MessageHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageReturnReturn extends StObject {
  
  /**
    * The header messageId of the outgoing message. Only included for
    * actually sent messages.
    */
  var headerMessageId: js.UndefOr[String] = js.undefined
  
  /**
    * Copies of the sent message. The number of created copies depends on
    * the applied file carbon copy configuration (fcc).
    */
  var messages: js.Array[MessageHeader]
  
  /** The used send mode. */
  var mode: SendMessageReturnReturnMode
}
object SendMessageReturnReturn {
  
  inline def apply(messages: js.Array[MessageHeader], mode: SendMessageReturnReturnMode): SendMessageReturnReturn = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageReturnReturn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendMessageReturnReturn] (val x: Self) extends AnyVal {
    
    inline def setHeaderMessageId(value: String): Self = StObject.set(x, "headerMessageId", value.asInstanceOf[js.Any])
    
    inline def setHeaderMessageIdUndefined: Self = StObject.set(x, "headerMessageId", js.undefined)
    
    inline def setMessages(value: js.Array[MessageHeader]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: MessageHeader*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMode(value: SendMessageReturnReturnMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
