package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallControl extends js.Object {
  var hasRinger: scala.Boolean
  var onanswerrequested: js.Any
  var onaudiotransferrequested: js.Any
  var ondialrequested: js.Any
  var onhanguprequested: js.Any
  var onkeypadpressed: js.Any
  var onredialrequested: js.Any
  def endCall(callToken: scala.Double): scala.Unit
  def indicateActiveCall(callToken: scala.Double): scala.Unit
  def indicateNewIncomingCall(enableRinger: scala.Boolean, callerId: java.lang.String): scala.Double
  def indicateNewOutgoingCall(): scala.Double
}

object ICallControl {
  @scala.inline
  def apply(
    endCall: js.Function1[scala.Double, scala.Unit],
    hasRinger: scala.Boolean,
    indicateActiveCall: js.Function1[scala.Double, scala.Unit],
    indicateNewIncomingCall: js.Function2[scala.Boolean, java.lang.String, scala.Double],
    indicateNewOutgoingCall: js.Function0[scala.Double],
    onanswerrequested: js.Any,
    onaudiotransferrequested: js.Any,
    ondialrequested: js.Any,
    onhanguprequested: js.Any,
    onkeypadpressed: js.Any,
    onredialrequested: js.Any
  ): ICallControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endCall")(endCall)
    __obj.updateDynamic("hasRinger")(hasRinger)
    __obj.updateDynamic("indicateActiveCall")(indicateActiveCall)
    __obj.updateDynamic("indicateNewIncomingCall")(indicateNewIncomingCall)
    __obj.updateDynamic("indicateNewOutgoingCall")(indicateNewOutgoingCall)
    __obj.updateDynamic("onanswerrequested")(onanswerrequested)
    __obj.updateDynamic("onaudiotransferrequested")(onaudiotransferrequested)
    __obj.updateDynamic("ondialrequested")(ondialrequested)
    __obj.updateDynamic("onhanguprequested")(onhanguprequested)
    __obj.updateDynamic("onkeypadpressed")(onkeypadpressed)
    __obj.updateDynamic("onredialrequested")(onredialrequested)
    __obj.asInstanceOf[ICallControl]
  }
}

