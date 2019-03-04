package typings
package winrtLib.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompressor
  extends winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream {
  def detachStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  def finishAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]
}

object ICompressor {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    detachStream: js.Function0[winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream],
    finishAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]],
    flushAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]],
    writeAsync: js.Function1[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double]
    ]
  ): ICompressor = {
    val __obj = js.Dynamic.literal(close = close, detachStream = detachStream, finishAsync = finishAsync, flushAsync = flushAsync, writeAsync = writeAsync)
  
    __obj.asInstanceOf[ICompressor]
  }
}

