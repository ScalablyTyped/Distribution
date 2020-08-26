package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSoterAuthenticationRes extends js.Object {
  /**
    * 生物认证方式
    */
  var authMode: js.UndefOr[String] = js.native
  /**
    * 错误码
    */
  var errCode: js.UndefOr[Double] = js.native
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  /**
    * 在设备安全区域（TEE）内获得的本机安全信息以及本次认证信息
    */
  var resultJSON: js.UndefOr[String] = js.native
}

object StartSoterAuthenticationRes {
  @scala.inline
  def apply(): StartSoterAuthenticationRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSoterAuthenticationRes]
  }
  @scala.inline
  implicit class StartSoterAuthenticationResOps[Self <: StartSoterAuthenticationRes] (val x: Self) extends AnyVal {
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
    def setAuthMode(value: String): Self = this.set("authMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthMode: Self = this.set("authMode", js.undefined)
    @scala.inline
    def setErrCode(value: Double): Self = this.set("errCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrCode: Self = this.set("errCode", js.undefined)
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
    @scala.inline
    def setResultJSON(value: String): Self = this.set("resultJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultJSON: Self = this.set("resultJSON", js.undefined)
  }
  
}

