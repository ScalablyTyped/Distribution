package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedDataErrMsg extends StObject {
  
  /**
    * 包括敏感数据在内的完整转发信息的加密数据
    */
  var encryptedData: String
  
  /**
    * 错误信息
    */
  var errMsg: String
  
  /**
    * 加密算法的初始向量
    */
  var iv: String
}
object EncryptedDataErrMsg {
  
  @scala.inline
  def apply(encryptedData: String, errMsg: String, iv: String): EncryptedDataErrMsg = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedDataErrMsg]
  }
  
  @scala.inline
  implicit class EncryptedDataErrMsgMutableBuilder[Self <: EncryptedDataErrMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
