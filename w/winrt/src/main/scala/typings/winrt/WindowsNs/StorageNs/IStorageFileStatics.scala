package typings.winrt.WindowsNs.StorageNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageFileStatics extends js.Object {
  def createStreamedFileAsync(
    displayNameWithExtension: String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[StorageFile]
  def createStreamedFileFromUriAsync(displayNameWithExtension: String, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[StorageFile]
  def getFileFromApplicationUriAsync(uri: Uri): IAsyncOperation[StorageFile]
  def getFileFromPathAsync(path: String): IAsyncOperation[StorageFile]
  def replaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[StorageFile]
  def replaceWithStreamedFileFromUriAsync(fileToReplace: IStorageFile, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[StorageFile]
}

object IStorageFileStatics {
  @scala.inline
  def apply(
    createStreamedFileAsync: (String, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => IAsyncOperation[StorageFile],
    createStreamedFileFromUriAsync: (String, Uri, IRandomAccessStreamReference) => IAsyncOperation[StorageFile],
    getFileFromApplicationUriAsync: Uri => IAsyncOperation[StorageFile],
    getFileFromPathAsync: String => IAsyncOperation[StorageFile],
    replaceWithStreamedFileAsync: (IStorageFile, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => IAsyncOperation[StorageFile],
    replaceWithStreamedFileFromUriAsync: (IStorageFile, Uri, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]
  ): IStorageFileStatics = {
    val __obj = js.Dynamic.literal(createStreamedFileAsync = js.Any.fromFunction3(createStreamedFileAsync), createStreamedFileFromUriAsync = js.Any.fromFunction3(createStreamedFileFromUriAsync), getFileFromApplicationUriAsync = js.Any.fromFunction1(getFileFromApplicationUriAsync), getFileFromPathAsync = js.Any.fromFunction1(getFileFromPathAsync), replaceWithStreamedFileAsync = js.Any.fromFunction3(replaceWithStreamedFileAsync), replaceWithStreamedFileFromUriAsync = js.Any.fromFunction3(replaceWithStreamedFileFromUriAsync))
  
    __obj.asInstanceOf[IStorageFileStatics]
  }
}

