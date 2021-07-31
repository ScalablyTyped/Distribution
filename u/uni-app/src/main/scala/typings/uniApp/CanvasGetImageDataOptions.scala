package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasGetImageDataOptions extends StObject {
  
  /**
    * 画布标识，传入 <canvas/> 的 canvas-id
    */
  var canvasId: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 将要被提取的图像数据矩形区域的高度
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ CanvasGetImageDataRes, Unit]] = js.undefined
  
  /**
    * 将要被提取的图像数据矩形区域的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * 将要被提取的图像数据矩形区域的左上角 x 坐标
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * 将要被提取的图像数据矩形区域的左上角 y 坐标
    */
  var y: js.UndefOr[Double] = js.undefined
}
object CanvasGetImageDataOptions {
  
  @scala.inline
  def apply(): CanvasGetImageDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasGetImageDataOptions]
  }
  
  @scala.inline
  implicit class CanvasGetImageDataOptionsMutableBuilder[Self <: CanvasGetImageDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasIdUndefined: Self = StObject.set(x, "canvasId", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ CanvasGetImageDataRes => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
