package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

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
  sealed trait fileTransferRequest extends ChatMessageKind
  
  /** A conversation the user joined */
  @js.native
  sealed trait joinedConversation extends ChatMessageKind
  
  /** A conversation the user left */
  @js.native
  sealed trait leftConversation extends ChatMessageKind
  
  /** A conversation that another user joined */
  @js.native
  sealed trait otherParticipantJoinedConversation extends ChatMessageKind
  
  /** A conversation that another user left */
  @js.native
  sealed trait otherParticipantLeftConversation extends ChatMessageKind
  
  /** A standard chat message */
  @js.native
  sealed trait standard extends ChatMessageKind
  
  /** A non-SMS/MMS message written to the device by the app */
  @js.native
  sealed trait transportCustom extends ChatMessageKind
  
  /* 1 */ val fileTransferRequest: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind.fileTransferRequest with Double = js.native
  /* 3 */ val joinedConversation: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind.joinedConversation with Double = js.native
  /* 4 */ val leftConversation: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind.leftConversation with Double = js.native
  /* 5 */ val otherParticipantJoinedConversation: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind.otherParticipantJoinedConversation with Double = js.native
  /* 6 */ val otherParticipantLeftConversation: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind.otherParticipantLeftConversation with Double = js.native
  /* 0 */ val standard: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind.standard with Double = js.native
  /* 2 */ val transportCustom: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind.transportCustom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageKind with Double] = js.native
}

