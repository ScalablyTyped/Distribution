package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoStats extends StObject {
  
  /** 视频高度 */
  var framesHeight: Double = js.native
  
  /** 视频宽度 */
  var framesWidth: Double = js.native
}
object VideoStats {
  
  @scala.inline
  def apply(framesHeight: Double, framesWidth: Double): VideoStats = {
    val __obj = js.Dynamic.literal(framesHeight = framesHeight.asInstanceOf[js.Any], framesWidth = framesWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStats]
  }
  
  @scala.inline
  implicit class VideoStatsMutableBuilder[Self <: VideoStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFramesHeight(value: Double): Self = StObject.set(x, "framesHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesWidth(value: Double): Self = StObject.set(x, "framesWidth", value.asInstanceOf[js.Any])
  }
}
