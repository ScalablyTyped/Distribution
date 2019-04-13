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
  
  val AuthResult: AuthResult with java.lang.String = js.native
  val ConnectionClosed: ConnectionClosed with java.lang.String = js.native
  val ConnectionEstablished: ConnectionEstablished with java.lang.String = js.native
  val ConnectionFailed: ConnectionFailed with java.lang.String = js.native
  val IncomingCall: IncomingCall with java.lang.String = js.native
  val MicAccessResult: MicAccessResult with java.lang.String = js.native
  val NetStatsReceived: NetStatsReceived with java.lang.String = js.native
  val PlaybackFinished: PlaybackFinished with java.lang.String = js.native
  val SDKReady: SDKReady with java.lang.String = js.native
  val SourcesInfoUpdated: SourcesInfoUpdated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[voximplantDashWebsdkLib.voximplantDashWebsdkMod.Events with java.lang.String] = js.native
}

