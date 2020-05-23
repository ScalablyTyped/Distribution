package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A representation of a Bluetooth LE advertisement payload. */
trait BluetoothLEAdvertisement extends js.Object {
  /** Gets the list of raw data sections. */
  var dataSections: IVector[BluetoothLEAdvertisementDataSection]
  /** Bluetooth LE advertisement flags. */
  var flags: BluetoothLEAdvertisementFlags
  /** The local name contained within the advertisement. */
  var localName: String
  /** Gets the list of manufacturer-specific data sections in a BluetoothLEAdvertisement . */
  var manufacturerData: IVector[BluetoothLEManufacturerData]
  /** The list of service UUIDs in 128-bit GUID format in a BluetoothLEAdvertisement . */
  var serviceUuids: IVector[String]
  /**
    * Return a list of all manufacturer data sections in the BluetoothLEAdvertisement payload matching the specified company ID.
    * @param companyId The company identifier code defined by the Bluetooth Special Interest Group (SIG).
    * @return A vector of BluetoothLEManufacturerData contained within the payload.
    */
  def getManufacturerDataByCompanyId(companyId: Double): IVectorView[BluetoothLEManufacturerData]
  /**
    * Return a list of advertisement data sections that matches a given advertisement section type in a BluetoothLEAdvertisement .
    * @param type The advertisement section type
    * @return A vector of all the BluetoothLEAdvertisementDataSection matching the given advertisement type.
    */
  def getSectionsByType(`type`: Double): IVectorView[BluetoothLEAdvertisementDataSection]
}

object BluetoothLEAdvertisement {
  @scala.inline
  def apply(
    dataSections: IVector[BluetoothLEAdvertisementDataSection],
    flags: BluetoothLEAdvertisementFlags,
    getManufacturerDataByCompanyId: Double => IVectorView[BluetoothLEManufacturerData],
    getSectionsByType: Double => IVectorView[BluetoothLEAdvertisementDataSection],
    localName: String,
    manufacturerData: IVector[BluetoothLEManufacturerData],
    serviceUuids: IVector[String]
  ): BluetoothLEAdvertisement = {
    val __obj = js.Dynamic.literal(dataSections = dataSections.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getManufacturerDataByCompanyId = js.Any.fromFunction1(getManufacturerDataByCompanyId), getSectionsByType = js.Any.fromFunction1(getSectionsByType), localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], serviceUuids = serviceUuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisement]
  }
}

