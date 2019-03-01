package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundDownloadProgress extends js.Object {
  var bytesReceived: scala.Double
  var hasResponseChanged: scala.Boolean
  var hasRestarted: scala.Boolean
  var status: BackgroundTransferStatus
  var totalBytesToReceive: scala.Double
}

object BackgroundDownloadProgress {
  @scala.inline
  def apply(
    bytesReceived: scala.Double,
    hasResponseChanged: scala.Boolean,
    hasRestarted: scala.Boolean,
    status: BackgroundTransferStatus,
    totalBytesToReceive: scala.Double
  ): BackgroundDownloadProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytesReceived")(bytesReceived)
    __obj.updateDynamic("hasResponseChanged")(hasResponseChanged)
    __obj.updateDynamic("hasRestarted")(hasRestarted)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("totalBytesToReceive")(totalBytesToReceive)
    __obj.asInstanceOf[BackgroundDownloadProgress]
  }
}

