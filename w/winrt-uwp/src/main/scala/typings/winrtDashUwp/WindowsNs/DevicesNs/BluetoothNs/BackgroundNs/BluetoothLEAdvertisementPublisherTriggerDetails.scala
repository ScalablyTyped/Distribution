package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementPublisherStatus
import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BluetoothError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a BluetoothLEAdvertisementPublisher trigger. */
@JSGlobal("Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementPublisherTriggerDetails")
@js.native
abstract class BluetoothLEAdvertisementPublisherTriggerDetails () extends js.Object {
  /** Gets the error status for the trigger. */
  var error: BluetoothError = js.native
  /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
  var status: BluetoothLEAdvertisementPublisherStatus = js.native
}

