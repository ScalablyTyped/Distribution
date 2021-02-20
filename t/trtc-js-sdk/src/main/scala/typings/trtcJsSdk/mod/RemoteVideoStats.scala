package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class RemoteVideoStatsMutableBuilder[Self <: RemoteVideoStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFramesDecoded(value: Double): Self = StObject.set(x, "framesDecoded", value.asInstanceOf[js.Any])
  }
}
