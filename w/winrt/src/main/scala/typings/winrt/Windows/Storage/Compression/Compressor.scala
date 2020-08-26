package typings.winrt.Windows.Storage.Compression

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compressor extends ICompressor {
  def dispose(): Unit = js.native
}

object Compressor {
  @scala.inline
  def apply(
    close: () => Unit,
    detachStream: () => IOutputStream,
    dispose: () => Unit,
    finishAsync: () => IAsyncOperation[Boolean],
    flushAsync: () => IAsyncOperation[Boolean],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): Compressor = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), dispose = js.Any.fromFunction0(dispose), finishAsync = js.Any.fromFunction0(finishAsync), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
  }
  
}

