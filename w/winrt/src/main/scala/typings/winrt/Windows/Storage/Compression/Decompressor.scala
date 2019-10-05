package typings.winrt.Windows.Storage.Compression

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Compression.Decompressor")
@js.native
class Decompressor protected () extends IDecompressor {
  def this(underlyingStream: IInputStream) = this()
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def detachStream(): IInputStream = js.native
  def dispose(): Unit = js.native
  /* CompleteClass */
  override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
}

