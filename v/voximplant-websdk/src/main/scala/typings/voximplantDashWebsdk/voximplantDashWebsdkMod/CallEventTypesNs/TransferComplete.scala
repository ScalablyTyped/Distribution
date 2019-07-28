package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Call
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when call has been transferred successfully
		*/
trait TransferComplete extends VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: Call
}

object TransferComplete {
  @scala.inline
  def apply(call: Call): TransferComplete = {
    val __obj = js.Dynamic.literal(call = call)
  
    __obj.asInstanceOf[TransferComplete]
  }
}

