package typings.winrt.WindowsNs.StorageNs.CompressionNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrt.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecompressor extends IInputStream {
  def detachStream(): IInputStream
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
}

