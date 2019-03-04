package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSoterAuthenticationOptions
  extends BaseOptions[js.Any, js.Any] {
   // 挑战因子。挑战因子为调用者为此次生物鉴权准备的用于签名的字符串关键是别信息，将作为result_json的一部分，供调用者识别本次请求。例如：如果场景为请求用户对某订单进行授权确认，则可以将订单号填入此参数。
  var authContent: js.UndefOr[java.lang.String] = js.undefined
   // 请求使用的可接受的生物认证方式
  var challenge: java.lang.String
  var requestAuthModes: js.Array[AuthModes]
   // 验证描述，即识别过程中显示在界面上的对话框提示内容
  @JSName("success")
  var success_StartSoterAuthenticationOptions: js.UndefOr[js.Function1[/* res */ weixinDashAppLib.Anon_AuthMode, scala.Unit]] = js.undefined
}

object StartSoterAuthenticationOptions {
  @scala.inline
  def apply(
    challenge: java.lang.String,
    requestAuthModes: js.Array[AuthModes],
    authContent: java.lang.String = null,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ weixinDashAppLib.Anon_AuthMode, scala.Unit] = null
  ): StartSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge, requestAuthModes = requestAuthModes)
    if (authContent != null) __obj.updateDynamic("authContent")(authContent)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[StartSoterAuthenticationOptions]
  }
}

