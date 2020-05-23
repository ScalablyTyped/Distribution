package typings.winrtUwp.Windows.Devices.Bluetooth.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Bluetooth LE device that caused this trigger to fire. */
trait GattCharacteristicNotificationTriggerDetails extends js.Object {
  /** Gets the GATT characteristic that changed. */
  var characteristic: GattCharacteristic
  /** Gets a byte stream containing the new value of the characteristic. */
  var value: IBuffer
}

object GattCharacteristicNotificationTriggerDetails {
  @scala.inline
  def apply(characteristic: GattCharacteristic, value: IBuffer): GattCharacteristicNotificationTriggerDetails = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattCharacteristicNotificationTriggerDetails]
  }
}

