package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scopeaddress extends js.Object {
  @JSName("scope.address")
  var scopeDotaddress: Boolean
  @JSName("scope.camera")
  var scopeDotcamera: Boolean
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

object Anon_Scopeaddress {
  @scala.inline
  def apply(
    scopeDotaddress: Boolean,
    scopeDotcamera: Boolean,
    scopeDotinvoiceTitle: Boolean,
    scopeDotrecord: Boolean,
    scopeDotuserInfo: Boolean,
    scopeDotuserLocation: Boolean,
    scopeDotwerun: Boolean,
    scopeDotwritePhotosAlbum: Boolean
  ): Anon_Scopeaddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.camera")(scopeDotcamera.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Scopeaddress]
  }
}

