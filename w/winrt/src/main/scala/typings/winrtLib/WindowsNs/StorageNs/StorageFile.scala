package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageFile")
@js.native
class StorageFile ()
  extends IStorageFile
     with IStorageItemProperties {
  /* CompleteClass */
  override def openReadAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType] = js.native
  /* CompleteClass */
  override def openSequentialReadAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream] = js.native
}

@JSGlobal("Windows.Storage.StorageFile")
@js.native
object StorageFile extends js.Object {
  def createStreamedFileAsync(
    displayNameWithExtension: java.lang.String,
    dataRequested: winrtLib.WindowsNs.StorageNs.StreamedFileDataRequestedHandler,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def createStreamedFileFromUriAsync(
    displayNameWithExtension: java.lang.String,
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def getFileFromApplicationUriAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def getFileFromPathAsync(path: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def replaceWithStreamedFileAsync(
    fileToReplace: winrtLib.WindowsNs.StorageNs.IStorageFile,
    dataRequested: winrtLib.WindowsNs.StorageNs.StreamedFileDataRequestedHandler,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
  def replaceWithStreamedFileFromUriAsync(
    fileToReplace: winrtLib.WindowsNs.StorageNs.IStorageFile,
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
}

