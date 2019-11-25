package typings.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes

import typings.voximplantDashWebsdk.voximplantDashWebsdkMod.Call
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
  var call: Call
}

object ICETimeout {
  @scala.inline
  def apply(call: Call): ICETimeout = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICETimeout]
  }
}

