package typings.winrtUwp.Windows.Devices.Bluetooth.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus
import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a BluetoothLEAdvertisementPublisher trigger. */
trait BluetoothLEAdvertisementPublisherTriggerDetails extends js.Object {
  /** Gets the error status for the trigger. */
  var error: BluetoothError
  /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
  var status: BluetoothLEAdvertisementPublisherStatus
}

object BluetoothLEAdvertisementPublisherTriggerDetails {
  @scala.inline
  def apply(error: BluetoothError, status: BluetoothLEAdvertisementPublisherStatus): BluetoothLEAdvertisementPublisherTriggerDetails = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementPublisherTriggerDetails]
  }
}

