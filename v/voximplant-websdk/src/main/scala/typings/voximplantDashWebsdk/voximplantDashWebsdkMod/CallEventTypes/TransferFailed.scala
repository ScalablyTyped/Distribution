package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Call
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when call transfer failed
		*/
trait TransferFailed extends VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: Call
}

object TransferFailed {
  @scala.inline
  def apply(call: Call): TransferFailed = {
    val __obj = js.Dynamic.literal(call = call)
  
    __obj.asInstanceOf[TransferFailed]
  }
}

