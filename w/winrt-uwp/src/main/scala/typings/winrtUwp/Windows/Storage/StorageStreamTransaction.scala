package typings.winrtUwp.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a write transaction for a random-access stream. */
@js.native
trait StorageStreamTransaction extends StObject {
  
  /** Releases system resources that are exposed by the stream, indicating that the data request is complete. */
  def close(): Unit = js.native
  
  /**
    * Save the stream to the underlying file.
    * @return No object or value is returned by this method.
    */
  def commitAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets the random-access stream used in the transaction. */
  var stream: IRandomAccessStream = js.native
}
object StorageStreamTransaction {
  
  @scala.inline
  def apply(close: () => Unit, commitAsync: () => IPromiseWithIAsyncAction, stream: IRandomAccessStream): StorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), commitAsync = js.Any.fromFunction0(commitAsync), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageStreamTransaction]
  }
  
  @scala.inline
  implicit class StorageStreamTransactionMutableBuilder[Self <: StorageStreamTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCommitAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "commitAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStream(value: IRandomAccessStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
