package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.high
import typings.wechatMiniprogram.wechatMiniprogramStrings.low
import typings.wechatMiniprogram.wechatMiniprogramStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TakePhotoOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[TakePhotoCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[TakePhotoFailCallback] = js.native
  /** 成像质量
    *
    * 可选值：
    * - 'high': 高质量;
    * - 'normal': 普通质量;
    * - 'low': 低质量; */
  var quality: js.UndefOr[high | normal | low] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[TakePhotoSuccessCallback] = js.native
}

object TakePhotoOption {
  @scala.inline
  def apply(): TakePhotoOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakePhotoOption]
  }
  @scala.inline
  implicit class TakePhotoOptionOps[Self <: TakePhotoOption] (val x: Self) extends AnyVal {
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
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setQuality(value: high | normal | low): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ TakePhotoSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

