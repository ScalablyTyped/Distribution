package typings
package winrtLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IProximityDeviceStatics extends js.Object {
  def fromId(deviceInterfaceId: java.lang.String): ProximityDevice
  def getDefault(): ProximityDevice
  def getDeviceSelector(): java.lang.String
}

