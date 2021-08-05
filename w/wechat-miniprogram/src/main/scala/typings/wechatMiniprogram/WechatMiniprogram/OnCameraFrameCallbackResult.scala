package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCameraFrameCallbackResult extends StObject {
  
  /** 图像像素点数据，一维数组，每四项表示一个像素点的 rgba */
  var data: ArrayBuffer
  
  /** 图像数据矩形的高度 */
  var height: Double
  
  /** 图像数据矩形的宽度 */
  var width: Double
}
object OnCameraFrameCallbackResult {
  
  inline def apply(data: ArrayBuffer, height: Double, width: Double): OnCameraFrameCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCameraFrameCallbackResult]
  }
  
  extension [Self <: OnCameraFrameCallbackResult](x: Self) {
    
    inline def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
