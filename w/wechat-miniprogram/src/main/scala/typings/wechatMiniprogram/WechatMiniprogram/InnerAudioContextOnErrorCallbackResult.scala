package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramNumbers.`-1`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`10001`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`10002`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`10003`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`10004`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InnerAudioContextOnErrorCallbackResult extends js.Object {
  /**
    *
    * 可选值：
    * - 10001: 系统错误;
    * - 10002: 网络错误;
    * - 10003: 文件错误;
    * - 10004: 格式错误;
    * - -1: 未知错误; */
  var errCode: `10001` | `10002` | `10003` | `10004` | `-1` = js.native
  var errMsg: String = js.native
}

object InnerAudioContextOnErrorCallbackResult {
  @scala.inline
  def apply(errCode: `10001` | `10002` | `10003` | `10004` | `-1`, errMsg: String): InnerAudioContextOnErrorCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerAudioContextOnErrorCallbackResult]
  }
  @scala.inline
  implicit class InnerAudioContextOnErrorCallbackResultOps[Self <: InnerAudioContextOnErrorCallbackResult] (val x: Self) extends AnyVal {
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
    def setErrCode(value: `10001` | `10002` | `10003` | `10004` | `-1`): Self = this.set("errCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

