package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoStats extends StObject {
  
  /** 视频高度 */
  var framesHeight: Double
  
  /** 视频宽度 */
  var framesWidth: Double
}
object VideoStats {
  
  inline def apply(framesHeight: Double, framesWidth: Double): VideoStats = {
    val __obj = js.Dynamic.literal(framesHeight = framesHeight.asInstanceOf[js.Any], framesWidth = framesWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStats]
  }
  
  extension [Self <: VideoStats](x: Self) {
    
    inline def setFramesHeight(value: Double): Self = StObject.set(x, "framesHeight", value.asInstanceOf[js.Any])
    
    inline def setFramesWidth(value: Double): Self = StObject.set(x, "framesWidth", value.asInstanceOf[js.Any])
  }
}
