package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
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

