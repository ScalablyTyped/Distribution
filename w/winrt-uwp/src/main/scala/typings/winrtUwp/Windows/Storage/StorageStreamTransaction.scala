package typings.winrtUwp.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a write transaction for a random-access stream. */
trait StorageStreamTransaction extends StObject {
  
  /** Releases system resources that are exposed by the stream, indicating that the data request is complete. */
  def close(): Unit
  
  /**
    * Save the stream to the underlying file.
    * @return No object or value is returned by this method.
    */
  def commitAsync(): IPromiseWithIAsyncAction
  
  /** Gets the random-access stream used in the transaction. */
  var stream: IRandomAccessStream
}
object StorageStreamTransaction {
  
  inline def apply(close: () => Unit, commitAsync: () => IPromiseWithIAsyncAction, stream: IRandomAccessStream): StorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), commitAsync = js.Any.fromFunction0(commitAsync), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageStreamTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageStreamTransaction] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCommitAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "commitAsync", js.Any.fromFunction0(value))
    
    inline def setStream(value: IRandomAccessStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
