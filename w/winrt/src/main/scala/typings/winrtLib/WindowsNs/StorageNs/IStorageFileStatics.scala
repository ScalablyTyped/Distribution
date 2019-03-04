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
    createStreamedFileAsync: js.Function3[
      java.lang.String, 
      StreamedFileDataRequestedHandler, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
    ],
    createStreamedFileFromUriAsync: js.Function3[
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
    ],
    getFileFromApplicationUriAsync: js.Function1[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
    ],
    getFileFromPathAsync: js.Function1[java.lang.String, winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]],
    replaceWithStreamedFileAsync: js.Function3[
      IStorageFile, 
      StreamedFileDataRequestedHandler, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
    ],
    replaceWithStreamedFileFromUriAsync: js.Function3[
      IStorageFile, 
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile]
    ]
  ): IStorageFileStatics = {
    val __obj = js.Dynamic.literal(createStreamedFileAsync = createStreamedFileAsync, createStreamedFileFromUriAsync = createStreamedFileFromUriAsync, getFileFromApplicationUriAsync = getFileFromApplicationUriAsync, getFileFromPathAsync = getFileFromPathAsync, replaceWithStreamedFileAsync = replaceWithStreamedFileAsync, replaceWithStreamedFileFromUriAsync = replaceWithStreamedFileFromUriAsync)
  
    __obj.asInstanceOf[IStorageFileStatics]
  }
}

