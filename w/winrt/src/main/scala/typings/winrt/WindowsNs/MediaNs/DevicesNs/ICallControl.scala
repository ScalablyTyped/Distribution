package typings.winrt.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallControl extends js.Object {
  var hasRinger: Boolean
  var onanswerrequested: js.Any
  var onaudiotransferrequested: js.Any
  var ondialrequested: js.Any
  var onhanguprequested: js.Any
  var onkeypadpressed: js.Any
  var onredialrequested: js.Any
  def endCall(callToken: Double): Unit
  def indicateActiveCall(callToken: Double): Unit
  def indicateNewIncomingCall(enableRinger: Boolean, callerId: String): Double
  def indicateNewOutgoingCall(): Double
}

object ICallControl {
  @scala.inline
  def apply(
    endCall: Double => Unit,
    hasRinger: Boolean,
    indicateActiveCall: Double => Unit,
    indicateNewIncomingCall: (Boolean, String) => Double,
    indicateNewOutgoingCall: () => Double,
    onanswerrequested: js.Any,
    onaudiotransferrequested: js.Any,
    ondialrequested: js.Any,
    onhanguprequested: js.Any,
    onkeypadpressed: js.Any,
    onredialrequested: js.Any
  ): ICallControl = {
    val __obj = js.Dynamic.literal(endCall = js.Any.fromFunction1(endCall), hasRinger = hasRinger, indicateActiveCall = js.Any.fromFunction1(indicateActiveCall), indicateNewIncomingCall = js.Any.fromFunction2(indicateNewIncomingCall), indicateNewOutgoingCall = js.Any.fromFunction0(indicateNewOutgoingCall), onanswerrequested = onanswerrequested, onaudiotransferrequested = onaudiotransferrequested, ondialrequested = ondialrequested, onhanguprequested = onhanguprequested, onkeypadpressed = onkeypadpressed, onredialrequested = onredialrequested)
  
    __obj.asInstanceOf[ICallControl]
  }
}

