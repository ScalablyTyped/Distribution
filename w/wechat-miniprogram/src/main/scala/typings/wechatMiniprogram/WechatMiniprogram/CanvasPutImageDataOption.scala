package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasPutImageDataOption extends StObject {
  
  /** 画布标识，传入 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件的 canvas-id 属性。 */
  var canvasId: String
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CanvasPutImageDataCompleteCallback] = js.undefined
  
  /** 图像像素点数据，一维数组，每四项表示一个像素点的 rgba */
  var data: js.typedarray.Uint8ClampedArray
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CanvasPutImageDataFailCallback] = js.undefined
  
  /** 源图像数据矩形区域的高度 */
  var height: Double
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CanvasPutImageDataSuccessCallback] = js.undefined
  
  /** 源图像数据矩形区域的宽度 */
  var width: Double
  
  /** 源图像数据在目标画布中的位置偏移量（x 轴方向的偏移量） */
  var x: Double
  
  /** 源图像数据在目标画布中的位置偏移量（y 轴方向的偏移量） */
  var y: Double
}
object CanvasPutImageDataOption {
  
  inline def apply(
    canvasId: String,
    data: js.typedarray.Uint8ClampedArray,
    height: Double,
    width: Double,
    x: Double,
    y: Double
  ): CanvasPutImageDataOption = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasPutImageDataOption]
  }
  
  extension [Self <: CanvasPutImageDataOption](x: Self) {
    
    inline def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
