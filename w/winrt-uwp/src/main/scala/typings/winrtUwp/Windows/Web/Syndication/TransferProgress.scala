package typings.winrtUwp.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains progress information for a data transfer operation. */
@js.native
trait TransferProgress extends js.Object {
  /** The number of bytes received. */
  var bytesRetrieved: Double = js.native
  /** The number of bytes sent. */
  var bytesSent: Double = js.native
  /** The total number of bytes that will be received during the transfer operation. */
  var totalBytesToRetrieve: Double = js.native
  /** The total number of bytes that will be sent during the transfer operation. */
  var totalBytesToSend: Double = js.native
}

object TransferProgress {
  @scala.inline
  def apply(bytesRetrieved: Double, bytesSent: Double, totalBytesToRetrieve: Double, totalBytesToSend: Double): TransferProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], totalBytesToRetrieve = totalBytesToRetrieve.asInstanceOf[js.Any], totalBytesToSend = totalBytesToSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferProgress]
  }
  @scala.inline
  implicit class TransferProgressOps[Self <: TransferProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBytesRetrieved(value: Double): Self = this.set("bytesRetrieved", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesSent(value: Double): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytesToRetrieve(value: Double): Self = this.set("totalBytesToRetrieve", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytesToSend(value: Double): Self = this.set("totalBytesToSend", value.asInstanceOf[js.Any])
  }
  
}

