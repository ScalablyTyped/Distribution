package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadVoiceConfig extends WxBaseRequestConfig {
  var isShowProgressTips: js.UndefOr[Double] = js.native
  var localId: String = js.native
  @JSName("success")
  def success_MUploadVoiceConfig(res: js.Any): Unit = js.native
}

object UploadVoiceConfig {
  @scala.inline
  def apply(localId: String, success: js.Any => Unit): UploadVoiceConfig = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[UploadVoiceConfig]
  }
  @scala.inline
  implicit class UploadVoiceConfigOps[Self <: UploadVoiceConfig] (val x: Self) extends AnyVal {
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
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: js.Any => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setIsShowProgressTips(value: Double): Self = this.set("isShowProgressTips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsShowProgressTips: Self = this.set("isShowProgressTips", js.undefined)
  }
  
}

