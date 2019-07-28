package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Bluetooth LE advertisement byte pattern for filters to match. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementBytePattern")
@js.native
/** Create a new BluetoothLEAdvertisementBytePattern object. */
class BluetoothLEAdvertisementBytePattern () extends js.Object {
  /**
    * Create a new BluetoothLEAdvertisementBytePattern object with an advertisement data type to match, the advertisement data byte pattern to match, and the offset of the byte pattern from the beginning of the advertisement data section.
    * @param dataType The Bluetooth LE advertisement data type to match.
    * @param offset The offset of byte pattern from beginning of advertisement data section.
    * @param data The Bluetooth LE advertisement data byte pattern to match.
    */
  def this(dataType: Double, offset: Double, data: IBuffer) = this()
  /** The Bluetooth LE advertisement data byte pattern to match. */
  var data: IBuffer = js.native
  /** The Bluetooth LE advertisement data type defined by the Bluetooth Special Interest Group (SIG) to match. */
  var dataType: Double = js.native
  /** The offset of byte pattern from beginning of advertisement data section. */
  var offset: Double = js.native
}

