package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatConversationThreadingKind extends js.Object
/** Specifies how a conversation is threaded. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatConversationThreadingKind")
@js.native
object ChatConversationThreadingKind extends js.Object {
  
  /** By contact ID */
  @js.native
  sealed trait contactId extends ChatConversationThreadingKind
  
  /** By conversation ID */
  @js.native
  sealed trait conversationId extends ChatConversationThreadingKind
  
  /** Custom threading defined by the app */
  @js.native
  sealed trait custom extends ChatConversationThreadingKind
  
  /** By participants */
  @js.native
  sealed trait participants extends ChatConversationThreadingKind
}
