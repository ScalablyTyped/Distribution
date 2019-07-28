package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementReceivedEventArgs
import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BluetoothError
import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BluetoothSignalStrengthFilter
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a BluetoothLEAdvertisementWatcher trigger. */
@JSGlobal("Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementWatcherTriggerDetails")
@js.native
abstract class BluetoothLEAdvertisementWatcherTriggerDetails () extends js.Object {
  /** Gets a collection of Bluetooth LE advertisements. */
  var advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs] = js.native
  /** Gets the error status for the trigger. */
  var error: BluetoothError = js.native
  /** Gets the parameters used to configure received signal strength indicator (RSSI)-based filtering. */
  var signalStrengthFilter: BluetoothSignalStrengthFilter = js.native
}

