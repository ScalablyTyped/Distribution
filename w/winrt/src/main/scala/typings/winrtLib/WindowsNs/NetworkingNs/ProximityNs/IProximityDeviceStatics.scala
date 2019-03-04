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
    fromId: js.Function1[java.lang.String, ProximityDevice],
    getDefault: js.Function0[ProximityDevice],
    getDeviceSelector: js.Function0[java.lang.String]
  ): IProximityDeviceStatics = {
    val __obj = js.Dynamic.literal(fromId = fromId, getDefault = getDefault, getDeviceSelector = getDeviceSelector)
  
    __obj.asInstanceOf[IProximityDeviceStatics]
  }
}

