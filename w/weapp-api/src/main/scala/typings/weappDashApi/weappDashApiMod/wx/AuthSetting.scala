package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 用户授权结果，参考 type Scope
  */
trait AuthSetting extends js.Object {
  var `scope.address`: Boolean
  var `scope.camera`: Boolean
  var `scope.invoice`: Boolean
  var `scope.invoiceTitle`: Boolean
  var `scope.record`: Boolean
  var `scope.userInfo`: Boolean
  var `scope.userLocation`: Boolean
  var `scope.werun`: Boolean
  var `scope.writePhotosAlbum`: Boolean
}

object AuthSetting {
  @scala.inline
  def apply(
    `scope.address`: Boolean,
    `scope.camera`: Boolean,
    `scope.invoice`: Boolean,
    `scope.invoiceTitle`: Boolean,
    `scope.record`: Boolean,
    `scope.userInfo`: Boolean,
    `scope.userLocation`: Boolean,
    `scope.werun`: Boolean,
    `scope.writePhotosAlbum`: Boolean
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(`scope.address`)
    __obj.updateDynamic("scope.camera")(`scope.camera`)
    __obj.updateDynamic("scope.invoice")(`scope.invoice`)
    __obj.updateDynamic("scope.invoiceTitle")(`scope.invoiceTitle`)
    __obj.updateDynamic("scope.record")(`scope.record`)
    __obj.updateDynamic("scope.userInfo")(`scope.userInfo`)
    __obj.updateDynamic("scope.userLocation")(`scope.userLocation`)
    __obj.updateDynamic("scope.werun")(`scope.werun`)
    __obj.updateDynamic("scope.writePhotosAlbum")(`scope.writePhotosAlbum`)
    __obj.asInstanceOf[AuthSetting]
  }
}

