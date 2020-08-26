package typings.winrtUwp.global.Windows.Devices.Usb

import typings.winrtUwp.anon.ParsedUsbInterfaceDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a USB alternate setting (of an interface) in an interface descriptor. For an explanation of an interface descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
@JSGlobal("Windows.Devices.Usb.UsbInterfaceDescriptor")
@js.native
abstract class UsbInterfaceDescriptor ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor

/* static members */
@JSGlobal("Windows.Devices.Usb.UsbInterfaceDescriptor")
@js.native
object UsbInterfaceDescriptor extends js.Object {
  /**
    * Parses the specified USB descriptor and returns alternate setting information in a UsbInterfaceDescriptor object.
    * @param descriptor A UsbDescriptor object that contains the USB interface descriptor.
    * @return A UsbInterfaceDescriptor object describes the alternate setting.
    */
  def parse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor = js.native
  /**
    * Retrieves information about the alternate setting in a UsbInterfaceDescriptor object that is contained in a UsbDescriptor object.
    * @param descriptor The UsbDescriptor object to parse.
    */
  def tryParse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): ParsedUsbInterfaceDescriptor = js.native
}

