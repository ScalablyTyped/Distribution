package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a StatusChanged event on a BluetoothLEAdvertisementPublisher . */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatusChangedEventArgs")
@js.native
abstract class BluetoothLEAdvertisementPublisherStatusChangedEventArgs () extends js.Object {
  /** Gets the error status for a StatusChanged event on a BluetoothLEAdvertisementPublisher . */
  var error: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError = js.native
  /** Gets the new status of the BluetoothLEAdvertisementPublisher . */
  var status: BluetoothLEAdvertisementPublisherStatus = js.native
}

