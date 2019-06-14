package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

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
  sealed trait AuthResult
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events
  
  @js.native
  sealed trait ConnectionClosed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events
  
  @js.native
  sealed trait ConnectionEstablished
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events
  
  @js.native
  sealed trait ConnectionFailed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events
  
  @js.native
  sealed trait IncomingCall
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events
  
  @js.native
  sealed trait MicAccessResult
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events
  
  @js.native
  sealed trait NetStatsReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events
  
  @js.native
  sealed trait PlaybackFinished
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events
  
  @js.native
  sealed trait SDKReady
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events
  
  @js.native
  sealed trait SourcesInfoUpdated
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events
  
  /* 0 */ val AuthResult: AuthResult with scala.Double = js.native
  /* 1 */ val ConnectionClosed: ConnectionClosed with scala.Double = js.native
  /* 2 */ val ConnectionEstablished: ConnectionEstablished with scala.Double = js.native
  /* 3 */ val ConnectionFailed: ConnectionFailed with scala.Double = js.native
  /* 4 */ val IncomingCall: IncomingCall with scala.Double = js.native
  /* 5 */ val MicAccessResult: MicAccessResult with scala.Double = js.native
  /* 6 */ val NetStatsReceived: NetStatsReceived with scala.Double = js.native
  /* 7 */ val PlaybackFinished: PlaybackFinished with scala.Double = js.native
  /* 8 */ val SDKReady: SDKReady with scala.Double = js.native
  /* 9 */ val SourcesInfoUpdated: SourcesInfoUpdated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events with scala.Double] = js.native
}

