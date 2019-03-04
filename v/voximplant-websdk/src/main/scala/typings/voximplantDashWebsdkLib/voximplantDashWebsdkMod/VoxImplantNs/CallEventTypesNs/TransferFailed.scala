package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when call transfer failed
		*/
trait TransferFailed
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call
}

object TransferFailed {
  @scala.inline
  def apply(call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call): TransferFailed = {
    val __obj = js.Dynamic.literal(call = call)
  
    __obj.asInstanceOf[TransferFailed]
  }
}

