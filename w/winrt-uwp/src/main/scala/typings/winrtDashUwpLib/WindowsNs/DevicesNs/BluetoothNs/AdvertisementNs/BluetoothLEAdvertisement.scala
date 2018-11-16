package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A representation of a Bluetooth LE advertisement payload. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement")
@js.native
class BluetoothLEAdvertisement () extends js.Object {
  /** Gets the list of raw data sections. */
  var dataSections: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[BluetoothLEAdvertisementDataSection] = js.native
  /** Bluetooth LE advertisement flags. */
  var flags: BluetoothLEAdvertisementFlags = js.native
  /** The local name contained within the advertisement. */
  var localName: java.lang.String = js.native
  /** Gets the list of manufacturer-specific data sections in a BluetoothLEAdvertisement . */
  var manufacturerData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[BluetoothLEManufacturerData] = js.native
  /** The list of service UUIDs in 128-bit GUID format in a BluetoothLEAdvertisement . */
  var serviceUuids: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /**
                       * Return a list of all manufacturer data sections in the BluetoothLEAdvertisement payload matching the specified company ID.
                       * @param companyId The company identifier code defined by the Bluetooth Special Interest Group (SIG).
                       * @return A vector of BluetoothLEManufacturerData contained within the payload.
                       */
  def getManufacturerDataByCompanyId(companyId: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[BluetoothLEManufacturerData] = js.native
  /**
                       * Return a list of advertisement data sections that matches a given advertisement section type in a BluetoothLEAdvertisement .
                       * @param type The advertisement section type
                       * @return A vector of all the BluetoothLEAdvertisementDataSection matching the given advertisement type.
                       */
  def getSectionsByType(`type`: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[BluetoothLEAdvertisementDataSection] = js.native
}

