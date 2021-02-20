package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data for the ChatMessageStoreChanged event. */
@js.native
trait ChatMessageStoreChangedEventArgs extends StObject {
  
  /** Gets the ID of the object that changed. */
  var id: String = js.native
  
  /** Gets the type of change that happened. */
  var kind: ChatStoreChangedEventKind = js.native
}
object ChatMessageStoreChangedEventArgs {
  
  @scala.inline
  def apply(id: String, kind: ChatStoreChangedEventKind): ChatMessageStoreChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageStoreChangedEventArgs]
  }
  
  @scala.inline
  implicit class ChatMessageStoreChangedEventArgsMutableBuilder[Self <: ChatMessageStoreChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ChatStoreChangedEventKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
