package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentMediaStats extends js.Object {
  /** 已发送字节数 */
  var bytesSent: Double
  /** 已发送包数 */
  var packetsSent: Double
}

object SentMediaStats {
  @scala.inline
  def apply(bytesSent: Double, packetsSent: Double): SentMediaStats = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], packetsSent = packetsSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMediaStats]
  }
}

