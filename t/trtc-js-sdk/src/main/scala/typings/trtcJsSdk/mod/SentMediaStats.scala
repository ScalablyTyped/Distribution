package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentMediaStats extends js.Object {
  /** 已发送字节数 */
  var bytesSent: Double = js.native
  /** 已发送包数 */
  var packetsSent: Double = js.native
}

object SentMediaStats {
  @scala.inline
  def apply(bytesSent: Double, packetsSent: Double): SentMediaStats = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], packetsSent = packetsSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMediaStats]
  }
  @scala.inline
  implicit class SentMediaStatsOps[Self <: SentMediaStats] (val x: Self) extends AnyVal {
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
    def setBytesSent(value: Double): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPacketsSent(value: Double): Self = this.set("packetsSent", value.asInstanceOf[js.Any])
  }
  
}

