package typings.winrtUwp.Windows.Storage.Streams

import typings.winrtUwp.Windows.Foundation.IClosable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sequential stream of bytes to be read. */
@js.native
trait IInputStream extends IClosable {
  /**
    * Reads data from the stream asynchronously.
    * @param buffer A buffer that may be used to return the bytes that are read. The return value contains the buffer that holds the results.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
}

object IInputStream {
  @scala.inline
  def apply(
    close: () => Unit,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  ): IInputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[IInputStream]
  }
  @scala.inline
  implicit class IInputStreamOps[Self <: IInputStream] (val x: Self) extends AnyVal {
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
    def setReadAsync(
      value: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
    ): Self = this.set("readAsync", js.Any.fromFunction3(value))
  }
  
}

