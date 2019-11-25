package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSoterAuthenticationOptions extends js.Object {
  /**
    * 验证描述，即识别过程中显示在界面上的对话框提示内容
    */
  var authContent: js.UndefOr[String] = js.undefined
  /**
    * 挑战因子
    */
  var challenge: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 请求使用的可接受的生物认证方式
    */
  var requestAuthModes: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ StartSoterAuthenticationRes, Unit]] = js.undefined
}

object StartSoterAuthenticationOptions {
  @scala.inline
  def apply(
    authContent: String = null,
    challenge: String = null,
    complete: () => Unit = null,
    fail: () => Unit = null,
    requestAuthModes: js.Array[_] = null,
    success: /* result */ StartSoterAuthenticationRes => Unit = null
  ): StartSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    if (authContent != null) __obj.updateDynamic("authContent")(authContent.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (requestAuthModes != null) __obj.updateDynamic("requestAuthModes")(requestAuthModes.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StartSoterAuthenticationOptions]
  }
}

