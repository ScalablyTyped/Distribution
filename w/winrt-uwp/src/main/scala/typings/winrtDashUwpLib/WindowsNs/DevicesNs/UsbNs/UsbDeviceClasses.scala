package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the app to create a UsbDeviceClass object by specifying the USB device class of the device. The properties defined in this class represent the supported USB device classes and are passed in the constructor call to instantiate UsbDeviceClass. For information about USB device classes, see the official USB Website for Approved Class Specification Documents. */
@JSGlobal("Windows.Devices.Usb.UsbDeviceClasses")
@js.native
abstract class UsbDeviceClasses () extends js.Object

/** Provides a way for the app to create a UsbDeviceClass object by specifying the USB device class of the device. The properties defined in this class represent the supported USB device classes and are passed in the constructor call to instantiate UsbDeviceClass. For information about USB device classes, see the official USB Website for Approved Class Specification Documents. */
@JSGlobal("Windows.Devices.Usb.UsbDeviceClasses")
@js.native
object UsbDeviceClasses extends js.Object {
  /** Gets the device class object for the device that conforms to the Active Sync device class. */
  var activeSync: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbDeviceClass = js.native
  /** Gets the device class object for the device that conforms to the Communication Device Class (CDC). */
  var cdcControl: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbDeviceClass = js.native
  /** Gets the device class object for the device that conforms to the Device Firmware Update device class. */
  var deviceFirmwareUpdate: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbDeviceClass = js.native
  /** Gets the device class object for an infrared transceiver that conforms to the IrDA class defined as per the IrDA Bridge Device Definition 1.0 specification. */
  var irda: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbDeviceClass = js.native
  /** Gets the device class object for a device that conforms to the USB test and measurement class (USBTMC). */
  var measurement: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbDeviceClass = js.native
  /** Gets the device class object for the device that conforms to the Palm Sync device class. */
  var palmSync: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbDeviceClass = js.native
  /** Gets the device class object for a device that conforms to the USB Personal Healthcare Device Class (PHDC). */
  var personalHealthcare: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbDeviceClass = js.native
  /** Gets the device class object for a device that conforms to the Physical Interface Devices (PID) specification. */
  var physical: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbDeviceClass = js.native
  /** Gets the device class object for a custom device that has 0xFF class code. This indicates that the device does not belong to a class approved by USB-IF. */
  var vendorSpecific: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbDeviceClass = js.native
}

