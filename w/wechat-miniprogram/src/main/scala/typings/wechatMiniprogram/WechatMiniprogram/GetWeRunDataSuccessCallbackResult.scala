package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWeRunDataSuccessCallbackResult extends StObject {
  
  /** 敏感数据对应的云 ID，开通云开发的小程序才会返回，可通过云调用直接获取开放数据，详细见[云调用直接获取开放数据](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/signature.html#method-cloud)
    *
    * 最低基础库： `2.7.0` */
  var cloudID: String
  
  /** 包括敏感数据在内的完整用户信息的加密数据，详细见[加密数据解密算法](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/signature.html)。解密后得到的数据结构见后文 */
  var encryptedData: String
  
  var errMsg: String
  
  /** 加密算法的初始向量，详细见[加密数据解密算法](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/signature.html) */
  var iv: String
}
object GetWeRunDataSuccessCallbackResult {
  
  inline def apply(cloudID: String, encryptedData: String, errMsg: String, iv: String): GetWeRunDataSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cloudID = cloudID.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWeRunDataSuccessCallbackResult]
  }
  
  extension [Self <: GetWeRunDataSuccessCallbackResult](x: Self) {
    
    inline def setCloudID(value: String): Self = StObject.set(x, "cloudID", value.asInstanceOf[js.Any])
    
    inline def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
