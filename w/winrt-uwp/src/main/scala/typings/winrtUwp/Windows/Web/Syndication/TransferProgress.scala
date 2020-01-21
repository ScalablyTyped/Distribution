package typings.winrtUwp.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains progress information for a data transfer operation. */
trait TransferProgress extends js.Object {
  /** The number of bytes received. */
  var bytesRetrieved: Double
  /** The number of bytes sent. */
  var bytesSent: Double
  /** The total number of bytes that will be received during the transfer operation. */
  var totalBytesToRetrieve: Double
  /** The total number of bytes that will be sent during the transfer operation. */
  var totalBytesToSend: Double
}

object TransferProgress {
  @scala.inline
  def apply(bytesRetrieved: Double, bytesSent: Double, totalBytesToRetrieve: Double, totalBytesToSend: Double): TransferProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], totalBytesToRetrieve = totalBytesToRetrieve.asInstanceOf[js.Any], totalBytesToSend = totalBytesToSend.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransferProgress]
  }
}

