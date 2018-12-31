package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Characteristic of a GATT service. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic")
@js.native
abstract class GattCharacteristic () extends js.Object {
  /** Gets the handle used to uniquely identify GATT-based characteristic attributes as declared on the Bluetooth LE device. */
  var attributeHandle: scala.Double = js.native
  /** Gets the GATT characteristic properties, as defined by the GATT profile. */
  var characteristicProperties: GattCharacteristicProperties = js.native
  /** An App can register an event handler in order to receive events when notification or indications are received from a device, after setting the Client Characteristic Configuration Descriptor. */
  @JSName("onvaluechanged")
  var onvaluechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GattCharacteristic, GattValueChangedEventArgs] = js.native
  /** Gets the list of presentation format descriptors associated with this GattCharacteristic, in the order specified by the Aggregate Format Descriptor. */
  var presentationFormats: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[GattPresentationFormat] = js.native
  /** Gets or sets the desired GATT security options for over the air communication with the device. */
  var protectionLevel: GattProtectionLevel = js.native
  /** Gets the GattDeviceService of which this characteristic is a member. */
  var service: GattDeviceService = js.native
  /** Get the user friendly description for this GattCharacteristic, if the User Description Descriptor is present, otherwise this will be an empty string. */
  var userDescription: java.lang.String = js.native
  /** Gets the GATT Characteristic UUID for this GattCharacteristic. */
  var uuid: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valuechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.valuechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GattCharacteristic, GattValueChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Gets the collection of all descriptors belonging to this GattCharacteristic instance.
    * @return The collection of all descriptors belonging to this GattCharacteristic instance.
    */
  def getAllDescriptors(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[GattDescriptor] = js.native
  /**
    * Returns a vector of descriptors, that are identified by the specified UUID, and belong to this GattCharacteristic instance.
    * @param descriptorUuid The UUID for the descriptors to be retrieved.
    * @return A vector of descriptors whose UUIDs match descriptorUuid.
    */
  def getDescriptors(descriptorUuid: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[GattDescriptor] = js.native
  /** An App can register an event handler in order to receive events when notification or indications are received from a device, after setting the Client Characteristic Configuration Descriptor. */
  def onvaluechanged(ev: GattValueChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[GattCharacteristic]): scala.Unit = js.native
  /**
    * Reads the current value of the ClientCharacteristicConfigurationDescriptor.
    * @return The object that manages the asynchronous operation. Upon completion of the asynchronous method, the IAsyncOperation(GattReadClientCharacteristicConfigurationDescriptorResult) contains the result of the read operation, which contains the status of completed operation.
    */
  def readClientCharacteristicConfigurationDescriptorAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[GattReadClientCharacteristicConfigurationDescriptorResult] = js.native
  /**
    * Performs a Characteristic Value read from the value cache maintained by Windows.
    * @return The object required to manage the asynchronous operation, which, upon completion, returns a GattReadResult object, which in turn contains the completion status of the asynchronous operation and, if successful, the data read from the device.
    */
  def readValueAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[GattReadResult] = js.native
  /**
    * Performs a Characteristic Value read either from the value cache maintained by Windows, or directly from the device.
    * @param cacheMode Specifies whether to read the value directly from the device or from a value cache maintained by Windows.
    * @return The object required to manage the asynchronous operation, which, upon completion, returns a GattReadResult object, which in turn contains the completion status of the asynchronous operation and, if successful, the data read from the device.
    */
  def readValueAsync(cacheMode: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothCacheMode): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[GattReadResult] = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_valuechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.valuechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GattCharacteristic, GattValueChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Writes the ClientCharacteristicConfigurationDescriptor to the Bluetooth LE device, and if the value to be written represents an indication or a notification and a ValueChanged event handler is registered, enables receiving ValueChanged events from the device.
    * @param clientCharacteristicConfigurationDescriptorValue Specifies a new value for the ClientCharacteristicConfigurationDescriptor of this Characteristic object.
    * @return The object that manages the asynchronous operation, which, upon completion, returns the status with which the operation completed.
    */
  def writeClientCharacteristicConfigurationDescriptorAsync(
    clientCharacteristicConfigurationDescriptorValue: GattClientCharacteristicConfigurationDescriptorValue
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[GattCommunicationStatus] = js.native
  /**
    * Performs a Characteristic Value write to a Bluetooth LE device.
    * @param value A Windows.Storage.Streams.IBuffer object which contains the data to be written to the Bluetooth LE device.
    * @return The object that manages the asynchronous operation, which, upon completion, returns the status with which the operation completed.
    */
  def writeValueAsync(value: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[GattCommunicationStatus] = js.native
  /**
    * Performs a Characteristic Value write to a Bluetooth LE device.
    * @param value A Windows.Storage.Streams.IBuffer object which contains the data to be written to the Bluetooth LE device.
    * @param writeOption Specifies what type of GATT write should be performed.
    * @return The object that manages the asynchronous operation, which, upon completion, returns the status with which the operation completed.
    */
  def writeValueAsync(value: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, writeOption: GattWriteOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[GattCommunicationStatus] = js.native
}

/** Represents a Characteristic of a GATT service. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic")
@js.native
object GattCharacteristic extends js.Object {
  /**
    * Converts a Bluetooth SIG defined short Id to a full GATT UUID.
    * @param shortId A 16-bit Bluetooth GATT Service UUID.
    * @return The corresponding 128-bit GATT Characteristic UUID, that uniquely identifies this characteristic.
    */
  def convertShortIdToUuid(shortId: scala.Double): java.lang.String = js.native
}

