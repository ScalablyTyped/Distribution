package typings.winrtUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to determine the Bluetooth Class Of Device (Bluetooth COD) information for a device. */
trait BluetoothClassOfDevice extends js.Object {
  /** Gets the Major Class code of the Bluetooth device. */
  var majorClass: BluetoothMajorClass
  /** Gets the Minor Class code of the device. */
  var minorClass: BluetoothMinorClass
  /** Gets the Bluetooth Class Of Device information, represented as an integer value. */
  var rawValue: Double
  /** Gets the service capabilities of the device. */
  var serviceCapabilities: BluetoothServiceCapabilities
}

object BluetoothClassOfDevice {
  @scala.inline
  def apply(
    majorClass: BluetoothMajorClass,
    minorClass: BluetoothMinorClass,
    rawValue: Double,
    serviceCapabilities: BluetoothServiceCapabilities
  ): BluetoothClassOfDevice = {
    val __obj = js.Dynamic.literal(majorClass = majorClass.asInstanceOf[js.Any], minorClass = minorClass.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], serviceCapabilities = serviceCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothClassOfDevice]
  }
}

