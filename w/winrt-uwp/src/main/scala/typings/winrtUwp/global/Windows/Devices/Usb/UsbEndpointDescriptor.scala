package typings.winrtUwp.global.Windows.Devices.Usb

import typings.winrtUwp.anon.ParsedReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Derives information from the USB endpoint descriptor of the endpoint, such as type, direction, and endpoint number. This object also gets the specific endpoint descriptors based on the type of endpoint. For an explanation of an endpoint descriptor, see Section 9.6.5 in the Universal Serial Bus Specification: */
@JSGlobal("Windows.Devices.Usb.UsbEndpointDescriptor")
@js.native
abstract class UsbEndpointDescriptor ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor {
  /** Gets an object that represents the endpoint descriptor for the USB bulk IN endpoint. */
  /* CompleteClass */
  override var asBulkInEndpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbBulkInEndpointDescriptor = js.native
  /** Gets an object that represents the endpoint descriptor for the USB bulk OUT endpoint. */
  /* CompleteClass */
  override var asBulkOutEndpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutEndpointDescriptor = js.native
  /** Gets an object that represents the endpoint descriptor for the USB interrupt IN endpoint. */
  /* CompleteClass */
  override var asInterruptInEndpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInEndpointDescriptor = js.native
  /** Gets an object that represents the endpoint descriptor for the USB interrupt OUT endpoint. */
  /* CompleteClass */
  override var asInterruptOutEndpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor = js.native
  /** Gets the direction of the USB endpoint. */
  /* CompleteClass */
  override var direction: typings.winrtUwp.Windows.Devices.Usb.UsbTransferDirection = js.native
  /** Gets the USB endpoint number. */
  /* CompleteClass */
  override var endpointNumber: Double = js.native
  /** Gets the type of USB endpoint. */
  /* CompleteClass */
  override var endpointType: typings.winrtUwp.Windows.Devices.Usb.UsbEndpointType = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Usb.UsbEndpointDescriptor")
@js.native
object UsbEndpointDescriptor extends js.Object {
  /**
    * Parses the specified USB descriptor and returns the USB endpoint descriptor in a UsbEndpointDescriptor object.
    * @param descriptor A UsbDescriptor object that contains the USB endpoint descriptor.
    * @return A UsbEndpointDescriptor object that contains the USB endpoint descriptor.
    */
  def parse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): typings.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor = js.native
  /**
    * Retrieves the USB endpoint descriptor in a UsbEndpointDescriptor object that is contained in a UsbDescriptor object.
    * @param descriptor The UsbDescriptor object to parse.
    */
  def tryParse(descriptor: typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor): ParsedReturnValue = js.native
}

