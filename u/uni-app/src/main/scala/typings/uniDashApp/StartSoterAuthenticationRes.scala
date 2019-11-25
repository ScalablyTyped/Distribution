package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSoterAuthenticationRes extends js.Object {
  /**
    * 生物认证方式
    */
  var authMode: js.UndefOr[String] = js.undefined
  /**
    * 错误码
    */
  var errCode: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 在设备安全区域（TEE）内获得的本机安全信息以及本次认证信息
    */
  var resultJSON: js.UndefOr[String] = js.undefined
}

object StartSoterAuthenticationRes {
  @scala.inline
  def apply(
    authMode: String = null,
    errCode: Int | Double = null,
    errMsg: String = null,
    resultJSON: String = null
  ): StartSoterAuthenticationRes = {
    val __obj = js.Dynamic.literal()
    if (authMode != null) __obj.updateDynamic("authMode")(authMode.asInstanceOf[js.Any])
    if (errCode != null) __obj.updateDynamic("errCode")(errCode.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (resultJSON != null) __obj.updateDynamic("resultJSON")(resultJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSoterAuthenticationRes]
  }
}

