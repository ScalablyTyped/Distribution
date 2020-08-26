package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSoterAuthenticationOptions extends js.Object {
  /**
    * 验证描述，即识别过程中显示在界面上的对话框提示内容
    */
  var authContent: js.UndefOr[String] = js.native
  /**
    * 挑战因子
    */
  var challenge: js.UndefOr[String] = js.native
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 请求使用的可接受的生物认证方式
    */
  var requestAuthModes: js.UndefOr[js.Array[_]] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ StartSoterAuthenticationRes, Unit]] = js.native
}

object StartSoterAuthenticationOptions {
  @scala.inline
  def apply(): StartSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSoterAuthenticationOptions]
  }
  @scala.inline
  implicit class StartSoterAuthenticationOptionsOps[Self <: StartSoterAuthenticationOptions] (val x: Self) extends AnyVal {
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
    def setAuthContent(value: String): Self = this.set("authContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthContent: Self = this.set("authContent", js.undefined)
    @scala.inline
    def setChallenge(value: String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallenge: Self = this.set("challenge", js.undefined)
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setRequestAuthModesVarargs(value: js.Any*): Self = this.set("requestAuthModes", js.Array(value :_*))
    @scala.inline
    def setRequestAuthModes(value: js.Array[_]): Self = this.set("requestAuthModes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestAuthModes: Self = this.set("requestAuthModes", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ StartSoterAuthenticationRes => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

