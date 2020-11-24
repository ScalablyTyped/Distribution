package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains status information about the download operation. */
@js.native
trait BackgroundDownloadProgress extends js.Object {
  
  /** The total number of bytes received. This value does not include bytes received as response headers. */
  var bytesReceived: Double = js.native
  
  /** true if the download request response has changed; otherwise, false. */
  var hasResponseChanged: Boolean = js.native
  
  /** true if a data transfer operation has restarted; otherwise false. */
  var hasRestarted: Boolean = js.native
  
  /** The current status of the download operation. */
  var status: BackgroundTransferStatus = js.native
  
  /** The total number of bytes of data to download. If this number is unknown, this value is set to 0. */
  var totalBytesToReceive: Double = js.native
}
object BackgroundDownloadProgress {
  
  @scala.inline
  def apply(
    bytesReceived: Double,
    hasResponseChanged: Boolean,
    hasRestarted: Boolean,
    status: BackgroundTransferStatus,
    totalBytesToReceive: Double
  ): BackgroundDownloadProgress = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], hasResponseChanged = hasResponseChanged.asInstanceOf[js.Any], hasRestarted = hasRestarted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], totalBytesToReceive = totalBytesToReceive.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundDownloadProgress]
  }
  
  @scala.inline
  implicit class BackgroundDownloadProgressOps[Self <: BackgroundDownloadProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBytesReceived(value: Double): Self = this.set("bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasResponseChanged(value: Boolean): Self = this.set("hasResponseChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRestarted(value: Boolean): Self = this.set("hasRestarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BackgroundTransferStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToReceive(value: Double): Self = this.set("totalBytesToReceive", value.asInstanceOf[js.Any])
  }
}
