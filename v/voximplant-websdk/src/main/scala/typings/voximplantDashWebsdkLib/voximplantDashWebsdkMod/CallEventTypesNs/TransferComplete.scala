package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when call has been transferred successfully
		*/
trait TransferComplete
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call
}

object TransferComplete {
  @scala.inline
  def apply(call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call): TransferComplete = {
    val __obj = js.Dynamic.literal(call = call)
  
    __obj.asInstanceOf[TransferComplete]
  }
}

