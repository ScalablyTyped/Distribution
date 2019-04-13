package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when text message is received
		*/
trait MessageReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call
  /**
  			*	Content of the message
  			*/
  var text: java.lang.String
}

object MessageReceived {
  @scala.inline
  def apply(call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call, text: java.lang.String): MessageReceived = {
    val __obj = js.Dynamic.literal(call = call, text = text)
  
    __obj.asInstanceOf[MessageReceived]
  }
}

