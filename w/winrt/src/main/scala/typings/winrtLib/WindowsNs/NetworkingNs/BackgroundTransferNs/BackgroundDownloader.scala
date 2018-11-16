package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
@js.native
class BackgroundDownloader () extends IBackgroundDownloader {
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

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
@js.native
object BackgroundDownloader extends js.Object {
  def getCurrentDownloadsAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.DownloadOperation]
  ] = js.native
  def getCurrentDownloadsAsync(group: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.DownloadOperation]
  ] = js.native
}

