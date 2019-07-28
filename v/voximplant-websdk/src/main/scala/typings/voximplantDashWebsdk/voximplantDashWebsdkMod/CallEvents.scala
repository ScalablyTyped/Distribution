package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

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
  sealed trait Connected extends CallEvents
  
  @js.native
  sealed trait Disconnected extends CallEvents
  
  @js.native
  sealed trait Failed extends CallEvents
  
  @js.native
  sealed trait ICETimeout extends CallEvents
  
  @js.native
  sealed trait InfoReceived extends CallEvents
  
  @js.native
  sealed trait MessageReceived extends CallEvents
  
  @js.native
  sealed trait ProgressToneStart extends CallEvents
  
  @js.native
  sealed trait ProgressToneStop extends CallEvents
  
  @js.native
  sealed trait TransferComplete extends CallEvents
  
  @js.native
  sealed trait TransferFailed extends CallEvents
  
  /* 0 */ val Connected: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.Connected with Double = js.native
  /* 1 */ val Disconnected: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.Disconnected with Double = js.native
  /* 2 */ val Failed: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.Failed with Double = js.native
  /* 3 */ val ICETimeout: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.ICETimeout with Double = js.native
  /* 4 */ val InfoReceived: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.InfoReceived with Double = js.native
  /* 5 */ val MessageReceived: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.MessageReceived with Double = js.native
  /* 6 */ val ProgressToneStart: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.ProgressToneStart with Double = js.native
  /* 7 */ val ProgressToneStop: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.ProgressToneStop with Double = js.native
  /* 8 */ val TransferComplete: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.TransferComplete with Double = js.native
  /* 9 */ val TransferFailed: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.TransferFailed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CallEvents with Double] = js.native
}

