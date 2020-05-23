package typings.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs GATT reliable writes on the Bluetooth LE device, in the form of a transaction write operation. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattReliableWriteTransaction")
@js.native
/** Creates a new GattReliableWriteTransaction object. */
class GattReliableWriteTransaction ()
  extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattReliableWriteTransaction {
  /**
    * Performs all the queued writes, in sequence, writing the data to the device. Once a transaction object has been committed, no further operations are possible on the GattReliableWriteTransaction object.
    * @return The object used to manage the asynchronous operation, which, upon completion, will return the status of the asynchronous operation.
    */
  /* CompleteClass */
  override def commitAsync(): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus
  ] = js.native
  /**
    * Adds a new write operation to the transaction object.
    * @param characteristic The GattCharacteristic object on which to perform the write operation.
    * @param value The Characteristic Value to be written to characteristic.
    */
  /* CompleteClass */
  override def writeValue(
    characteristic: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic,
    value: IBuffer
  ): Unit = js.native
}

