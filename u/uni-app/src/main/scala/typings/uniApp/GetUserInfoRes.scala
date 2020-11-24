package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserInfoRes extends js.Object {
  
  /**
    * 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法，仅微信小程序生效。
    */
  var encryptedData: js.UndefOr[String] = js.native
  
  /**
    * 描述信息
    */
  var errMsg: js.UndefOr[String] = js.native
  
  /**
    * 加密算法的初始向量，详细见加密数据解密算法，仅微信小程序生效。
    */
  var iv: js.UndefOr[String] = js.native
  
  /**
    * 不包括敏感信息的原始数据字符串，用于计算签名。
    */
  var rawData: js.UndefOr[String] = js.native
  
  /**
    * 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息，仅微信小程序生效。
    */
  var signature: js.UndefOr[String] = js.native
  
  /**
    * 用户信息对象，不包含 openid 等敏感信息
    */
  var userInfo: js.UndefOr[UserInfo] = js.native
}
object GetUserInfoRes {
  
  @scala.inline
  def apply(): GetUserInfoRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserInfoRes]
  }
  
  @scala.inline
  implicit class GetUserInfoResOps[Self <: GetUserInfoRes] (val x: Self) extends AnyVal {
    
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
    def setEncryptedData(value: String): Self = this.set("encryptedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedData: Self = this.set("encryptedData", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
    
    @scala.inline
    def setIv(value: String): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    
    @scala.inline
    def setRawData(value: String): Self = this.set("rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawData: Self = this.set("rawData", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setUserInfo(value: UserInfo): Self = this.set("userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserInfo: Self = this.set("userInfo", js.undefined)
  }
}
