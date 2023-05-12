package typings.thunderbirdWebextBrowser.browser.compose

import typings.thunderbirdWebextBrowser.browser.messages.MessageHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveMessageReturnReturn extends StObject {
  
  /**
    * The saved message(s). The number of saved messages depends on the
    * applied file carbon copy configuration (fcc).
    */
  var messages: js.Array[MessageHeader]
  
  /** The used save mode. */
  var mode: SaveMessageReturnReturnMode
}
object SaveMessageReturnReturn {
  
  inline def apply(messages: js.Array[MessageHeader], mode: SaveMessageReturnReturnMode): SaveMessageReturnReturn = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveMessageReturnReturn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveMessageReturnReturn] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: js.Array[MessageHeader]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: MessageHeader*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMode(value: SaveMessageReturnReturnMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
