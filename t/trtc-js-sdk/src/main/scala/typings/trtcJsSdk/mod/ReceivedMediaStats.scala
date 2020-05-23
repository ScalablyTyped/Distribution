package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceivedMediaStats extends js.Object {
  /** 已接收字节数 */
  var bytesReceived: Double
  /** 丢包数 */
  var packetsLost: Double
  /** 已接收包数 */
  var packetsReceived: Double
}

object ReceivedMediaStats {
  @scala.inline
  def apply(bytesReceived: Double, packetsLost: Double, packetsReceived: Double): ReceivedMediaStats = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], packetsLost = packetsLost.asInstanceOf[js.Any], packetsReceived = packetsReceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedMediaStats]
  }
}

