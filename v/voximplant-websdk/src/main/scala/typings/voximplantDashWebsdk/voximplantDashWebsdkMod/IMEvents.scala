package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

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
  
  /* 0 */ val ChatHistoryReceived: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatHistoryReceived with Double = js.native
  /* 1 */ val ChatRoomBanList: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomBanList with Double = js.native
  /* 2 */ val ChatRoomCreated: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomCreated with Double = js.native
  /* 3 */ val ChatRoomError: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomError with Double = js.native
  /* 4 */ val ChatRoomHistoryReceived: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomHistoryReceived with Double = js.native
  /* 5 */ val ChatRoomInfo: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomInfo with Double = js.native
  /* 6 */ val ChatRoomInvitation: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomInvitation with Double = js.native
  /* 7 */ val ChatRoomInviteDeclined: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomInviteDeclined with Double = js.native
  /* 8 */ val ChatRoomMessageModified: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomMessageModified with Double = js.native
  /* 9 */ val ChatRoomMessageNotModified: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomMessageNotModified with Double = js.native
  /* 10 */ val ChatRoomMessageReceived: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomMessageReceived with Double = js.native
  /* 11 */ val ChatRoomMessageRemoved: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomMessageRemoved with Double = js.native
  /* 12 */ val ChatRoomNewParticipant: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomNewParticipant with Double = js.native
  /* 13 */ val ChatRoomOperation: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomOperation with Double = js.native
  /* 14 */ val ChatRoomParticipantExit: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomParticipantExit with Double = js.native
  /* 15 */ val ChatRoomParticipants: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomParticipants with Double = js.native
  /* 16 */ val ChatRoomPresenceUpdate: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomPresenceUpdate with Double = js.native
  /* 17 */ val ChatRoomStateUpdate: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomStateUpdate with Double = js.native
  /* 18 */ val ChatRoomSubjectChange: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomSubjectChange with Double = js.native
  /* 19 */ val ChatRoomsDataReceived: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatRoomsDataReceived with Double = js.native
  /* 20 */ val ChatStateUpdate: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.ChatStateUpdate with Double = js.native
  /* 21 */ val MessageModified: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.MessageModified with Double = js.native
  /* 22 */ val MessageNotModified: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.MessageNotModified with Double = js.native
  /* 23 */ val MessageReceived: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.MessageReceived with Double = js.native
  /* 24 */ val MessageRemoved: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.MessageRemoved with Double = js.native
  /* 25 */ val MessageStatus: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.MessageStatus with Double = js.native
  /* 26 */ val PresenceUpdate: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.PresenceUpdate with Double = js.native
  /* 27 */ val RosterItemChange: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.RosterItemChange with Double = js.native
  /* 28 */ val RosterPresenceUpdate: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.RosterPresenceUpdate with Double = js.native
  /* 29 */ val RosterReceived: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.RosterReceived with Double = js.native
  /* 30 */ val SubscriptionRequest: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.SubscriptionRequest with Double = js.native
  /* 31 */ val SystemError: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.SystemError with Double = js.native
  /* 32 */ val UCConnected: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.UCConnected with Double = js.native
  /* 33 */ val UCDisconnected: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEvents.UCDisconnected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMEvents with Double] = js.native
}

