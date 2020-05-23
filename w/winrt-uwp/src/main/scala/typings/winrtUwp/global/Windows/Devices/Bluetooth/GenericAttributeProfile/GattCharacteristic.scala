package typings.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Characteristic of a GATT service. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic")
@js.native
abstract class GattCharacteristic ()
  extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic

/* static members */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic")
@js.native
object GattCharacteristic extends js.Object {
  /**
    * Converts a Bluetooth SIG defined short Id to a full GATT UUID.
    * @param shortId A 16-bit Bluetooth GATT Service UUID.
    * @return The corresponding 128-bit GATT Characteristic UUID, that uniquely identifies this characteristic.
    */
  def convertShortIdToUuid(shortId: Double): String = js.native
}

