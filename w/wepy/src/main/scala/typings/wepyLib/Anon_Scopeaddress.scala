package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scopeaddress extends js.Object {
  var `scope.address`: scala.Boolean
  var `scope.camera`: scala.Boolean
  var `scope.invoiceTitle`: scala.Boolean
  var `scope.record`: scala.Boolean
  var `scope.userInfo`: scala.Boolean
  var `scope.userLocation`: scala.Boolean
  var `scope.werun`: scala.Boolean
  var `scope.writePhotosAlbum`: scala.Boolean
}

object Anon_Scopeaddress {
  @scala.inline
  def apply(
    `scope.address`: scala.Boolean,
    `scope.camera`: scala.Boolean,
    `scope.invoiceTitle`: scala.Boolean,
    `scope.record`: scala.Boolean,
    `scope.userInfo`: scala.Boolean,
    `scope.userLocation`: scala.Boolean,
    `scope.werun`: scala.Boolean,
    `scope.writePhotosAlbum`: scala.Boolean
  ): Anon_Scopeaddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(`scope.address`)
    __obj.updateDynamic("scope.camera")(`scope.camera`)
    __obj.updateDynamic("scope.invoiceTitle")(`scope.invoiceTitle`)
    __obj.updateDynamic("scope.record")(`scope.record`)
    __obj.updateDynamic("scope.userInfo")(`scope.userInfo`)
    __obj.updateDynamic("scope.userLocation")(`scope.userLocation`)
    __obj.updateDynamic("scope.werun")(`scope.werun`)
    __obj.updateDynamic("scope.writePhotosAlbum")(`scope.writePhotosAlbum`)
    __obj.asInstanceOf[Anon_Scopeaddress]
  }
}

