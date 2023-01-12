package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitMarkerClusterOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[InitMarkerClusterCompleteCallback] = js.undefined
  
  /** 启用默认的聚合样式 */
  var enableDefaultStyle: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[InitMarkerClusterFailCallback] = js.undefined
  
  /** 聚合算法的可聚合距离，即距离小于该值的点会聚合至一起，以像素为单位 */
  var gridSize: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[InitMarkerClusterSuccessCallback] = js.undefined
  
  /** 点击已经聚合的标记点时是否实现聚合分离 */
  var zoomOnClick: js.UndefOr[Boolean] = js.undefined
}
object InitMarkerClusterOption {
  
  inline def apply(): InitMarkerClusterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitMarkerClusterOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitMarkerClusterOption] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setEnableDefaultStyle(value: Boolean): Self = StObject.set(x, "enableDefaultStyle", value.asInstanceOf[js.Any])
    
    inline def setEnableDefaultStyleUndefined: Self = StObject.set(x, "enableDefaultStyle", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setGridSize(value: Boolean): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
    
    inline def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setZoomOnClick(value: Boolean): Self = StObject.set(x, "zoomOnClick", value.asInstanceOf[js.Any])
    
    inline def setZoomOnClickUndefined: Self = StObject.set(x, "zoomOnClick", js.undefined)
  }
}
