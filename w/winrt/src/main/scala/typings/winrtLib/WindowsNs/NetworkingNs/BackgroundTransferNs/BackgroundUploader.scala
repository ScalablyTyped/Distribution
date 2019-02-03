package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
@js.native
class BackgroundUploader () extends IBackgroundUploader {
  /* CompleteClass */
  override var costPolicy: BackgroundTransferCostPolicy = js.native
  /* CompleteClass */
  override var group: java.lang.String = js.native
  /* CompleteClass */
  override var method: java.lang.String = js.native
  /* CompleteClass */
  override var proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /* CompleteClass */
  override var serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /* CompleteClass */
  override def setRequestHeader(headerName: java.lang.String, headerValue: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
@js.native
object BackgroundUploader extends js.Object {
  def getCurrentUploadsAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.UploadOperation]
  ] = js.native
  def getCurrentUploadsAsync(group: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.UploadOperation]
  ] = js.native
}

