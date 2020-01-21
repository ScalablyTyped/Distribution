package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 用户授权结果，参考 type Scope
  */
trait AuthSetting extends js.Object {
  @JSName("scope.address")
  var scopeDotaddress: Boolean
  @JSName("scope.camera")
  var scopeDotcamera: Boolean
  @JSName("scope.invoice")
  var scopeDotinvoice: Boolean
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: Boolean
  @JSName("scope.record")
  var scopeDotrecord: Boolean
  @JSName("scope.userInfo")
  var scopeDotuserInfo: Boolean
  @JSName("scope.userLocation")
  var scopeDotuserLocation: Boolean
  @JSName("scope.werun")
  var scopeDotwerun: Boolean
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: Boolean
}

object AuthSetting {
  @scala.inline
  def apply(
    scopeDotaddress: Boolean,
    scopeDotcamera: Boolean,
    scopeDotinvoice: Boolean,
    scopeDotinvoiceTitle: Boolean,
    scopeDotrecord: Boolean,
    scopeDotuserInfo: Boolean,
    scopeDotuserLocation: Boolean,
    scopeDotwerun: Boolean,
    scopeDotwritePhotosAlbum: Boolean
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.camera")(scopeDotcamera.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoice")(scopeDotinvoice.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
}

