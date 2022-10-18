package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data for the ChatMessageStoreChanged event. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageStoreChangedEventArgs")
@js.native
open class ChatMessageStoreChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageStoreChangedEventArgs {
  
  /** Gets the ID of the object that changed. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets the type of change that happened. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatStoreChangedEventKind = js.native
}
