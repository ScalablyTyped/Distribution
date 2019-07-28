package typings.winrt.WindowsNs.DevicesNs.EnumerationNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IOutputStream
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType
import typings.winrt.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration.DeviceThumbnail")
@js.native
class DeviceThumbnail () extends IRandomAccessStreamWithContentType {
  /* CompleteClass */
  override var canRead: Boolean = js.native
  /* CompleteClass */
  override var canWrite: Boolean = js.native
  /* CompleteClass */
  override var contentType: String = js.native
  /* CompleteClass */
  override var position: Double = js.native
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def cloneStream(): IRandomAccessStream = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  def dispose(): Unit = js.native
  /* CompleteClass */
  override def flushAsync(): IAsyncOperation[Boolean] = js.native
  /* CompleteClass */
  override def getInputStreamAt(position: Double): IInputStream = js.native
  /* CompleteClass */
  override def getOutputStreamAt(position: Double): IOutputStream = js.native
  /* CompleteClass */
  override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
  /* CompleteClass */
  override def seek(position: Double): Unit = js.native
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
}

