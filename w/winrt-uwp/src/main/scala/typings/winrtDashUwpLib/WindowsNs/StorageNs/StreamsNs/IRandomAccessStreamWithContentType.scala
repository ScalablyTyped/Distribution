package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports random access of data in input and output streams for a specified data format. */
trait IRandomAccessStreamWithContentType
  extends IRandomAccessStream
     with IContentTypeProvider

object IRandomAccessStreamWithContentType {
  @scala.inline
  def apply(
    canRead: scala.Boolean,
    canWrite: scala.Boolean,
    cloneStream: js.Function0[IRandomAccessStream],
    close: js.Function0[scala.Unit],
    contentType: java.lang.String,
    flushAsync: js.Function0[
      winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean]
    ],
    getInputStreamAt: js.Function1[scala.Double, IInputStream],
    getOutputStreamAt: js.Function1[scala.Double, IOutputStream],
    position: scala.Double,
    readAsync: js.Function3[
      IBuffer, 
      scala.Double, 
      InputStreamOptions, 
      winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[IBuffer, scala.Double]
    ],
    seek: js.Function1[scala.Double, scala.Unit],
    size: scala.Double,
    writeAsync: js.Function1[
      IBuffer, 
      winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double]
    ]
  ): IRandomAccessStreamWithContentType = {
    val __obj = js.Dynamic.literal(canRead = canRead, canWrite = canWrite, cloneStream = cloneStream, close = close, contentType = contentType, flushAsync = flushAsync, getInputStreamAt = getInputStreamAt, getOutputStreamAt = getOutputStreamAt, position = position, readAsync = readAsync, seek = seek, size = size, writeAsync = writeAsync)
  
    __obj.asInstanceOf[IRandomAccessStreamWithContentType]
  }
}

