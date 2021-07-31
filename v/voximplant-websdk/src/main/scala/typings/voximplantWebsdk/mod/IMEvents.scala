package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IMEvents extends StObject
/**
  *    VoxImplant.Client Instant Messaging and Presence events
  */
@JSImport("voximplant-websdk", "IMEvents")
@js.native
object IMEvents extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMEvents & Double] = js.native
  
  @js.native
  sealed trait ChatHistoryReceived
    extends StObject
       with IMEvents
  /* 0 */ val ChatHistoryReceived: typings.voximplantWebsdk.mod.IMEvents.ChatHistoryReceived & Double = js.native
  
  @js.native
  sealed trait ChatRoomBanList
    extends StObject
       with IMEvents
  /* 1 */ val ChatRoomBanList: typings.voximplantWebsdk.mod.IMEvents.ChatRoomBanList & Double = js.native
  
  @js.native
  sealed trait ChatRoomCreated
    extends StObject
       with IMEvents
  /* 2 */ val ChatRoomCreated: typings.voximplantWebsdk.mod.IMEvents.ChatRoomCreated & Double = js.native
  
  @js.native
  sealed trait ChatRoomError
    extends StObject
       with IMEvents
  /* 3 */ val ChatRoomError: typings.voximplantWebsdk.mod.IMEvents.ChatRoomError & Double = js.native
  
  @js.native
  sealed trait ChatRoomHistoryReceived
    extends StObject
       with IMEvents
  /* 4 */ val ChatRoomHistoryReceived: typings.voximplantWebsdk.mod.IMEvents.ChatRoomHistoryReceived & Double = js.native
  
  @js.native
  sealed trait ChatRoomInfo
    extends StObject
       with IMEvents
  /* 5 */ val ChatRoomInfo: typings.voximplantWebsdk.mod.IMEvents.ChatRoomInfo & Double = js.native
  
  @js.native
  sealed trait ChatRoomInvitation
    extends StObject
       with IMEvents
  /* 6 */ val ChatRoomInvitation: typings.voximplantWebsdk.mod.IMEvents.ChatRoomInvitation & Double = js.native
  
  @js.native
  sealed trait ChatRoomInviteDeclined
    extends StObject
       with IMEvents
  /* 7 */ val ChatRoomInviteDeclined: typings.voximplantWebsdk.mod.IMEvents.ChatRoomInviteDeclined & Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageModified
    extends StObject
       with IMEvents
  /* 8 */ val ChatRoomMessageModified: typings.voximplantWebsdk.mod.IMEvents.ChatRoomMessageModified & Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageNotModified
    extends StObject
       with IMEvents
  /* 9 */ val ChatRoomMessageNotModified: typings.voximplantWebsdk.mod.IMEvents.ChatRoomMessageNotModified & Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageReceived
    extends StObject
       with IMEvents
  /* 10 */ val ChatRoomMessageReceived: typings.voximplantWebsdk.mod.IMEvents.ChatRoomMessageReceived & Double = js.native
  
  @js.native
  sealed trait ChatRoomMessageRemoved
    extends StObject
       with IMEvents
  /* 11 */ val ChatRoomMessageRemoved: typings.voximplantWebsdk.mod.IMEvents.ChatRoomMessageRemoved & Double = js.native
  
  @js.native
  sealed trait ChatRoomNewParticipant
    extends StObject
       with IMEvents
  /* 12 */ val ChatRoomNewParticipant: typings.voximplantWebsdk.mod.IMEvents.ChatRoomNewParticipant & Double = js.native
  
  @js.native
  sealed trait ChatRoomOperation
    extends StObject
       with IMEvents
  /* 13 */ val ChatRoomOperation: typings.voximplantWebsdk.mod.IMEvents.ChatRoomOperation & Double = js.native
  
  @js.native
  sealed trait ChatRoomParticipantExit
    extends StObject
       with IMEvents
  /* 14 */ val ChatRoomParticipantExit: typings.voximplantWebsdk.mod.IMEvents.ChatRoomParticipantExit & Double = js.native
  
  @js.native
  sealed trait ChatRoomParticipants
    extends StObject
       with IMEvents
  /* 15 */ val ChatRoomParticipants: typings.voximplantWebsdk.mod.IMEvents.ChatRoomParticipants & Double = js.native
  
  @js.native
  sealed trait ChatRoomPresenceUpdate
    extends StObject
       with IMEvents
  /* 16 */ val ChatRoomPresenceUpdate: typings.voximplantWebsdk.mod.IMEvents.ChatRoomPresenceUpdate & Double = js.native
  
  @js.native
  sealed trait ChatRoomStateUpdate
    extends StObject
       with IMEvents
  /* 17 */ val ChatRoomStateUpdate: typings.voximplantWebsdk.mod.IMEvents.ChatRoomStateUpdate & Double = js.native
  
  @js.native
  sealed trait ChatRoomSubjectChange
    extends StObject
       with IMEvents
  /* 18 */ val ChatRoomSubjectChange: typings.voximplantWebsdk.mod.IMEvents.ChatRoomSubjectChange & Double = js.native
  
  @js.native
  sealed trait ChatRoomsDataReceived
    extends StObject
       with IMEvents
  /* 19 */ val ChatRoomsDataReceived: typings.voximplantWebsdk.mod.IMEvents.ChatRoomsDataReceived & Double = js.native
  
  @js.native
  sealed trait ChatStateUpdate
    extends StObject
       with IMEvents
  /* 20 */ val ChatStateUpdate: typings.voximplantWebsdk.mod.IMEvents.ChatStateUpdate & Double = js.native
  
  @js.native
  sealed trait MessageModified
    extends StObject
       with IMEvents
  /* 21 */ val MessageModified: typings.voximplantWebsdk.mod.IMEvents.MessageModified & Double = js.native
  
  @js.native
  sealed trait MessageNotModified
    extends StObject
       with IMEvents
  /* 22 */ val MessageNotModified: typings.voximplantWebsdk.mod.IMEvents.MessageNotModified & Double = js.native
  
  @js.native
  sealed trait MessageReceived
    extends StObject
       with IMEvents
  /* 23 */ val MessageReceived: typings.voximplantWebsdk.mod.IMEvents.MessageReceived & Double = js.native
  
  @js.native
  sealed trait MessageRemoved
    extends StObject
       with IMEvents
  /* 24 */ val MessageRemoved: typings.voximplantWebsdk.mod.IMEvents.MessageRemoved & Double = js.native
  
  @js.native
  sealed trait MessageStatus
    extends StObject
       with IMEvents
  /* 25 */ val MessageStatus: typings.voximplantWebsdk.mod.IMEvents.MessageStatus & Double = js.native
  
  @js.native
  sealed trait PresenceUpdate
    extends StObject
       with IMEvents
  /* 26 */ val PresenceUpdate: typings.voximplantWebsdk.mod.IMEvents.PresenceUpdate & Double = js.native
  
  @js.native
  sealed trait RosterItemChange
    extends StObject
       with IMEvents
  /* 27 */ val RosterItemChange: typings.voximplantWebsdk.mod.IMEvents.RosterItemChange & Double = js.native
  
  @js.native
  sealed trait RosterPresenceUpdate
    extends StObject
       with IMEvents
  /* 28 */ val RosterPresenceUpdate: typings.voximplantWebsdk.mod.IMEvents.RosterPresenceUpdate & Double = js.native
  
  @js.native
  sealed trait RosterReceived
    extends StObject
       with IMEvents
  /* 29 */ val RosterReceived: typings.voximplantWebsdk.mod.IMEvents.RosterReceived & Double = js.native
  
  @js.native
  sealed trait SubscriptionRequest
    extends StObject
       with IMEvents
  /* 30 */ val SubscriptionRequest: typings.voximplantWebsdk.mod.IMEvents.SubscriptionRequest & Double = js.native
  
  @js.native
  sealed trait SystemError
    extends StObject
       with IMEvents
  /* 31 */ val SystemError: typings.voximplantWebsdk.mod.IMEvents.SystemError & Double = js.native
  
  @js.native
  sealed trait UCConnected
    extends StObject
       with IMEvents
  /* 32 */ val UCConnected: typings.voximplantWebsdk.mod.IMEvents.UCConnected & Double = js.native
  
  @js.native
  sealed trait UCDisconnected
    extends StObject
       with IMEvents
  /* 33 */ val UCDisconnected: typings.voximplantWebsdk.mod.IMEvents.UCDisconnected & Double = js.native
}
