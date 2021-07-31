package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasImageDataOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 画布标识，传入 <canvas /> 的 canvas-id  */
  var canvasId: String
  
  /** 将要被提取的图像数据矩形区域的高度 */
  var height: Double
  
  /** 将要被提取的图像数据矩形区域的宽度 */
  var width: Double
  
  /** 将要被提取的图像数据矩形区域的左上角 x 坐标 */
  var x: Double
  
  /** 将要被提取的图像数据矩形区域的左上角 y 坐标 */
  var y: Double
}
object CanvasImageDataOptions {
  
  @scala.inline
  def apply(canvasId: String, height: Double, width: Double, x: Double, y: Double): CanvasImageDataOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasImageDataOptions]
  }
  
  @scala.inline
  implicit class CanvasImageDataOptionsMutableBuilder[Self <: CanvasImageDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
