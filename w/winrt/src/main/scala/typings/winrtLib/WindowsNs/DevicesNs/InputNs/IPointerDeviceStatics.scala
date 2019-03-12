package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerDeviceStatics extends js.Object {
  def getPointerDevice(pointerId: scala.Double): PointerDevice
  def getPointerDevices(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PointerDevice]
}

object IPointerDeviceStatics {
  @scala.inline
  def apply(
    getPointerDevice: scala.Double => PointerDevice,
    getPointerDevices: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PointerDevice]
  ): IPointerDeviceStatics = {
    val __obj = js.Dynamic.literal(getPointerDevice = js.Any.fromFunction1(getPointerDevice), getPointerDevices = js.Any.fromFunction0(getPointerDevices))
  
    __obj.asInstanceOf[IPointerDeviceStatics]
  }
}

