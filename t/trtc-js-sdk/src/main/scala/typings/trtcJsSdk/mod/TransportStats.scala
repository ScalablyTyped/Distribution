package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportStats extends js.Object {
  /** SDK 到腾讯视频云的 RTT (Round-Trip Time)，单位 ms */
  var rtt: Double = js.native
}

object TransportStats {
  @scala.inline
  def apply(rtt: Double): TransportStats = {
    val __obj = js.Dynamic.literal(rtt = rtt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportStats]
  }
  @scala.inline
  implicit class TransportStatsOps[Self <: TransportStats] (val x: Self) extends AnyVal {
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
    def setRtt(value: Double): Self = this.set("rtt", value.asInstanceOf[js.Any])
  }
  
}

