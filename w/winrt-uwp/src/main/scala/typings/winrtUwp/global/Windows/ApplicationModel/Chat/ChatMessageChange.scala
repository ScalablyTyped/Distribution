package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a revision to a chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChange")
@js.native
abstract class ChatMessageChange ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChange {
  
  /** Gets the type of change made to a chat message, such as created, modified, etc. */
  /* CompleteClass */
  var changeType: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChangeType = js.native
  
  /** Gets the updated message text. */
  /* CompleteClass */
  var message: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessage = js.native
}
