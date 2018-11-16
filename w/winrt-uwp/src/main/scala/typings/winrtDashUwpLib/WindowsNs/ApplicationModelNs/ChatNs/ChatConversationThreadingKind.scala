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
  
  val contactId: contactId with java.lang.String = js.native
  val conversationId: conversationId with java.lang.String = js.native
  val custom: custom with java.lang.String = js.native
  val participants: participants with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatConversationThreadingKind with java.lang.String
  ] = js.native
}

