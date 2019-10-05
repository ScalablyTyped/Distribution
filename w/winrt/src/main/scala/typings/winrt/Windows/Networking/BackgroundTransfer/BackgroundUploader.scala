package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
@js.native
class BackgroundUploader () extends IBackgroundUploader {
  /* CompleteClass */
  override var costPolicy: BackgroundTransferCostPolicy = js.native
  /* CompleteClass */
  override var group: String = js.native
  /* CompleteClass */
  override var method: String = js.native
  /* CompleteClass */
  override var proxyCredential: PasswordCredential = js.native
  /* CompleteClass */
  override var serverCredential: PasswordCredential = js.native
  /* CompleteClass */
  override def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
@js.native
object BackgroundUploader extends js.Object {
  def getCurrentUploadsAsync(): IAsyncOperation[IVectorView[UploadOperation]] = js.native
  def getCurrentUploadsAsync(group: String): IAsyncOperation[IVectorView[UploadOperation]] = js.native
}

