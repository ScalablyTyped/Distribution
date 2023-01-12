package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetShareInfoRes extends StObject {
  
  /**
    * 包括敏感数据在内的完整转发信息的加密数据
    */
  var encryptedData: js.UndefOr[String] = js.undefined
  
  /**
    * 错误信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
  
  /**
    * 加密算法的初始向量
    */
  var iv: js.UndefOr[String] = js.undefined
}
object GetShareInfoRes {
  
  inline def apply(): GetShareInfoRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetShareInfoRes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetShareInfoRes] (val x: Self) extends AnyVal {
    
    inline def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setEncryptedDataUndefined: Self = StObject.set(x, "encryptedData", js.undefined)
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
  }
}
