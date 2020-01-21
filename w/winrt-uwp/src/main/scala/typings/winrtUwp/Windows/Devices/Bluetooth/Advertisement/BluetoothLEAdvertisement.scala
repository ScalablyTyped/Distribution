package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A representation of a Bluetooth LE advertisement payload. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement")
@js.native
/** Creates a new BluetoothLEAdvertisement object. */
class BluetoothLEAdvertisement () extends js.Object {
  /** Gets the list of raw data sections. */
  var dataSections: IVector[BluetoothLEAdvertisementDataSection] = js.native
  /** Bluetooth LE advertisement flags. */
  var flags: BluetoothLEAdvertisementFlags = js.native
  /** The local name contained within the advertisement. */
  var localName: String = js.native
  /** Gets the list of manufacturer-specific data sections in a BluetoothLEAdvertisement . */
  var manufacturerData: IVector[BluetoothLEManufacturerData] = js.native
  /** The list of service UUIDs in 128-bit GUID format in a BluetoothLEAdvertisement . */
  var serviceUuids: IVector[String] = js.native
  /**
    * Return a list of all manufacturer data sections in the BluetoothLEAdvertisement payload matching the specified company ID.
    * @param companyId The company identifier code defined by the Bluetooth Special Interest Group (SIG).
    * @return A vector of BluetoothLEManufacturerData contained within the payload.
    */
  def getManufacturerDataByCompanyId(companyId: Double): IVectorView[BluetoothLEManufacturerData] = js.native
  /**
    * Return a list of advertisement data sections that matches a given advertisement section type in a BluetoothLEAdvertisement .
    * @param type The advertisement section type
    * @return A vector of all the BluetoothLEAdvertisementDataSection matching the given advertisement type.
    */
  def getSectionsByType(`type`: Double): IVectorView[BluetoothLEAdvertisementDataSection] = js.native
}

