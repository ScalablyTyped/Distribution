package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserProfileSuccessCallbackResult extends StObject {
  
  /** 敏感数据对应的云 ID，开通[云开发](https://developers.weixin.qq.com/miniprogram/dev/wxcloud/basis/getting-started.html)的小程序才会返回，可通过云调用直接获取开放数据，详细见[云调用直接获取开放数据](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/signature.html#method-cloud)
    *
    * 最低基础库： `2.10.4` */
  var cloudID: String
  
  /** 包括敏感数据在内的完整用户信息的加密数据，详见 [用户数据的签名验证和加解密]((signature#加密数据解密算法))
    *
    * 最低基础库： `2.10.4` */
  var encryptedData: String
  
  var errMsg: String
  
  /** 加密算法的初始向量，详见 [用户数据的签名验证和加解密]((signature#加密数据解密算法))
    *
    * 最低基础库： `2.10.4` */
  var iv: String
  
  /** 不包括敏感信息的原始数据字符串，用于计算签名
    *
    * 最低基础库： `2.10.4` */
  var rawData: String
  
  /** 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息，详见 [用户数据的签名验证和加解密](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/signature.html)
    *
    * 最低基础库： `2.10.4` */
  var signature: String
  
  /** [UserInfo](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/user-info/UserInfo.html)
    *
    * 用户信息对象
    *
    * 最低基础库： `2.10.4` */
  var userInfo: UserInfo
}
object GetUserProfileSuccessCallbackResult {
  
  inline def apply(
    cloudID: String,
    encryptedData: String,
    errMsg: String,
    iv: String,
    rawData: String,
    signature: String,
    userInfo: UserInfo
  ): GetUserProfileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cloudID = cloudID.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserProfileSuccessCallbackResult]
  }
  
  extension [Self <: GetUserProfileSuccessCallbackResult](x: Self) {
    
    inline def setCloudID(value: String): Self = StObject.set(x, "cloudID", value.asInstanceOf[js.Any])
    
    inline def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setRawData(value: String): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
