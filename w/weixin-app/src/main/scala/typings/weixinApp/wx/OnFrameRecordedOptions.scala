package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFrameRecordedOptions extends StObject {
  
  /**  录音分片结果数据 */
  var frameBuffer: js.typedarray.ArrayBuffer
  
  /** 当前帧是否正常录音结束前的最后一帧 */
  var isLastFrame: Boolean
}
object OnFrameRecordedOptions {
  
  inline def apply(frameBuffer: js.typedarray.ArrayBuffer, isLastFrame: Boolean): OnFrameRecordedOptions = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFrameRecordedOptions]
  }
  
  extension [Self <: OnFrameRecordedOptions](x: Self) {
    
    inline def setFrameBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "frameBuffer", value.asInstanceOf[js.Any])
    
    inline def setIsLastFrame(value: Boolean): Self = StObject.set(x, "isLastFrame", value.asInstanceOf[js.Any])
  }
}
