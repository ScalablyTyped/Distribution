package typings.winrt.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Proximity.ProximityDevice")
@js.native
class ProximityDevice () extends IProximityDevice

/* static members */
@JSGlobal("Windows.Networking.Proximity.ProximityDevice")
@js.native
object ProximityDevice extends js.Object {
  def fromId(deviceInterfaceId: String): ProximityDevice = js.native
  def getDefault(): ProximityDevice = js.native
  def getDeviceSelector(): String = js.native
}

