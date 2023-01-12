package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedData extends StObject {
  
  // 调用结果
  var encryptedData: String
  
  var errMsg: String
  
  // 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法
  var iv: String
}
object EncryptedData {
  
  inline def apply(encryptedData: String, errMsg: String, iv: String): EncryptedData = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptedData] (val x: Self) extends AnyVal {
    
    inline def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
