package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundUploaderStaticMethods extends js.Object {
  
  def getCurrentUploadsAsync(): IAsyncOperation[IVectorView[UploadOperation]] = js.native
  def getCurrentUploadsAsync(group: String): IAsyncOperation[IVectorView[UploadOperation]] = js.native
}
