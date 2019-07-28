package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCharacteristic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task when an incoming change notification is received for a Bluetooth LE GATT characteristic. */
@JSGlobal("Windows.ApplicationModel.Background.GattCharacteristicNotificationTrigger")
@js.native
class GattCharacteristicNotificationTrigger protected () extends js.Object {
  /**
    * Initializes a new instance of the GattCharacteristicNotificationTrigger class.
    * @param characteristic The GATT characteristic for which value change notifications are desired.
    */
  def this(characteristic: GattCharacteristic) = this()
  /** Gets the GATT characteristic for which value change notifications are desired. */
  var characteristic: GattCharacteristic = js.native
}

