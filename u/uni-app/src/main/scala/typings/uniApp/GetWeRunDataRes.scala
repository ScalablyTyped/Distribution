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
  
  @scala.inline
  def apply(): GetWeRunDataRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWeRunDataRes]
  }
  
  @scala.inline
  implicit class GetWeRunDataResMutableBuilder[Self <: GetWeRunDataRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedDataUndefined: Self = StObject.set(x, "encryptedData", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    @scala.inline
    def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
  }
}
