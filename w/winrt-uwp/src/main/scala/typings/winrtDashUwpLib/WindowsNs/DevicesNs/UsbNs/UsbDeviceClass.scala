package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the app to get an Advanced Query Syntax (AQS) string by specifying the class code, subclass code, and the protocol code defined by the device. The properties in this class are passed in the call to GetDeviceClassSelector . */
@JSGlobal("Windows.Devices.Usb.UsbDeviceClass")
@js.native
/** Creates a UsbDeviceClass object. */
class UsbDeviceClass () extends js.Object {
  /** Gets or sets the class code of the device. */
  var classCode: scala.Double = js.native
  /** Gets or sets the protocol code of the device. */
  var protocolCode: scala.Double = js.native
  /** Gets or sets the subclass code of the device. */
  var subclassCode: scala.Double = js.native
}

