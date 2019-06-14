package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

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
  sealed trait ChatHistoryReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomBanList
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomCreated
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomError
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomHistoryReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomInfo
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomInvitation
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomInviteDeclined
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomMessageModified
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomMessageNotModified
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomMessageReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomMessageRemoved
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomNewParticipant
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomOperation
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomParticipantExit
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomParticipants
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomPresenceUpdate
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomStateUpdate
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomSubjectChange
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatRoomsDataReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait ChatStateUpdate
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait MessageModified
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait MessageNotModified
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait MessageReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait MessageRemoved
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait MessageStatus
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait PresenceUpdate
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait RosterItemChange
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait RosterPresenceUpdate
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait RosterReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait SubscriptionRequest
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait SystemError
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait UCConnected
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  @js.native
  sealed trait UCDisconnected
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents
  
  /* 0 */ val ChatHistoryReceived: ChatHistoryReceived with scala.Double = js.native
  /* 1 */ val ChatRoomBanList: ChatRoomBanList with scala.Double = js.native
  /* 2 */ val ChatRoomCreated: ChatRoomCreated with scala.Double = js.native
  /* 3 */ val ChatRoomError: ChatRoomError with scala.Double = js.native
  /* 4 */ val ChatRoomHistoryReceived: ChatRoomHistoryReceived with scala.Double = js.native
  /* 5 */ val ChatRoomInfo: ChatRoomInfo with scala.Double = js.native
  /* 6 */ val ChatRoomInvitation: ChatRoomInvitation with scala.Double = js.native
  /* 7 */ val ChatRoomInviteDeclined: ChatRoomInviteDeclined with scala.Double = js.native
  /* 8 */ val ChatRoomMessageModified: ChatRoomMessageModified with scala.Double = js.native
  /* 9 */ val ChatRoomMessageNotModified: ChatRoomMessageNotModified with scala.Double = js.native
  /* 10 */ val ChatRoomMessageReceived: ChatRoomMessageReceived with scala.Double = js.native
  /* 11 */ val ChatRoomMessageRemoved: ChatRoomMessageRemoved with scala.Double = js.native
  /* 12 */ val ChatRoomNewParticipant: ChatRoomNewParticipant with scala.Double = js.native
  /* 13 */ val ChatRoomOperation: ChatRoomOperation with scala.Double = js.native
  /* 14 */ val ChatRoomParticipantExit: ChatRoomParticipantExit with scala.Double = js.native
  /* 15 */ val ChatRoomParticipants: ChatRoomParticipants with scala.Double = js.native
  /* 16 */ val ChatRoomPresenceUpdate: ChatRoomPresenceUpdate with scala.Double = js.native
  /* 17 */ val ChatRoomStateUpdate: ChatRoomStateUpdate with scala.Double = js.native
  /* 18 */ val ChatRoomSubjectChange: ChatRoomSubjectChange with scala.Double = js.native
  /* 19 */ val ChatRoomsDataReceived: ChatRoomsDataReceived with scala.Double = js.native
  /* 20 */ val ChatStateUpdate: ChatStateUpdate with scala.Double = js.native
  /* 21 */ val MessageModified: MessageModified with scala.Double = js.native
  /* 22 */ val MessageNotModified: MessageNotModified with scala.Double = js.native
  /* 23 */ val MessageReceived: MessageReceived with scala.Double = js.native
  /* 24 */ val MessageRemoved: MessageRemoved with scala.Double = js.native
  /* 25 */ val MessageStatus: MessageStatus with scala.Double = js.native
  /* 26 */ val PresenceUpdate: PresenceUpdate with scala.Double = js.native
  /* 27 */ val RosterItemChange: RosterItemChange with scala.Double = js.native
  /* 28 */ val RosterPresenceUpdate: RosterPresenceUpdate with scala.Double = js.native
  /* 29 */ val RosterReceived: RosterReceived with scala.Double = js.native
  /* 30 */ val SubscriptionRequest: SubscriptionRequest with scala.Double = js.native
  /* 31 */ val SystemError: SystemError with scala.Double = js.native
  /* 32 */ val UCConnected: UCConnected with scala.Double = js.native
  /* 33 */ val UCDisconnected: UCDisconnected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents with scala.Double] = js.native
}

