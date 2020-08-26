package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageScrollToOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[PageScrollToCompleteCallback] = js.native
  /** 滚动动画的时长，单位 ms */
  var duration: js.UndefOr[Double] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[PageScrollToFailCallback] = js.native
  /** 滚动到页面的目标位置，单位 px */
  var scrollTop: js.UndefOr[Double] = js.native
  /** 选择器
    *
    * 最低基础库： `2.7.3` */
  var selector: js.UndefOr[String] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[PageScrollToSuccessCallback] = js.native
}

object PageScrollToOption {
  @scala.inline
  def apply(): PageScrollToOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageScrollToOption]
  }
  @scala.inline
  implicit class PageScrollToOptionOps[Self <: PageScrollToOption] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

