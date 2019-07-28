package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Events extends js.Object

/**
	*	VoxImplant.Client general events
	*/
@JSImport("voximplant-websdk", "Events")
@js.native
object Events extends js.Object {
  @js.native
  sealed trait AuthResult extends Events
  
  @js.native
  sealed trait ConnectionClosed extends Events
  
  @js.native
  sealed trait ConnectionEstablished extends Events
  
  @js.native
  sealed trait ConnectionFailed extends Events
  
  @js.native
  sealed trait IncomingCall extends Events
  
  @js.native
  sealed trait MicAccessResult extends Events
  
  @js.native
  sealed trait NetStatsReceived extends Events
  
  @js.native
  sealed trait PlaybackFinished extends Events
  
  @js.native
  sealed trait SDKReady extends Events
  
  @js.native
  sealed trait SourcesInfoUpdated extends Events
  
  /* 0 */ val AuthResult: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.AuthResult with Double = js.native
  /* 1 */ val ConnectionClosed: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.ConnectionClosed with Double = js.native
  /* 2 */ val ConnectionEstablished: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.ConnectionEstablished with Double = js.native
  /* 3 */ val ConnectionFailed: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.ConnectionFailed with Double = js.native
  /* 4 */ val IncomingCall: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.IncomingCall with Double = js.native
  /* 5 */ val MicAccessResult: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.MicAccessResult with Double = js.native
  /* 6 */ val NetStatsReceived: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.NetStatsReceived with Double = js.native
  /* 7 */ val PlaybackFinished: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.PlaybackFinished with Double = js.native
  /* 8 */ val SDKReady: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.SDKReady with Double = js.native
  /* 9 */ val SourcesInfoUpdated: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.SourcesInfoUpdated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Events with Double] = js.native
}

