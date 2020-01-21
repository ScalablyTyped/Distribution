package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --设置
trait AuthSetting extends js.Object {
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
  @scala.inline
  def apply(
    scopeDotaddress: js.UndefOr[Boolean] = js.undefined,
    scopeDotcamera: js.UndefOr[Boolean] = js.undefined,
    scopeDotinvoiceTitle: js.UndefOr[Boolean] = js.undefined,
    scopeDotrecord: js.UndefOr[Boolean] = js.undefined,
    scopeDotuserInfo: js.UndefOr[Boolean] = js.undefined,
    scopeDotuserLocation: js.UndefOr[Boolean] = js.undefined,
    scopeDotwerun: js.UndefOr[Boolean] = js.undefined,
    scopeDotwritePhotosAlbum: js.UndefOr[Boolean] = js.undefined
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scopeDotaddress)) __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotcamera)) __obj.updateDynamic("scope.camera")(scopeDotcamera.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotinvoiceTitle)) __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotrecord)) __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotuserInfo)) __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotuserLocation)) __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotwerun)) __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotwritePhotosAlbum)) __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
}

