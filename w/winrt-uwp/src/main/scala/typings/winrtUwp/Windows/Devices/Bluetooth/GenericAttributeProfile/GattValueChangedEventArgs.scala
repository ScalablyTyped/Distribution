package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.std.Date
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value received when registering to receive notifications or indications from a Bluetooth LE device. */
trait GattValueChangedEventArgs extends js.Object {
  /** Gets the new Characteristic Value. */
  var characteristicValue: IBuffer
  /** Gets the time at which the system was notified of the Characteristic Value change. */
  var timestamp: Date
}

object GattValueChangedEventArgs {
  @scala.inline
  def apply(characteristicValue: IBuffer, timestamp: Date): GattValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(characteristicValue = characteristicValue.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattValueChangedEventArgs]
  }
}

