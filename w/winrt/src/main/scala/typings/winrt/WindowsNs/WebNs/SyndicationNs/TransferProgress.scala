package typings.winrt.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferProgress extends js.Object {
  var bytesRetrieved: Double
  var bytesSent: Double
  var totalBytesToRetrieve: Double
  var totalBytesToSend: Double
}

object TransferProgress {
  @scala.inline
  def apply(bytesRetrieved: Double, bytesSent: Double, totalBytesToRetrieve: Double, totalBytesToSend: Double): TransferProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved, bytesSent = bytesSent, totalBytesToRetrieve = totalBytesToRetrieve, totalBytesToSend = totalBytesToSend)
  
    __obj.asInstanceOf[TransferProgress]
  }
}

