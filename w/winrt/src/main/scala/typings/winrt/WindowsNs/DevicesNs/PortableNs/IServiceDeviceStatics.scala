package typings.winrt.WindowsNs.DevicesNs.PortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServiceDeviceStatics extends js.Object {
  def getDeviceSelector(serviceType: ServiceDeviceType): String
  def getDeviceSelectorFromServiceId(serviceId: String): String
}

object IServiceDeviceStatics {
  @scala.inline
  def apply(getDeviceSelector: ServiceDeviceType => String, getDeviceSelectorFromServiceId: String => String): IServiceDeviceStatics = {
    val __obj = js.Dynamic.literal(getDeviceSelector = js.Any.fromFunction1(getDeviceSelector), getDeviceSelectorFromServiceId = js.Any.fromFunction1(getDeviceSelectorFromServiceId))
  
    __obj.asInstanceOf[IServiceDeviceStatics]
  }
}

