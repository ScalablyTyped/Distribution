package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOutputStream extends IClosable {
  def flushAsync(): IAsyncOperation[Boolean] = js.native
  def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
}

object IOutputStream {
  @scala.inline
  def apply(
    close: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): IOutputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[IOutputStream]
  }
  @scala.inline
  implicit class IOutputStreamOps[Self <: IOutputStream] (val x: Self) extends AnyVal {
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
    def setFlushAsync(value: () => IAsyncOperation[Boolean]): Self = this.set("flushAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setWriteAsync(value: IBuffer => IAsyncOperationWithProgress[Double, Double]): Self = this.set("writeAsync", js.Any.fromFunction1(value))
  }
  
}

