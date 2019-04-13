package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when progress tone playback stops
		*/
trait ProgressToneStop
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call
}

object ProgressToneStop {
  @scala.inline
  def apply(call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call): ProgressToneStop = {
    val __obj = js.Dynamic.literal(call = call)
  
    __obj.asInstanceOf[ProgressToneStop]
  }
}

