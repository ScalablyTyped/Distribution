package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundUploadProgress extends js.Object {
  var bytesReceived: scala.Double
  var bytesSent: scala.Double
  var hasResponseChanged: scala.Boolean
  var hasRestarted: scala.Boolean
  var status: BackgroundTransferStatus
  var totalBytesToReceive: scala.Double
  var totalBytesToSend: scala.Double
}

object BackgroundUploadProgress {
  @scala.inline
  def apply(
    bytesReceived: scala.Double,
    bytesSent: scala.Double,
    hasResponseChanged: scala.Boolean,
    hasRestarted: scala.Boolean,
    status: BackgroundTransferStatus,
    totalBytesToReceive: scala.Double,
    totalBytesToSend: scala.Double
  ): BackgroundUploadProgress = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived, bytesSent = bytesSent, hasResponseChanged = hasResponseChanged, hasRestarted = hasRestarted, status = status, totalBytesToReceive = totalBytesToReceive, totalBytesToSend = totalBytesToSend)
  
    __obj.asInstanceOf[BackgroundUploadProgress]
  }
}

