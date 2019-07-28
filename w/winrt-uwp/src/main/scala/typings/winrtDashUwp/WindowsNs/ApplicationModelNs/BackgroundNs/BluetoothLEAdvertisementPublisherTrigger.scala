package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs.BluetoothLEAdvertisement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that is registered to advertise a Bluetooth LE advertisement in the background. */
@JSGlobal("Windows.ApplicationModel.Background.BluetoothLEAdvertisementPublisherTrigger")
@js.native
/** Creates a new instance of the BluetoothLEAdvertisementPublisherTrigger class. */
class BluetoothLEAdvertisementPublisherTrigger () extends js.Object {
  /** Gets the Bluetooth LE advertisement to configure and publish in the background. */
  var advertisement: BluetoothLEAdvertisement = js.native
}

