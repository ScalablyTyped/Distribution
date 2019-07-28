package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 1 */ val contactId: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatConversationThreadingKind.contactId with Double = js.native
  /* 2 */ val conversationId: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatConversationThreadingKind.conversationId with Double = js.native
  /* 3 */ val custom: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatConversationThreadingKind.custom with Double = js.native
  /* 0 */ val participants: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatConversationThreadingKind.participants with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatConversationThreadingKind with Double] = js.native
}

