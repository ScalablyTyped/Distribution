package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStorageFileStatics extends StObject {
  
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
  
  @scala.inline
  implicit class IStorageFileStaticsMutableBuilder[Self <: IStorageFileStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateStreamedFileAsync(
      value: (String, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]
    ): Self = StObject.set(x, "createStreamedFileAsync", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateStreamedFileFromUriAsync(value: (String, Uri, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]): Self = StObject.set(x, "createStreamedFileFromUriAsync", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetFileFromApplicationUriAsync(value: Uri => IAsyncOperation[StorageFile]): Self = StObject.set(x, "getFileFromApplicationUriAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFileFromPathAsync(value: String => IAsyncOperation[StorageFile]): Self = StObject.set(x, "getFileFromPathAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceWithStreamedFileAsync(
      value: (IStorageFile, StreamedFileDataRequestedHandler, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]
    ): Self = StObject.set(x, "replaceWithStreamedFileAsync", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReplaceWithStreamedFileFromUriAsync(value: (IStorageFile, Uri, IRandomAccessStreamReference) => IAsyncOperation[StorageFile]): Self = StObject.set(x, "replaceWithStreamedFileFromUriAsync", js.Any.fromFunction3(value))
  }
}
