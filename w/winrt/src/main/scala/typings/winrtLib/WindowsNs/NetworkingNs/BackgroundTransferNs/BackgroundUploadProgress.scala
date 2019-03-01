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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytesReceived")(bytesReceived)
    __obj.updateDynamic("bytesSent")(bytesSent)
    __obj.updateDynamic("hasResponseChanged")(hasResponseChanged)
    __obj.updateDynamic("hasRestarted")(hasRestarted)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("totalBytesToReceive")(totalBytesToReceive)
    __obj.updateDynamic("totalBytesToSend")(totalBytesToSend)
    __obj.asInstanceOf[BackgroundUploadProgress]
  }
}

