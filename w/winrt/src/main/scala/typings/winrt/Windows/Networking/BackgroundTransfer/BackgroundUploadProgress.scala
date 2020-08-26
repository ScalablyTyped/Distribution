package typings.winrt.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundUploadProgress extends js.Object {
  var bytesReceived: Double = js.native
  var bytesSent: Double = js.native
  var hasResponseChanged: Boolean = js.native
  var hasRestarted: Boolean = js.native
  var status: BackgroundTransferStatus = js.native
  var totalBytesToReceive: Double = js.native
  var totalBytesToSend: Double = js.native
}

object BackgroundUploadProgress {
  @scala.inline
  def apply(
    bytesReceived: Double,
    bytesSent: Double,
    hasResponseChanged: Boolean,
    hasRestarted: Boolean,
    status: BackgroundTransferStatus,
    totalBytesToReceive: Double,
    totalBytesToSend: Double
  ): BackgroundUploadProgress = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], hasResponseChanged = hasResponseChanged.asInstanceOf[js.Any], hasRestarted = hasRestarted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], totalBytesToReceive = totalBytesToReceive.asInstanceOf[js.Any], totalBytesToSend = totalBytesToSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundUploadProgress]
  }
  @scala.inline
  implicit class BackgroundUploadProgressOps[Self <: BackgroundUploadProgress] (val x: Self) extends AnyVal {
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
    def setBytesSent(value: Double): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasResponseChanged(value: Boolean): Self = this.set("hasResponseChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasRestarted(value: Boolean): Self = this.set("hasRestarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: BackgroundTransferStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytesToReceive(value: Double): Self = this.set("totalBytesToReceive", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytesToSend(value: Double): Self = this.set("totalBytesToSend", value.asInstanceOf[js.Any])
  }
  
}

