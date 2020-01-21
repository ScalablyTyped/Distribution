package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEDevice
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GATT Primary Service on a Bluetooth device. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService")
@js.native
abstract class GattDeviceService () extends js.Object {
  /** Gets the handle used to uniquely identify GATT-based service attributes as declared on the Bluetooth LE device. */
  var attributeHandle: Double = js.native
  /** Gets the BluetoothLEDevice object describing the device associated with the current GattDeviceService object. */
  var device: BluetoothLEDevice = js.native
  /** Get the string that represents the GATT service instance path used to instantiate the GattDeviceService. */
  var deviceId: String = js.native
  /** Gets the read-only list of parent services for this service. */
  var parentServices: IVectorView[GattDeviceService] = js.native
  /** The GATT Service UUID associated with this GattDeviceService. */
  var uuid: String = js.native
  /** Releases the resources associated with the GattDeviceService class. This allows other apps to access the resources of the GattDeviceService in question. A GattDeviceService object should not be used after Close is invoked, instead a new GattDeviceService object should be instantiated using the FromIdAsync method. */
  def close(): Unit = js.native
  /**
    * Gets the collection of all characteristics belonging to this GattDeviceService instance.
    * @return The collection of all characteristics belonging to this GattDeviceService instance.
    */
  def getAllCharacteristics(): IVectorView[GattCharacteristic] = js.native
  /**
    * Gets the collection of all included services belonging to this GattDeviceService instance.
    * @return The collection of all included services belonging to this GattDeviceService instance.
    */
  def getAllIncludedServices(): IVectorView[GattDeviceService] = js.native
  /**
    * Returns a vector of characteristics, that are identified by the specified UUID and belong to this GattDeviceService instance.
    * @param characteristicUuid The UUID for the characteristics to be retrieved.
    * @return A vector of GattCharacteristic objects whose UUIDs match characteristicUuid.
    */
  def getCharacteristics(characteristicUuid: String): IVectorView[GattCharacteristic] = js.native
  /**
    * Returns a vector of included services, that are identified by the specified UUID and belong to this GattDeviceService instance.
    * @param serviceUuid The UUID for the included services to be retrieved.
    * @return A vector of included services whose UUIDs match serviceUuid.
    */
  def getIncludedServices(serviceUuid: String): IVectorView[GattDeviceService] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService")
@js.native
object GattDeviceService extends js.Object {
  /**
    * Converts a Bluetooth SIG defined short Id to a full GATT UUID.
    * @param shortId A 16-bit Bluetooth GATT Service UUID.
    * @return The corresponding 128-bit GATT Service UUID, that uniquely identifies this service.
    */
  def convertShortIdToUuid(shortId: Double): String = js.native
  /**
    * Instantiates a new GattDeviceService from the device ID.
    * @param deviceId The GATT device ID.
    * @return The object for managing the asynchronous operation, which, upon completion, returns the newly instantiated GattDeviceService.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[GattDeviceService] = js.native
  /**
    * Creates a suitable AQS Filter string for use with the CreateWatcher method, from a 16-bit Bluetooth GATT Service UUID.
    * @param serviceShortId A 16-bit Bluetooth GATT Service UUID.
    * @return A suitable AQS Selector String which can be passed as a parameter to the CreateWatcher method, in order to retrieve a GATT service instance path
    */
  def getDeviceSelectorFromShortId(serviceShortId: Double): String = js.native
  /**
    * Creates a suitable AQS Filter string for use with the CreateWatcher method, from a Bluetooth service UUID.
    * @param serviceUuid A 128-bit Bluetooth GATT Service UUID, represented as a standard GUID object.
    * @return A suitable AQS Selector String which can be passed as a parameter to the CreateWatcher method, in order to retrieve a GATT service instance path.
    */
  def getDeviceSelectorFromUuid(serviceUuid: String): String = js.native
}

