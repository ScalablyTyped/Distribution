package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.AnonParsed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Derives information from the first 9 bytes of a USB configuration descriptor. The information includes the power capabilities of the device when the configuration is active and the number of interfaces included in that configuration. For an explanation of a configuration descriptor, Section 9.6.3 Universal Serial Bus Specification. For information about descriptor fields, see: */
@JSGlobal("Windows.Devices.Usb.UsbConfigurationDescriptor")
@js.native
abstract class UsbConfigurationDescriptor () extends js.Object {
  /** Gets the bConfigurationValue field of a USB configuration descriptor. The value is the number that identifies the configuration. */
  var configurationValue: Double = js.native
  /** Gets the bMaxPower field of a USB configuration descriptor. The value indicates the maximum power (in milliamp units) that the device can draw from the bus, when the device is bus-powered. */
  var maxPowerMilliamps: Double = js.native
  /** Gets the D5 bit value of the bmAttributes field in the USB configuration descriptor. The value indicates whether the device can send a resume signal to wake up itself or the host system from a low power state. */
  var remoteWakeup: Boolean = js.native
  /** Gets the D6 bit of the bmAttributes field in the USB configuration. This value indicates whether the device is drawing power from a local source or the bus. */
  var selfPowered: Boolean = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Usb.UsbConfigurationDescriptor")
@js.native
object UsbConfigurationDescriptor extends js.Object {
  /**
    * Parses the specified USB descriptor and returns fields of a USB configuration descriptor.
    * @param descriptor A UsbDescriptor object that contains first 9 bytes of the USB configuration descriptor.
    * @return A UsbConfigurationDescriptor object that contains fields of a USB configuration descriptor.
    */
  def parse(descriptor: UsbDescriptor): UsbConfigurationDescriptor = js.native
  /**
    * Retrieves the first 9 bytes of a USB configuration descriptor in a UsbConfigurationDescriptor object that is contained in a UsbDescriptor object.
    * @param descriptor The UsbDescriptor object to parse.
    */
  def tryParse(descriptor: UsbDescriptor): AnonParsed = js.native
}

