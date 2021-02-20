package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.StreamedFileDataRequestedHandler
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.StorageFile")
@js.native
class StorageFile ()
  extends typings.winrt.Windows.Storage.StorageFile
/* static members */
object StorageFile {
  
  @JSGlobal("Windows.Storage.StorageFile.createStreamedFileAsync")
  @js.native
  def createStreamedFileAsync(
    displayNameWithExtension: String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.StorageFile.createStreamedFileFromUriAsync")
  @js.native
  def createStreamedFileFromUriAsync(displayNameWithExtension: String, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.StorageFile.getFileFromApplicationUriAsync")
  @js.native
  def getFileFromApplicationUriAsync(uri: Uri): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.StorageFile.getFileFromPathAsync")
  @js.native
  def getFileFromPathAsync(path: String): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.StorageFile.replaceWithStreamedFileAsync")
  @js.native
  def replaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  
  @JSGlobal("Windows.Storage.StorageFile.replaceWithStreamedFileFromUriAsync")
  @js.native
  def replaceWithStreamedFileFromUriAsync(fileToReplace: IStorageFile, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
}
