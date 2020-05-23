package typings.winrtUwp.Windows.Devices.Bluetooth.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs
import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothError
import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a BluetoothLEAdvertisementWatcher trigger. */
trait BluetoothLEAdvertisementWatcherTriggerDetails extends js.Object {
  /** Gets a collection of Bluetooth LE advertisements. */
  var advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs]
  /** Gets the error status for the trigger. */
  var error: BluetoothError
  /** Gets the parameters used to configure received signal strength indicator (RSSI)-based filtering. */
  var signalStrengthFilter: BluetoothSignalStrengthFilter
}

object BluetoothLEAdvertisementWatcherTriggerDetails {
  @scala.inline
  def apply(
    advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs],
    error: BluetoothError,
    signalStrengthFilter: BluetoothSignalStrengthFilter
  ): BluetoothLEAdvertisementWatcherTriggerDetails = {
    val __obj = js.Dynamic.literal(advertisements = advertisements.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], signalStrengthFilter = signalStrengthFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementWatcherTriggerDetails]
  }
}

