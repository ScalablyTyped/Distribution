package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.WechatMiniprogram.GeneralCallbackResult & std.Partial<wechat-miniprogram.WechatMiniprogram.GetWeRunDataSuccessCallbackResult> */
trait GeneralCallbackResultPart extends StObject {
  
  var cloudID: js.UndefOr[String] = js.undefined
  
  var encryptedData: js.UndefOr[String] = js.undefined
  
  var errMsg: String
  
  var iv: js.UndefOr[String] = js.undefined
}
object GeneralCallbackResultPart {
  
  inline def apply(errMsg: String): GeneralCallbackResultPart = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralCallbackResultPart]
  }
  
  extension [Self <: GeneralCallbackResultPart](x: Self) {
    
    inline def setCloudID(value: String): Self = StObject.set(x, "cloudID", value.asInstanceOf[js.Any])
    
    inline def setCloudIDUndefined: Self = StObject.set(x, "cloudID", js.undefined)
    
    inline def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setEncryptedDataUndefined: Self = StObject.set(x, "encryptedData", js.undefined)
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
  }
}
