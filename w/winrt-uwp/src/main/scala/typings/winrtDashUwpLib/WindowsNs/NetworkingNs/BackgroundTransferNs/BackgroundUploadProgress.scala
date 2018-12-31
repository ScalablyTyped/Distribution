package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains status information about the upload operation. */
trait BackgroundUploadProgress extends js.Object {
  /** The total number of bytes received. This value does not include bytes received as part of response headers. If the upload operation has restarted, this value may be smaller than in the previous progress report. */
  var bytesReceived: scala.Double
  /** The total number of bytes sent. If the upload operation has restarted, this value may be smaller than in the previous progress report. */
  var bytesSent: scala.Double
  /** TRUE if the upload request response has changed; otherwise, FALSE. */
  var hasResponseChanged: scala.Boolean
  /** true if a upload transfer operation has restarted; otherwise false. */
  var hasRestarted: scala.Boolean
  /** The current status of the upload operation. */
  var status: BackgroundTransferStatus
  /** The total number of bytes of data to upload. If this number is unknown, this value is set to 0. */
  var totalBytesToReceive: scala.Double
  /** The total number of bytes to upload. */
  var totalBytesToSend: scala.Double
}

