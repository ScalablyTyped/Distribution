package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteVideoStats
  extends StObject
     with ReceivedMediaStats
     with VideoStats {
  
  /** 视频高度 */
  var frameHeight: Double
  
  /** 视频宽度 */
  var frameWidth: Double
  
  /** 已解码帧数 */
  var framesDecoded: Double
}
object RemoteVideoStats {
  
  inline def apply(
    bytesReceived: Double,
    frameHeight: Double,
    frameWidth: Double,
    framesDecoded: Double,
    framesHeight: Double,
    framesWidth: Double,
    packetsLost: Double,
    packetsReceived: Double
  ): RemoteVideoStats = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], frameHeight = frameHeight.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], framesDecoded = framesDecoded.asInstanceOf[js.Any], framesHeight = framesHeight.asInstanceOf[js.Any], framesWidth = framesWidth.asInstanceOf[js.Any], packetsLost = packetsLost.asInstanceOf[js.Any], packetsReceived = packetsReceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteVideoStats]
  }
  
  extension [Self <: RemoteVideoStats](x: Self) {
    
    inline def setFrameHeight(value: Double): Self = StObject.set(x, "frameHeight", value.asInstanceOf[js.Any])
    
    inline def setFrameWidth(value: Double): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
    
    inline def setFramesDecoded(value: Double): Self = StObject.set(x, "framesDecoded", value.asInstanceOf[js.Any])
  }
}
