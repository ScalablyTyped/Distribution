package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatMessageKind extends StObject
/** Specifies the type of chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageKind")
@js.native
object ChatMessageKind extends StObject {
  
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
}
