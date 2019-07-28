package typings.winrt.WindowsNs.DevicesNs.InputNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerDeviceStatics extends js.Object {
  def getPointerDevice(pointerId: Double): PointerDevice
  def getPointerDevices(): IVectorView[PointerDevice]
}

object IPointerDeviceStatics {
  @scala.inline
  def apply(getPointerDevice: Double => PointerDevice, getPointerDevices: () => IVectorView[PointerDevice]): IPointerDeviceStatics = {
    val __obj = js.Dynamic.literal(getPointerDevice = js.Any.fromFunction1(getPointerDevice), getPointerDevices = js.Any.fromFunction0(getPointerDevices))
  
    __obj.asInstanceOf[IPointerDeviceStatics]
  }
}

