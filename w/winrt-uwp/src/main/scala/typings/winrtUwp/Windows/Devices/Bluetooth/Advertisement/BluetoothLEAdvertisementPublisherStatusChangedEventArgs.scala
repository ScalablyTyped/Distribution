package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a StatusChanged event on a BluetoothLEAdvertisementPublisher . */
trait BluetoothLEAdvertisementPublisherStatusChangedEventArgs extends js.Object {
  /** Gets the error status for a StatusChanged event on a BluetoothLEAdvertisementPublisher . */
  var error: BluetoothError
  /** Gets the new status of the BluetoothLEAdvertisementPublisher . */
  var status: BluetoothLEAdvertisementPublisherStatus
}

object BluetoothLEAdvertisementPublisherStatusChangedEventArgs {
  @scala.inline
  def apply(error: BluetoothError, status: BluetoothLEAdvertisementPublisherStatus): BluetoothLEAdvertisementPublisherStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementPublisherStatusChangedEventArgs]
  }
}

