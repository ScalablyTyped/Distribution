package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalVideoStats
  extends SentMediaStats
     with VideoStats {
  /** 已编码帧数 */
  var framesEncoded: Double
  /** 已发送帧数 */
  var framesSent: Double
}

object LocalVideoStats {
  @scala.inline
  def apply(
    bytesSent: Double,
    framesEncoded: Double,
    framesHeight: Double,
    framesSent: Double,
    framesWidth: Double,
    packetsSent: Double
  ): LocalVideoStats = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], framesEncoded = framesEncoded.asInstanceOf[js.Any], framesHeight = framesHeight.asInstanceOf[js.Any], framesSent = framesSent.asInstanceOf[js.Any], framesWidth = framesWidth.asInstanceOf[js.Any], packetsSent = packetsSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVideoStats]
  }
}

