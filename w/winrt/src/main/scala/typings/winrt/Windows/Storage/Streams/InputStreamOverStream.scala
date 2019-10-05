package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.InputStreamOverStream")
@js.native
class InputStreamOverStream () extends IInputStream {
  /* CompleteClass */
  override def close(): Unit = js.native
  def dispose(): Unit = js.native
  /* CompleteClass */
  override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
}

