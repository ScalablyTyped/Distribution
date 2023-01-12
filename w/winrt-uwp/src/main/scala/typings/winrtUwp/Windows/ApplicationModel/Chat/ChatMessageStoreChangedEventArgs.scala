package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data for the ChatMessageStoreChanged event. */
trait ChatMessageStoreChangedEventArgs extends StObject {
  
  /** Gets the ID of the object that changed. */
  var id: String
  
  /** Gets the type of change that happened. */
  var kind: ChatStoreChangedEventKind
}
object ChatMessageStoreChangedEventArgs {
  
  inline def apply(id: String, kind: ChatStoreChangedEventKind): ChatMessageStoreChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageStoreChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMessageStoreChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ChatStoreChangedEventKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
