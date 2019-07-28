package typings.winrt.WindowsNs.DevicesNs.PortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Portable.ServiceDevice")
@js.native
class ServiceDevice () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.Portable.ServiceDevice")
@js.native
object ServiceDevice extends js.Object {
  def getDeviceSelector(serviceType: ServiceDeviceType): String = js.native
  def getDeviceSelectorFromServiceId(serviceId: String): String = js.native
}

