package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.StreamedFileDataRequestedHandler
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.StorageFile")
@js.native
class StorageFile ()
  extends StObject
     with typings.winrt.Windows.Storage.StorageFile {
  
  /* CompleteClass */
  override def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  
  /* CompleteClass */
  override def openSequentialReadAsync(): IAsyncOperation[IInputStream] = js.native
}
/* static members */
object StorageFile {
  
  @JSGlobal("Windows.Storage.StorageFile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStreamedFileAsync(
    displayNameWithExtension: String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStreamedFileAsync")(displayNameWithExtension.asInstanceOf[js.Any], dataRequested.asInstanceOf[js.Any], thumbnail.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Storage.StorageFile]]
  
  inline def createStreamedFileFromUriAsync(displayNameWithExtension: String, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStreamedFileFromUriAsync")(displayNameWithExtension.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], thumbnail.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Storage.StorageFile]]
  
  inline def getFileFromApplicationUriAsync(uri: Uri): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromApplicationUriAsync")(uri.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Storage.StorageFile]]
  
  inline def getFileFromPathAsync(path: String): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileFromPathAsync")(path.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Storage.StorageFile]]
  
  inline def replaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceWithStreamedFileAsync")(fileToReplace.asInstanceOf[js.Any], dataRequested.asInstanceOf[js.Any], thumbnail.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Storage.StorageFile]]
  
  inline def replaceWithStreamedFileFromUriAsync(fileToReplace: IStorageFile, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceWithStreamedFileFromUriAsync")(fileToReplace.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], thumbnail.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Storage.StorageFile]]
}
