package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitMarkerClusterOption extends js.Object {
  
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
  implicit class InitMarkerClusterOptionOps[Self <: InitMarkerClusterOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setEnableDefaultStyle(value: Boolean): Self = this.set("enableDefaultStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDefaultStyle: Self = this.set("enableDefaultStyle", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setGridSize(value: Boolean): Self = this.set("gridSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridSize: Self = this.set("gridSize", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setZoomOnClick(value: Boolean): Self = this.set("zoomOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOnClick: Self = this.set("zoomOnClick", js.undefined)
  }
}
