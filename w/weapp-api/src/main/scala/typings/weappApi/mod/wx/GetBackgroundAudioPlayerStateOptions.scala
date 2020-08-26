package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackgroundAudioPlayerStateOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NoneParamCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NoneParamCallback] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetBackgroundAudioPlayerStateSuccessCallback] = js.native
}

object GetBackgroundAudioPlayerStateOptions {
  @scala.inline
  def apply(): GetBackgroundAudioPlayerStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateOptions]
  }
  @scala.inline
  implicit class GetBackgroundAudioPlayerStateOptionsOps[Self <: GetBackgroundAudioPlayerStateOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* state */ BackgroundAudioPlayerState => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

