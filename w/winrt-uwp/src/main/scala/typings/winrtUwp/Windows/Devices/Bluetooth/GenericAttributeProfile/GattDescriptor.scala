package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothCacheMode
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Descriptor of a GATT Characteristic. */
@js.native
trait GattDescriptor extends StObject {
  
  /** Gets the GATT Attribute handle used to uniquely identify this attribute on the GATT Server Device. */
  var attributeHandle: Double = js.native
  
  /** Gets or sets the desired GATT security options for over the air communication with the device. */
  var protectionLevel: GattProtectionLevel = js.native
  
  /**
    * Performs a Descriptor Value read from a value cache maintained by Windows.
    * @return The object required to manage the asynchronous operation, which, upon completion, returns a GattReadResult object, which in turn contains the completion status of the asynchronous operation and, if successful, the data read from the device.
    */
  def readValueAsync(): IPromiseWithIAsyncOperation[GattReadResult] = js.native
  /**
    * Performs a Descriptor Value read either from the value cache maintained by Windows, or directly from the device.
    * @param cacheMode Specifies whether to read the value directly from the device or from a value cache maintained by Windows.
    * @return The object required to manage the asynchronous operation, which, upon completion, returns a GattReadResult object, which in turn contains the completion status of the asynchronous operation and, if successful, the data read from the device.
    */
  def readValueAsync(cacheMode: BluetoothCacheMode): IPromiseWithIAsyncOperation[GattReadResult] = js.native
  
  /** Gets the GATT Descriptor UUID for this GattDescriptor. */
  var uuid: String = js.native
  
  /**
    * Performs a Descriptor Value write to a Bluetooth LE device.
    * @param value A Windows.Storage.Streams.IBuffer object which contains the data to be written to the Bluetooth LE device.
    * @return The object that manages the asynchronous operation, which, upon completion, returns the status with which the operation completed.
    */
  def writeValueAsync(value: IBuffer): IPromiseWithIAsyncOperation[GattCommunicationStatus] = js.native
}
