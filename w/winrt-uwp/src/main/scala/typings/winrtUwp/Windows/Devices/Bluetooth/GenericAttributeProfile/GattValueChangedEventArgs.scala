package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.std.Date
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value received when registering to receive notifications or indications from a Bluetooth LE device. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattValueChangedEventArgs")
@js.native
abstract class GattValueChangedEventArgs () extends js.Object {
  /** Gets the new Characteristic Value. */
  var characteristicValue: IBuffer = js.native
  /** Gets the time at which the system was notified of the Characteristic Value change. */
  var timestamp: Date = js.native
}

