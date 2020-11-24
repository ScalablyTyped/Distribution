package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CallEvents extends js.Object
/**
  *    VoxImplant.Call events
  */
@JSImport("voximplant-websdk", "CallEvents")
@js.native
object CallEvents extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CallEvents with Double] = js.native
  
  @js.native
  sealed trait Connected extends CallEvents
  /* 0 */ @js.native
  object Connected extends TopLevel[Connected with Double]
  
  @js.native
  sealed trait Disconnected extends CallEvents
  /* 1 */ @js.native
  object Disconnected extends TopLevel[Disconnected with Double]
  
  @js.native
  sealed trait Failed extends CallEvents
  /* 2 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  @js.native
  sealed trait ICETimeout extends CallEvents
  /* 3 */ @js.native
  object ICETimeout extends TopLevel[ICETimeout with Double]
  
  @js.native
  sealed trait InfoReceived extends CallEvents
  /* 4 */ @js.native
  object InfoReceived extends TopLevel[InfoReceived with Double]
  
  @js.native
  sealed trait MessageReceived extends CallEvents
  /* 5 */ @js.native
  object MessageReceived extends TopLevel[MessageReceived with Double]
  
  @js.native
  sealed trait ProgressToneStart extends CallEvents
  /* 6 */ @js.native
  object ProgressToneStart extends TopLevel[ProgressToneStart with Double]
  
  @js.native
  sealed trait ProgressToneStop extends CallEvents
  /* 7 */ @js.native
  object ProgressToneStop extends TopLevel[ProgressToneStop with Double]
  
  @js.native
  sealed trait TransferComplete extends CallEvents
  /* 8 */ @js.native
  object TransferComplete extends TopLevel[TransferComplete with Double]
  
  @js.native
  sealed trait TransferFailed extends CallEvents
  /* 9 */ @js.native
  object TransferFailed extends TopLevel[TransferFailed with Double]
}
