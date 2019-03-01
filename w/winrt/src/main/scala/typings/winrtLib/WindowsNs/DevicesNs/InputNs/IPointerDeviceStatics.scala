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
    getPointerDevice: js.Function1[scala.Double, PointerDevice],
    getPointerDevices: js.Function0[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PointerDevice]]
  ): IPointerDeviceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPointerDevice")(getPointerDevice)
    __obj.updateDynamic("getPointerDevices")(getPointerDevices)
    __obj.asInstanceOf[IPointerDeviceStatics]
  }
}

