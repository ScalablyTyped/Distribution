package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserInfoRes extends StObject {
  
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
  
  inline def apply(): GetUserInfoRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserInfoRes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUserInfoRes] (val x: Self) extends AnyVal {
    
    inline def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setEncryptedDataUndefined: Self = StObject.set(x, "encryptedData", js.undefined)
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    inline def setRawData(value: String): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    inline def setRawDataUndefined: Self = StObject.set(x, "rawData", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setUserInfo(value: UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
