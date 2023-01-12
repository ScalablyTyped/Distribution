package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.jpg
import typings.wechatMiniprogram.wechatMiniprogramStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasToTempFilePathOption extends StObject {
  
  /** 画布标识，传入 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件实例 （canvas type="2d" 时使用该属性）。 */
  var canvas: js.UndefOr[IAnyObject] = js.undefined
  
  /** 画布标识，传入 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件的 canvas-id */
  var canvasId: js.UndefOr[String] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CanvasToTempFilePathCompleteCallback] = js.undefined
  
  /** 输出的图片的高度
    *
    * 最低基础库： `1.2.0` */
  var destHeight: js.UndefOr[Double] = js.undefined
  
  /** 输出的图片的宽度
    *
    * 最低基础库： `1.2.0` */
  var destWidth: js.UndefOr[Double] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CanvasToTempFilePathFailCallback] = js.undefined
  
  /** 目标文件的类型
    *
    * 可选值：
    * - 'jpg': jpg 图片;
    * - 'png': png 图片;
    *
    * 最低基础库： `1.7.0` */
  var fileType: js.UndefOr[jpg | png] = js.undefined
  
  /** 指定的画布区域的高度
    *
    * 最低基础库： `1.2.0` */
  var height: js.UndefOr[Double] = js.undefined
  
  /** 图片的质量，目前仅对 jpg 有效。取值范围为 (0, 1]，不在范围内时当作 1.0 处理。
    *
    * 最低基础库： `1.7.0` */
  var quality: js.UndefOr[Double] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CanvasToTempFilePathSuccessCallback] = js.undefined
  
  /** 指定的画布区域的宽度
    *
    * 最低基础库： `1.2.0` */
  var width: js.UndefOr[Double] = js.undefined
  
  /** 指定的画布区域的左上角横坐标
    *
    * 最低基础库： `1.2.0` */
  var x: js.UndefOr[Double] = js.undefined
  
  /** 指定的画布区域的左上角纵坐标
    *
    * 最低基础库： `1.2.0` */
  var y: js.UndefOr[Double] = js.undefined
}
object CanvasToTempFilePathOption {
  
  inline def apply(): CanvasToTempFilePathOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasToTempFilePathOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasToTempFilePathOption] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: IAnyObject): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
    
    inline def setCanvasIdUndefined: Self = StObject.set(x, "canvasId", js.undefined)
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDestHeight(value: Double): Self = StObject.set(x, "destHeight", value.asInstanceOf[js.Any])
    
    inline def setDestHeightUndefined: Self = StObject.set(x, "destHeight", js.undefined)
    
    inline def setDestWidth(value: Double): Self = StObject.set(x, "destWidth", value.asInstanceOf[js.Any])
    
    inline def setDestWidthUndefined: Self = StObject.set(x, "destWidth", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFileType(value: jpg | png): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setSuccess(value: /* result */ CanvasToTempFilePathSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
