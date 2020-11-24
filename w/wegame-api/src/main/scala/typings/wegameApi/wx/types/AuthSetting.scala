package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// --设置
@js.native
trait AuthSetting extends js.Object {
  
  /**
    * 通讯地址，对应接口 wx.chooseAddress
    */
  @JSName("scope.address")
  var scopeDotaddress: js.UndefOr[Boolean] = js.native
  
  /**
    * 摄像头 wx.camera
    */
  @JSName("scope.camera")
  var scopeDotcamera: js.UndefOr[Boolean] = js.native
  
  /**
    * 发票抬头，对应接口 wx.chooseInvoiceTitle
    */
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * 录音功能，对应接口 wx.startRecord
    */
  @JSName("scope.record")
  var scopeDotrecord: js.UndefOr[Boolean] = js.native
  
  /**
    * 用户信息，对应接口 wx.getUserInfo
    */
  @JSName("scope.userInfo")
  var scopeDotuserInfo: js.UndefOr[Boolean] = js.native
  
  /**
    * 地理位置，对应接口 wx.getLocation wx.chooseLocation
    */
  @JSName("scope.userLocation")
  var scopeDotuserLocation: js.UndefOr[Boolean] = js.native
  
  /**
    * 微信运动步数，对应接口 wx.getWeRunData
    */
  @JSName("scope.werun")
  var scopeDotwerun: js.UndefOr[Boolean] = js.native
  
  /**
    * 保存到相册 wx.saveImageToPhotosAlbum, wx.saveVideoToPhotosAlbum
    */
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: js.UndefOr[Boolean] = js.native
}
object AuthSetting {
  
  @scala.inline
  def apply(): AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthSetting]
  }
  
  @scala.inline
  implicit class AuthSettingOps[Self <: AuthSetting] (val x: Self) extends AnyVal {
    
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
    def setScopeDotaddress(value: Boolean): Self = this.set("scope.address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeDotaddress: Self = this.set("scope.address", js.undefined)
    
    @scala.inline
    def setScopeDotcamera(value: Boolean): Self = this.set("scope.camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeDotcamera: Self = this.set("scope.camera", js.undefined)
    
    @scala.inline
    def setScopeDotinvoiceTitle(value: Boolean): Self = this.set("scope.invoiceTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeDotinvoiceTitle: Self = this.set("scope.invoiceTitle", js.undefined)
    
    @scala.inline
    def setScopeDotrecord(value: Boolean): Self = this.set("scope.record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeDotrecord: Self = this.set("scope.record", js.undefined)
    
    @scala.inline
    def setScopeDotuserInfo(value: Boolean): Self = this.set("scope.userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeDotuserInfo: Self = this.set("scope.userInfo", js.undefined)
    
    @scala.inline
    def setScopeDotuserLocation(value: Boolean): Self = this.set("scope.userLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeDotuserLocation: Self = this.set("scope.userLocation", js.undefined)
    
    @scala.inline
    def setScopeDotwerun(value: Boolean): Self = this.set("scope.werun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeDotwerun: Self = this.set("scope.werun", js.undefined)
    
    @scala.inline
    def setScopeDotwritePhotosAlbum(value: Boolean): Self = this.set("scope.writePhotosAlbum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeDotwritePhotosAlbum: Self = this.set("scope.writePhotosAlbum", js.undefined)
  }
}
