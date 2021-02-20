package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CallEvents extends StObject
/**
  *    VoxImplant.Call events
  */
@JSImport("voximplant-websdk", "CallEvents")
@js.native
object CallEvents extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CallEvents with Double] = js.native
  
  @js.native
  sealed trait Connected extends CallEvents
  /* 0 */ val Connected: typings.voximplantWebsdk.mod.CallEvents.Connected with Double = js.native
  
  @js.native
  sealed trait Disconnected extends CallEvents
  /* 1 */ val Disconnected: typings.voximplantWebsdk.mod.CallEvents.Disconnected with Double = js.native
  
  @js.native
  sealed trait Failed extends CallEvents
  /* 2 */ val Failed: typings.voximplantWebsdk.mod.CallEvents.Failed with Double = js.native
  
  @js.native
  sealed trait ICETimeout extends CallEvents
  /* 3 */ val ICETimeout: typings.voximplantWebsdk.mod.CallEvents.ICETimeout with Double = js.native
  
  @js.native
  sealed trait InfoReceived extends CallEvents
  /* 4 */ val InfoReceived: typings.voximplantWebsdk.mod.CallEvents.InfoReceived with Double = js.native
  
  @js.native
  sealed trait MessageReceived extends CallEvents
  /* 5 */ val MessageReceived: typings.voximplantWebsdk.mod.CallEvents.MessageReceived with Double = js.native
  
  @js.native
  sealed trait ProgressToneStart extends CallEvents
  /* 6 */ val ProgressToneStart: typings.voximplantWebsdk.mod.CallEvents.ProgressToneStart with Double = js.native
  
  @js.native
  sealed trait ProgressToneStop extends CallEvents
  /* 7 */ val ProgressToneStop: typings.voximplantWebsdk.mod.CallEvents.ProgressToneStop with Double = js.native
  
  @js.native
  sealed trait TransferComplete extends CallEvents
  /* 8 */ val TransferComplete: typings.voximplantWebsdk.mod.CallEvents.TransferComplete with Double = js.native
  
  @js.native
  sealed trait TransferFailed extends CallEvents
  /* 9 */ val TransferFailed: typings.voximplantWebsdk.mod.CallEvents.TransferFailed with Double = js.native
}
