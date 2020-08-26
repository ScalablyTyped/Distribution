package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scopeaddress extends js.Object {
  @JSName("scope.address")
  var scopeDotaddress: Boolean = js.native
  @JSName("scope.camera")
  var scopeDotcamera: Boolean = js.native
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: Boolean = js.native
  @JSName("scope.record")
  var scopeDotrecord: Boolean = js.native
  @JSName("scope.userInfo")
  var scopeDotuserInfo: Boolean = js.native
  @JSName("scope.userLocation")
  var scopeDotuserLocation: Boolean = js.native
  @JSName("scope.werun")
  var scopeDotwerun: Boolean = js.native
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: Boolean = js.native
}

object Scopeaddress {
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
  ): Scopeaddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.camera")(scopeDotcamera.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scopeaddress]
  }
  @scala.inline
  implicit class ScopeaddressOps[Self <: Scopeaddress] (val x: Self) extends AnyVal {
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
    def setScopeDotcamera(value: Boolean): Self = this.set("scope.camera", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotinvoiceTitle(value: Boolean): Self = this.set("scope.invoiceTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotrecord(value: Boolean): Self = this.set("scope.record", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotuserInfo(value: Boolean): Self = this.set("scope.userInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotuserLocation(value: Boolean): Self = this.set("scope.userLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotwerun(value: Boolean): Self = this.set("scope.werun", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotwritePhotosAlbum(value: Boolean): Self = this.set("scope.writePhotosAlbum", value.asInstanceOf[js.Any])
  }
  
}

