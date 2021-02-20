package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitMarkerClusterOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[InitMarkerClusterCompleteCallback] = js.native
  
  /** 启用默认的聚合样式 */
  var enableDefaultStyle: js.UndefOr[Boolean] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[InitMarkerClusterFailCallback] = js.native
  
  /** 聚合算法的可聚合距离，即距离小于该值的点会聚合至一起，以像素为单位 */
  var gridSize: js.UndefOr[Boolean] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[InitMarkerClusterSuccessCallback] = js.native
  
  /** 点击已经聚合的标记点时是否实现聚合分离 */
  var zoomOnClick: js.UndefOr[Boolean] = js.native
}
object InitMarkerClusterOption {
  
  @scala.inline
  def apply(): InitMarkerClusterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitMarkerClusterOption]
  }
  
  @scala.inline
  implicit class InitMarkerClusterOptionMutableBuilder[Self <: InitMarkerClusterOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setEnableDefaultStyle(value: Boolean): Self = StObject.set(x, "enableDefaultStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDefaultStyleUndefined: Self = StObject.set(x, "enableDefaultStyle", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setGridSize(value: Boolean): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setZoomOnClick(value: Boolean): Self = StObject.set(x, "zoomOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOnClickUndefined: Self = StObject.set(x, "zoomOnClick", js.undefined)
  }
}
