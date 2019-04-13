package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when call transfer failed
		*/
trait TransferFailed
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call
}

object TransferFailed {
  @scala.inline
  def apply(call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call): TransferFailed = {
    val __obj = js.Dynamic.literal(call = call)
  
    __obj.asInstanceOf[TransferFailed]
  }
}

