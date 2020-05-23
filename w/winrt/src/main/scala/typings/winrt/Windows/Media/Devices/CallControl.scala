package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallControl extends ICallControl

object CallControl {
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
  ): CallControl = {
    val __obj = js.Dynamic.literal(endCall = js.Any.fromFunction1(endCall), hasRinger = hasRinger.asInstanceOf[js.Any], indicateActiveCall = js.Any.fromFunction1(indicateActiveCall), indicateNewIncomingCall = js.Any.fromFunction2(indicateNewIncomingCall), indicateNewOutgoingCall = js.Any.fromFunction0(indicateNewOutgoingCall), onanswerrequested = onanswerrequested.asInstanceOf[js.Any], onaudiotransferrequested = onaudiotransferrequested.asInstanceOf[js.Any], ondialrequested = ondialrequested.asInstanceOf[js.Any], onhanguprequested = onhanguprequested.asInstanceOf[js.Any], onkeypadpressed = onkeypadpressed.asInstanceOf[js.Any], onredialrequested = onredialrequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallControl]
  }
}

