package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.CallEventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when INFO message is received
		*/
trait InfoReceived
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantCallEvent {
  /**
  			*	Content of the message
  			*/
  var body: java.lang.String
  /**
  			*	Call that dispatched the event
  			*/
  var call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call
  /**
  			*	Optional SIP headers received with the message
  			*/
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
  			*	MIME type of INFO message
  			*/
  var mimeType: java.lang.String
}

object InfoReceived {
  @scala.inline
  def apply(
    body: java.lang.String,
    call: voximplantDashWebsdkLib.voximplantDashWebsdkMod.Call,
    mimeType: java.lang.String,
    headers: js.Object = null
  ): InfoReceived = {
    val __obj = js.Dynamic.literal(body = body, call = call, mimeType = mimeType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[InfoReceived]
  }
}

