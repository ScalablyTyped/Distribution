package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CallEvents extends js.Object

/**
	*	VoxImplant.Call events
	*/
@JSImport("voximplant-websdk/VoxImplant", "CallEvents")
@js.native
object CallEvents extends js.Object {
  @js.native
  sealed trait Connected
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEvents
  
  @js.native
  sealed trait Disconnected
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEvents
  
  @js.native
  sealed trait Failed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEvents
  
  @js.native
  sealed trait ICETimeout
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEvents
  
  @js.native
  sealed trait InfoReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEvents
  
  @js.native
  sealed trait MessageReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEvents
  
  @js.native
  sealed trait ProgressToneStart
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEvents
  
  @js.native
  sealed trait ProgressToneStop
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEvents
  
  @js.native
  sealed trait TransferComplete
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEvents
  
  @js.native
  sealed trait TransferFailed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEvents
  
}

