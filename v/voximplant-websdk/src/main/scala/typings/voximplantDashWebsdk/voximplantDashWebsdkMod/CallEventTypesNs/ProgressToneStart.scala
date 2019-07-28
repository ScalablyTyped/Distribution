package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Call
import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when progress tone playback starts
		*/
trait ProgressToneStart extends VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: Call
}

object ProgressToneStart {
  @scala.inline
  def apply(call: Call): ProgressToneStart = {
    val __obj = js.Dynamic.literal(call = call)
  
    __obj.asInstanceOf[ProgressToneStart]
  }
}

