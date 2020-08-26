package typings.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GATT Primary Service on a Bluetooth device. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService")
@js.native
abstract class GattDeviceService ()
  extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService

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
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService
  ] = js.native
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

