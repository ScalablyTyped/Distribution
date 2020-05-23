package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSetting extends js.Object {
  /**
    * 是否授权通讯地址
    */
  @JSName("scope.address")
  var scopeDotaddress: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否授权摄像头
    */
  @JSName("scope.camera")
  var scopeDotcamera: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否授权获取发票
    */
  @JSName("scope.invoice")
  var scopeDotinvoice: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否授权发票抬头
    */
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否授权录音功能
    */
  @JSName("scope.record")
  var scopeDotrecord: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否授权用户信息
    */
  @JSName("scope.userInfo")
  var scopeDotuserInfo: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否授权地理位置
    */
  @JSName("scope.userLocation")
  var scopeDotuserLocation: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否授权微信运动步数
    */
  @JSName("scope.werun")
  var scopeDotwerun: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否授权保存到相册
    */
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: js.UndefOr[Boolean] = js.undefined
}

object AuthSetting {
  @scala.inline
  def apply(
    scopeDotaddress: js.UndefOr[Boolean] = js.undefined,
    scopeDotcamera: js.UndefOr[Boolean] = js.undefined,
    scopeDotinvoice: js.UndefOr[Boolean] = js.undefined,
    scopeDotinvoiceTitle: js.UndefOr[Boolean] = js.undefined,
    scopeDotrecord: js.UndefOr[Boolean] = js.undefined,
    scopeDotuserInfo: js.UndefOr[Boolean] = js.undefined,
    scopeDotuserLocation: js.UndefOr[Boolean] = js.undefined,
    scopeDotwerun: js.UndefOr[Boolean] = js.undefined,
    scopeDotwritePhotosAlbum: js.UndefOr[Boolean] = js.undefined
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scopeDotaddress)) __obj.updateDynamic("scope.address")(scopeDotaddress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotcamera)) __obj.updateDynamic("scope.camera")(scopeDotcamera.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotinvoice)) __obj.updateDynamic("scope.invoice")(scopeDotinvoice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotinvoiceTitle)) __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotrecord)) __obj.updateDynamic("scope.record")(scopeDotrecord.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotuserInfo)) __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotuserLocation)) __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotwerun)) __obj.updateDynamic("scope.werun")(scopeDotwerun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeDotwritePhotosAlbum)) __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
}

