package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.game
import typings.wechatMiniprogram.wechatMiniprogramStrings.normal
import typings.wechatMiniprogram.wechatMiniprogramStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDeviceMotionListeningOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartDeviceMotionListeningCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartDeviceMotionListeningFailCallback] = js.native
  /** 监听设备方向的变化回调函数的执行频率
    *
    * 可选值：
    * - 'game': 适用于更新游戏的回调频率，在 20ms/次 左右;
    * - 'ui': 适用于更新 UI 的回调频率，在 60ms/次 左右;
    * - 'normal': 普通的回调频率，在 200ms/次 左右; */
  var interval: js.UndefOr[game | ui | normal] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartDeviceMotionListeningSuccessCallback] = js.native
}

object StartDeviceMotionListeningOption {
  @scala.inline
  def apply(): StartDeviceMotionListeningOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDeviceMotionListeningOption]
  }
  @scala.inline
  implicit class StartDeviceMotionListeningOptionOps[Self <: StartDeviceMotionListeningOption] (val x: Self) extends AnyVal {
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
    def setInterval(value: game | ui | normal): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

