package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputStreamOverStream extends IOutputStream {
  def dispose(): Unit = js.native
}

object OutputStreamOverStream {
  @scala.inline
  def apply(
    close: () => Unit,
    dispose: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): OutputStreamOverStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[OutputStreamOverStream]
  }
  @scala.inline
  implicit class OutputStreamOverStreamOps[Self <: OutputStreamOverStream] (val x: Self) extends AnyVal {
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

