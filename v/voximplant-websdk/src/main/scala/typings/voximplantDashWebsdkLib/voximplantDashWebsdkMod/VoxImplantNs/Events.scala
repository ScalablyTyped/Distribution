package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Events extends js.Object

/**
	*	VoxImplant.Client general events
	*/
@JSImport("voximplant-websdk/VoxImplant", "Events")
@js.native
object Events extends js.Object {
  @js.native
  sealed trait AuthResult
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Events
  
  @js.native
  sealed trait ConnectionClosed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Events
  
  @js.native
  sealed trait ConnectionEstablished
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Events
  
  @js.native
  sealed trait ConnectionFailed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Events
  
  @js.native
  sealed trait IncomingCall
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Events
  
  @js.native
  sealed trait MicAccessResult
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Events
  
  @js.native
  sealed trait NetStatsReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Events
  
  @js.native
  sealed trait PlaybackFinished
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Events
  
  @js.native
  sealed trait SDKReady
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Events
  
  @js.native
  sealed trait SourcesInfoUpdated
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Events
  
}

