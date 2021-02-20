package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatConversationThreadingKind extends StObject
/** Specifies how a conversation is threaded. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatConversationThreadingKind")
@js.native
object ChatConversationThreadingKind extends StObject {
  
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
