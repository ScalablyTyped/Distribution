package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.WechatMiniprogram.GeneralCallbackResult & std.Partial<wechat-miniprogram.WechatMiniprogram.GetWeRunDataSuccessCallbackResult> */
@js.native
trait GeneralCallbackResultPart extends StObject {
  
  var cloudID: js.UndefOr[String] = js.native
  
  var encryptedData: js.UndefOr[String] = js.native
  
  var errMsg: String with js.UndefOr[String] = js.native
  
  var iv: js.UndefOr[String] = js.native
}
object GeneralCallbackResultPart {
  
  @scala.inline
  def apply(errMsg: String with js.UndefOr[String]): GeneralCallbackResultPart = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralCallbackResultPart]
  }
  
  @scala.inline
  implicit class GeneralCallbackResultPartMutableBuilder[Self <: GeneralCallbackResultPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudID(value: String): Self = StObject.set(x, "cloudID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudIDUndefined: Self = StObject.set(x, "cloudID", js.undefined)
    
    @scala.inline
    def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedDataUndefined: Self = StObject.set(x, "encryptedData", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String with js.UndefOr[String]): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
  }
}
