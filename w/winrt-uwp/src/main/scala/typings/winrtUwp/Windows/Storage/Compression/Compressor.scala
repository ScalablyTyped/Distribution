package typings.winrtUwp.Windows.Storage.Compression

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A compressor takes information written to a stream and compresses it using a compression algorithm. */
@js.native
trait Compressor extends js.Object {
  
  /** Closes a Compressor object and synchronously discards any information in buffers. This will close the underlying stream as well unless the Compressor.Detach method has been used to detach the stream from the object. Subsequent calls on a closed object, except for Compressor.Close, will fail. */
  def close(): Unit = js.native
  
  /**
    * Detaches the underlying stream from the Compressor object so that the object can be closed using the Compressor.Close method without also closing the underlying stream.
    * @return The stream of information.
    */
  def detachStream(): IOutputStream = js.native
  
  /**
    * Finishes writing the compression stream.
    * @return The asynchronous operation.
    */
  def finishAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Flushes the compression stream asynchronously.
    * @return The asynchronous operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Writes information to the compression stream asynchronously.
    * @param buffer The buffer that contains the information to be written to the stream.
    * @return The asynchronous operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}
object Compressor {
  
  @scala.inline
  def apply(
    close: () => Unit,
    detachStream: () => IOutputStream,
    finishAsync: () => IPromiseWithIAsyncOperation[Boolean],
    flushAsync: () => IPromiseWithIAsyncOperation[Boolean],
    writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): Compressor = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), finishAsync = js.Any.fromFunction0(finishAsync), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[Compressor]
  }
  
  @scala.inline
  implicit class CompressorOps[Self <: Compressor] (val x: Self) extends AnyVal {
    
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
    def setDetachStream(value: () => IOutputStream): Self = this.set("detachStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinishAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("finishAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlushAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("flushAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteAsync(value: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = this.set("writeAsync", js.Any.fromFunction1(value))
  }
}
