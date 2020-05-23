package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSetting extends js.Object {
  var authSetting: typings.wegameApi.wx.types.AuthSetting
}

object AuthSetting {
  @scala.inline
  def apply(authSetting: typings.wegameApi.wx.types.AuthSetting): AuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
}

