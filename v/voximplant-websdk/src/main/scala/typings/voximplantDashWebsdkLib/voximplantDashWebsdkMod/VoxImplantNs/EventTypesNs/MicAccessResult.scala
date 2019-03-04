package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.EventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched after user interaction with the mic access dialog.
		*/
trait MicAccessResult
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantEvent {
  /**
  			*	True is access was allowed, false - otherwise
  			*/
  var result: scala.Boolean
}

object MicAccessResult {
  @scala.inline
  def apply(result: scala.Boolean): MicAccessResult = {
    val __obj = js.Dynamic.literal(result = result)
  
    __obj.asInstanceOf[MicAccessResult]
  }
}

