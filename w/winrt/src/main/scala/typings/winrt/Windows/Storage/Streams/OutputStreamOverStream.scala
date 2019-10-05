package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.OutputStreamOverStream")
@js.native
class OutputStreamOverStream () extends IOutputStream {
  /* CompleteClass */
  override def close(): Unit = js.native
  def dispose(): Unit = js.native
  /* CompleteClass */
  override def flushAsync(): IAsyncOperation[Boolean] = js.native
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
}

