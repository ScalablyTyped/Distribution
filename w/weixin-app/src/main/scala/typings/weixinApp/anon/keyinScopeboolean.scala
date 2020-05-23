package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in weixin-app.wx.Scope ]: boolean} */
trait keyinScopeboolean extends js.Object {
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
  @JSName("scope.userLocationBackground")
  var scopeDotuserLocationBackground: Boolean
  @JSName("scope.werun")
  var scopeDotwerun: Boolean
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: Boolean
}

object keyinScopeboolean {
  @scala.inline
  def apply(
    scopeDotaddress: Boolean,
    scopeDotcamera: Boolean,
    scopeDotinvoice: Boolean,
    scopeDotinvoiceTitle: Boolean,
    scopeDotrecord: Boolean,
    scopeDotuserInfo: Boolean,
    scopeDotuserLocation: Boolean,
    scopeDotuserLocationBackground: Boolean,
    scopeDotwerun: Boolean,
    scopeDotwritePhotosAlbum: Boolean
  ): keyinScopeboolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.camera")(scopeDotcamera.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoice")(scopeDotinvoice.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocationBackground")(scopeDotuserLocationBackground.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinScopeboolean]
  }
}

