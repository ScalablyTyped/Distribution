package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLatestUserKeySuccessCallbackResult extends StObject {
  
  /** 用户加密密钥 */
  var encryptKey: String
  
  var errMsg: String
  
  /** 密钥过期时间 */
  var expireTime: Double
  
  /** 密钥初始向量 */
  var iv: String
  
  /** 密钥版本 */
  var version: Double
}
object GetLatestUserKeySuccessCallbackResult {
  
  inline def apply(encryptKey: String, errMsg: String, expireTime: Double, iv: String, version: Double): GetLatestUserKeySuccessCallbackResult = {
    val __obj = js.Dynamic.literal(encryptKey = encryptKey.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], expireTime = expireTime.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLatestUserKeySuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLatestUserKeySuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setEncryptKey(value: String): Self = StObject.set(x, "encryptKey", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setExpireTime(value: Double): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
