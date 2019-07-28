package typings.winrt.WindowsNs.StorageNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageFile")
@js.native
class StorageFile ()
  extends IStorageFile
     with IStorageItemProperties {
  /* CompleteClass */
  override def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  /* CompleteClass */
  override def openSequentialReadAsync(): IAsyncOperation[IInputStream] = js.native
}

/* static members */
@JSGlobal("Windows.Storage.StorageFile")
@js.native
object StorageFile extends js.Object {
  def createStreamedFileAsync(
    displayNameWithExtension: String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[StorageFile] = js.native
  def createStreamedFileFromUriAsync(displayNameWithExtension: String, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[StorageFile] = js.native
  def getFileFromApplicationUriAsync(uri: Uri): IAsyncOperation[StorageFile] = js.native
  def getFileFromPathAsync(path: String): IAsyncOperation[StorageFile] = js.native
  def replaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[StorageFile] = js.native
  def replaceWithStreamedFileFromUriAsync(fileToReplace: IStorageFile, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[StorageFile] = js.native
}

