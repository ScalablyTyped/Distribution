package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CallEvents extends js.Object

/**
  *    VoxImplant.Call events
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CallEvents with Double] = js.native
  /* 0 */ @js.native
  object Connected extends TopLevel[Connected with Double]
  
  /* 1 */ @js.native
  object Disconnected extends TopLevel[Disconnected with Double]
  
  /* 2 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 3 */ @js.native
  object ICETimeout extends TopLevel[ICETimeout with Double]
  
  /* 4 */ @js.native
  object InfoReceived extends TopLevel[InfoReceived with Double]
  
  /* 5 */ @js.native
  object MessageReceived extends TopLevel[MessageReceived with Double]
  
  /* 6 */ @js.native
  object ProgressToneStart extends TopLevel[ProgressToneStart with Double]
  
  /* 7 */ @js.native
  object ProgressToneStop extends TopLevel[ProgressToneStop with Double]
  
  /* 8 */ @js.native
  object TransferComplete extends TopLevel[TransferComplete with Double]
  
  /* 9 */ @js.native
  object TransferFailed extends TopLevel[TransferFailed with Double]
  
}

