package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when progress tone playback stops
		*/
trait ProgressToneStop
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call
}

object ProgressToneStop {
  @scala.inline
  def apply(call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call): ProgressToneStop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("call")(call)
    __obj.asInstanceOf[ProgressToneStop]
  }
}

