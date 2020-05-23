package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportStats extends js.Object {
  /** SDK 到腾讯视频云的 RTT (Round-Trip Time)，单位 ms */
  var rtt: Double
}

object TransportStats {
  @scala.inline
  def apply(rtt: Double): TransportStats = {
    val __obj = js.Dynamic.literal(rtt = rtt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportStats]
  }
}

