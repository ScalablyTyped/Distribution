package typings.wegameDashApi

import typings.wegameDashApi.wx.types.UserInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptedData extends js.Object {
  /**
    * 包括敏感数据在内的完整用户信息的加密数据，详见加密数据解密算法(https://mp.weixin.qq.com/debug/wxagame/dev/tutorial/open-ability/signature.html?t=201822)
    */
  var encryptedData: String
  var errMsg: String
  /**
    * 加密算法的初始向量，详见加密数据解密算法(https://mp.weixin.qq.com/debug/wxagame/dev/tutorial/open-ability/signature.html?t=201822)
    */
  var iv: String
  /**
    * 不包括敏感信息的原始数据字符串，用于计算签名
    */
  var rawData: String
  /**
    * 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息，参考文档signature(https://mp.weixin.qq.com/debug/wxagame/dev/tutorial/open-ability/http-signature.html?t=201822)
    */
  var signature: String
  /**
    * 用户信息对象，不包含 openid 等敏感信息
    */
  var userInfo: UserInfo
}

object Anon_EncryptedData {
  @scala.inline
  def apply(
    encryptedData: String,
    errMsg: String,
    iv: String,
    rawData: String,
    signature: String,
    userInfo: UserInfo
  ): Anon_EncryptedData = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EncryptedData]
  }
}

