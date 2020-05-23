package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that is registered to advertise a Bluetooth LE advertisement in the background. */
trait BluetoothLEAdvertisementPublisherTrigger extends js.Object {
  /** Gets the Bluetooth LE advertisement to configure and publish in the background. */
  var advertisement: BluetoothLEAdvertisement
}

object BluetoothLEAdvertisementPublisherTrigger {
  @scala.inline
  def apply(advertisement: BluetoothLEAdvertisement): BluetoothLEAdvertisementPublisherTrigger = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementPublisherTrigger]
  }
}

