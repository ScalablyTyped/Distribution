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
  
  val fileTransferRequest: fileTransferRequest with java.lang.String = js.native
  val joinedConversation: joinedConversation with java.lang.String = js.native
  val leftConversation: leftConversation with java.lang.String = js.native
  val otherParticipantJoinedConversation: otherParticipantJoinedConversation with java.lang.String = js.native
  val otherParticipantLeftConversation: otherParticipantLeftConversation with java.lang.String = js.native
  val standard: standard with java.lang.String = js.native
  val transportCustom: transportCustom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageKind with java.lang.String
  ] = js.native
}

