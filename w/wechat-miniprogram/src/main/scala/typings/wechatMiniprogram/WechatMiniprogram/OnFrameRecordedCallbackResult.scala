package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFrameRecordedCallbackResult extends StObject {
  
  /** 录音分片数据 */
  var frameBuffer: js.typedarray.ArrayBuffer
  
  /** 当前帧是否正常录音结束前的最后一帧 */
  var isLastFrame: Boolean
}
object OnFrameRecordedCallbackResult {
  
  inline def apply(frameBuffer: js.typedarray.ArrayBuffer, isLastFrame: Boolean): OnFrameRecordedCallbackResult = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFrameRecordedCallbackResult]
  }
  
  extension [Self <: OnFrameRecordedCallbackResult](x: Self) {
    
    inline def setFrameBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "frameBuffer", value.asInstanceOf[js.Any])
    
    inline def setIsLastFrame(value: Boolean): Self = StObject.set(x, "isLastFrame", value.asInstanceOf[js.Any])
  }
}
