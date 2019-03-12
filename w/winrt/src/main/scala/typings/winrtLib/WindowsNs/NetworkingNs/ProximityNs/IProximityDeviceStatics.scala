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

object IProximityDeviceStatics {
  @scala.inline
  def apply(
    fromId: java.lang.String => ProximityDevice,
    getDefault: () => ProximityDevice,
    getDeviceSelector: () => java.lang.String
  ): IProximityDeviceStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = js.Any.fromFunction0(getDefault), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
  
    __obj.asInstanceOf[IProximityDeviceStatics]
  }
}

