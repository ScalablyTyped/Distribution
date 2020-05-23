package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task when an incoming change notification is received for a Bluetooth LE GATT characteristic. */
trait GattCharacteristicNotificationTrigger extends js.Object {
  /** Gets the GATT characteristic for which value change notifications are desired. */
  var characteristic: GattCharacteristic
}

object GattCharacteristicNotificationTrigger {
  @scala.inline
  def apply(characteristic: GattCharacteristic): GattCharacteristicNotificationTrigger = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattCharacteristicNotificationTrigger]
  }
}

