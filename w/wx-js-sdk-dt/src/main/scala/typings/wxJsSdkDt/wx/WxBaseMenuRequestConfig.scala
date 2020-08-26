package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 所有Menu中的相关接口的请求参数
  */
@js.native
trait WxBaseMenuRequestConfig extends WxBaseRequestConfig {
  /**
    * 监听Menu中的按钮点击时触发的方法
    */
  var trigger: js.UndefOr[js.Function0[Unit]] = js.native
}

object WxBaseMenuRequestConfig {
  @scala.inline
  def apply(): WxBaseMenuRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WxBaseMenuRequestConfig]
  }
  @scala.inline
  implicit class WxBaseMenuRequestConfigOps[Self <: WxBaseMenuRequestConfig] (val x: Self) extends AnyVal {
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
    def setTrigger(value: () => Unit): Self = this.set("trigger", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
  
}

