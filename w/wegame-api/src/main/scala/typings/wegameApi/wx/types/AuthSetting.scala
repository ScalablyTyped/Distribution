package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// --设置
trait AuthSetting extends StObject {
  
  /**
    * 通讯地址，对应接口 wx.chooseAddress
    */
  @JSName("scope.address")
  var scopeDotaddress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 摄像头 wx.camera
    */
  @JSName("scope.camera")
  var scopeDotcamera: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 发票抬头，对应接口 wx.chooseInvoiceTitle
    */
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 录音功能，对应接口 wx.startRecord
    */
  @JSName("scope.record")
  var scopeDotrecord: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 用户信息，对应接口 wx.getUserInfo
    */
  @JSName("scope.userInfo")
  var scopeDotuserInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 地理位置，对应接口 wx.getLocation wx.chooseLocation
    */
  @JSName("scope.userLocation")
  var scopeDotuserLocation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 微信运动步数，对应接口 wx.getWeRunData
    */
  @JSName("scope.werun")
  var scopeDotwerun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 保存到相册 wx.saveImageToPhotosAlbum, wx.saveVideoToPhotosAlbum
    */
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: js.UndefOr[Boolean] = js.undefined
}
object AuthSetting {
  
  inline def apply(): AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthSetting] (val x: Self) extends AnyVal {
    
    inline def setScopeDotaddress(value: Boolean): Self = StObject.set(x, "scope.address", value.asInstanceOf[js.Any])
    
    inline def setScopeDotaddressUndefined: Self = StObject.set(x, "scope.address", js.undefined)
    
    inline def setScopeDotcamera(value: Boolean): Self = StObject.set(x, "scope.camera", value.asInstanceOf[js.Any])
    
    inline def setScopeDotcameraUndefined: Self = StObject.set(x, "scope.camera", js.undefined)
    
    inline def setScopeDotinvoiceTitle(value: Boolean): Self = StObject.set(x, "scope.invoiceTitle", value.asInstanceOf[js.Any])
    
    inline def setScopeDotinvoiceTitleUndefined: Self = StObject.set(x, "scope.invoiceTitle", js.undefined)
    
    inline def setScopeDotrecord(value: Boolean): Self = StObject.set(x, "scope.record", value.asInstanceOf[js.Any])
    
    inline def setScopeDotrecordUndefined: Self = StObject.set(x, "scope.record", js.undefined)
    
    inline def setScopeDotuserInfo(value: Boolean): Self = StObject.set(x, "scope.userInfo", value.asInstanceOf[js.Any])
    
    inline def setScopeDotuserInfoUndefined: Self = StObject.set(x, "scope.userInfo", js.undefined)
    
    inline def setScopeDotuserLocation(value: Boolean): Self = StObject.set(x, "scope.userLocation", value.asInstanceOf[js.Any])
    
    inline def setScopeDotuserLocationUndefined: Self = StObject.set(x, "scope.userLocation", js.undefined)
    
    inline def setScopeDotwerun(value: Boolean): Self = StObject.set(x, "scope.werun", value.asInstanceOf[js.Any])
    
    inline def setScopeDotwerunUndefined: Self = StObject.set(x, "scope.werun", js.undefined)
    
    inline def setScopeDotwritePhotosAlbum(value: Boolean): Self = StObject.set(x, "scope.writePhotosAlbum", value.asInstanceOf[js.Any])
    
    inline def setScopeDotwritePhotosAlbumUndefined: Self = StObject.set(x, "scope.writePhotosAlbum", js.undefined)
  }
}
