package typings.winrtDashUwp.WindowsNs.DevicesNs.PortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for identifying a device service for a portable device that supports WPD (Windows Portable Devices) for device enumeration. */
@JSGlobal("Windows.Devices.Portable.ServiceDevice")
@js.native
abstract class ServiceDevice () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.Portable.ServiceDevice")
@js.native
object ServiceDevice extends js.Object {
  /**
    * Returns an Advanced Query Syntax (AQS) string that is used to enumerate device services of the specified ServiceDeviceType . This string is passed to the FindAllAsync or CreateWatcher method.
    * @param serviceType The type of service to identify.
    * @return The AQS string.
    */
  def getDeviceSelector(serviceType: ServiceDeviceType): String = js.native
  /**
    * An Advanced Query Syntax (AQS) string for identifying a device service by its GUIDs. This string is passed to the FindAllAsync or CreateWatcher method.
    * @param serviceId The service identifier.
    * @return The AQS string.
    */
  def getDeviceSelectorFromServiceId(serviceId: String): String = js.native
}

