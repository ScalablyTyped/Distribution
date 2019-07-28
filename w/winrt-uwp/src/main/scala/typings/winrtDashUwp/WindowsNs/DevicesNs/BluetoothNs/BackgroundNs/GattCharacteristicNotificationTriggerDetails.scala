package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristic
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Bluetooth LE device that caused this trigger to fire. */
@JSGlobal("Windows.Devices.Bluetooth.Background.GattCharacteristicNotificationTriggerDetails")
@js.native
abstract class GattCharacteristicNotificationTriggerDetails () extends js.Object {
  /** Gets the GATT characteristic that changed. */
  var characteristic: GattCharacteristic = js.native
  /** Gets a byte stream containing the new value of the characteristic. */
  var value: IBuffer = js.native
}

