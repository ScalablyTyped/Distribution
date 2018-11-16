package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.InMemoryRandomAccessStream")
@js.native
class InMemoryRandomAccessStream () extends IRandomAccessStream {
  /* CompleteClass */
  override var canRead: scala.Boolean = js.native
  /* CompleteClass */
  override var canWrite: scala.Boolean = js.native
  /* CompleteClass */
  override var position: scala.Double = js.native
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override def cloneStream(): IRandomAccessStream = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def flushAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  /* CompleteClass */
  override def getInputStreamAt(position: scala.Double): IInputStream = js.native
  /* CompleteClass */
  override def getOutputStreamAt(position: scala.Double): IOutputStream = js.native
  /* CompleteClass */
  override def readAsync(buffer: IBuffer, count: scala.Double, options: InputStreamOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[IBuffer, scala.Double] = js.native
  /* CompleteClass */
  override def seek(position: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

