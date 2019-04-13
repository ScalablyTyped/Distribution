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
  
  val Connected: Connected with java.lang.String = js.native
  val Disconnected: Disconnected with java.lang.String = js.native
  val Failed: Failed with java.lang.String = js.native
  val ICETimeout: ICETimeout with java.lang.String = js.native
  val InfoReceived: InfoReceived with java.lang.String = js.native
  val MessageReceived: MessageReceived with java.lang.String = js.native
  val ProgressToneStart: ProgressToneStart with java.lang.String = js.native
  val ProgressToneStop: ProgressToneStop with java.lang.String = js.native
  val TransferComplete: TransferComplete with java.lang.String = js.native
  val TransferFailed: TransferFailed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEvents with java.lang.String] = js.native
}

