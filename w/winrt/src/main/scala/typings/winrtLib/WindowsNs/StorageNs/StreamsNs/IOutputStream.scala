package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOutputStream
  extends winrtLib.WindowsNs.FoundationNs.IClosable {
  def flushAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]
  def writeAsync(buffer: IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double]
}

object IOutputStream {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    flushAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]],
    writeAsync: js.Function1[
      IBuffer, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double]
    ]
  ): IOutputStream = {
    val __obj = js.Dynamic.literal(close = close, flushAsync = flushAsync, writeAsync = writeAsync)
  
    __obj.asInstanceOf[IOutputStream]
  }
}

