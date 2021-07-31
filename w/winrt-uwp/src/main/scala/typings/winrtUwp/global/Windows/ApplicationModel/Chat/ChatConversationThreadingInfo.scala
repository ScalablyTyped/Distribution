package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides threading info for a ChatConversation . */
@JSGlobal("Windows.ApplicationModel.Chat.ChatConversationThreadingInfo")
@js.native
/** Initializes a new instance of the ChatConversationThreadingInfo class. */
class ChatConversationThreadingInfo ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatConversationThreadingInfo {
  
  /** Gets or sets the Contact.Id for the remote participant. */
  /* CompleteClass */
  var contactId: String = js.native
  
  /** Gets or sets the ID of the ChatConversation . */
  /* CompleteClass */
  var conversationId: String = js.native
  
  /** Gets or sets a string where you can store your own custom threading info. */
  /* CompleteClass */
  var custom: String = js.native
  
  /** Gets or sets a value that indicates the type of threading info, such as participant, contact ID, conversation ID, and so on. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatConversationThreadingKind = js.native
  
  /** Gets the list of participants in the ChatConversation . */
  /* CompleteClass */
  var participants: IVector[String] = js.native
}
