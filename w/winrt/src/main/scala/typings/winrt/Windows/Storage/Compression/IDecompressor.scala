package typings.winrt.Windows.Storage.Compression

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDecompressor extends IInputStream {
  def detachStream(): IInputStream = js.native
}

object IDecompressor {
  @scala.inline
  def apply(
    close: () => Unit,
    detachStream: () => IInputStream,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
  ): IDecompressor = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[IDecompressor]
  }
  @scala.inline
  implicit class IDecompressorOps[Self <: IDecompressor] (val x: Self) extends AnyVal {
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
    def setDetachStream(value: () => IInputStream): Self = this.set("detachStream", js.Any.fromFunction0(value))
  }
  
}

