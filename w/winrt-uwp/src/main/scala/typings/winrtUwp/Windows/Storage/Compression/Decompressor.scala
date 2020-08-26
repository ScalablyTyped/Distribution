package typings.winrtUwp.Windows.Storage.Compression

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A decompressor takes a stream compressed by a compressor and decompresses it. */
@js.native
trait Decompressor extends js.Object {
  /** Closes a Decompressor object and synchronously discards any information in buffers. This will close the underlying stream as well unless the Decompressor.Detach method has been used to detach the stream from the object. Subsequent calls on a closed object, except Decompressor.Close, will fail. */
  def close(): Unit = js.native
  /**
    * Detaches the underlying stream from the Decompressor object so that the object can be closed using the Decompressor.Close method without also closing the underlying stream.
    * @return The stream of information.
    */
  def detachStream(): IInputStream = js.native
  /**
    * Reads from the compression stream asynchronously.
    * @param buffer The buffer that contains the information to be read from the stream.
    * @param count The number of bytes to read.
    * @param options Read options
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
}

object Decompressor {
  @scala.inline
  def apply(
    close: () => Unit,
    detachStream: () => IInputStream,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  ): Decompressor = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[Decompressor]
  }
  @scala.inline
  implicit class DecompressorOps[Self <: Decompressor] (val x: Self) extends AnyVal {
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
    def setDetachStream(value: () => IInputStream): Self = this.set("detachStream", js.Any.fromFunction0(value))
    @scala.inline
    def setReadAsync(
      value: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
    ): Self = this.set("readAsync", js.Any.fromFunction3(value))
  }
  
}

