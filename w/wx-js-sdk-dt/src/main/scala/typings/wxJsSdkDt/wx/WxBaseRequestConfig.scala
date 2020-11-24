package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 所有通过wx对象调用的接口的基础请求参数
  * 见：https://mp.weixin.qq.com/wiki?action=doc&id=mp1421141115&t=0.08966560295638093#7
  */
@js.native
trait WxBaseRequestConfig extends js.Object {
  
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
  implicit class WxBaseRequestConfigOps[Self <: WxBaseRequestConfig] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ js.UndefOr[js.Any] => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* error */ js.UndefOr[js.Any] => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ js.UndefOr[js.Any] => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
