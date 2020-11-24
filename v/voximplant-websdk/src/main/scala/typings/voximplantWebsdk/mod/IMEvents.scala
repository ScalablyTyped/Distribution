package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IMEvents extends js.Object
/**
  *    VoxImplant.Client Instant Messaging and Presence events
  */
@JSImport("voximplant-websdk", "IMEvents")
@js.native
object IMEvents extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMEvents with Double] = js.native
  
  @js.native
  sealed trait ChatHistoryReceived extends IMEvents
  /* 0 */ @js.native
  object ChatHistoryReceived extends TopLevel[ChatHistoryReceived with Double]
  
  @js.native
  sealed trait ChatRoomBanList extends IMEvents
  /* 1 */ @js.native
  object ChatRoomBanList extends TopLevel[ChatRoomBanList with Double]
  
  @js.native
  sealed trait ChatRoomCreated extends IMEvents
  /* 2 */ @js.native
  object ChatRoomCreated extends TopLevel[ChatRoomCreated with Double]
  
  @js.native
  sealed trait ChatRoomError extends IMEvents
  /* 3 */ @js.native
  object ChatRoomError extends TopLevel[ChatRoomError with Double]
  
  @js.native
  sealed trait ChatRoomHistoryReceived extends IMEvents
  /* 4 */ @js.native
  object ChatRoomHistoryReceived extends TopLevel[ChatRoomHistoryReceived with Double]
  
  @js.native
  sealed trait ChatRoomInfo extends IMEvents
  /* 5 */ @js.native
  object ChatRoomInfo
    extends TopLevel[typings.voximplantWebsdk.mod.IMEvents.ChatRoomInfo with Double]
  
  @js.native
  sealed trait ChatRoomInvitation extends IMEvents
  /* 6 */ @js.native
  object ChatRoomInvitation extends TopLevel[ChatRoomInvitation with Double]
  
  @js.native
  sealed trait ChatRoomInviteDeclined extends IMEvents
  /* 7 */ @js.native
  object ChatRoomInviteDeclined extends TopLevel[ChatRoomInviteDeclined with Double]
  
  @js.native
  sealed trait ChatRoomMessageModified extends IMEvents
  /* 8 */ @js.native
  object ChatRoomMessageModified extends TopLevel[ChatRoomMessageModified with Double]
  
  @js.native
  sealed trait ChatRoomMessageNotModified extends IMEvents
  /* 9 */ @js.native
  object ChatRoomMessageNotModified extends TopLevel[ChatRoomMessageNotModified with Double]
  
  @js.native
  sealed trait ChatRoomMessageReceived extends IMEvents
  /* 10 */ @js.native
  object ChatRoomMessageReceived extends TopLevel[ChatRoomMessageReceived with Double]
  
  @js.native
  sealed trait ChatRoomMessageRemoved extends IMEvents
  /* 11 */ @js.native
  object ChatRoomMessageRemoved extends TopLevel[ChatRoomMessageRemoved with Double]
  
  @js.native
  sealed trait ChatRoomNewParticipant extends IMEvents
  /* 12 */ @js.native
  object ChatRoomNewParticipant extends TopLevel[ChatRoomNewParticipant with Double]
  
  @js.native
  sealed trait ChatRoomOperation extends IMEvents
  /* 13 */ @js.native
  object ChatRoomOperation extends TopLevel[ChatRoomOperation with Double]
  
  @js.native
  sealed trait ChatRoomParticipantExit extends IMEvents
  /* 14 */ @js.native
  object ChatRoomParticipantExit extends TopLevel[ChatRoomParticipantExit with Double]
  
  @js.native
  sealed trait ChatRoomParticipants extends IMEvents
  /* 15 */ @js.native
  object ChatRoomParticipants extends TopLevel[ChatRoomParticipants with Double]
  
  @js.native
  sealed trait ChatRoomPresenceUpdate extends IMEvents
  /* 16 */ @js.native
  object ChatRoomPresenceUpdate extends TopLevel[ChatRoomPresenceUpdate with Double]
  
  @js.native
  sealed trait ChatRoomStateUpdate extends IMEvents
  /* 17 */ @js.native
  object ChatRoomStateUpdate extends TopLevel[ChatRoomStateUpdate with Double]
  
  @js.native
  sealed trait ChatRoomSubjectChange extends IMEvents
  /* 18 */ @js.native
  object ChatRoomSubjectChange extends TopLevel[ChatRoomSubjectChange with Double]
  
  @js.native
  sealed trait ChatRoomsDataReceived extends IMEvents
  /* 19 */ @js.native
  object ChatRoomsDataReceived extends TopLevel[ChatRoomsDataReceived with Double]
  
  @js.native
  sealed trait ChatStateUpdate extends IMEvents
  /* 20 */ @js.native
  object ChatStateUpdate extends TopLevel[ChatStateUpdate with Double]
  
  @js.native
  sealed trait MessageModified extends IMEvents
  /* 21 */ @js.native
  object MessageModified extends TopLevel[MessageModified with Double]
  
  @js.native
  sealed trait MessageNotModified extends IMEvents
  /* 22 */ @js.native
  object MessageNotModified extends TopLevel[MessageNotModified with Double]
  
  @js.native
  sealed trait MessageReceived extends IMEvents
  /* 23 */ @js.native
  object MessageReceived extends TopLevel[MessageReceived with Double]
  
  @js.native
  sealed trait MessageRemoved extends IMEvents
  /* 24 */ @js.native
  object MessageRemoved extends TopLevel[MessageRemoved with Double]
  
  @js.native
  sealed trait MessageStatus extends IMEvents
  /* 25 */ @js.native
  object MessageStatus extends TopLevel[MessageStatus with Double]
  
  @js.native
  sealed trait PresenceUpdate extends IMEvents
  /* 26 */ @js.native
  object PresenceUpdate extends TopLevel[PresenceUpdate with Double]
  
  @js.native
  sealed trait RosterItemChange extends IMEvents
  /* 27 */ @js.native
  object RosterItemChange extends TopLevel[RosterItemChange with Double]
  
  @js.native
  sealed trait RosterPresenceUpdate extends IMEvents
  /* 28 */ @js.native
  object RosterPresenceUpdate extends TopLevel[RosterPresenceUpdate with Double]
  
  @js.native
  sealed trait RosterReceived extends IMEvents
  /* 29 */ @js.native
  object RosterReceived extends TopLevel[RosterReceived with Double]
  
  @js.native
  sealed trait SubscriptionRequest extends IMEvents
  /* 30 */ @js.native
  object SubscriptionRequest extends TopLevel[SubscriptionRequest with Double]
  
  @js.native
  sealed trait SystemError extends IMEvents
  /* 31 */ @js.native
  object SystemError extends TopLevel[SystemError with Double]
  
  @js.native
  sealed trait UCConnected extends IMEvents
  /* 32 */ @js.native
  object UCConnected extends TopLevel[UCConnected with Double]
  
  @js.native
  sealed trait UCDisconnected extends IMEvents
  /* 33 */ @js.native
  object UCDisconnected extends TopLevel[UCDisconnected with Double]
}
