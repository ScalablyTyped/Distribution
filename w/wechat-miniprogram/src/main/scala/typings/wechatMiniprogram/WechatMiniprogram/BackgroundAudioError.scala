package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundAudioError extends js.Object {
  /** 错误码
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 10001 |  | 系统错误 |
    * | 10002 |  | 网络错误 |
    * | 10003 |  | 文件错误 |
    * | 10004 |  | 格式错误 |
    * | -1 |  | 未知错误 | */ var errCode: Double = js.native
  /** 错误信息
    *
    * | 错误码 | 错误信息 | 说明 |
    * | - | - | - |
    * | 10001 |  | 系统错误 |
    * | 10002 |  | 网络错误 |
    * | 10003 |  | 文件错误 |
    * | 10004 |  | 格式错误 |
    * | -1 |  | 未知错误 | */ var errMsg: String = js.native
}

object BackgroundAudioError {
  @scala.inline
  def apply(errCode: Double, errMsg: String): BackgroundAudioError = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundAudioError]
  }
  @scala.inline
  implicit class BackgroundAudioErrorOps[Self <: BackgroundAudioError] (val x: Self) extends AnyVal {
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
    def setErrCode(value: Double): Self = this.set("errCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

