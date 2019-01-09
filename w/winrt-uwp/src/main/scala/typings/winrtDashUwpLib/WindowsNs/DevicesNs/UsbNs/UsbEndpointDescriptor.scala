package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Derives information from the USB endpoint descriptor of the endpoint, such as type, direction, and endpoint number. This object also gets the specific endpoint descriptors based on the type of endpoint. For an explanation of an endpoint descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
@JSGlobal("Windows.Devices.Usb.UsbEndpointDescriptor")
@js.native
abstract class UsbEndpointDescriptor () extends js.Object {
  /** Gets an object that represents the endpoint descriptor for the USB bulk IN endpoint. */
  var asBulkInEndpointDescriptor: UsbBulkInEndpointDescriptor = js.native
  /** Gets an object that represents the endpoint descriptor for the USB bulk OUT endpoint. */
  var asBulkOutEndpointDescriptor: UsbBulkOutEndpointDescriptor = js.native
  /** Gets an object that represents the endpoint descriptor for the USB interrupt IN endpoint. */
  var asInterruptInEndpointDescriptor: UsbInterruptInEndpointDescriptor = js.native
  /** Gets an object that represents the endpoint descriptor for the USB interrupt OUT endpoint. */
  var asInterruptOutEndpointDescriptor: UsbInterruptOutEndpointDescriptor = js.native
  /** Gets the direction of the USB endpoint. */
  var direction: UsbTransferDirection = js.native
  /** Gets the USB endpoint number. */
  var endpointNumber: scala.Double = js.native
  /** Gets the type of USB endpoint. */
  var endpointType: UsbEndpointType = js.native
}

/** Derives information from the USB endpoint descriptor of the endpoint, such as type, direction, and endpoint number. This object also gets the specific endpoint descriptors based on the type of endpoint. For an explanation of an endpoint descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
@JSGlobal("Windows.Devices.Usb.UsbEndpointDescriptor")
@js.native
object UsbEndpointDescriptor extends js.Object {
  /**
    * Parses the specified USB descriptor and returns the USB endpoint descriptor in a UsbEndpointDescriptor object.
    * @param descriptor A UsbDescriptor object that contains the USB endpoint descriptor.
    * @return A UsbEndpointDescriptor object that contains the USB endpoint descriptor.
    */
  def parse(descriptor: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbDescriptor): winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbEndpointDescriptor = js.native
  /**
    * Retrieves the USB endpoint descriptor in a UsbEndpointDescriptor object that is contained in a UsbDescriptor object.
    * @param descriptor The UsbDescriptor object to parse.
    */
  def tryParse(descriptor: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbDescriptor): winrtDashUwpLib.Anon_ParsedReturnValue = js.native
}

