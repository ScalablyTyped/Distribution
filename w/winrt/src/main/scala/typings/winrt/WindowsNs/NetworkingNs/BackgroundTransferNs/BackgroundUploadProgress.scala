package typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundUploadProgress extends js.Object {
  var bytesReceived: Double
  var bytesSent: Double
  var hasResponseChanged: Boolean
  var hasRestarted: Boolean
  var status: BackgroundTransferStatus
  var totalBytesToReceive: Double
  var totalBytesToSend: Double
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
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived, bytesSent = bytesSent, hasResponseChanged = hasResponseChanged, hasRestarted = hasRestarted, status = status, totalBytesToReceive = totalBytesToReceive, totalBytesToSend = totalBytesToSend)
  
    __obj.asInstanceOf[BackgroundUploadProgress]
  }
}

