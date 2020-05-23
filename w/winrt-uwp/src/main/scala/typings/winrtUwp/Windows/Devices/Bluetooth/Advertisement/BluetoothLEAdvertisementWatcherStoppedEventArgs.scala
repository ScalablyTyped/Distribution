package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a Stopped event on a BluetoothLEAdvertisementWatcher . */
trait BluetoothLEAdvertisementWatcherStoppedEventArgs extends js.Object {
  /** Gets the error status for Stopped event. */
  var error: BluetoothError
}

object BluetoothLEAdvertisementWatcherStoppedEventArgs {
  @scala.inline
  def apply(error: BluetoothError): BluetoothLEAdvertisementWatcherStoppedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementWatcherStoppedEventArgs]
  }
}

