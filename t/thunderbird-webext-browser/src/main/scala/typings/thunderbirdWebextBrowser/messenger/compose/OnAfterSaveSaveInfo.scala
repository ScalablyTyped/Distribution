package typings.thunderbirdWebextBrowser.messenger.compose

import typings.thunderbirdWebextBrowser.messenger.messages.MessageHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAfterSaveSaveInfo extends StObject {
  
  /** An error description, if saving the message failed. */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * The saved message(s). The number of saved messages depends on the
    * applied file carbon copy configuration (fcc).
    */
  var messages: js.Array[MessageHeader]
  
  /** The used save mode. */
  var mode: OnAfterSaveSaveInfoMode
}
object OnAfterSaveSaveInfo {
  
  inline def apply(messages: js.Array[MessageHeader], mode: OnAfterSaveSaveInfoMode): OnAfterSaveSaveInfo = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAfterSaveSaveInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnAfterSaveSaveInfo] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMessages(value: js.Array[MessageHeader]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: MessageHeader*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMode(value: OnAfterSaveSaveInfoMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
