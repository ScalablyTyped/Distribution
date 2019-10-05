package typings.winrtDashUwp.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the context for the printer extension object. */
@JSGlobal("Windows.Devices.Printers.Extensions.PrintExtensionContext")
@js.native
abstract class PrintExtensionContext () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.Printers.Extensions.PrintExtensionContext")
@js.native
object PrintExtensionContext extends js.Object {
  /**
    * Gets the context for the printer extension object based on the DeviceInformation ID.
    * @param deviceId The device information ID for the print device.
    * @return Pointer to the context.
    */
  def fromDeviceId(deviceId: String): js.Any = js.native
}

