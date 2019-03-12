package typings
package winrtLib.WindowsNs.DevicesNs.PortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServiceDeviceStatics extends js.Object {
  def getDeviceSelector(serviceType: ServiceDeviceType): java.lang.String
  def getDeviceSelectorFromServiceId(serviceId: java.lang.String): java.lang.String
}

object IServiceDeviceStatics {
  @scala.inline
  def apply(
    getDeviceSelector: ServiceDeviceType => java.lang.String,
    getDeviceSelectorFromServiceId: java.lang.String => java.lang.String
  ): IServiceDeviceStatics = {
    val __obj = js.Dynamic.literal(getDeviceSelector = js.Any.fromFunction1(getDeviceSelector), getDeviceSelectorFromServiceId = js.Any.fromFunction1(getDeviceSelectorFromServiceId))
  
    __obj.asInstanceOf[IServiceDeviceStatics]
  }
}

