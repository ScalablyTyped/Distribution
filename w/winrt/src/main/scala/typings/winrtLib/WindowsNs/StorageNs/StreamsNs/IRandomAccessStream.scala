package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessStream
  extends IInputStream
     with IOutputStream {
  var canRead: scala.Boolean
  var canWrite: scala.Boolean
  var position: scala.Double
  var size: scala.Double
  def cloneStream(): IRandomAccessStream
  def getInputStreamAt(position: scala.Double): IInputStream
  def getOutputStreamAt(position: scala.Double): IOutputStream
  def seek(position: scala.Double): scala.Unit
}

object IRandomAccessStream {
  @scala.inline
  def apply(
    canRead: scala.Boolean,
    canWrite: scala.Boolean,
    cloneStream: js.Function0[IRandomAccessStream],
    close: js.Function0[scala.Unit],
    flushAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]],
    getInputStreamAt: js.Function1[scala.Double, IInputStream],
    getOutputStreamAt: js.Function1[scala.Double, IOutputStream],
    position: scala.Double,
    readAsync: js.Function3[
      IBuffer, 
      scala.Double, 
      InputStreamOptions, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[IBuffer, scala.Double]
    ],
    seek: js.Function1[scala.Double, scala.Unit],
    size: scala.Double,
    writeAsync: js.Function1[
      IBuffer, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double]
    ]
  ): IRandomAccessStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canRead")(canRead)
    __obj.updateDynamic("canWrite")(canWrite)
    __obj.updateDynamic("cloneStream")(cloneStream)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("flushAsync")(flushAsync)
    __obj.updateDynamic("getInputStreamAt")(getInputStreamAt)
    __obj.updateDynamic("getOutputStreamAt")(getOutputStreamAt)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("readAsync")(readAsync)
    __obj.updateDynamic("seek")(seek)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("writeAsync")(writeAsync)
    __obj.asInstanceOf[IRandomAccessStream]
  }
}

