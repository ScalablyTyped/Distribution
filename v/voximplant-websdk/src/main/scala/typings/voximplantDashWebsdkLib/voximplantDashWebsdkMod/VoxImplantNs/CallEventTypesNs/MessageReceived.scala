package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.CallEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when text message is received
		*/
trait MessageReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call
  /**
  			*	Content of the message
  			*/
  var text: java.lang.String
}

object MessageReceived {
  @scala.inline
  def apply(call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.Call, text: java.lang.String): MessageReceived = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("call")(call)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MessageReceived]
  }
}

