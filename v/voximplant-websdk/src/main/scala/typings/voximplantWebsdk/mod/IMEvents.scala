package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IMEvents extends js.Object

/**
	*	VoxImplant.Client Instant Messaging and Presence events
	*/
@JSImport("voximplant-websdk", "IMEvents")
@js.native
object IMEvents extends js.Object {
  @js.native
  sealed trait ChatHistoryReceived extends IMEvents
  
  @js.native
  sealed trait ChatRoomBanList extends IMEvents
  
  @js.native
  sealed trait ChatRoomCreated extends IMEvents
  
  @js.native
  sealed trait ChatRoomError extends IMEvents
  
  @js.native
  sealed trait ChatRoomHistoryReceived extends IMEvents
  
  @js.native
  sealed trait ChatRoomInfo extends IMEvents
  
  @js.native
  sealed trait ChatRoomInvitation extends IMEvents
  
  @js.native
  sealed trait ChatRoomInviteDeclined extends IMEvents
  
  @js.native
  sealed trait ChatRoomMessageModified extends IMEvents
  
  @js.native
  sealed trait ChatRoomMessageNotModified extends IMEvents
  
  @js.native
  sealed trait ChatRoomMessageReceived extends IMEvents
  
  @js.native
  sealed trait ChatRoomMessageRemoved extends IMEvents
  
  @js.native
  sealed trait ChatRoomNewParticipant extends IMEvents
  
  @js.native
  sealed trait ChatRoomOperation extends IMEvents
  
  @js.native
  sealed trait ChatRoomParticipantExit extends IMEvents
  
  @js.native
  sealed trait ChatRoomParticipants extends IMEvents
  
  @js.native
  sealed trait ChatRoomPresenceUpdate extends IMEvents
  
  @js.native
  sealed trait ChatRoomStateUpdate extends IMEvents
  
  @js.native
  sealed trait ChatRoomSubjectChange extends IMEvents
  
  @js.native
  sealed trait ChatRoomsDataReceived extends IMEvents
  
  @js.native
  sealed trait ChatStateUpdate extends IMEvents
  
  @js.native
  sealed trait MessageModified extends IMEvents
  
  @js.native
  sealed trait MessageNotModified extends IMEvents
  
  @js.native
  sealed trait MessageReceived extends IMEvents
  
  @js.native
  sealed trait MessageRemoved extends IMEvents
  
  @js.native
  sealed trait MessageStatus extends IMEvents
  
  @js.native
  sealed trait PresenceUpdate extends IMEvents
  
  @js.native
  sealed trait RosterItemChange extends IMEvents
  
  @js.native
  sealed trait RosterPresenceUpdate extends IMEvents
  
  @js.native
  sealed trait RosterReceived extends IMEvents
  
  @js.native
  sealed trait SubscriptionRequest extends IMEvents
  
  @js.native
  sealed trait SystemError extends IMEvents
  
  @js.native
  sealed trait UCConnected extends IMEvents
  
  @js.native
  sealed trait UCDisconnected extends IMEvents
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMEvents with Double] = js.native
  /* 0 */ @js.native
  object ChatHistoryReceived extends TopLevel[ChatHistoryReceived with Double]
  
  /* 1 */ @js.native
  object ChatRoomBanList extends TopLevel[ChatRoomBanList with Double]
  
  /* 2 */ @js.native
  object ChatRoomCreated extends TopLevel[ChatRoomCreated with Double]
  
  /* 3 */ @js.native
  object ChatRoomError extends TopLevel[ChatRoomError with Double]
  
  /* 4 */ @js.native
  object ChatRoomHistoryReceived extends TopLevel[ChatRoomHistoryReceived with Double]
  
  /* 5 */ @js.native
  object ChatRoomInfo
    extends TopLevel[typings.voximplantWebsdk.mod.IMEvents.ChatRoomInfo with Double]
  
  /* 6 */ @js.native
  object ChatRoomInvitation extends TopLevel[ChatRoomInvitation with Double]
  
  /* 7 */ @js.native
  object ChatRoomInviteDeclined extends TopLevel[ChatRoomInviteDeclined with Double]
  
  /* 8 */ @js.native
  object ChatRoomMessageModified extends TopLevel[ChatRoomMessageModified with Double]
  
  /* 9 */ @js.native
  object ChatRoomMessageNotModified extends TopLevel[ChatRoomMessageNotModified with Double]
  
  /* 10 */ @js.native
  object ChatRoomMessageReceived extends TopLevel[ChatRoomMessageReceived with Double]
  
  /* 11 */ @js.native
  object ChatRoomMessageRemoved extends TopLevel[ChatRoomMessageRemoved with Double]
  
  /* 12 */ @js.native
  object ChatRoomNewParticipant extends TopLevel[ChatRoomNewParticipant with Double]
  
  /* 13 */ @js.native
  object ChatRoomOperation extends TopLevel[ChatRoomOperation with Double]
  
  /* 14 */ @js.native
  object ChatRoomParticipantExit extends TopLevel[ChatRoomParticipantExit with Double]
  
  /* 15 */ @js.native
  object ChatRoomParticipants extends TopLevel[ChatRoomParticipants with Double]
  
  /* 16 */ @js.native
  object ChatRoomPresenceUpdate extends TopLevel[ChatRoomPresenceUpdate with Double]
  
  /* 17 */ @js.native
  object ChatRoomStateUpdate extends TopLevel[ChatRoomStateUpdate with Double]
  
  /* 18 */ @js.native
  object ChatRoomSubjectChange extends TopLevel[ChatRoomSubjectChange with Double]
  
  /* 19 */ @js.native
  object ChatRoomsDataReceived extends TopLevel[ChatRoomsDataReceived with Double]
  
  /* 20 */ @js.native
  object ChatStateUpdate extends TopLevel[ChatStateUpdate with Double]
  
  /* 21 */ @js.native
  object MessageModified extends TopLevel[MessageModified with Double]
  
  /* 22 */ @js.native
  object MessageNotModified extends TopLevel[MessageNotModified with Double]
  
  /* 23 */ @js.native
  object MessageReceived extends TopLevel[MessageReceived with Double]
  
  /* 24 */ @js.native
  object MessageRemoved extends TopLevel[MessageRemoved with Double]
  
  /* 25 */ @js.native
  object MessageStatus extends TopLevel[MessageStatus with Double]
  
  /* 26 */ @js.native
  object PresenceUpdate extends TopLevel[PresenceUpdate with Double]
  
  /* 27 */ @js.native
  object RosterItemChange extends TopLevel[RosterItemChange with Double]
  
  /* 28 */ @js.native
  object RosterPresenceUpdate extends TopLevel[RosterPresenceUpdate with Double]
  
  /* 29 */ @js.native
  object RosterReceived extends TopLevel[RosterReceived with Double]
  
  /* 30 */ @js.native
  object SubscriptionRequest extends TopLevel[SubscriptionRequest with Double]
  
  /* 31 */ @js.native
  object SystemError extends TopLevel[SystemError with Double]
  
  /* 32 */ @js.native
  object UCConnected extends TopLevel[UCConnected with Double]
  
  /* 33 */ @js.native
  object UCDisconnected extends TopLevel[UCDisconnected with Double]
  
}

