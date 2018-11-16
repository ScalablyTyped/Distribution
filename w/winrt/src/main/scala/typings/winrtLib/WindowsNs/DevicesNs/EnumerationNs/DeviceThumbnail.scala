package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration.DeviceThumbnail")
@js.native
class DeviceThumbnail ()
  extends winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType {
  /* CompleteClass */
  override var canRead: scala.Boolean = js.native
  /* CompleteClass */
  override var canWrite: scala.Boolean = js.native
  /* CompleteClass */
  override var contentType: java.lang.String = js.native
  /* CompleteClass */
  override var position: scala.Double = js.native
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override def cloneStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def flushAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  /* CompleteClass */
  override def getInputStreamAt(position: scala.Double): winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  /* CompleteClass */
  override def getOutputStreamAt(position: scala.Double): winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  /* CompleteClass */
  override def readAsync(
    buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    count: scala.Double,
    options: winrtLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double] = js.native
  /* CompleteClass */
  override def seek(position: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def writeAsync(buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

