package typings.winrtUwp.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a write transaction for a random-access stream. */
@js.native
trait StorageStreamTransaction extends js.Object {
  
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
  implicit class StorageStreamTransactionOps[Self <: StorageStreamTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCommitAsync(value: () => IPromiseWithIAsyncAction): Self = this.set("commitAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStream(value: IRandomAccessStream): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
}
