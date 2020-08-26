package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteVideoStats
  extends ReceivedMediaStats
     with VideoStats {
  /** 已解码帧数 */
  var framesDecoded: Double = js.native
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
  @scala.inline
  implicit class RemoteVideoStatsOps[Self <: RemoteVideoStats] (val x: Self) extends AnyVal {
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
    def setFramesDecoded(value: Double): Self = this.set("framesDecoded", value.asInstanceOf[js.Any])
  }
  
}

