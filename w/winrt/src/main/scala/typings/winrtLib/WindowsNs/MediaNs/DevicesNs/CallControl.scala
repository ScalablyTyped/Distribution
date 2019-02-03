package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Devices.CallControl")
@js.native
class CallControl () extends ICallControl {
  /* CompleteClass */
  override var hasRinger: scala.Boolean = js.native
  /* CompleteClass */
  override var onanswerrequested: js.Any = js.native
  /* CompleteClass */
  override var onaudiotransferrequested: js.Any = js.native
  /* CompleteClass */
  override var ondialrequested: js.Any = js.native
  /* CompleteClass */
  override var onhanguprequested: js.Any = js.native
  /* CompleteClass */
  override var onkeypadpressed: js.Any = js.native
  /* CompleteClass */
  override var onredialrequested: js.Any = js.native
  /* CompleteClass */
  override def endCall(callToken: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def indicateActiveCall(callToken: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def indicateNewIncomingCall(enableRinger: scala.Boolean, callerId: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def indicateNewOutgoingCall(): scala.Double = js.native
}

/* static members */
@JSGlobal("Windows.Media.Devices.CallControl")
@js.native
object CallControl extends js.Object {
  def fromId(deviceInterfaceId: java.lang.String): winrtLib.WindowsNs.MediaNs.DevicesNs.CallControl = js.native
  def getDefault(): winrtLib.WindowsNs.MediaNs.DevicesNs.CallControl = js.native
}

