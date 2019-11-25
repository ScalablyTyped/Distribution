package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserInfoRes extends js.Object {
  /**
    * 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法，仅微信小程序生效。
    */
  var encryptedData: js.UndefOr[String] = js.undefined
  /**
    * 描述信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 加密算法的初始向量，详细见加密数据解密算法，仅微信小程序生效。
    */
  var iv: js.UndefOr[String] = js.undefined
  /**
    * 不包括敏感信息的原始数据字符串，用于计算签名。
    */
  var rawData: js.UndefOr[String] = js.undefined
  /**
    * 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息，仅微信小程序生效。
    */
  var signature: js.UndefOr[String] = js.undefined
  /**
    * 用户信息对象，不包含 openid 等敏感信息
    */
  var userInfo: js.UndefOr[UserInfo] = js.undefined
}

object GetUserInfoRes {
  @scala.inline
  def apply(
    encryptedData: String = null,
    errMsg: String = null,
    iv: String = null,
    rawData: String = null,
    signature: String = null,
    userInfo: UserInfo = null
  ): GetUserInfoRes = {
    val __obj = js.Dynamic.literal()
    if (encryptedData != null) __obj.updateDynamic("encryptedData")(encryptedData.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (rawData != null) __obj.updateDynamic("rawData")(rawData.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserInfoRes]
  }
}

