package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Bluetooth LE manufacturer-specific data section (one particular type of LE advertisement section) */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEManufacturerData")
@js.native
/** Creates a new BluetoothLEManufacturerData object. */
class BluetoothLEManufacturerData () extends js.Object {
  /**
    * Creates a new BluetoothLEManufacturerData object with a company identifier code and manufacterer-specific section data.
    * @param companyId The Bluetooth LE company identifier code as defined by the Bluetooth Special Interest Group (SIG).
    * @param data Bluetooth LE manufacturer-specific section data.
    */
  def this(companyId: Double, data: IBuffer) = this()
  /** The Bluetooth LE company identifier code as defined by the Bluetooth Special Interest Group (SIG). */
  var companyId: Double = js.native
  /** Bluetooth LE manufacturer-specific section data. */
  var data: IBuffer = js.native
}

