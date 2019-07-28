package typings.winrt.WindowsNs.StorageNs.CompressionNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompressor extends IOutputStream {
  def detachStream(): IOutputStream
  def finishAsync(): IAsyncOperation[Boolean]
}

object ICompressor {
  @scala.inline
  def apply(
    close: () => Unit,
    detachStream: () => IOutputStream,
    finishAsync: () => IAsyncOperation[Boolean],
    flushAsync: () => IAsyncOperation[Boolean],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): ICompressor = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), finishAsync = js.Any.fromFunction0(finishAsync), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
  
    __obj.asInstanceOf[ICompressor]
  }
}

