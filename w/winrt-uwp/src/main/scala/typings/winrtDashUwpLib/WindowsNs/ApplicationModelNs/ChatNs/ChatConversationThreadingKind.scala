package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

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
  sealed trait contactId
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatConversationThreadingKind
  
  /** By conversation ID */
  @js.native
  sealed trait conversationId
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatConversationThreadingKind
  
  /** Custom threading defined by the app */
  @js.native
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatConversationThreadingKind
  
  /** By participants */
  @js.native
  sealed trait participants
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatConversationThreadingKind
  
  /* 1 */ val contactId: contactId with scala.Double = js.native
  /* 2 */ val conversationId: conversationId with scala.Double = js.native
  /* 3 */ val custom: custom with scala.Double = js.native
  /* 0 */ val participants: participants with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatConversationThreadingKind with scala.Double
  ] = js.native
}

