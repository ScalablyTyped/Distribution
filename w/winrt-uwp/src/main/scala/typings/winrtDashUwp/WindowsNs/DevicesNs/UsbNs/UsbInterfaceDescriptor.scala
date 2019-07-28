package typings.winrtDashUwp.WindowsNs.DevicesNs.UsbNs

import typings.winrtDashUwp.Anon_ParsedReturnValueBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a USB alternate setting (of an interface) in an interface descriptor. For an explanation of an interface descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
@JSGlobal("Windows.Devices.Usb.UsbInterfaceDescriptor")
@js.native
abstract class UsbInterfaceDescriptor () extends js.Object {
  /** Gets the bAlternateSetting field of the USB interface descriptor. The value is a number that identifies the alternate setting defined by the interface. */
  var alternateSettingNumber: Double = js.native
  /** Gets the bInterfaceClass field of the USB interface descriptor. The value indicates the USB-defined class to which the interface conforms. */
  var classCode: Double = js.native
  /** Gets the bInterfaceNumber field of the USB interface descriptor. The value is the index that identifies the interface. */
  var interfaceNumber: Double = js.native
  /** Gets the bInterfaceProtocol field of the interface descriptor. The value is a USB-assigned identifier that specifies a USB-defined protocol to which the interface conforms. */
  var protocolCode: Double = js.native
  /** Gets the bInterfaceSubClass field of the USB interface descriptor. The value is a USB-assigned identifier that specifies a USB-defined subclass to which the interface. */
  var subclassCode: Double = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Usb.UsbInterfaceDescriptor")
@js.native
object UsbInterfaceDescriptor extends js.Object {
  /**
    * Parses the specified USB descriptor and returns alternate setting information in a UsbInterfaceDescriptor object.
    * @param descriptor A UsbDescriptor object that contains the USB interface descriptor.
    * @return A UsbInterfaceDescriptor object describes the alternate setting.
    */
  def parse(descriptor: UsbDescriptor): UsbInterfaceDescriptor = js.native
  /**
    * Retrieves information about the alternate setting in a UsbInterfaceDescriptor object that is contained in a UsbDescriptor object.
    * @param descriptor The UsbDescriptor object to parse.
    */
  def tryParse(descriptor: UsbDescriptor): Anon_ParsedReturnValueBoolean = js.native
}

