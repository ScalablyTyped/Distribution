package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains progress information for a data transfer operation. */
trait TransferProgress extends js.Object {
  /** The number of bytes received. */
  var bytesRetrieved: scala.Double
  /** The number of bytes sent. */
  var bytesSent: scala.Double
  /** The total number of bytes that will be received during the transfer operation. */
  var totalBytesToRetrieve: scala.Double
  /** The total number of bytes that will be sent during the transfer operation. */
  var totalBytesToSend: scala.Double
}

