package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a BluetoothLEAdvertisementWatcher trigger. */
@JSGlobal("Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementWatcherTriggerDetails")
@js.native
abstract class BluetoothLEAdvertisementWatcherTriggerDetails () extends js.Object {
  /** Gets a collection of Bluetooth LE advertisements. */
  var advertisements: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementReceivedEventArgs
  ] = js.native
  /** Gets the error status for the trigger. */
  var error: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError = js.native
  /** Gets the parameters used to configure received signal strength indicator (RSSI)-based filtering. */
  var signalStrengthFilter: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothSignalStrengthFilter = js.native
}

