package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def apply(value: Double): js.UndefOr[CallEvents & Double] = js.native
  
  @js.native
  sealed trait Connected
    extends StObject
       with CallEvents
  /* 0 */ val Connected: typings.voximplantWebsdk.mod.CallEvents.Connected & Double = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with CallEvents
  /* 1 */ val Disconnected: typings.voximplantWebsdk.mod.CallEvents.Disconnected & Double = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with CallEvents
  /* 2 */ val Failed: typings.voximplantWebsdk.mod.CallEvents.Failed & Double = js.native
  
  @js.native
  sealed trait ICETimeout
    extends StObject
       with CallEvents
  /* 3 */ val ICETimeout: typings.voximplantWebsdk.mod.CallEvents.ICETimeout & Double = js.native
  
  @js.native
  sealed trait InfoReceived
    extends StObject
       with CallEvents
  /* 4 */ val InfoReceived: typings.voximplantWebsdk.mod.CallEvents.InfoReceived & Double = js.native
  
  @js.native
  sealed trait MessageReceived
    extends StObject
       with CallEvents
  /* 5 */ val MessageReceived: typings.voximplantWebsdk.mod.CallEvents.MessageReceived & Double = js.native
  
  @js.native
  sealed trait ProgressToneStart
    extends StObject
       with CallEvents
  /* 6 */ val ProgressToneStart: typings.voximplantWebsdk.mod.CallEvents.ProgressToneStart & Double = js.native
  
  @js.native
  sealed trait ProgressToneStop
    extends StObject
       with CallEvents
  /* 7 */ val ProgressToneStop: typings.voximplantWebsdk.mod.CallEvents.ProgressToneStop & Double = js.native
  
  @js.native
  sealed trait TransferComplete
    extends StObject
       with CallEvents
  /* 8 */ val TransferComplete: typings.voximplantWebsdk.mod.CallEvents.TransferComplete & Double = js.native
  
  @js.native
  sealed trait TransferFailed
    extends StObject
       with CallEvents
  /* 9 */ val TransferFailed: typings.voximplantWebsdk.mod.CallEvents.TransferFailed & Double = js.native
}
