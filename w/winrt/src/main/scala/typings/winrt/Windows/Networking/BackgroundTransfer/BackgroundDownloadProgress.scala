package typings.winrt.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundDownloadProgress extends js.Object {
  var bytesReceived: Double
  var hasResponseChanged: Boolean
  var hasRestarted: Boolean
  var status: BackgroundTransferStatus
  var totalBytesToReceive: Double
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
}

