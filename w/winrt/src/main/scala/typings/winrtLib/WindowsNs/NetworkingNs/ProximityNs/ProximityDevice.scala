package typings
package winrtLib.WindowsNs.NetworkingNs.ProximityNs

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
  def fromId(deviceInterfaceId: java.lang.String): winrtLib.WindowsNs.NetworkingNs.ProximityNs.ProximityDevice = js.native
  def getDefault(): winrtLib.WindowsNs.NetworkingNs.ProximityNs.ProximityDevice = js.native
  def getDeviceSelector(): java.lang.String = js.native
}

