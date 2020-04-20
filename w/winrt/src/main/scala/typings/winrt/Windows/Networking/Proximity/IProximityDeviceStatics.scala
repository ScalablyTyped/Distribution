package typings.winrt.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProximityDeviceStatics extends js.Object {
  def fromId(deviceInterfaceId: String): ProximityDevice
  def getDefault(): ProximityDevice
  def getDeviceSelector(): String
}

object IProximityDeviceStatics {
  @scala.inline
  def apply(
    fromId: String => ProximityDevice,
    getDefault: () => ProximityDevice,
    getDeviceSelector: () => String
  ): IProximityDeviceStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = js.Any.fromFunction0(getDefault), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
    __obj.asInstanceOf[IProximityDeviceStatics]
  }
}

