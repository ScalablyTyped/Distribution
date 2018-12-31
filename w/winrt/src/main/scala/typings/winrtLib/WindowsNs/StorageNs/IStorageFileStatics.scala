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

