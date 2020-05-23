package typings.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the app to get an Advanced Query Syntax (AQS) string by specifying the class code, subclass code, and the protocol code defined by the device. The properties in this class are passed in the call to GetDeviceClassSelector . */
trait UsbDeviceClass extends js.Object {
  /** Gets or sets the class code of the device. */
  var classCode: Double
  /** Gets or sets the protocol code of the device. */
  var protocolCode: Double
  /** Gets or sets the subclass code of the device. */
  var subclassCode: Double
}

object UsbDeviceClass {
  @scala.inline
  def apply(classCode: Double, protocolCode: Double, subclassCode: Double): UsbDeviceClass = {
    val __obj = js.Dynamic.literal(classCode = classCode.asInstanceOf[js.Any], protocolCode = protocolCode.asInstanceOf[js.Any], subclassCode = subclassCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbDeviceClass]
  }
}

