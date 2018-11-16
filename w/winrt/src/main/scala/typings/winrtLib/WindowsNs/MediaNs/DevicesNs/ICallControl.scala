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

