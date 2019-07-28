package typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs

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
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived, hasResponseChanged = hasResponseChanged, hasRestarted = hasRestarted, status = status, totalBytesToReceive = totalBytesToReceive)
  
    __obj.asInstanceOf[BackgroundDownloadProgress]
  }
}

