package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginRes extends js.Object {
  /**
    * 头条小程序当前设备标识
    */
  var anonymousCode: js.UndefOr[String] = js.undefined
  /**
    * 支付宝小程序授权码
    */
  var authCode: js.UndefOr[String] = js.undefined
  /**
    * 支付宝小程序登录失败的授权类型，key是授权失败的 scope，value 是对应的错误码
    */
  var authErrorScope: js.UndefOr[js.Any] = js.undefined
  /**
    * 登录服务商提供的登录信息，服务商不同返回的结果不完全相同
    */
  var authResult: js.UndefOr[String] = js.undefined
  /**
    * 支付宝小程序登录成功的授权 scope
    */
  var authSucessScope: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 小程序用户临时登录凭证
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * 描述信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}

object LoginRes {
  @scala.inline
  def apply(
    anonymousCode: String = null,
    authCode: String = null,
    authErrorScope: js.Any = null,
    authResult: String = null,
    authSucessScope: js.Array[String] = null,
    code: String = null,
    errMsg: String = null
  ): LoginRes = {
    val __obj = js.Dynamic.literal()
    if (anonymousCode != null) __obj.updateDynamic("anonymousCode")(anonymousCode.asInstanceOf[js.Any])
    if (authCode != null) __obj.updateDynamic("authCode")(authCode.asInstanceOf[js.Any])
    if (authErrorScope != null) __obj.updateDynamic("authErrorScope")(authErrorScope.asInstanceOf[js.Any])
    if (authResult != null) __obj.updateDynamic("authResult")(authResult.asInstanceOf[js.Any])
    if (authSucessScope != null) __obj.updateDynamic("authSucessScope")(authSucessScope.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginRes]
  }
}

