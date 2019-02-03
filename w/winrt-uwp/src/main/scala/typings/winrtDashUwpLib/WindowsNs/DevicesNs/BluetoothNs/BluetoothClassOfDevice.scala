package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to determine the Bluetooth Class Of Device (Bluetooth COD) information for a device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothClassOfDevice")
@js.native
abstract class BluetoothClassOfDevice () extends js.Object {
  /** Gets the Major Class code of the Bluetooth device. */
  var majorClass: BluetoothMajorClass = js.native
  /** Gets the Minor Class code of the device. */
  var minorClass: BluetoothMinorClass = js.native
  /** Gets the Bluetooth Class Of Device information, represented as an integer value. */
  var rawValue: scala.Double = js.native
  /** Gets the service capabilities of the device. */
  var serviceCapabilities: BluetoothServiceCapabilities = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothClassOfDevice")
@js.native
object BluetoothClassOfDevice extends js.Object {
  /**
    * Creates a BluetoothClassOfDevice object by supplying values for BluetoothMajorClass , BluetoothMinorClass and BluetoothClassOfDevice.
    * @param majorClass One of the enumeration values that specifies the device's main function.
    * @param minorClass One of the enumeration values that specifies the minor class value to be used.
    * @param serviceCapabilities One of the enumeration values that specifies the service the device supports.
    * @return A BluetoothClassOfDevice object.
    */
  def fromParts(
    majorClass: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMajorClass,
    minorClass: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothMinorClass,
    serviceCapabilities: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
  ): winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothClassOfDevice = js.native
  /**
    * Creates a BluetoothClassOfDevice object from a raw integer value representing the Major Class, Minor Class and Service Capabilities of the device.
    * @param rawValue The raw integer value from which to create the BluetoothClassOfDevice object.
    * @return A BluetoothClassOfDevice object.
    */
  def fromRawValue(rawValue: scala.Double): winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothClassOfDevice = js.native
}

