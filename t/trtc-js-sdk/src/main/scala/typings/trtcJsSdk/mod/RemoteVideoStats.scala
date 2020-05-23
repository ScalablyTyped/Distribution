package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteVideoStats
  extends ReceivedMediaStats
     with VideoStats {
  /** 已解码帧数 */
  var framesDecoded: Double
}

object RemoteVideoStats {
  @scala.inline
  def apply(
    bytesReceived: Double,
    framesDecoded: Double,
    framesHeight: Double,
    framesWidth: Double,
    packetsLost: Double,
    packetsReceived: Double
  ): RemoteVideoStats = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], framesDecoded = framesDecoded.asInstanceOf[js.Any], framesHeight = framesHeight.asInstanceOf[js.Any], framesWidth = framesWidth.asInstanceOf[js.Any], packetsLost = packetsLost.asInstanceOf[js.Any], packetsReceived = packetsReceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteVideoStats]
  }
}

