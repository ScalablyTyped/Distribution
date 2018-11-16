package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value received when registering to receive notifications or indications from a Bluetooth LE device. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattValueChangedEventArgs")
@js.native
abstract class GattValueChangedEventArgs () extends js.Object {
  /** Gets the new Characteristic Value. */
  var characteristicValue: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the time at which the system was notified of the Characteristic Value change. */
  var timestamp: stdLib.Date = js.native
}

