package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Performs GATT reliable writes on the Bluetooth LE device, in the form of a transaction write operation. */
@js.native
trait GattReliableWriteTransaction extends StObject {
  
  /**
    * Performs all the queued writes, in sequence, writing the data to the device. Once a transaction object has been committed, no further operations are possible on the GattReliableWriteTransaction object.
    * @return The object used to manage the asynchronous operation, which, upon completion, will return the status of the asynchronous operation.
    */
  def commitAsync(): IPromiseWithIAsyncOperation[GattCommunicationStatus] = js.native
  
  /**
    * Adds a new write operation to the transaction object.
    * @param characteristic The GattCharacteristic object on which to perform the write operation.
    * @param value The Characteristic Value to be written to characteristic.
    */
  def writeValue(characteristic: GattCharacteristic, value: IBuffer): Unit = js.native
}
object GattReliableWriteTransaction {
  
  @scala.inline
  def apply(
    commitAsync: () => IPromiseWithIAsyncOperation[GattCommunicationStatus],
    writeValue: (GattCharacteristic, IBuffer) => Unit
  ): GattReliableWriteTransaction = {
    val __obj = js.Dynamic.literal(commitAsync = js.Any.fromFunction0(commitAsync), writeValue = js.Any.fromFunction2(writeValue))
    __obj.asInstanceOf[GattReliableWriteTransaction]
  }
  
  @scala.inline
  implicit class GattReliableWriteTransactionMutableBuilder[Self <: GattReliableWriteTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitAsync(value: () => IPromiseWithIAsyncOperation[GattCommunicationStatus]): Self = StObject.set(x, "commitAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteValue(value: (GattCharacteristic, IBuffer) => Unit): Self = StObject.set(x, "writeValue", js.Any.fromFunction2(value))
  }
}
