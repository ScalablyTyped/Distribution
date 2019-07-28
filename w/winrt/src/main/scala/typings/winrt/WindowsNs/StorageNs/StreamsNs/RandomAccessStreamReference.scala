package typings.winrt.WindowsNs.StorageNs.StreamsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
class RandomAccessStreamReference () extends IRandomAccessStreamReference {
  /* CompleteClass */
  override def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
}

/* static members */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
object RandomAccessStreamReference extends js.Object {
  def createFromFile(file: IStorageFile): RandomAccessStreamReference = js.native
  def createFromStream(stream: IRandomAccessStream): RandomAccessStreamReference = js.native
  def createFromUri(uri: Uri): RandomAccessStreamReference = js.native
}

