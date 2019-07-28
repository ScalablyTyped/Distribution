package typings.winrt.WindowsNs.StorageNs.StreamsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import typings.winrt.WindowsNs.FoundationNs.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOutputStream extends IClosable {
  def flushAsync(): IAsyncOperation[Boolean]
  def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double]
}

object IOutputStream {
  @scala.inline
  def apply(
    close: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): IOutputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
  
    __obj.asInstanceOf[IOutputStream]
  }
}

