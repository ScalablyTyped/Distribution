package typings.weixinApp.anon

import typings.weixinApp.wx.AuthModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportMode extends js.Object {
   // 该设备支持的可被SOTER识别的生物识别方式
  var errMsg: String = js.native
  var supportMode: js.Array[AuthModes] = js.native
}

object SupportMode {
  @scala.inline
  def apply(errMsg: String, supportMode: js.Array[AuthModes]): SupportMode = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportMode]
  }
  @scala.inline
  implicit class SupportModeOps[Self <: SupportMode] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportModeVarargs(value: AuthModes*): Self = this.set("supportMode", js.Array(value :_*))
    @scala.inline
    def setSupportMode(value: js.Array[AuthModes]): Self = this.set("supportMode", value.asInstanceOf[js.Any])
  }
  
}

