package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaRecorderOption extends StObject {
  
  /** 指定录制的时长（s)，到达自动停止。最大 7200，最小 5 */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 视频 fps */
  var fps: js.UndefOr[Double] = js.undefined
  
  /** 视频关键帧间隔 */
  var gop: js.UndefOr[Double] = js.undefined
  
  /** 视频比特率（kbps），最小值 600，最大值 3000 */
  var videoBitsPerSecond: js.UndefOr[Double] = js.undefined
}
object CreateMediaRecorderOption {
  
  inline def apply(): CreateMediaRecorderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMediaRecorderOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMediaRecorderOption] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
    
    inline def setGop(value: Double): Self = StObject.set(x, "gop", value.asInstanceOf[js.Any])
    
    inline def setGopUndefined: Self = StObject.set(x, "gop", js.undefined)
    
    inline def setVideoBitsPerSecond(value: Double): Self = StObject.set(x, "videoBitsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setVideoBitsPerSecondUndefined: Self = StObject.set(x, "videoBitsPerSecond", js.undefined)
  }
}
