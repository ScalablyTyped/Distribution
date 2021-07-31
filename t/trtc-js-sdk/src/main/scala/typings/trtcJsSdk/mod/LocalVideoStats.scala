package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalVideoStats
  extends StObject
     with SentMediaStats
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
  
  @scala.inline
  implicit class LocalVideoStatsMutableBuilder[Self <: LocalVideoStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFramesEncoded(value: Double): Self = StObject.set(x, "framesEncoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesSent(value: Double): Self = StObject.set(x, "framesSent", value.asInstanceOf[js.Any])
  }
}
