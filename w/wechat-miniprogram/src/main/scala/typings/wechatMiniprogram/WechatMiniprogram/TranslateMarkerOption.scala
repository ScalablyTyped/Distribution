package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateMarkerOption extends js.Object {
  /** 动画结束回调函数 */
  var animationEnd: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  /** 移动过程中是否自动旋转 marker */
  var autoRotate: Boolean = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[TranslateMarkerCompleteCallback] = js.native
  /** 指定 marker 移动到的目标点 */
  var destination: DestinationOption = js.native
  /** 动画持续时长，平移与旋转分别计算 */
  var duration: js.UndefOr[Double] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[TranslateMarkerFailCallback] = js.native
  /** 指定 marker */
  var markerId: Double = js.native
  /** marker 的旋转角度 */
  var rotate: Double = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[TranslateMarkerSuccessCallback] = js.native
}

object TranslateMarkerOption {
  @scala.inline
  def apply(autoRotate: Boolean, destination: DestinationOption, markerId: Double, rotate: Double): TranslateMarkerOption = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateMarkerOption]
  }
  @scala.inline
  implicit class TranslateMarkerOptionOps[Self <: TranslateMarkerOption] (val x: Self) extends AnyVal {
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
    def setAutoRotate(value: Boolean): Self = this.set("autoRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: DestinationOption): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerId(value: Double): Self = this.set("markerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationEnd(value: /* repeated */ js.Any => _): Self = this.set("animationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAnimationEnd: Self = this.set("animationEnd", js.undefined)
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
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

