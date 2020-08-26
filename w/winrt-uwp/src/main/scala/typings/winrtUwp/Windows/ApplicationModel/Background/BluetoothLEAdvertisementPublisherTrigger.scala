package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that is registered to advertise a Bluetooth LE advertisement in the background. */
@js.native
trait BluetoothLEAdvertisementPublisherTrigger extends js.Object {
  /** Gets the Bluetooth LE advertisement to configure and publish in the background. */
  var advertisement: BluetoothLEAdvertisement = js.native
}

object BluetoothLEAdvertisementPublisherTrigger {
  @scala.inline
  def apply(advertisement: BluetoothLEAdvertisement): BluetoothLEAdvertisementPublisherTrigger = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementPublisherTrigger]
  }
  @scala.inline
  implicit class BluetoothLEAdvertisementPublisherTriggerOps[Self <: BluetoothLEAdvertisementPublisherTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdvertisement(value: BluetoothLEAdvertisement): Self = this.set("advertisement", value.asInstanceOf[js.Any])
  }
  
}

