package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamedFileDataRequest
  extends IOutputStream
     with IStreamedFileDataRequest {
  def dispose(): Unit
}

object StreamedFileDataRequest {
  @scala.inline
  def apply(
    close: () => Unit,
    dispose: () => Unit,
    failAndClose: StreamedFileFailureMode => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): StreamedFileDataRequest = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), failAndClose = js.Any.fromFunction1(failAndClose), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[StreamedFileDataRequest]
  }
}

