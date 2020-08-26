package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceivedMediaStats extends js.Object {
  /** 已接收字节数 */
  var bytesReceived: Double = js.native
  /** 丢包数 */
  var packetsLost: Double = js.native
  /** 已接收包数 */
  var packetsReceived: Double = js.native
}

object ReceivedMediaStats {
  @scala.inline
  def apply(bytesReceived: Double, packetsLost: Double, packetsReceived: Double): ReceivedMediaStats = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], packetsLost = packetsLost.asInstanceOf[js.Any], packetsReceived = packetsReceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedMediaStats]
  }
  @scala.inline
  implicit class ReceivedMediaStatsOps[Self <: ReceivedMediaStats] (val x: Self) extends AnyVal {
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
    def setBytesReceived(value: Double): Self = this.set("bytesReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setPacketsLost(value: Double): Self = this.set("packetsLost", value.asInstanceOf[js.Any])
    @scala.inline
    def setPacketsReceived(value: Double): Self = this.set("packetsReceived", value.asInstanceOf[js.Any])
  }
  
}

