package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroundOverlayOption extends StObject {
  
  /** 图片覆盖的经纬度范围 */
  var bounds: MapBounds
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UpdateGroundOverlayCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UpdateGroundOverlayFailCallback] = js.undefined
  
  /** 图片图层 id */
  var id: String
  
  /** 图层透明度 */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /** 图片路径，支持网络图片、临时路径、代码包路径 */
  var src: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UpdateGroundOverlaySuccessCallback] = js.undefined
  
  /** 是否可见 */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /** 图层绘制顺序 */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object UpdateGroundOverlayOption {
  
  inline def apply(bounds: MapBounds, id: String, src: String): UpdateGroundOverlayOption = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroundOverlayOption]
  }
  
  extension [Self <: UpdateGroundOverlayOption](x: Self) {
    
    inline def setBounds(value: MapBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
