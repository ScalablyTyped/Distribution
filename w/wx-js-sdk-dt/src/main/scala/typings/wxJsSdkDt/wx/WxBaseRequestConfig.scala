package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 所有通过wx对象调用的接口的基础请求参数
  * 见：https://mp.weixin.qq.com/wiki?action=doc&id=mp1421141115&t=0.08966560295638093#7
  */
@js.native
trait WxBaseRequestConfig extends StObject {
  
  /**
    * 用户点击取消时的回调函数，仅部分有用户取消操作的api才会用到
    */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 接口调用完成时执行的回调函数，无论成功或失败都会执行
    */
  var complete: js.UndefOr[js.Function1[/* res */ js.UndefOr[js.Any], Unit]] = js.native
  
  /**
    * 接口调用失败时执行的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.native
  
  /**
    * 接口调用成功时执行的回调函数
    */
  var success: js.UndefOr[js.Function1[/* res */ js.UndefOr[js.Any], Unit]] = js.native
}
object WxBaseRequestConfig {
  
  @scala.inline
  def apply(): WxBaseRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WxBaseRequestConfig]
  }
  
  @scala.inline
  implicit class WxBaseRequestConfigMutableBuilder[Self <: WxBaseRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* error */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
