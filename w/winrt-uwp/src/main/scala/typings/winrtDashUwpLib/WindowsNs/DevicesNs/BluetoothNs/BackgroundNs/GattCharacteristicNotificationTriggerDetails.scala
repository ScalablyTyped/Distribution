package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Bluetooth LE device that caused this trigger to fire. */
@JSGlobal("Windows.Devices.Bluetooth.Background.GattCharacteristicNotificationTriggerDetails")
@js.native
abstract class GattCharacteristicNotificationTriggerDetails () extends js.Object {
  /** Gets the GATT characteristic that changed. */
  var characteristic: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristic = js.native
  /** Gets a byte stream containing the new value of the characteristic. */
  var value: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}

