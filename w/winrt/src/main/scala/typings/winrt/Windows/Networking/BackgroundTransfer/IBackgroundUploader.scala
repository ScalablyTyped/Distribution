package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundUploader extends IBackgroundTransferBase {
  
  def createUpload(uri: Uri, sourceFile: IStorageFile): UploadOperation = js.native
  
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart]): IAsyncOperation[UploadOperation] = js.native
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart], subType: String): IAsyncOperation[UploadOperation] = js.native
  def createUploadAsync(uri: Uri, parts: IIterable[BackgroundTransferContentPart], subType: String, boundary: String): IAsyncOperation[UploadOperation] = js.native
  
  def createUploadFromStreamAsync(uri: Uri, sourceStream: IInputStream): IAsyncOperation[UploadOperation] = js.native
}
