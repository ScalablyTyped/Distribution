package typings.winrtUwp.global.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to determine the Bluetooth Class Of Device (Bluetooth COD) information for a device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothClassOfDevice")
@js.native
abstract class BluetoothClassOfDevice ()
  extends typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothClassOfDevice

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
    majorClass: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothMajorClass,
    minorClass: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothMinorClass,
    serviceCapabilities: typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities
  ): typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothClassOfDevice = js.native
  /**
    * Creates a BluetoothClassOfDevice object from a raw integer value representing the Major Class, Minor Class and Service Capabilities of the device.
    * @param rawValue The raw integer value from which to create the BluetoothClassOfDevice object.
    * @return A BluetoothClassOfDevice object.
    */
  def fromRawValue(rawValue: Double): typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothClassOfDevice = js.native
}

