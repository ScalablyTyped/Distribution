package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profile extends StObject {
  
  /** 比特率 kbs */
  var bitrate: Double
  
  /** 帧率 */
  var frameRate: Double
  
  /** 视频高度 */
  var height: Double
  
  /** 视频宽度 */
  var width: Double
}
object Profile {
  
  inline def apply(bitrate: Double, frameRate: Double, height: Double, width: Double): Profile = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  
  extension [Self <: Profile](x: Self) {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
