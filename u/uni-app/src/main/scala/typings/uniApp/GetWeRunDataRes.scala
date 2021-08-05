package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWeRunDataRes extends StObject {
  
  /**
    * 包括敏感数据在内的完整用户信息的加密数据
    */
  var encryptedData: js.UndefOr[String] = js.undefined
  
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  
  /**
    * 加密算法的初始向量
    */
  var iv: js.UndefOr[String] = js.undefined
}
object GetWeRunDataRes {
  
  inline def apply(): GetWeRunDataRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWeRunDataRes]
  }
  
  extension [Self <: GetWeRunDataRes](x: Self) {
    
    inline def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setEncryptedDataUndefined: Self = StObject.set(x, "encryptedData", js.undefined)
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
  }
}
