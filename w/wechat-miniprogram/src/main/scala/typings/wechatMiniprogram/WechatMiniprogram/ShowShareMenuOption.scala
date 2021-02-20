package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowShareMenuOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowShareMenuCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowShareMenuFailCallback] = js.native
  
  /** 本接口为 Beta 版本，暂只在 Android 平台支持。需要显示的转发按钮名称列表，默认['shareAppMessage']。按钮名称合法值包含 "shareAppMessage"、"shareTimeline" 两种
    *
    * 最低基础库： `2.11.3` */
  var menus: js.UndefOr[js.Array[String]] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowShareMenuSuccessCallback] = js.native
  
  /** 是否使用带 shareTicket 的转发[详情](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html) */
  var withShareTicket: js.UndefOr[Boolean] = js.native
}
object ShowShareMenuOption {
  
  @scala.inline
  def apply(): ShowShareMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowShareMenuOption]
  }
  
  @scala.inline
  implicit class ShowShareMenuOptionMutableBuilder[Self <: ShowShareMenuOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setMenus(value: js.Array[String]): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenusUndefined: Self = StObject.set(x, "menus", js.undefined)
    
    @scala.inline
    def setMenusVarargs(value: String*): Self = StObject.set(x, "menus", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWithShareTicket(value: Boolean): Self = StObject.set(x, "withShareTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithShareTicketUndefined: Self = StObject.set(x, "withShareTicket", js.undefined)
  }
}
