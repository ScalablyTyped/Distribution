package typings.voximplantWebsdk

import typings.voximplantWebsdk.mod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object VoxImplant {
    
    @JSGlobal("VoxImplant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *    VoxImplant.Call events
      */
    @JSGlobal("VoxImplant.CallEvents")
    @js.native
    object CallEvents extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.voximplantWebsdk.mod.CallEvents & Double] = js.native
      
      /* 0 */ val Connected: typings.voximplantWebsdk.mod.CallEvents.Connected & Double = js.native
      
      /* 1 */ val Disconnected: typings.voximplantWebsdk.mod.CallEvents.Disconnected & Double = js.native
      
      /* 2 */ val Failed: typings.voximplantWebsdk.mod.CallEvents.Failed & Double = js.native
      
      /* 3 */ val ICETimeout: typings.voximplantWebsdk.mod.CallEvents.ICETimeout & Double = js.native
      
      /* 4 */ val InfoReceived: typings.voximplantWebsdk.mod.CallEvents.InfoReceived & Double = js.native
      
      /* 5 */ val MessageReceived: typings.voximplantWebsdk.mod.CallEvents.MessageReceived & Double = js.native
      
      /* 6 */ val ProgressToneStart: typings.voximplantWebsdk.mod.CallEvents.ProgressToneStart & Double = js.native
      
      /* 7 */ val ProgressToneStop: typings.voximplantWebsdk.mod.CallEvents.ProgressToneStop & Double = js.native
      
      /* 8 */ val TransferComplete: typings.voximplantWebsdk.mod.CallEvents.TransferComplete & Double = js.native
      
      /* 9 */ val TransferFailed: typings.voximplantWebsdk.mod.CallEvents.TransferFailed & Double = js.native
    }
    
    @JSGlobal("VoxImplant.ChatRoomOperationType")
    @js.native
    object ChatRoomOperationType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.voximplantWebsdk.mod.ChatRoomOperationType & Double] = js.native
      
      /* 0 */ val Ban: typings.voximplantWebsdk.mod.ChatRoomOperationType.Ban & Double = js.native
      
      /* 1 */ val Unban: typings.voximplantWebsdk.mod.ChatRoomOperationType.Unban & Double = js.native
    }
    
    @JSGlobal("VoxImplant.ChatStateType")
    @js.native
    object ChatStateType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.voximplantWebsdk.mod.ChatStateType & Double] = js.native
      
      /* 0 */ val Active: typings.voximplantWebsdk.mod.ChatStateType.Active & Double = js.native
      
      /* 1 */ val Composing: typings.voximplantWebsdk.mod.ChatStateType.Composing & Double = js.native
      
      /* 2 */ val Gone: typings.voximplantWebsdk.mod.ChatStateType.Gone & Double = js.native
      
      /* 3 */ val Inactive: typings.voximplantWebsdk.mod.ChatStateType.Inactive & Double = js.native
      
      /* 4 */ val Invalid: typings.voximplantWebsdk.mod.ChatStateType.Invalid & Double = js.native
      
      /* 5 */ val Paused: typings.voximplantWebsdk.mod.ChatStateType.Paused & Double = js.native
    }
    
    /**
      *    VoxImplant.Client general events
      */
    @JSGlobal("VoxImplant.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.voximplantWebsdk.mod.Events & Double] = js.native
      
      /* 0 */ val AuthResult: typings.voximplantWebsdk.mod.Events.AuthResult & Double = js.native
      
      /* 1 */ val ConnectionClosed: typings.voximplantWebsdk.mod.Events.ConnectionClosed & Double = js.native
      
      /* 2 */ val ConnectionEstablished: typings.voximplantWebsdk.mod.Events.ConnectionEstablished & Double = js.native
      
      /* 3 */ val ConnectionFailed: typings.voximplantWebsdk.mod.Events.ConnectionFailed & Double = js.native
      
      /* 4 */ val IncomingCall: typings.voximplantWebsdk.mod.Events.IncomingCall & Double = js.native
      
      /* 5 */ val MicAccessResult: typings.voximplantWebsdk.mod.Events.MicAccessResult & Double = js.native
      
      /* 6 */ val NetStatsReceived: typings.voximplantWebsdk.mod.Events.NetStatsReceived & Double = js.native
      
      /* 7 */ val PlaybackFinished: typings.voximplantWebsdk.mod.Events.PlaybackFinished & Double = js.native
      
      /* 8 */ val SDKReady: typings.voximplantWebsdk.mod.Events.SDKReady & Double = js.native
      
      /* 9 */ val SourcesInfoUpdated: typings.voximplantWebsdk.mod.Events.SourcesInfoUpdated & Double = js.native
    }
    
    @JSGlobal("VoxImplant.IMErrorType")
    @js.native
    object IMErrorType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.voximplantWebsdk.mod.IMErrorType & Double] = js.native
      
      /* 1 */ val Error: typings.voximplantWebsdk.mod.IMErrorType.Error & Double = js.native
      
      /* 0 */ val RemoteFunctionError: typings.voximplantWebsdk.mod.IMErrorType.RemoteFunctionError & Double = js.native
      
      /* 2 */ val RosterError: typings.voximplantWebsdk.mod.IMErrorType.RosterError & Double = js.native
    }
    
    /**
      *    VoxImplant.Client Instant Messaging and Presence events
      */
    @JSGlobal("VoxImplant.IMEvents")
    @js.native
    object IMEvents extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.voximplantWebsdk.mod.IMEvents & Double] = js.native
      
      /* 0 */ val ChatHistoryReceived: typings.voximplantWebsdk.mod.IMEvents.ChatHistoryReceived & Double = js.native
      
      /* 1 */ val ChatRoomBanList: typings.voximplantWebsdk.mod.IMEvents.ChatRoomBanList & Double = js.native
      
      /* 2 */ val ChatRoomCreated: typings.voximplantWebsdk.mod.IMEvents.ChatRoomCreated & Double = js.native
      
      /* 3 */ val ChatRoomError: typings.voximplantWebsdk.mod.IMEvents.ChatRoomError & Double = js.native
      
      /* 4 */ val ChatRoomHistoryReceived: typings.voximplantWebsdk.mod.IMEvents.ChatRoomHistoryReceived & Double = js.native
      
      /* 5 */ val ChatRoomInfo: typings.voximplantWebsdk.mod.IMEvents.ChatRoomInfo & Double = js.native
      
      /* 6 */ val ChatRoomInvitation: typings.voximplantWebsdk.mod.IMEvents.ChatRoomInvitation & Double = js.native
      
      /* 7 */ val ChatRoomInviteDeclined: typings.voximplantWebsdk.mod.IMEvents.ChatRoomInviteDeclined & Double = js.native
      
      /* 8 */ val ChatRoomMessageModified: typings.voximplantWebsdk.mod.IMEvents.ChatRoomMessageModified & Double = js.native
      
      /* 9 */ val ChatRoomMessageNotModified: typings.voximplantWebsdk.mod.IMEvents.ChatRoomMessageNotModified & Double = js.native
      
      /* 10 */ val ChatRoomMessageReceived: typings.voximplantWebsdk.mod.IMEvents.ChatRoomMessageReceived & Double = js.native
      
      /* 11 */ val ChatRoomMessageRemoved: typings.voximplantWebsdk.mod.IMEvents.ChatRoomMessageRemoved & Double = js.native
      
      /* 12 */ val ChatRoomNewParticipant: typings.voximplantWebsdk.mod.IMEvents.ChatRoomNewParticipant & Double = js.native
      
      /* 13 */ val ChatRoomOperation: typings.voximplantWebsdk.mod.IMEvents.ChatRoomOperation & Double = js.native
      
      /* 14 */ val ChatRoomParticipantExit: typings.voximplantWebsdk.mod.IMEvents.ChatRoomParticipantExit & Double = js.native
      
      /* 15 */ val ChatRoomParticipants: typings.voximplantWebsdk.mod.IMEvents.ChatRoomParticipants & Double = js.native
      
      /* 16 */ val ChatRoomPresenceUpdate: typings.voximplantWebsdk.mod.IMEvents.ChatRoomPresenceUpdate & Double = js.native
      
      /* 17 */ val ChatRoomStateUpdate: typings.voximplantWebsdk.mod.IMEvents.ChatRoomStateUpdate & Double = js.native
      
      /* 18 */ val ChatRoomSubjectChange: typings.voximplantWebsdk.mod.IMEvents.ChatRoomSubjectChange & Double = js.native
      
      /* 19 */ val ChatRoomsDataReceived: typings.voximplantWebsdk.mod.IMEvents.ChatRoomsDataReceived & Double = js.native
      
      /* 20 */ val ChatStateUpdate: typings.voximplantWebsdk.mod.IMEvents.ChatStateUpdate & Double = js.native
      
      /* 21 */ val MessageModified: typings.voximplantWebsdk.mod.IMEvents.MessageModified & Double = js.native
      
      /* 22 */ val MessageNotModified: typings.voximplantWebsdk.mod.IMEvents.MessageNotModified & Double = js.native
      
      /* 23 */ val MessageReceived: typings.voximplantWebsdk.mod.IMEvents.MessageReceived & Double = js.native
      
      /* 24 */ val MessageRemoved: typings.voximplantWebsdk.mod.IMEvents.MessageRemoved & Double = js.native
      
      /* 25 */ val MessageStatus: typings.voximplantWebsdk.mod.IMEvents.MessageStatus & Double = js.native
      
      /* 26 */ val PresenceUpdate: typings.voximplantWebsdk.mod.IMEvents.PresenceUpdate & Double = js.native
      
      /* 27 */ val RosterItemChange: typings.voximplantWebsdk.mod.IMEvents.RosterItemChange & Double = js.native
      
      /* 28 */ val RosterPresenceUpdate: typings.voximplantWebsdk.mod.IMEvents.RosterPresenceUpdate & Double = js.native
      
      /* 29 */ val RosterReceived: typings.voximplantWebsdk.mod.IMEvents.RosterReceived & Double = js.native
      
      /* 30 */ val SubscriptionRequest: typings.voximplantWebsdk.mod.IMEvents.SubscriptionRequest & Double = js.native
      
      /* 31 */ val SystemError: typings.voximplantWebsdk.mod.IMEvents.SystemError & Double = js.native
      
      /* 32 */ val UCConnected: typings.voximplantWebsdk.mod.IMEvents.UCConnected & Double = js.native
      
      /* 33 */ val UCDisconnected: typings.voximplantWebsdk.mod.IMEvents.UCDisconnected & Double = js.native
    }
    
    @JSGlobal("VoxImplant.MessageEventType")
    @js.native
    object MessageEventType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.voximplantWebsdk.mod.MessageEventType & Double] = js.native
      
      /* 0 */ val Cancel: typings.voximplantWebsdk.mod.MessageEventType.Cancel & Double = js.native
      
      /* 1 */ val Composing: typings.voximplantWebsdk.mod.MessageEventType.Composing & Double = js.native
      
      /* 2 */ val Delivered: typings.voximplantWebsdk.mod.MessageEventType.Delivered & Double = js.native
      
      /* 3 */ val Displayed: typings.voximplantWebsdk.mod.MessageEventType.Displayed & Double = js.native
      
      /* 4 */ val Invalid: typings.voximplantWebsdk.mod.MessageEventType.Invalid & Double = js.native
      
      /* 5 */ val Offline: typings.voximplantWebsdk.mod.MessageEventType.Offline & Double = js.native
    }
    
    @JSGlobal("VoxImplant.OperatorACDStatuses")
    @js.native
    object OperatorACDStatuses extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.voximplantWebsdk.mod.OperatorACDStatuses & Double] = js.native
      
      /* 0 */ val AfterService: typings.voximplantWebsdk.mod.OperatorACDStatuses.AfterService & Double = js.native
      
      /* 1 */ val DND: typings.voximplantWebsdk.mod.OperatorACDStatuses.DND & Double = js.native
      
      /* 2 */ val InService: typings.voximplantWebsdk.mod.OperatorACDStatuses.InService & Double = js.native
      
      /* 3 */ val Offline: typings.voximplantWebsdk.mod.OperatorACDStatuses.Offline & Double = js.native
      
      /* 4 */ val Online: typings.voximplantWebsdk.mod.OperatorACDStatuses.Online & Double = js.native
      
      /* 5 */ val Ready: typings.voximplantWebsdk.mod.OperatorACDStatuses.Ready & Double = js.native
      
      /* 6 */ val Timeout: typings.voximplantWebsdk.mod.OperatorACDStatuses.Timeout & Double = js.native
    }
    
    @JSGlobal("VoxImplant.RosterItemEvent")
    @js.native
    object RosterItemEvent extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.voximplantWebsdk.mod.RosterItemEvent & Double] = js.native
      
      /* 0 */ val Added: typings.voximplantWebsdk.mod.RosterItemEvent.Added & Double = js.native
      
      /* 1 */ val Removed: typings.voximplantWebsdk.mod.RosterItemEvent.Removed & Double = js.native
      
      /* 2 */ val Subscribed: typings.voximplantWebsdk.mod.RosterItemEvent.Subscribed & Double = js.native
      
      /* 3 */ val Unsubscribed: typings.voximplantWebsdk.mod.RosterItemEvent.Unsubscribed & Double = js.native
      
      /* 4 */ val Updated: typings.voximplantWebsdk.mod.RosterItemEvent.Updated & Double = js.native
    }
    
    @JSGlobal("VoxImplant.SubscriptionRequestType")
    @js.native
    object SubscriptionRequestType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.voximplantWebsdk.mod.SubscriptionRequestType & Double] = js.native
      
      /* 0 */ val Subscribe: typings.voximplantWebsdk.mod.SubscriptionRequestType.Subscribe & Double = js.native
      
      /* 1 */ val Unsubscribe: typings.voximplantWebsdk.mod.SubscriptionRequestType.Unsubscribe & Double = js.native
    }
    
    @JSGlobal("VoxImplant.UserStatuses")
    @js.native
    object UserStatuses extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.voximplantWebsdk.mod.UserStatuses & Double] = js.native
      
      /* 0 */ val Away: typings.voximplantWebsdk.mod.UserStatuses.Away & Double = js.native
      
      /* 1 */ val Chat: typings.voximplantWebsdk.mod.UserStatuses.Chat & Double = js.native
      
      /* 2 */ val DND: typings.voximplantWebsdk.mod.UserStatuses.DND & Double = js.native
      
      /* 3 */ val Offline: typings.voximplantWebsdk.mod.UserStatuses.Offline & Double = js.native
      
      /* 4 */ val Online: typings.voximplantWebsdk.mod.UserStatuses.Online & Double = js.native
      
      /* 5 */ val XA: typings.voximplantWebsdk.mod.UserStatuses.XA & Double = js.native
    }
    
    /**
      *    Get Client instance to use platform functions
      */
    inline def getInstance(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Client]
    
    /**
      *    VoxImplant Web SDK lib version
      */
    inline def version(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[String]
  }
}
