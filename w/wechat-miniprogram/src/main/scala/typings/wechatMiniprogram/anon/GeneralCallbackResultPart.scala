package typings.wechatMiniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.WechatMiniprogram.GeneralCallbackResult & std.Partial<wechat-miniprogram.WechatMiniprogram.GetWeRunDataSuccessCallbackResult> */
@js.native
trait GeneralCallbackResultPart extends js.Object {
  
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
  implicit class GeneralCallbackResultPartOps[Self <: GeneralCallbackResultPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrMsg(value: String with js.UndefOr[String]): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudID(value: String): Self = this.set("cloudID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudID: Self = this.set("cloudID", js.undefined)
    
    @scala.inline
    def setEncryptedData(value: String): Self = this.set("encryptedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedData: Self = this.set("encryptedData", js.undefined)
    
    @scala.inline
    def setIv(value: String): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
  }
}
