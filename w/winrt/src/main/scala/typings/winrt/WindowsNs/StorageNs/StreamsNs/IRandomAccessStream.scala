package typings.winrt.WindowsNs.StorageNs.StreamsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessStream
  extends IInputStream
     with IOutputStream {
  var canRead: Boolean
  var canWrite: Boolean
  var position: Double
  var size: Double
  def cloneStream(): IRandomAccessStream
  def getInputStreamAt(position: Double): IInputStream
  def getOutputStreamAt(position: Double): IOutputStream
  def seek(position: Double): Unit
}

object IRandomAccessStream {
  @scala.inline
  def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: () => IRandomAccessStream,
    close: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    getInputStreamAt: Double => IInputStream,
    getOutputStreamAt: Double => IOutputStream,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double],
    seek: Double => Unit,
    size: Double,
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): IRandomAccessStream = {
    val __obj = js.Dynamic.literal(canRead = canRead, canWrite = canWrite, cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), position = position, readAsync = js.Any.fromFunction3(readAsync), seek = js.Any.fromFunction1(seek), size = size, writeAsync = js.Any.fromFunction1(writeAsync))
  
    __obj.asInstanceOf[IRandomAccessStream]
  }
}

