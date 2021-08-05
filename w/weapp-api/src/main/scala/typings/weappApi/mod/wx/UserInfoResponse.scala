package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInfoResponse extends StObject {
  
  /** 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法 */
  var encryptData: String
  
  /** 不包括敏感信息的原始数据字符串，用于计算签名。 */
  var rawData: String
  
  /** 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息。 */
  var signature: String
  
  /** 用户信息对象，不包含 openid 等敏感信息 */
  var userInfo: UserInfo
}
object UserInfoResponse {
  
  inline def apply(encryptData: String, rawData: String, signature: String, userInfo: UserInfo): UserInfoResponse = {
    val __obj = js.Dynamic.literal(encryptData = encryptData.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfoResponse]
  }
  
  extension [Self <: UserInfoResponse](x: Self) {
    
    inline def setEncryptData(value: String): Self = StObject.set(x, "encryptData", value.asInstanceOf[js.Any])
    
    inline def setRawData(value: String): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
