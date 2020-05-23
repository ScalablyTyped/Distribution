package typings.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a USB alternate setting (of an interface) in an interface descriptor. For an explanation of an interface descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
trait UsbInterfaceDescriptor extends js.Object {
  /** Gets the bAlternateSetting field of the USB interface descriptor. The value is a number that identifies the alternate setting defined by the interface. */
  var alternateSettingNumber: Double
  /** Gets the bInterfaceClass field of the USB interface descriptor. The value indicates the USB-defined class to which the interface conforms. */
  var classCode: Double
  /** Gets the bInterfaceNumber field of the USB interface descriptor. The value is the index that identifies the interface. */
  var interfaceNumber: Double
  /** Gets the bInterfaceProtocol field of the interface descriptor. The value is a USB-assigned identifier that specifies a USB-defined protocol to which the interface conforms. */
  var protocolCode: Double
  /** Gets the bInterfaceSubClass field of the USB interface descriptor. The value is a USB-assigned identifier that specifies a USB-defined subclass to which the interface. */
  var subclassCode: Double
}

object UsbInterfaceDescriptor {
  @scala.inline
  def apply(
    alternateSettingNumber: Double,
    classCode: Double,
    interfaceNumber: Double,
    protocolCode: Double,
    subclassCode: Double
  ): UsbInterfaceDescriptor = {
    val __obj = js.Dynamic.literal(alternateSettingNumber = alternateSettingNumber.asInstanceOf[js.Any], classCode = classCode.asInstanceOf[js.Any], interfaceNumber = interfaceNumber.asInstanceOf[js.Any], protocolCode = protocolCode.asInstanceOf[js.Any], subclassCode = subclassCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterfaceDescriptor]
  }
}

