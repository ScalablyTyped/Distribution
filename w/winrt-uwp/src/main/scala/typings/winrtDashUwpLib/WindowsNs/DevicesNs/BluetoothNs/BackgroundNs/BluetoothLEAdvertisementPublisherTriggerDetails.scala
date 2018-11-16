package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a BluetoothLEAdvertisementPublisher trigger. */
@JSGlobal("Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementPublisherTriggerDetails")
@js.native
abstract class BluetoothLEAdvertisementPublisherTriggerDetails () extends js.Object {
  /** Gets the error status for the trigger. */
  var error: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError = js.native
  /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
  var status: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisementPublisherStatus = js.native
}

