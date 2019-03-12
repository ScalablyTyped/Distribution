package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageFileStatics extends js.Object {
  def createStreamedFileAsync(
    displayNameWithExtension: java.lang.String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
  def createStreamedFileFromUriAsync(
    displayNameWithExtension: java.lang.String,
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
  def getFileFromApplicationUriAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
  def getFileFromPathAsync(path: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
  def replaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
  def replaceWithStreamedFileFromUriAsync(
    fileToReplace: IStorageFile,
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
}

object IStorageFileStatics {
  @scala.inline
  def apply(
    createStreamedFileAsync: (java.lang.String, StreamedFileDataRequestedHandler, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference) => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile],
    createStreamedFileFromUriAsync: (java.lang.String, winrtLib.WindowsNs.FoundationNs.Uri, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference) => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile],
    getFileFromApplicationUriAsync: winrtLib.WindowsNs.FoundationNs.Uri => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile],
    getFileFromPathAsync: java.lang.String => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile],
    replaceWithStreamedFileAsync: (IStorageFile, StreamedFileDataRequestedHandler, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference) => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile],
    replaceWithStreamedFileFromUriAsync: (IStorageFile, winrtLib.WindowsNs.FoundationNs.Uri, winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference) => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
  ): IStorageFileStatics = {
    val __obj = js.Dynamic.literal(createStreamedFileAsync = js.Any.fromFunction3(createStreamedFileAsync), createStreamedFileFromUriAsync = js.Any.fromFunction3(createStreamedFileFromUriAsync), getFileFromApplicationUriAsync = js.Any.fromFunction1(getFileFromApplicationUriAsync), getFileFromPathAsync = js.Any.fromFunction1(getFileFromPathAsync), replaceWithStreamedFileAsync = js.Any.fromFunction3(replaceWithStreamedFileAsync), replaceWithStreamedFileFromUriAsync = js.Any.fromFunction3(replaceWithStreamedFileFromUriAsync))
  
    __obj.asInstanceOf[IStorageFileStatics]
  }
}

