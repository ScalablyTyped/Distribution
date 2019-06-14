package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatMessageKind extends js.Object

/** Specifies the type of chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageKind")
@js.native
object ChatMessageKind extends js.Object {
  /** A file transfer request */
  @js.native
  sealed trait fileTransferRequest
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind
  
  /** A conversation the user joined */
  @js.native
  sealed trait joinedConversation
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind
  
  /** A conversation the user left */
  @js.native
  sealed trait leftConversation
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind
  
  /** A conversation that another user joined */
  @js.native
  sealed trait otherParticipantJoinedConversation
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind
  
  /** A conversation that another user left */
  @js.native
  sealed trait otherParticipantLeftConversation
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind
  
  /** A standard chat message */
  @js.native
  sealed trait standard
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind
  
  /** A non-SMS/MMS message written to the device by the app */
  @js.native
  sealed trait transportCustom
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind
  
  /* 1 */ val fileTransferRequest: fileTransferRequest with scala.Double = js.native
  /* 3 */ val joinedConversation: joinedConversation with scala.Double = js.native
  /* 4 */ val leftConversation: leftConversation with scala.Double = js.native
  /* 5 */ val otherParticipantJoinedConversation: otherParticipantJoinedConversation with scala.Double = js.native
  /* 6 */ val otherParticipantLeftConversation: otherParticipantLeftConversation with scala.Double = js.native
  /* 0 */ val standard: standard with scala.Double = js.native
  /* 2 */ val transportCustom: transportCustom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind with scala.Double
  ] = js.native
}

