package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched in case of network connection problem between 2 peers
		*/
trait ICETimeout extends js.Object {
  /**
  			*	Call that dispatched the event
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call
}

object ICETimeout {
  @scala.inline
  def apply(call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call): ICETimeout = {
    val __obj = js.Dynamic.literal(call = call)
  
    __obj.asInstanceOf[ICETimeout]
  }
}

