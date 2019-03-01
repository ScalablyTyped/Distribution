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
    getDeviceSelector: js.Function1[ServiceDeviceType, java.lang.String],
    getDeviceSelectorFromServiceId: js.Function1[java.lang.String, java.lang.String]
  ): IServiceDeviceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDeviceSelector")(getDeviceSelector)
    __obj.updateDynamic("getDeviceSelectorFromServiceId")(getDeviceSelectorFromServiceId)
    __obj.asInstanceOf[IServiceDeviceStatics]
  }
}

