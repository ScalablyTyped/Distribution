package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.EventTypesNs

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched after user interaction with the mic access dialog.
		*/
trait MicAccessResult extends VoxImplantEvent {
  /**
  			*	True is access was allowed, false - otherwise
  			*/
  var result: Boolean
}

object MicAccessResult {
  @scala.inline
  def apply(result: Boolean): MicAccessResult = {
    val __obj = js.Dynamic.literal(result = result)
  
    __obj.asInstanceOf[MicAccessResult]
  }
}

