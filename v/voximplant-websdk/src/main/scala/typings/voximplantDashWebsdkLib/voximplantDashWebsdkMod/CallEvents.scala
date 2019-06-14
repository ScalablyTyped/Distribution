package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CallEvents extends js.Object

/**
	*	VoxImplant.Call events
	*/
@JSImport("voximplant-websdk", "CallEvents")
@js.native
object CallEvents extends js.Object {
  @js.native
  sealed trait Connected
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents
  
  @js.native
  sealed trait Disconnected
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents
  
  @js.native
  sealed trait Failed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents
  
  @js.native
  sealed trait ICETimeout
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents
  
  @js.native
  sealed trait InfoReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents
  
  @js.native
  sealed trait MessageReceived
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents
  
  @js.native
  sealed trait ProgressToneStart
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents
  
  @js.native
  sealed trait ProgressToneStop
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents
  
  @js.native
  sealed trait TransferComplete
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents
  
  @js.native
  sealed trait TransferFailed
    extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents
  
  /* 0 */ val Connected: Connected with scala.Double = js.native
  /* 1 */ val Disconnected: Disconnected with scala.Double = js.native
  /* 2 */ val Failed: Failed with scala.Double = js.native
  /* 3 */ val ICETimeout: ICETimeout with scala.Double = js.native
  /* 4 */ val InfoReceived: InfoReceived with scala.Double = js.native
  /* 5 */ val MessageReceived: MessageReceived with scala.Double = js.native
  /* 6 */ val ProgressToneStart: ProgressToneStart with scala.Double = js.native
  /* 7 */ val ProgressToneStop: ProgressToneStop with scala.Double = js.native
  /* 8 */ val TransferComplete: TransferComplete with scala.Double = js.native
  /* 9 */ val TransferFailed: TransferFailed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents with scala.Double] = js.native
}

