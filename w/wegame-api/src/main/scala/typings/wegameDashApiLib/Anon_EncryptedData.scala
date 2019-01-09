package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptedData extends js.Object {
  /**
    * 包括敏感数据在内的完整用户信息的加密数据，详见加密数据解密算法(https://mp.weixin.qq.com/debug/wxagame/dev/tutorial/open-ability/signature.html?t=201822)
    */
  var encryptedData: java.lang.String
  var errMsg: java.lang.String
  /**
    * 加密算法的初始向量，详见加密数据解密算法(https://mp.weixin.qq.com/debug/wxagame/dev/tutorial/open-ability/signature.html?t=201822)
    */
  var iv: java.lang.String
  /**
    * 不包括敏感信息的原始数据字符串，用于计算签名
    */
  var rawData: java.lang.String
  /**
    * 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息，参考文档signature(https://mp.weixin.qq.com/debug/wxagame/dev/tutorial/open-ability/http-signature.html?t=201822)
    */
  var signature: java.lang.String
  /**
    * 用户信息对象，不包含 openid 等敏感信息
    */
  var userInfo: wegameDashApiLib.wxNs.typesNs.UserInfo
}

