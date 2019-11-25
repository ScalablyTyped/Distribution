package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scopeaddress extends js.Object {
  var `scope.address`: Boolean
  var `scope.camera`: Boolean
  var `scope.invoiceTitle`: Boolean
  var `scope.record`: Boolean
  var `scope.userInfo`: Boolean
  var `scope.userLocation`: Boolean
  var `scope.werun`: Boolean
  var `scope.writePhotosAlbum`: Boolean
}

object Anon_Scopeaddress {
  @scala.inline
  def apply(
    `scope.address`: Boolean,
    `scope.camera`: Boolean,
    `scope.invoiceTitle`: Boolean,
    `scope.record`: Boolean,
    `scope.userInfo`: Boolean,
    `scope.userLocation`: Boolean,
    `scope.werun`: Boolean,
    `scope.writePhotosAlbum`: Boolean
  ): Anon_Scopeaddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(`scope.address`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.camera")(`scope.camera`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(`scope.invoiceTitle`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(`scope.record`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(`scope.userInfo`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(`scope.userLocation`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(`scope.werun`.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(`scope.writePhotosAlbum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Scopeaddress]
  }
}

