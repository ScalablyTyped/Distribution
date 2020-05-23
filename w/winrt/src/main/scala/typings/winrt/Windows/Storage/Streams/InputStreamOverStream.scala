package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputStreamOverStream extends IInputStream {
  def dispose(): Unit
}

object InputStreamOverStream {
  @scala.inline
  def apply(
    close: () => Unit,
    dispose: () => Unit,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
  ): InputStreamOverStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[InputStreamOverStream]
  }
}

