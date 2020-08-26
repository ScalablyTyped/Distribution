package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramNumbers.`-90`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`0`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LivePlayerContextRequestFullScreenOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestFullScreenCompleteCallback] = js.native
  /** 设置全屏时的方向
    *
    * 可选值：
    * - 0: 正常竖向;
    * - 90: 屏幕逆时针90度;
    * - -90: 屏幕顺时针90度; */
  var direction: js.UndefOr[`0` | `90` | `-90`] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestFullScreenFailCallback] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestFullScreenSuccessCallback] = js.native
}

object LivePlayerContextRequestFullScreenOption {
  @scala.inline
  def apply(): LivePlayerContextRequestFullScreenOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LivePlayerContextRequestFullScreenOption]
  }
  @scala.inline
  implicit class LivePlayerContextRequestFullScreenOptionOps[Self <: LivePlayerContextRequestFullScreenOption] (val x: Self) extends AnyVal {
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
    def setDirection(value: `0` | `90` | `-90`): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

