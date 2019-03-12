package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessStreamWithContentType
  extends IRandomAccessStream
     with IContentTypeProvider

object IRandomAccessStreamWithContentType {
  @scala.inline
  def apply(
    canRead: scala.Boolean,
    canWrite: scala.Boolean,
    cloneStream: () => IRandomAccessStream,
    close: () => scala.Unit,
    contentType: java.lang.String,
    flushAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean],
    getInputStreamAt: scala.Double => IInputStream,
    getOutputStreamAt: scala.Double => IOutputStream,
    position: scala.Double,
    readAsync: (IBuffer, scala.Double, InputStreamOptions) => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[IBuffer, scala.Double],
    seek: scala.Double => scala.Unit,
    size: scala.Double,
    writeAsync: IBuffer => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double]
  ): IRandomAccessStreamWithContentType = {
    val __obj = js.Dynamic.literal(canRead = canRead, canWrite = canWrite, cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), contentType = contentType, flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), position = position, readAsync = js.Any.fromFunction3(readAsync), seek = js.Any.fromFunction1(seek), size = size, writeAsync = js.Any.fromFunction1(writeAsync))
  
    __obj.asInstanceOf[IRandomAccessStreamWithContentType]
  }
}

