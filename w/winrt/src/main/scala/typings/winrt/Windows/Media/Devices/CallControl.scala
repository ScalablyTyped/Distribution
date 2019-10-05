package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Devices.CallControl")
@js.native
class CallControl () extends ICallControl {
  /* CompleteClass */
  override var hasRinger: Boolean = js.native
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
  override def endCall(callToken: Double): Unit = js.native
  /* CompleteClass */
  override def indicateActiveCall(callToken: Double): Unit = js.native
  /* CompleteClass */
  override def indicateNewIncomingCall(enableRinger: Boolean, callerId: String): Double = js.native
  /* CompleteClass */
  override def indicateNewOutgoingCall(): Double = js.native
}

/* static members */
@JSGlobal("Windows.Media.Devices.CallControl")
@js.native
object CallControl extends js.Object {
  def fromId(deviceInterfaceId: String): CallControl = js.native
  def getDefault(): CallControl = js.native
}

