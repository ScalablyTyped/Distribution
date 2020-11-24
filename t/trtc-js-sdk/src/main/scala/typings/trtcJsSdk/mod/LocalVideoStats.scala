package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalVideoStats
  extends SentMediaStats
     with VideoStats {
  
  /** 已编码帧数 */
  var framesEncoded: Double = js.native
  
  /** 已发送帧数 */
  var framesSent: Double = js.native
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
  
  @scala.inline
  implicit class LocalVideoStatsOps[Self <: LocalVideoStats] (val x: Self) extends AnyVal {
    
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
    def setFramesEncoded(value: Double): Self = this.set("framesEncoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesSent(value: Double): Self = this.set("framesSent", value.asInstanceOf[js.Any])
  }
}
