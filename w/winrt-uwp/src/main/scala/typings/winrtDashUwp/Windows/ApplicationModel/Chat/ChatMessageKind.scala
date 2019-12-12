package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageKind.fileTransferRequest
import typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageKind.joinedConversation
import typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageKind.leftConversation
import typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageKind.otherParticipantJoinedConversation
import typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageKind.otherParticipantLeftConversation
import typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageKind.standard
import typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageKind.transportCustom
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageKind with Double] = js.native
  /* 1 */ @js.native
  object fileTransferRequest extends TopLevel[fileTransferRequest with Double]
  
  /* 3 */ @js.native
  object joinedConversation extends TopLevel[joinedConversation with Double]
  
  /* 4 */ @js.native
  object leftConversation extends TopLevel[leftConversation with Double]
  
  /* 5 */ @js.native
  object otherParticipantJoinedConversation extends TopLevel[otherParticipantJoinedConversation with Double]
  
  /* 6 */ @js.native
  object otherParticipantLeftConversation extends TopLevel[otherParticipantLeftConversation with Double]
  
  /* 0 */ @js.native
  object standard extends TopLevel[standard with Double]
  
  /* 2 */ @js.native
  object transportCustom extends TopLevel[transportCustom with Double]
  
}

