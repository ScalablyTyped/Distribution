package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
class RandomAccessStreamReference () extends IRandomAccessStreamReference {
  /* CompleteClass */
  override def openReadAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
}

/* static members */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
object RandomAccessStreamReference extends js.Object {
  def createFromFile(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference = js.native
  def createFromStream(stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference = js.native
  def createFromUri(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference = js.native
}

