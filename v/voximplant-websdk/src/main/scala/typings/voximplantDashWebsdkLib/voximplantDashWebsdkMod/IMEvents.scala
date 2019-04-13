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
  
  val ChatHistoryReceived: ChatHistoryReceived with java.lang.String = js.native
  val ChatRoomBanList: ChatRoomBanList with java.lang.String = js.native
  val ChatRoomCreated: ChatRoomCreated with java.lang.String = js.native
  val ChatRoomError: ChatRoomError with java.lang.String = js.native
  val ChatRoomHistoryReceived: ChatRoomHistoryReceived with java.lang.String = js.native
  val ChatRoomInfo: ChatRoomInfo with java.lang.String = js.native
  val ChatRoomInvitation: ChatRoomInvitation with java.lang.String = js.native
  val ChatRoomInviteDeclined: ChatRoomInviteDeclined with java.lang.String = js.native
  val ChatRoomMessageModified: ChatRoomMessageModified with java.lang.String = js.native
  val ChatRoomMessageNotModified: ChatRoomMessageNotModified with java.lang.String = js.native
  val ChatRoomMessageReceived: ChatRoomMessageReceived with java.lang.String = js.native
  val ChatRoomMessageRemoved: ChatRoomMessageRemoved with java.lang.String = js.native
  val ChatRoomNewParticipant: ChatRoomNewParticipant with java.lang.String = js.native
  val ChatRoomOperation: ChatRoomOperation with java.lang.String = js.native
  val ChatRoomParticipantExit: ChatRoomParticipantExit with java.lang.String = js.native
  val ChatRoomParticipants: ChatRoomParticipants with java.lang.String = js.native
  val ChatRoomPresenceUpdate: ChatRoomPresenceUpdate with java.lang.String = js.native
  val ChatRoomStateUpdate: ChatRoomStateUpdate with java.lang.String = js.native
  val ChatRoomSubjectChange: ChatRoomSubjectChange with java.lang.String = js.native
  val ChatRoomsDataReceived: ChatRoomsDataReceived with java.lang.String = js.native
  val ChatStateUpdate: ChatStateUpdate with java.lang.String = js.native
  val MessageModified: MessageModified with java.lang.String = js.native
  val MessageNotModified: MessageNotModified with java.lang.String = js.native
  val MessageReceived: MessageReceived with java.lang.String = js.native
  val MessageRemoved: MessageRemoved with java.lang.String = js.native
  val MessageStatus: MessageStatus with java.lang.String = js.native
  val PresenceUpdate: PresenceUpdate with java.lang.String = js.native
  val RosterItemChange: RosterItemChange with java.lang.String = js.native
  val RosterPresenceUpdate: RosterPresenceUpdate with java.lang.String = js.native
  val RosterReceived: RosterReceived with java.lang.String = js.native
  val SubscriptionRequest: SubscriptionRequest with java.lang.String = js.native
  val SystemError: SystemError with java.lang.String = js.native
  val UCConnected: UCConnected with java.lang.String = js.native
  val UCDisconnected: UCDisconnected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[voximplantDashWebsdkLib.voximplantDashWebsdkMod.IMEvents with java.lang.String] = js.native
}

