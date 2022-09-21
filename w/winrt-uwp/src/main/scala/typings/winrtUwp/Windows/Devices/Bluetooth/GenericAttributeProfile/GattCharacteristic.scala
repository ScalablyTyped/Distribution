package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothCacheMode
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.valuechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Characteristic of a GATT service. */
@js.native
trait GattCharacteristic extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valuechanged(`type`: valuechanged, listener: TypedEventHandler[GattCharacteristic, GattValueChangedEventArgs]): Unit = js.native
  
  /** Gets the handle used to uniquely identify GATT-based characteristic attributes as declared on the Bluetooth LE device. */
  var attributeHandle: Double = js.native
  
  /** Gets the GATT characteristic properties, as defined by the GATT profile. */
  var characteristicProperties: GattCharacteristicProperties = js.native
  
  /**
    * Gets the collection of all descriptors belonging to this GattCharacteristic instance.
    * @return The collection of all descriptors belonging to this GattCharacteristic instance.
    */
  def getAllDescriptors(): IVectorView[GattDescriptor] = js.native
  
  /**
    * Returns a vector of descriptors, that are identified by the specified UUID, and belong to this GattCharacteristic instance.
    * @param descriptorUuid The UUID for the descriptors to be retrieved.
    * @return A vector of descriptors whose UUIDs match descriptorUuid.
    */
  def getDescriptors(descriptorUuid: String): IVectorView[GattDescriptor] = js.native
  
  /** An App can register an event handler in order to receive events when notification or indications are received from a device, after setting the Client Characteristic Configuration Descriptor. */
  def onvaluechanged(ev: GattValueChangedEventArgs & WinRTEvent[GattCharacteristic]): Unit = js.native
  /** An App can register an event handler in order to receive events when notification or indications are received from a device, after setting the Client Characteristic Configuration Descriptor. */
  @JSName("onvaluechanged")
  var onvaluechanged_Original: TypedEventHandler[GattCharacteristic, GattValueChangedEventArgs] = js.native
  
  /** Gets the list of presentation format descriptors associated with this GattCharacteristic, in the order specified by the Aggregate Format Descriptor. */
  var presentationFormats: IVectorView[GattPresentationFormat] = js.native
  
  /** Gets or sets the desired GATT security options for over the air communication with the device. */
  var protectionLevel: GattProtectionLevel = js.native
  
  /**
    * Reads the current value of the ClientCharacteristicConfigurationDescriptor.
    * @return The object that manages the asynchronous operation. Upon completion of the asynchronous method, the IAsyncOperation(GattReadClientCharacteristicConfigurationDescriptorResult) contains the result of the read operation, which contains the status of completed operation.
    */
  def readClientCharacteristicConfigurationDescriptorAsync(): IPromiseWithIAsyncOperation[GattReadClientCharacteristicConfigurationDescriptorResult] = js.native
  
  /**
    * Performs a Characteristic Value read from the value cache maintained by Windows.
    * @return The object required to manage the asynchronous operation, which, upon completion, returns a GattReadResult object, which in turn contains the completion status of the asynchronous operation and, if successful, the data read from the device.
    */
  def readValueAsync(): IPromiseWithIAsyncOperation[GattReadResult] = js.native
  /**
    * Performs a Characteristic Value read either from the value cache maintained by Windows, or directly from the device.
    * @param cacheMode Specifies whether to read the value directly from the device or from a value cache maintained by Windows.
    * @return The object required to manage the asynchronous operation, which, upon completion, returns a GattReadResult object, which in turn contains the completion status of the asynchronous operation and, if successful, the data read from the device.
    */
  def readValueAsync(cacheMode: BluetoothCacheMode): IPromiseWithIAsyncOperation[GattReadResult] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_valuechanged(`type`: valuechanged, listener: TypedEventHandler[GattCharacteristic, GattValueChangedEventArgs]): Unit = js.native
  
  /** Gets the GattDeviceService of which this characteristic is a member. */
  var service: GattDeviceService = js.native
  
  /** Get the user friendly description for this GattCharacteristic, if the User Description Descriptor is present, otherwise this will be an empty string. */
  var userDescription: String = js.native
  
  /** Gets the GATT Characteristic UUID for this GattCharacteristic. */
  var uuid: String = js.native
  
  /**
    * Writes the ClientCharacteristicConfigurationDescriptor to the Bluetooth LE device, and if the value to be written represents an indication or a notification and a ValueChanged event handler is registered, enables receiving ValueChanged events from the device.
    * @param clientCharacteristicConfigurationDescriptorValue Specifies a new value for the ClientCharacteristicConfigurationDescriptor of this Characteristic object.
    * @return The object that manages the asynchronous operation, which, upon completion, returns the status with which the operation completed.
    */
  def writeClientCharacteristicConfigurationDescriptorAsync(
    clientCharacteristicConfigurationDescriptorValue: GattClientCharacteristicConfigurationDescriptorValue
  ): IPromiseWithIAsyncOperation[GattCommunicationStatus] = js.native
  
  /**
    * Performs a Characteristic Value write to a Bluetooth LE device.
    * @param value A Windows.Storage.Streams.IBuffer object which contains the data to be written to the Bluetooth LE device.
    * @return The object that manages the asynchronous operation, which, upon completion, returns the status with which the operation completed.
    */
  def writeValueAsync(value: IBuffer): IPromiseWithIAsyncOperation[GattCommunicationStatus] = js.native
  /**
    * Performs a Characteristic Value write to a Bluetooth LE device.
    * @param value A Windows.Storage.Streams.IBuffer object which contains the data to be written to the Bluetooth LE device.
    * @param writeOption Specifies what type of GATT write should be performed.
    * @return The object that manages the asynchronous operation, which, upon completion, returns the status with which the operation completed.
    */
  def writeValueAsync(value: IBuffer, writeOption: GattWriteOption): IPromiseWithIAsyncOperation[GattCommunicationStatus] = js.native
}
