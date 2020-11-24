package typings.winrtUwp.global.Windows.Devices.Usb

import typings.winrtUwp.anon.Parsed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Derives information from the first 9 bytes of a USB configuration descriptor. The information includes the power capabilities of the device when the configuration is active and the number of interfaces included in that configuration. For an explanation of a configuration descriptor, Section 9.6.3 Universal Serial Bus Specification. For information about descriptor fields, see: */
@JSGlobal("Windows.Devices.Usb.UsbConfigurationDescriptor")
@js.native
abstract class UsbConfigurationDescriptor ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbConfigurationDescriptor
/* static members */
@JSGlobal("Windows.Devices.Usb.UsbConfigurationDescriptor")
@js.native
object UsbConfigurationDescriptor extends js.Object {
  
  /**
    * Parses the specified USB descriptor and returns fields of a USB configuration descriptor.
    * @param descriptor A UsbDescriptor object that contains first 9 bytes of the USB configuration descriptor.
    * @return A UsbConfigurationDescriptor object that contains fields of a USB configuration descriptor.
    */
  def parse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): typings.winrtUwp.Windows.Devices.Usb.UsbConfigurationDescriptor = js.native
  
  /**
    * Retrieves the first 9 bytes of a USB configuration descriptor in a UsbConfigurationDescriptor object that is contained in a UsbDescriptor object.
    * @param descriptor The UsbDescriptor object to parse.
    */
  def tryParse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): Parsed = js.native
}
