package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Bluetooth LE advertisement section. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataSection")
@js.native
/** Creates a new BluetoothLEAdvertisementDataSection object. */
class BluetoothLEAdvertisementDataSection () extends js.Object {
  /**
    * Creates a new BluetoothLEAdvertisementDataSection object with the Bluetooth LE advertisement data type and the payload.
    * @param dataType The Bluetooth LE advertisement data type as defined by the Bluetooth Special Interest Group (SIG).
    * @param data The Bluetooth LE advertisement data payload.
    */
  def this(dataType: scala.Double, data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer) = this()
  /** The Bluetooth LE advertisement data payload. */
  var data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** The Bluetooth LE advertisement data type as defined by the Bluetooth Special Interest Group (SIG). */
  var dataType: scala.Double = js.native
}

